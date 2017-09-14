. 参见:

     http://wenku.baidu.com/view/07e2bbfc700abb68a982fbe4.html  -- 已经被删除

黑格尔说：人类惟一能从历史中汲取的教训，就是人类从来都不会从历史中汲取教训。
. 1. 逐行读取文件

  // 逐行读取数据    

  FileReader fr = new FileReader(%%1);   
 
  BufferedReader br = new BufferedReader(fr);   

  String %%2 = br.readLine();   
  while (%%2 != null) {   %%3    %%2 = br.readLine();   } 

  br.close();   
  fr.close();   

. 2. 文件定位

  参见:

       http://hi.baidu.com/tejingdream/item/b6b3320889acc93d4bc4a324

public static void main(String[] args) throws Exception {  
    try   
    {   
    RandomAccessFile   rd=new   RandomAccessFile("d:\\test.txt","rw");//参数1为要操作的文件的路径，参数2为操作方式
    
    rd.seek(0);//参数为要定位的文件的字符位置，0代表定位在文件的开头
    String temp = "";
    //按行读取
    while((temp = rd.readLine()) != null){//逐行读取该文件，如果定位到文件中一行的中间，则只读取从定位的位置开始的后半部分
     temp = new String(temp.getBytes("8859_1"), "gb2312");//转变编码格式：不进行转换的话读出的中文显示为乱码，很令人头疼的
     System.out.println(temp);
    }
    //经过以上操作，文件指针已经指向文件的末尾：相当于rd.seed(param)中的参数param的值为文本的字符长度。实际运用时可以在以上操作完成后记录文件的长度，如果文件长度是变化的，下次读取时可以直接从上次读取的位置开始读取。很方便。
    rd.close();//记得关闭该对象
    }   
    catch(IOException   e)   
    {   
     System.out.println("File   Access   error:"+e);   
    }   
    
   File f = new File("d:\\test.txt");//仅用于测试，看一下定位的对不对
   System.out.println(f.length());
}
}

==========================

参见:

    http://blog.sina.com.cn/s/blog_46726d240100uo7l.html

要定位到某行，试试 java.io.LineNumberReader 和 java.io.LineNumberInputStream


  参见:

       http://hi.baidu.com/victorlin23/item/c98293eca95711a9c10d759a

如果要使用BIO，建议使用java.io.RandomAccessFile来做，读取部分信息。
如果要使用NIO,建议使用java.nio.channels.FileChannel,使用虚拟内存来Mapping大文件。


. 3. 文件长度

File file = new File("文件路径");
System.out.println(file.length());//输出的是文件的字节数   


. 4. 文件访问的当前位置

			RandomAccessFile   rd=new   RandomAccessFile("c:/test.txt","rw");
			
			rd.seek(len);
			rd.getFilePointer();			// 获取当前指针位置
			
			len = rd.Length();			// 返回文件长度

. 5. 读取文件字节流 (下面的代码是groovy, 稍加改造就是java 代码)

	RandomAccessFile   rd=new   RandomAccessFile("c:/test.txt","rw");
			
	rd.seek( pos );
	byte[] buf  = new byte[9]
        def len = rd.read( buf, 0, 8)       //  0 是buf 的起始偏移量， 8是读取的字节流长度
        println "读取长度："+ len

     需要注意的是read() 中的buf ， 必须是已经申请好的空间， 不能def 来进行定义

        rd.writeChars( "hello, world!" )     // 向文件写字符串内容
   

. 一种Java 的调试方法. 查看堆栈

  System.out.print(stack.pop() + "\t")	;   
			if (stack.getSize() % 10 == 0)  
                                                         System.out.println(stack.pop());

最后一个pop出来以后，stack为大小为0，没法再出栈了 System.out.println(stack.pop());
这句也就坏了 修改：if (stack.getSize()!=0 && stack.getSize() % 10 == 0)

. 鼠标移动到对象或方法上时, 如果显示对应的帮助内容, 按 F2 则可以固定住对应的帮助信息, 可以下拉查看.