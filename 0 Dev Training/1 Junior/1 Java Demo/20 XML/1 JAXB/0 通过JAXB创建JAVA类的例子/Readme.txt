. Jaxb

  处理XML 主要分为2个大步骤

  1. 创建对应xml文档的 java 类

    1.1    创建xml 文档的schema 或 dtd

    1.2    在命令行下使用 xjc 来创建xml 对应的java  类
   
           c:\..\> xjc -d f:/UML *.xsd

           说明:

               -d 参数后面是 要生成的java文件所在的目录. 该目录必须已经存在.

           例子:

              xjc -d d:/ -p SH_Report d:/sh_annoucement.xsd

    1.3  错误解析
[ERROR] s4s-elt-invalid-content.1: The content of '#AnonType_div' is invalid.  E
lement 'sequence' is invalid, misplaced, or occurs too often.
  line 6 of file:/D:/sh_annoucement.xsd

Failed to parse a schema.

        分析:

            div 的子元素有问题, 如果删除div 的子元素, 则可以通过.  应该是<xs:attribute> 与<xs:sequence>的组合问题, <xs:attribute> 放在<xs:sequence>后面定义就可以了 

            长时间没碰dsd, 有些基础知识记不清了, 好像<xs:element> 要定义在<xs:sequence> 中

     1.4  错误2:

          [org.xml.sax.SAXParseException: The entity "nbsp" was referenced, but not declared.]

           由于html 中 &nbsp 用来标记空格, 而 xml 中& 后面的都认为是实体, 那么如果xsd 中没有定义, 则解析的时候就会出错
 
  2. 将java 类实例化， 然后通过操作java 类，来控制xml 

    例如:
    
        本目录下的a.xsd, 是一个可以被处理的xsd

        通过下面的命令

           ..\..\> xjc -d ./aa a.xsd

        然后在子目录aa(必须已经存在)中, 就会生成 ./generated 目录, 该目录中包含处理a.xsd 后的类文件.

        指定生成的package 名称

            xjc -d ./aa -p stock d:\shares.xsd    // 在aa 子目录中创建一个stock 目录(package)

       需要注意的是:

             如果 xml 中属性如果叫"Kind", 那么通过xjc 生成的代码中, 自动会改为kind_0020, 估计kind 与系统内部关键字有冲突.

   通过java 类来处理 xml的过程如下.

   2.0  在工程中引入 上面创建的package, 这样就可以访问了

        目前的引入方法是:

            a. 在工程中new  一个Package, 名称就是前面 xjc 创建的pacage名称(例如stock)

            b. 然后才工程中, import 前面xjc 创建的 stock 包(目录)的文件导入到 刚才新创建的Pacage 中

        这样, 工程中就可以使用刚才创建的Package 中的功能了


   2.1  实例化 java类

                JAXBContext jc = JAXBContext.newInstance("generated");

        注意:

              这儿的 "generated" 是 前面通过xjc  处理xsd 后生成的java类的目录，即java  package. 

        这样就建立了java 类与 xml 文件之间的联系

   2.2  将 xml  文档  导入到 java  类实例

        String    filePath = "f://A_1.xml";

        // 将xml 数据 导入到java 内容对象(树形)
        Unmarshaller  u = jc.createUnmarshaller();    
        generated.ProtocolOptionsMapping    maps = (generated.ProtocolOptionsMapping) u.unmarshal( new File( filePath ) );

        这样就a_1.xml 文件就以树状结构 映射到 类实例 maps 中了.

   2.3  操作 类实例以达到操作 xml 数据的目的

        以下代码都测试通过, 参见: 

         D:\0 Java\0 Dev Training\1 Junior\1 Java Demo\20 XML\1 JAXB\0 通过JAXB创建JAVA类的例子\textJAXB.java

        2.3.1 读

         读 元素个数
        System.out.printf("LogType 数量为%d", maps.getLogType().size() );
        for ( int i = 0; i < maps.getLogType().size(); i ++) {
        	System.out.printf(": %d", i);
        	
        }

          读 属性

        System.out.printf( "\nLogType Name = %s, value=%d\n", maps.getLogType().get(0).getName(),
        		maps.getLogType().get(0).getValue() );

          读下一级元素
          
        generated.ProtocolOptionsMapping.LogType.DestinationType  des = maps.getLogType().get(0).getDestinationType().get(0);
        
        System.out.printf("\nLogtype[0]的第一个Dest name=%s, value=%d\n", des.getName(),des.getValue());

        2.3.2  写操作

        // 增加一级元素   Name=Admin, value=31
        generated.ProtocolOptionsMapping.LogType logt = new generated.ProtocolOptionsMapping.LogType();
        
        logt.setName("Admin");
        logt.setValue(31);
        
        maps.getLogType().add( logt );
        
        // 给第2个logType 增加2级元素 DestinationType   Name=北京, value =10
        generated.ProtocolOptionsMapping.LogType.DestinationType de = new generated.ProtocolOptionsMapping.LogType.DestinationType();
        
        de.setName("北京");
        de.setValue( 10 );
        
        maps.getLogType().get(1).getDestinationType().add(de);
           
        2.3.3  修改操作

        // 修改第2个LogType 的name 属性为 "BJ LogType"
        maps.getLogType().get(1).setName( "BJ LogType" );
   
   2.4  将 java 类的数据 导出到 指定的输出

        2.4.1  将 JAXB 类的数据导出到为文件中。 注意， 这儿的maps 是之前 Unmarshal 实例化的对象
 
        String    filePath2 = "f://a_2.xml";
        Marshaller  m = jc.createMarshaller();
   
        OutputStream os = new FileOutputStream( filePath2 );
        m.marshal( maps, os );
 
        2.4.2  将 JAXB 类的数据导出到系统输出中

        m.marshal( maps, System.out );
 
        2.4.3  定制 输出的格式

        m.setProperty( "jaxb.encoding", "GB2312" );			// 指定输出字符编码是GB2312, 缺省是UTF-8
        m.marshal( maps, os );


   