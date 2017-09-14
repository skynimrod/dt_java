. 参见:

      正则表达式的基础知识 参见：

         http://baike.baidu.com/link?url=HEK4temGqcWcvhbaqFW7f6LYK1DQaPaXjekq4QdzxOLi2Bs7Et5t8i9F2Cm09DOI

      正则表达式的Java 应用   百度 搜索 "Java Matcher"

         http://www.jb51.net/article/17943.htm

. Java.util.regex 是一个用正则表达式 所定制的模式 来对字符串进行比配工作的类库包.  

  它包括两个类: Pattern 和 Matcher 

  Pattern   是一个正则表达式经编以后的表现模式;

  Matcher   一个Matcher 对象 是一个状态及其, 它依据Pattern 对象作为匹配模式对字符串展开匹配检查.

  首先一个Pattern 实例 定制了一个所用语法与PERL  类似的正则表达式经编以后的模式, 然后一个Matcher 实例 在这个给定的Pattern 实例的模式控制下进行字符串的匹配工作.

. Pattern 类

  方法如下:

  1.  static Pattern compile(String regex)

      将给定的正则表达式编译并赋予给 Pattern 类

  2.  static Pattern compile(String regex, int flags)

      同上, 但增加flag参数的制定, 可选的参数包括: CASEINSENSITIVE, MULITILINE, DOTALL, UNICODECASE, CANNOEQ

  3. int flags()

      返回当前Pattern 的匹配flag 参数

  4. Matcher mathcer( CharSequence input)

     生成一个给定命名的Matcher 对象

  5. static boolean matches(String regex, CharSequence input)

     编译给定的正则表达式并且对输入的字符串以该正则表达式 为模式开展匹配, 该方法适用于该正则表达式 只是用一次的情况, 也就是只进行一次匹配工作, 因为这种情况下并不需要生成一个Matchar实例.

  6. String pattern()

     返回 该Patter 对象所编译的正则表达式

  7. String[] split( CharSequence input)

     将目标字符串按照Pattern 里所包含的正则表达式为模进行分割

  8. String[] split(CharSequence input, int limit)

     作用同上, 增加参数limit 目的在于要指定分割的段数, 如将 limit 设为2, 那么目标字符串将根据正则表达式分为两段.

. 一个正则表达式, 也就是遗传有特定意义的字符, 必须首先要编译成为一个pattern类的实例, 这个Pattern 对象会使用matter( 方法来生成一个Matcher 实例, 接着便可以使用Matcher实例 以编译的正则表达式为基础对目标字符串进行匹配工作, 多个Matcher是可以共用一个Patter对象的.

. 例子:

import java.util.regex.*; 

public class Replacement{ 
public static void main(String[] args) throws Exception { 

	// 生成一个Pattern,同时编译一个正则表达式 
	Pattern p = Pattern.compile("[/]+"); 
	//用Pattern的split()方法把字符串按"/"分割 
	String[] result = p.split( 
			"Kevin has seen《LEON》seveal times,because it is a good film." 
			+"/ 凯文已经看过《这个杀手不太冷》几次了，因为它是一部" 
			+"好电影。/名词:凯文。"); 
	
	for (int i=0; i<result.length; i++) 
	System.out.println(result[i]); 
} 
} 


输出结果为： 
Kevin has seen《LEON》seveal times,because it is a good film. 
凯文已经看过《这个杀手不太冷》几次了，因为它是一部好电影。 
名词:凯文。 

. Matcher 类

  方法如下:

  1. Matcher appendReplacement( StringBuffer sb, String replacement )

     将当前匹配子串 替换为指定字符串, 并且将替换后的子串以及其之前到上次匹配子串之后的字符串添加到一个StringBuffer对象里

  2. StringBuffer appendTail( StringBuffer sb )
   
     将最后一次匹配工作后剩余的字符串添加到一个StringBuffer对象里.

  3. int end()

     返回当前匹配的子串的最后一个字符在原目标字符串中的索引位置.

  4. int end( int group)
     
     返回与匹配模式里指定的组相匹配的子串最后一个字符的位置。

  5. boolean find()

     尝试在目标字符串里查找下一个匹配子串

  6. boolean find( int start )

     重设Matcher对象, 并且尝试在目标字符串里从指定的位置开始查找下一个匹配的子串。

  7. String group()

     返回当前查找获得的与组匹配的所有子串内容。

  8. String group( int group )
 
     返回当前朝着而获得的与指定的组匹配的子串内容

  9. int groupCount()

     返回当前查找所获得的匹配组的数量。

  10. boolean lookingAt()

     检测目标字符串是否以匹配的子串开始

  11. boolean matches()

     尝试对整个目标字符展开匹配检测, 也就是只有整个目标字符串完全匹配时才返回真值.

  12. Pattern pattern()

     返回该Matcher对象的现有匹配模式, 也就是对应的Pattern对象.

  13. String replaceAll( String replacement ) 

     将目标字符串里与既有模式相匹配的子串全部替换为指定的字符串.

  14. String replaceFirst( String replacement )

     将目标字符串里第一个与既有模式相匹配的子串替换为指定的字符串.

  15. Matcher reset()

     重设该Matcher对象.

  16. Matcher reset( CharSequence input )

     重设该Matcher 对象 并且指定一个新的目标字符串.

  17. int start()

     返回当前查找所获子串的开始字符在原目标字符串中的位置.

  18. int start( int group )

     返回当前查找所获得的和指定组匹配的子串的第一个字符在原目标字符串中的位置. 

.  一个Matcher 实例 是被用来对目标字符串进行基于既有模式(也就是一个给定的Pattern 所编译的正则表达式)进行匹配查找的, 所有往 Matcher 的输入都是通过 CharSequence 接口提供的, 这样做的目的在于可以支持对从多元化的数据源提供哦你的数据进行匹配工作.

 
. 