. �μ�:

      ������ʽ�Ļ���֪ʶ �μ���

         http://baike.baidu.com/link?url=HEK4temGqcWcvhbaqFW7f6LYK1DQaPaXjekq4QdzxOLi2Bs7Et5t8i9F2Cm09DOI

      ������ʽ��Java Ӧ��   �ٶ� ���� "Java Matcher"

         http://www.jb51.net/article/17943.htm

. Java.util.regex ��һ����������ʽ �����Ƶ�ģʽ �����ַ������б��乤��������.  

  ������������: Pattern �� Matcher 

  Pattern   ��һ��������ʽ�����Ժ�ı���ģʽ;

  Matcher   һ��Matcher ���� ��һ��״̬����, ������Pattern ������Ϊƥ��ģʽ���ַ���չ��ƥ����.

  ����һ��Pattern ʵ�� ������һ�������﷨��PERL  ���Ƶ�������ʽ�����Ժ��ģʽ, Ȼ��һ��Matcher ʵ�� �����������Pattern ʵ����ģʽ�����½����ַ�����ƥ�乤��.

. Pattern ��

  ��������:

  1.  static Pattern compile(String regex)

      ��������������ʽ���벢����� Pattern ��

  2.  static Pattern compile(String regex, int flags)

      ͬ��, ������flag�������ƶ�, ��ѡ�Ĳ�������: CASEINSENSITIVE, MULITILINE, DOTALL, UNICODECASE, CANNOEQ

  3. int flags()

      ���ص�ǰPattern ��ƥ��flag ����

  4. Matcher mathcer( CharSequence input)

     ����һ������������Matcher ����

  5. static boolean matches(String regex, CharSequence input)

     ���������������ʽ���Ҷ�������ַ����Ը�������ʽ Ϊģʽ��չƥ��, �÷��������ڸ�������ʽ ֻ����һ�ε����, Ҳ����ֻ����һ��ƥ�乤��, ��Ϊ��������²�����Ҫ����һ��Matcharʵ��.

  6. String pattern()

     ���� ��Patter �����������������ʽ

  7. String[] split( CharSequence input)

     ��Ŀ���ַ�������Pattern ����������������ʽΪģ���зָ�

  8. String[] split(CharSequence input, int limit)

     ����ͬ��, ���Ӳ���limit Ŀ������Ҫָ���ָ�Ķ���, �罫 limit ��Ϊ2, ��ôĿ���ַ���������������ʽ��Ϊ����.

. һ��������ʽ, Ҳ�����Ŵ����ض�������ַ�, ��������Ҫ�����Ϊһ��pattern���ʵ��, ���Pattern �����ʹ��matter( ����������һ��Matcher ʵ��, ���ű����ʹ��Matcherʵ�� �Ա����������ʽΪ������Ŀ���ַ�������ƥ�乤��, ���Matcher�ǿ��Թ���һ��Patter�����.

. ����:

import java.util.regex.*; 

public class Replacement{ 
public static void main(String[] args) throws Exception { 

	// ����һ��Pattern,ͬʱ����һ��������ʽ 
	Pattern p = Pattern.compile("[/]+"); 
	//��Pattern��split()�������ַ�����"/"�ָ� 
	String[] result = p.split( 
			"Kevin has seen��LEON��seveal times,because it is a good film." 
			+"/ �����Ѿ����������ɱ�ֲ�̫�䡷�����ˣ���Ϊ����һ��" 
			+"�õ�Ӱ��/����:���ġ�"); 
	
	for (int i=0; i<result.length; i++) 
	System.out.println(result[i]); 
} 
} 


������Ϊ�� 
Kevin has seen��LEON��seveal times,because it is a good film. 
�����Ѿ����������ɱ�ֲ�̫�䡷�����ˣ���Ϊ����һ���õ�Ӱ�� 
����:���ġ� 

. Matcher ��

  ��������:

  1. Matcher appendReplacement( StringBuffer sb, String replacement )

     ����ǰƥ���Ӵ� �滻Ϊָ���ַ���, ���ҽ��滻����Ӵ��Լ���֮ǰ���ϴ�ƥ���Ӵ�֮����ַ�����ӵ�һ��StringBuffer������

  2. StringBuffer appendTail( StringBuffer sb )
   
     �����һ��ƥ�乤����ʣ����ַ�����ӵ�һ��StringBuffer������.

  3. int end()

     ���ص�ǰƥ����Ӵ������һ���ַ���ԭĿ���ַ����е�����λ��.

  4. int end( int group)
     
     ������ƥ��ģʽ��ָ��������ƥ����Ӵ����һ���ַ���λ�á�

  5. boolean find()

     ������Ŀ���ַ����������һ��ƥ���Ӵ�

  6. boolean find( int start )

     ����Matcher����, ���ҳ�����Ŀ���ַ������ָ����λ�ÿ�ʼ������һ��ƥ����Ӵ���

  7. String group()

     ���ص�ǰ���һ�õ�����ƥ��������Ӵ����ݡ�

  8. String group( int group )
 
     ���ص�ǰ���Ŷ���õ���ָ������ƥ����Ӵ�����

  9. int groupCount()

     ���ص�ǰ��������õ�ƥ�����������

  10. boolean lookingAt()

     ���Ŀ���ַ����Ƿ���ƥ����Ӵ���ʼ

  11. boolean matches()

     ���Զ�����Ŀ���ַ�չ��ƥ����, Ҳ����ֻ������Ŀ���ַ�����ȫƥ��ʱ�ŷ�����ֵ.

  12. Pattern pattern()

     ���ظ�Matcher���������ƥ��ģʽ, Ҳ���Ƕ�Ӧ��Pattern����.

  13. String replaceAll( String replacement ) 

     ��Ŀ���ַ����������ģʽ��ƥ����Ӵ�ȫ���滻Ϊָ�����ַ���.

  14. String replaceFirst( String replacement )

     ��Ŀ���ַ������һ�������ģʽ��ƥ����Ӵ��滻Ϊָ�����ַ���.

  15. Matcher reset()

     �����Matcher����.

  16. Matcher reset( CharSequence input )

     �����Matcher ���� ����ָ��һ���µ�Ŀ���ַ���.

  17. int start()

     ���ص�ǰ���������Ӵ��Ŀ�ʼ�ַ���ԭĿ���ַ����е�λ��.

  18. int start( int group )

     ���ص�ǰ��������õĺ�ָ����ƥ����Ӵ��ĵ�һ���ַ���ԭĿ���ַ����е�λ��. 

.  һ��Matcher ʵ�� �Ǳ�������Ŀ���ַ������л��ڼ���ģʽ(Ҳ����һ��������Pattern �������������ʽ)����ƥ����ҵ�, ������ Matcher �����붼��ͨ�� CharSequence �ӿ��ṩ��, ��������Ŀ�����ڿ���֧�ֶԴӶ�Ԫ��������Դ�ṩŶ������ݽ���ƥ�乤��.

 
. 