
. 0. HelloWorldCompression

    ����һ��pdf�� Ȼ��ֱ�ȫ��ѹ���ͽ�ѹ��, �鿴�ļ���С�仯.

    Size c:/HelloWorldCompressed.pdf: 4019         ԭ�ļ�
    Size c:/HelloWorldFullCompression.pdf: 3290    ��ȫѹ��
    Size c:/HelloWorldDecompressed.pdf: 5696       һҳҳ�Ŀ�����

. 1. HelloWorldEncryptDecrypt

   pdf �ļ�Ȩ�޹������ʾ����.  �����⣬52��: ִ�г��쳣

			stamper.setEncryption("Hello".getBytes(), "World".getBytes(),
					PdfWriter.ALLOW_PRINTING | PdfWriter.ALLOW_COPY,
					PdfWriter.STANDARD_ENCRYPTION_40);

   ��������, ����Ϊ��Ҫ����BC ��jar��:  bcprov-jdk15on-149.jar,  bcpkix-jdk15on-149.jar (�����ʹ�õ�CMS����)

   ��Ҫ����ע�����:

       pdfbox 1.8.2.jar ��Ҳ����BC, �������ϰ汾��, ���� 149 ��ͻ. 

. 2. HelloWorldEncrypted

  ��1 ����, ����ͬ���Ĵ���

 			writer.setEncryption("Hello".getBytes(), "World".getBytes(),
					PdfWriter.ALLOW_COPY | PdfWriter.ALLOW_PRINTING, 										PdfWriter.STANDARD_ENCRYPTION_128);
  ͬ1 һ�����.

. 3. HelloWorldFullyCompressed

  ������ӻ����� 0 ����ʾ���ˡ�

. 4. HelloWorldMaximum

  ����ҳ���С������. ������õķǳ���

. 5. HelloWorldUncompressed

  δѹ����pdf ʾ��. û��ɶ����ʾ��, ��0 �ж�����ʾ.


