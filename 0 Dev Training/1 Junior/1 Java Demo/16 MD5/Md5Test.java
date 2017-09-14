import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class Md5Test {
    private static void Md5(String plainText) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(plainText.getBytes());
            byte b[] = md.digest();//16λ��MD5
            int i;
            System.out.println(b.length);//
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                System.out.print(i+" ");
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");                
                buf.append(Integer.toHexString(i));
            }
            System.out.println();
            String temp=buf.toString();
            System.out.println("result: " +temp );// 32λ�ļ���
            //�����ǰ��ַ������ܳ�32λ��
            //��������32λ��MD5ת����16λ��
            byte [] bb=new byte[16];
            int m=0;
            for(int j=0;j<32;j+=2)
            {
                int num=Integer.valueOf(temp.substring(j, j+2),16);
                if(num>127)
                {
                    bb[m]=(byte) (num-256);
                    System.out.print((num-256)+" ");
                }
                else
                {
                    bb[m]=(byte) (num);
                    System.out.print(num+" ");
                }
                m++;
            }
            System.out.println();
            //String rr=Tools.byteToLowcaseStr(bb, 0, 16);
            //System.out.println(rr);
System.out.println(bb);
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void main(String [] args)
    {
        String pass="1zxv�й�rqwe";
        Md5(pass);
    }
}


//���н��:

//16
//112 100 -76 -79 -77 88 -26 -79 53 -15 -79 93 28 21 -111 70 
//result: 7064b4b1b358e6b135f1b15d1c159146
//112 100 -76 -79 -77 88 -26 -79 53 -15 -79 93 28 21 -111 70 
//7064b4b1b358e6b135f1b15d1c159146 