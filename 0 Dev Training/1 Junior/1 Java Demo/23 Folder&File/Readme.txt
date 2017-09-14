. Java 对文件目录的操作

  参见：

     http://tieba.baidu.com/f?kz=265014975

     http://wenku.baidu.com/view/07e2bbfc700abb68a982fbe4.html

. 1. 读取文件属性

    File af = new File( %%1 );

    if ( af.exists() ) {
	System.out.println( f.getName() + "的属性如下: 文件长度为: " + f.length() );
        System.out.println( f.isFile() ? "是文件" : "不是文件" );
        System.out.println( f.isDirectory() ? "是目录" : "不是目录" );
        System.out.println( f.canRead() ? "可读取" : "不可读取" );
	System.out.println( f.canWrite() ? "是隐藏文件" : "" );
        System.out.println( "文件夹的最后修改日期为 : " + new Date( f.lastModified() ) );
    }

