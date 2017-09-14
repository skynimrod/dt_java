. 参见:

  http://www.oschina.net/code/snippet_5189_608?from=rss

  http://www.cnblogs.com/YSO1983/archive/2009/12/07/1618564.html     非常好

. 1. java 计算汉字字符串的长度时， 不是按照字节，而是一个汉字为一个长度单位， 例如:

  str = "中联重科";

  k = str.length();  // 返回4 

. 2. 判断字符串中是否包含 指定的子串 indexOf() ,如果没找，就返回-1， 否则就返回子串在母串中的位置。

  str = "Hello World";

  if ( str.indexOf( "World") ) {
       System.out.println "如果返回>=0"，
  }

. 3. 字符串作为输入流

/**
　　* 将一个字符串转化为输入流
　　*/
public static InputStream getStringStream(String sInputString){
　　if (sInputString != null && !sInputString.trim().equals("")){
　　try{
　　ByteArrayInputStream tInputStringStream = new ByteArrayInputStream(sInputString.getBytes());
　　return tInputStringStream;
　　}catch (Exception ex){
　　ex.printStackTrace();
　　}
　　}
　　return null;
} 

. 4. 将unicode代码赋值给字符串

    	int     u = 0x65B0
            
        String ab = new String(Character.toChars(u)) 
            
        println ab

     如果是字节数组，直接new String(bs)

        byte[]   desbuf = new byte[22]

        desbuf = read( fs, 0, 22)    // 读取22字节的字节流

        // desbuf 内容为: 0052006F006F007400200045006E0074007200790000

        // 将desbuf 字节流中的内容转换为字符串

        String	str = new String(desbuf)    // str 内容为: " R o o t   E n t r y   "， 注意 中间的空白只有一个是空格, 其他都是0值的ASCII字符。 为了便于处理, 应该将字节流中的00先过滤掉. 即判断4字节中是否为负, 如果是则为汉字, 不过滤, 不为负则是ASCII字符, 过滤掉00. 
      