. Java ���ļ�Ŀ¼�Ĳ���

  �μ���

     http://tieba.baidu.com/f?kz=265014975

     http://wenku.baidu.com/view/07e2bbfc700abb68a982fbe4.html

. 1. ��ȡ�ļ�����

    File af = new File( %%1 );

    if ( af.exists() ) {
	System.out.println( f.getName() + "����������: �ļ�����Ϊ: " + f.length() );
        System.out.println( f.isFile() ? "���ļ�" : "�����ļ�" );
        System.out.println( f.isDirectory() ? "��Ŀ¼" : "����Ŀ¼" );
        System.out.println( f.canRead() ? "�ɶ�ȡ" : "���ɶ�ȡ" );
	System.out.println( f.canWrite() ? "�������ļ�" : "" );
        System.out.println( "�ļ��е�����޸�����Ϊ : " + new Date( f.lastModified() ) );
    }

