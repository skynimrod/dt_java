. Jaxb

  ����XML ��Ҫ��Ϊ2������

  1. ������Ӧxml�ĵ��� java ��

    1.1    ����xml �ĵ���schema �� dtd

    1.2    ����������ʹ�� xjc ������xml ��Ӧ��java  ��
   
           c:\..\> xjc -d f:/UML *.xsd

           ˵��:

               -d ���������� Ҫ���ɵ�java�ļ����ڵ�Ŀ¼. ��Ŀ¼�����Ѿ�����.

           ����:

              xjc -d d:/ -p SH_Report d:/sh_annoucement.xsd

    1.3  �������
[ERROR] s4s-elt-invalid-content.1: The content of '#AnonType_div' is invalid.  E
lement 'sequence' is invalid, misplaced, or occurs too often.
  line 6 of file:/D:/sh_annoucement.xsd

Failed to parse a schema.

        ����:

            div ����Ԫ��������, ���ɾ��div ����Ԫ��, �����ͨ��.  Ӧ����<xs:attribute> ��<xs:sequence>���������, <xs:attribute> ����<xs:sequence>���涨��Ϳ����� 

            ��ʱ��û��dsd, ��Щ����֪ʶ�ǲ�����, ����<xs:element> Ҫ������<xs:sequence> ��

     1.4  ����2:

          [org.xml.sax.SAXParseException: The entity "nbsp" was referenced, but not declared.]

           ����html �� &nbsp ������ǿո�, �� xml ��& ����Ķ���Ϊ��ʵ��, ��ô���xsd ��û�ж���, �������ʱ��ͻ����
 
  2. ��java ��ʵ������ Ȼ��ͨ������java �࣬������xml 

    ����:
    
        ��Ŀ¼�µ�a.xsd, ��һ�����Ա������xsd

        ͨ�����������

           ..\..\> xjc -d ./aa a.xsd

        Ȼ������Ŀ¼aa(�����Ѿ�����)��, �ͻ����� ./generated Ŀ¼, ��Ŀ¼�а�������a.xsd ������ļ�.

        ָ�����ɵ�package ����

            xjc -d ./aa -p stock d:\shares.xsd    // ��aa ��Ŀ¼�д���һ��stock Ŀ¼(package)

       ��Ҫע�����:

             ��� xml �����������"Kind", ��ôͨ��xjc ���ɵĴ�����, �Զ����Ϊkind_0020, ����kind ��ϵͳ�ڲ��ؼ����г�ͻ.

   ͨ��java �������� xml�Ĺ�������.

   2.0  �ڹ��������� ���洴����package, �����Ϳ��Է�����

        Ŀǰ�����뷽����:

            a. �ڹ�����new  һ��Package, ���ƾ���ǰ�� xjc ������pacage����(����stock)

            b. Ȼ��Ź�����, import ǰ��xjc ������ stock ��(Ŀ¼)���ļ����뵽 �ղ��´�����Pacage ��

        ����, �����оͿ���ʹ�øղŴ�����Package �еĹ�����


   2.1  ʵ���� java��

                JAXBContext jc = JAXBContext.newInstance("generated");

        ע��:

              ����� "generated" �� ǰ��ͨ��xjc  ����xsd �����ɵ�java���Ŀ¼����java  package. 

        �����ͽ�����java ���� xml �ļ�֮�����ϵ

   2.2  �� xml  �ĵ�  ���뵽 java  ��ʵ��

        String    filePath = "f://A_1.xml";

        // ��xml ���� ���뵽java ���ݶ���(����)
        Unmarshaller  u = jc.createUnmarshaller();    
        generated.ProtocolOptionsMapping    maps = (generated.ProtocolOptionsMapping) u.unmarshal( new File( filePath ) );

        ������a_1.xml �ļ�������״�ṹ ӳ�䵽 ��ʵ�� maps ����.

   2.3  ���� ��ʵ���Դﵽ���� xml ���ݵ�Ŀ��

        ���´��붼����ͨ��, �μ�: 

         D:\0 Java\0 Dev Training\1 Junior\1 Java Demo\20 XML\1 JAXB\0 ͨ��JAXB����JAVA�������\textJAXB.java

        2.3.1 ��

         �� Ԫ�ظ���
        System.out.printf("LogType ����Ϊ%d", maps.getLogType().size() );
        for ( int i = 0; i < maps.getLogType().size(); i ++) {
        	System.out.printf(": %d", i);
        	
        }

          �� ����

        System.out.printf( "\nLogType Name = %s, value=%d\n", maps.getLogType().get(0).getName(),
        		maps.getLogType().get(0).getValue() );

          ����һ��Ԫ��
          
        generated.ProtocolOptionsMapping.LogType.DestinationType  des = maps.getLogType().get(0).getDestinationType().get(0);
        
        System.out.printf("\nLogtype[0]�ĵ�һ��Dest name=%s, value=%d\n", des.getName(),des.getValue());

        2.3.2  д����

        // ����һ��Ԫ��   Name=Admin, value=31
        generated.ProtocolOptionsMapping.LogType logt = new generated.ProtocolOptionsMapping.LogType();
        
        logt.setName("Admin");
        logt.setValue(31);
        
        maps.getLogType().add( logt );
        
        // ����2��logType ����2��Ԫ�� DestinationType   Name=����, value =10
        generated.ProtocolOptionsMapping.LogType.DestinationType de = new generated.ProtocolOptionsMapping.LogType.DestinationType();
        
        de.setName("����");
        de.setValue( 10 );
        
        maps.getLogType().get(1).getDestinationType().add(de);
           
        2.3.3  �޸Ĳ���

        // �޸ĵ�2��LogType ��name ����Ϊ "BJ LogType"
        maps.getLogType().get(1).setName( "BJ LogType" );
   
   2.4  �� java ������� ������ ָ�������

        2.4.1  �� JAXB ������ݵ�����Ϊ�ļ��С� ע�⣬ �����maps ��֮ǰ Unmarshal ʵ�����Ķ���
 
        String    filePath2 = "f://a_2.xml";
        Marshaller  m = jc.createMarshaller();
   
        OutputStream os = new FileOutputStream( filePath2 );
        m.marshal( maps, os );
 
        2.4.2  �� JAXB ������ݵ�����ϵͳ�����

        m.marshal( maps, System.out );
 
        2.4.3  ���� ����ĸ�ʽ

        m.setProperty( "jaxb.encoding", "GB2312" );			// ָ������ַ�������GB2312, ȱʡ��UTF-8
        m.marshal( maps, os );


   