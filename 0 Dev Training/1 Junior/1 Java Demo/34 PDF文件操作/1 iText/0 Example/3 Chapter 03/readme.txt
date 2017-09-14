
. 0. HelloWorldCompression

    创建一个pdf， 然后分别全部压缩和解压缩, 查看文件大小变化.

    Size c:/HelloWorldCompressed.pdf: 4019         原文件
    Size c:/HelloWorldFullCompression.pdf: 3290    完全压缩
    Size c:/HelloWorldDecompressed.pdf: 5696       一页页的拷贝的

. 1. HelloWorldEncryptDecrypt

   pdf 文件权限管理的演示例子.  有问题，52行: 执行出异常

			stamper.setEncryption("Hello".getBytes(), "World".getBytes(),
					PdfWriter.ALLOW_PRINTING | PdfWriter.ALLOW_COPY,
					PdfWriter.STANDARD_ENCRYPTION_40);

   问题解决了, 是因为需要增加BC 的jar包:  bcprov-jdk15on-149.jar,  bcpkix-jdk15on-149.jar (这个包使用的CMS部分)

   需要另外注意的是:

       pdfbox 1.8.2.jar 中也包含BC, 不过是老版本的, 会与 149 冲突. 

. 2. HelloWorldEncrypted

  与1 类似, 还是同样的错误

 			writer.setEncryption("Hello".getBytes(), "World".getBytes(),
					PdfWriter.ALLOW_COPY | PdfWriter.ALLOW_PRINTING, 										PdfWriter.STANDARD_ENCRYPTION_128);
  同1 一样解决.

. 3. HelloWorldFullyCompressed

  这个例子基本在 0 中演示过了。

. 4. HelloWorldMaximum

  设置页面大小的例子. 这个设置的非常大。

. 5. HelloWorldUncompressed

  未压缩的pdf 示例. 没有啥可演示的, 在0 中都有演示.


