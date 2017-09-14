. 0 HelloWorld

  第一个例子, 创建了一个PDF 文件, 文件内容只有一句"Hello World"

. 1 HelloWorldBurst

  第二个例子, 创建了一个多页的pdf 文件.  原来的例子可以使用API将生成的PDF拆分为每页都单独成为一个PDF文件.

. 2. HelloWorldAbsolute

  第三个例子, 在PDF文件中绝对坐标位置显示"Hello World"

. 3. HelloWorldAddMetadata

  第4个例子. 给pdf 文件增加 metadata信息: 标题，作者，科目， 关键字，创建者等等.

. 4. HelloWorldBlue

  第5个例子. 创建带背景蓝色的pdf文件

. 5. HelloWorldBookmarks

  创建一个带有目录(bookmark, 可索引到目标内容)的pdf 文件, 将bookmark 提取出来, 输出到一个xml文件中

. 6. HelloWorldCopy

  创建3个pdf文件, 都只有一页, 分别为: 文字， 注释, 链接。 然后将3个文件内容拷贝到一个文件中， 分别为1，2，3页。

. 7. HelloWorldCopyFields 

  创建3个pdf文件, 都只有一页, 分别为: 文字， 域值。 然后将3个文件内容拷贝到一个文件中， 分别为1，2，3页。

. 8. HelloWorldCopyForm

  同7类似, 但是演示了同名域 复制过程中的 只有第一个会被复制，后面的被忽略。

. 9. HelloWorldCopyStamp

  与7，8 类似, 用来演示 多个Pdf复制为一个pdf后 ,有2个域, 可以分别修改2个域的内容

. 10. HelloWorldForm

  与 7, 8, 9 类似, 不过这个只是演示域内容的修改以及域修改后的设置(这个没看出区别)。

. 11. HelloWorldGraphics2D

  创建一个pdf 文件, 文件内容是一个2D图片.  图片内容是固定位置的一个字符串"Hello World"

. 12. HelloWorldImportedPages

  这个很有意思. 创建一个多页的PDF, 然后将该pdf 的页面缩印 作为内容创建一个新的pdf.

. 13. HelloWorldLandscape

  这个也很有意思. 在PDF 页面中创建了一个小的内部范围，里面可以自由缩放，缩放后, 内部的内容也会随之缩放。

  PageSize.LETTER.rotate() 的使用演示.

. 14. HelloWorldLandscape2

  与13 类似. 不过缩放的范围是自定义的.

. 15. HelloWorldLetter
  
  与13 类似。  PageSize.LETTER 的演示.

. 16. HelloWorldMargins
  
  演示页边距的设置. 这个例子使用  PageSize.A5, 36, 72, 108, 180   . A5的缩放. 后面是左,右,上,下的页边距(单位是pt)

. 17. HelloWorldMetadata

  演示了创建的pdf 中包含 普通内容, RTF页面, HTML 页面。 不过v5.4.3 好像已经不支持rtf, html 的处理了. ???

  好像iText 更专注于PDF的处理了。

. 18. HelloWorldMirroredMargins

  演示页边距设置。 多页。

. 19. HelloWorldMultiple

  由于//import com.itextpdf.text.html.HtmlWriter;
      //import com.itextpdf.text.rtf.RtfWriter2;
  这2个类不能用, 演示实际没有效果。

  原本是要显示PDF, RTF, HTML 3个文件的

. 20. HelloWorldNarrow 

  页面很窄的pdf 演示.   定制页面宽度的演示.

. 21. HelloWorldOpen

  创建一个pdf, 在open 之前设置页面的尺寸，页边距等，然后增加内容, 结果增加后的内容是按照设置的数据显示的。 这样的意义是可以有多页不同格式的页面存在。

. 22. HelloWorldPartialReader

  演示了读取PDF文件的2中方式对内存的使用情况: 全部读取， 随机对取(部分读取)。

 Memory used by the full read: -133824
 Memory used by the partial read: 5536

  似乎全部读取省内存。。。？？？

. 23. HelloWorldSelectPages                       *********************

  创建一个多页的pdf。 然后将其中指定的页面重新组合后创建一个新的pdf。  很有用.

. 24. HelloWorldSelectedPages

  与23 功能相同. 但是实现方式不同, 更加便捷。

. 25. HelloWorldStampCopy

  修改域内容.   将一页通过修改于内容变成2页重新创建一个新的pdf.

. 26. HelloWorldStampCopyStamp

  修改域名， 然后更改域的值，再合并为新的pdf。

. 27. HelloWorldStamper

  在pdf 文件内容中增加一个jpg 的图片作为背景, 并画了一个红色的椭圆(实际是个圆形).  增加了页脚(page 1等等)  这是丰富化pdf 显示的一种演示.

. 28. HelloWorldStamper2

  与27 类似, 稍有区别。

. 29. HelloWorldStamperAdvanced

  增强的邮戳处理. 增加注释框。  有用。

. 30. HelloWorldStamperImportedPages

  将多页的缩印显示在一页中, 并在也中间增加一个注释框说明.  很有意思。

. 31. HelloWorldSystemOut

  将创建的pdf 内容通过System.out 输出显示. 不保存为文件.

. 32. HelloWorldVersion_1_6

  设置创建的pdf 文件的 pdf 版本

. 33. HelloWorldWriter

  将原pdf 中的4页显示在一页， 并增加折纸类似的分割线, 即按照一张纸折叠的话, 正好是顺序。 便于出版使用。
