. �μ�:

     http://wenku.baidu.com/view/07e2bbfc700abb68a982fbe4.html  -- �Ѿ���ɾ��

�ڸ��˵������Ωһ�ܴ���ʷ�м�ȡ�Ľ�ѵ����������������������ʷ�м�ȡ��ѵ��
. 1. ���ж�ȡ�ļ�

  // ���ж�ȡ����    

  FileReader fr = new FileReader(%%1);   
 
  BufferedReader br = new BufferedReader(fr);   

  String %%2 = br.readLine();   
  while (%%2 != null) {   %%3    %%2 = br.readLine();   } 

  br.close();   
  fr.close();   

. 2. �ļ���λ

  �μ�:

       http://hi.baidu.com/tejingdream/item/b6b3320889acc93d4bc4a324

public static void main(String[] args) throws Exception {  
    try   
    {   
    RandomAccessFile   rd=new   RandomAccessFile("d:\\test.txt","rw");//����1ΪҪ�������ļ���·��������2Ϊ������ʽ
    
    rd.seek(0);//����ΪҪ��λ���ļ����ַ�λ�ã�0����λ���ļ��Ŀ�ͷ
    String temp = "";
    //���ж�ȡ
    while((temp = rd.readLine()) != null){//���ж�ȡ���ļ��������λ���ļ���һ�е��м䣬��ֻ��ȡ�Ӷ�λ��λ�ÿ�ʼ�ĺ�벿��
     temp = new String(temp.getBytes("8859_1"), "gb2312");//ת������ʽ��������ת���Ļ�������������ʾΪ���룬������ͷ�۵�
     System.out.println(temp);
    }
    //�������ϲ������ļ�ָ���Ѿ�ָ���ļ���ĩβ���൱��rd.seed(param)�еĲ���param��ֵΪ�ı����ַ����ȡ�ʵ������ʱ���������ϲ�����ɺ��¼�ļ��ĳ��ȣ�����ļ������Ǳ仯�ģ��´ζ�ȡʱ����ֱ�Ӵ��ϴζ�ȡ��λ�ÿ�ʼ��ȡ���ܷ��㡣
    rd.close();//�ǵùرոö���
    }   
    catch(IOException   e)   
    {   
     System.out.println("File   Access   error:"+e);   
    }   
    
   File f = new File("d:\\test.txt");//�����ڲ��ԣ���һ�¶�λ�ĶԲ���
   System.out.println(f.length());
}
}

==========================

�μ�:

    http://blog.sina.com.cn/s/blog_46726d240100uo7l.html

Ҫ��λ��ĳ�У����� java.io.LineNumberReader �� java.io.LineNumberInputStream


  �μ�:

       http://hi.baidu.com/victorlin23/item/c98293eca95711a9c10d759a

���Ҫʹ��BIO������ʹ��java.io.RandomAccessFile��������ȡ������Ϣ��
���Ҫʹ��NIO,����ʹ��java.nio.channels.FileChannel,ʹ�������ڴ���Mapping���ļ���


. 3. �ļ�����

File file = new File("�ļ�·��");
System.out.println(file.length());//��������ļ����ֽ���   


. 4. �ļ����ʵĵ�ǰλ��

			RandomAccessFile   rd=new   RandomAccessFile("c:/test.txt","rw");
			
			rd.seek(len);
			rd.getFilePointer();			// ��ȡ��ǰָ��λ��
			
			len = rd.Length();			// �����ļ�����

. 5. ��ȡ�ļ��ֽ��� (����Ĵ�����groovy, �ԼӸ������java ����)

	RandomAccessFile   rd=new   RandomAccessFile("c:/test.txt","rw");
			
	rd.seek( pos );
	byte[] buf  = new byte[9]
        def len = rd.read( buf, 0, 8)       //  0 ��buf ����ʼƫ������ 8�Ƕ�ȡ���ֽ�������
        println "��ȡ���ȣ�"+ len

     ��Ҫע�����read() �е�buf �� �������Ѿ�����õĿռ䣬 ����def �����ж���

        rd.writeChars( "hello, world!" )     // ���ļ�д�ַ�������
   

. һ��Java �ĵ��Է���. �鿴��ջ

  System.out.print(stack.pop() + "\t")	;   
			if (stack.getSize() % 10 == 0)  
                                                         System.out.println(stack.pop());

���һ��pop�����Ժ�stackΪ��СΪ0��û���ٳ�ջ�� System.out.println(stack.pop());
���Ҳ�ͻ��� �޸ģ�if (stack.getSize()!=0 && stack.getSize() % 10 == 0)

. ����ƶ�������򷽷���ʱ, �����ʾ��Ӧ�İ�������, �� F2 ����Թ̶�ס��Ӧ�İ�����Ϣ, ���������鿴.