. �μ�:

  http://www.oschina.net/code/snippet_5189_608?from=rss

  http://www.cnblogs.com/YSO1983/archive/2009/12/07/1618564.html     �ǳ���

. 1. java ���㺺���ַ����ĳ���ʱ�� ���ǰ����ֽڣ�����һ������Ϊһ�����ȵ�λ�� ����:

  str = "�����ؿ�";

  k = str.length();  // ����4 

. 2. �ж��ַ������Ƿ���� ָ�����Ӵ� indexOf() ,���û�ң��ͷ���-1�� ����ͷ����Ӵ���ĸ���е�λ�á�

  str = "Hello World";

  if ( str.indexOf( "World") ) {
       System.out.println "�������>=0"��
  }

. 3. �ַ�����Ϊ������

/**
����* ��һ���ַ���ת��Ϊ������
����*/
public static InputStream getStringStream(String sInputString){
����if (sInputString != null && !sInputString.trim().equals("")){
����try{
����ByteArrayInputStream tInputStringStream = new ByteArrayInputStream(sInputString.getBytes());
����return tInputStringStream;
����}catch (Exception ex){
����ex.printStackTrace();
����}
����}
����return null;
} 

. 4. ��unicode���븳ֵ���ַ���

    	int     u = 0x65B0
            
        String ab = new String(Character.toChars(u)) 
            
        println ab

     ������ֽ����飬ֱ��new String(bs)

        byte[]   desbuf = new byte[22]

        desbuf = read( fs, 0, 22)    // ��ȡ22�ֽڵ��ֽ���

        // desbuf ����Ϊ: 0052006F006F007400200045006E0074007200790000

        // ��desbuf �ֽ����е�����ת��Ϊ�ַ���

        String	str = new String(desbuf)    // str ����Ϊ: " R o o t   E n t r y   "�� ע�� �м�Ŀհ�ֻ��һ���ǿո�, ��������0ֵ��ASCII�ַ��� Ϊ�˱��ڴ���, Ӧ�ý��ֽ����е�00�ȹ��˵�. ���ж�4�ֽ����Ƿ�Ϊ��, �������Ϊ����, ������, ��Ϊ������ASCII�ַ�, ���˵�00. 
      