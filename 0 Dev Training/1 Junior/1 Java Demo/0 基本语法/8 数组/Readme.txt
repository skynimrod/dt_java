�������������ݵļ��ϣ������е�ÿ��Ԫ�ؾ�����ͬ�����������±���Ψһ��ȷ�������е�Ԫ�ء�

��5.1һά����

һ��һά����Ķ���

type arrayName[];

��������(type)����ΪJava��������������ͣ�����������������ͣ�������arrayNameΪһ���Ϸ��ı�ʶ����[]ָ���ñ�����һ���������ͱ��������磺

int intArray[];

������һ���������飬�����е�ÿ��Ԫ��Ϊ�������ݡ���C��C++��ͬ��Java������Ķ����в���Ϊ����Ԫ�ط����ڴ棬���[]�в���ָ��������Ԫ�ظ����������鳤�ȣ����Ҷ������϶����һ�������ǲ��ܷ��������κ�Ԫ�صġ����Ǳ���Ϊ�������ڴ�ռ䣬��ʱҪ�õ������new�����ʽ���£�

arrayName=new type[arraySize];

���У�arraySizeָ������ĳ��ȡ��磺

intArray=new int[3];

Ϊһ�������������3��int��������ռ�ݵ��ڴ�ռ䡣

ͨ�����������ֿ��Ժ���һ�𣬸�ʽ���£�

type arrayName=new type[arraySize]; 

���磺

int intArray=new int[3];

����һά����Ԫ�ص�����

������һ�����飬���������newΪ���������ڴ�ռ�󣬾Ϳ������������е�ÿһ��Ԫ���ˡ�����Ԫ�ص����÷�ʽΪ��

arrayName[index]

���У�indexΪ�����±꣬������Ϊ���ͳ�������ʽ����a[3]��b[i](iΪ����)��c[6*I]�ȡ��±� ��0��ʼ��һֱ������ĳ��ȼ�1���������������е�in-tArray����˵������3��Ԫ�أ��ֱ�Ϊ�� 

intArray[0]��intArray[1]��intArray[2]��ע�⣺û��intArray[3]��

���⣬��C��C++�в�ͬ��Java������Ԫ��Ҫ����Խ�����Ա�֤��ȫ�ԡ�ͬʱ������ÿ�����鶼��һ������lengthָ�����ĳ��ȣ����磺intArray.lengthָ������intArray�ĳ��ȡ�

��5.1

public class ArrayTest{
public static void main(String args[]){
int i;
int a[]=newint[5];
for(i=0;i��5;i++)
a[i]=i;
for(i=a.length-1;i��=0;i--)
System.out.println("a["+i+"]="+a[i]);
}
}

���н�����£�

C:\��java ArrayTest

a[4]=4
a[3]=3
a[2]=2
a[1]=1
a[0]=0

�ó���������е�ÿ��Ԫ�ظ�ֵ��Ȼ�����������

����һά����ĳ�ʼ��

������Ԫ�ؿ��԰������������ӽ��и�ֵ��Ҳ�����ڶ��������ͬʱ���г�ʼ����

���磺

int a[]={1��2��3��4��5};

�ö���(��)�ָ�����ĸ���Ԫ�أ�ϵͳ�Զ�Ϊ�������һ���ռ䡣

��C�в�ͬ����ʱJava��Ҫ������Ϊ��̬(static)��

�ġ�һά������������

��5.2Fibonacci����

Fibonacci���еĶ���Ϊ��

F1=F2=1��Fn=Fn-1+Fn-2(n��=3)

public classFibonacci{
public static void main(String args[]){
int i;
int f[]=new int[10];
f[0]=f[1]=1;
for(i=2;i��10;i++)
f[i]=f[i-1]+f[i-2];
for(i=1;i��=10;i++)
System.out.println("F["+i+"]="+f[i-1]);
}
}

���н��Ϊ��

C:\��java Fibonacci

F[1]=1
F[2]=1
F[3]=2
F[4]=3
F[5]=5
F[6]=8
F[7]=13
F[8]=21
F[9]=34
F[10]=55

��5.3ð�ݷ�����(��С����)

ð�ݷ���������ڵ�����Ԫ�ؽ��бȽϣ�����С��Ԫ�ؽ���ǰ�档

public class BubbleSort{
public static void main(String args[]){
int i��j;
int intArray[]={30��1��-9��70��25};
int l=intArray.length;
for(i=0;i��l-1;i++)
for(j=i+1;j��l;j++)
if(intArray[i]��intArray[j]){
int t=intArray[i];
intArray[i]=intArray[j];
intArray[j]=t;
}
for(i=0;i��l;i++)
System.out.println(intArray[i]+"");
}
}

���н��Ϊ��

C:\��java BubbleSort
-9
1
25
30
70

��5.2��ά����

��C��C++һ����Java�ж�ά���鱻������������顣�����ά����Ϊһ�������һά���飬��ÿ��Ԫ������һ��һά���顣����������Ҫ�Զ�ά��Ϊ��������˵������ά����������Ƶġ�

һ����ά����Ķ���

��ά����Ķ��巽ʽΪ��

type arrayName[][];

���磺

int intArray[][];

��һά����һ������ʱ������Ԫ��Ҳû�з����ڴ�ռ䣬ͬҪʹ�������new�������ڴ棬Ȼ��ſ��Է���ÿ��Ԫ�ء�

�Ը�ά������˵�������ڴ�ռ������漸�ַ�����

1ֱ��Ϊÿһά����ռ䣬�磺

int a[][]=new int[2][3];

2�����ά��ʼ���ֱ�Ϊÿһά����ռ䣬�磺

int a[][]=new int[2][];
a[0]=new int[3];
a[1]=new int[3];

���1����ͬ�Ĺ��ܡ���һ����C��C++�ǲ�ͬ�ģ���C��C++�б���һ��ָ��ÿһά�ĳ��ȡ�

������ά����Ԫ�ص�����

�Զ�ά������ÿ��Ԫ�أ����÷�ʽΪ��arrayName[index1][index2] ����index1��index2Ϊ�±꣬��Ϊ���ͳ�������ʽ����a[2][3]�ȣ�ͬ����ÿһά���±궼��0��ʼ��

������ά����ĳ�ʼ��

�����ַ�ʽ��

1ֱ�Ӷ�ÿ��Ԫ�ؽ��и�ֵ��

2�ڶ��������ͬʱ���г�ʼ����

�磺int a[][]={{2��3}��{1��5}��{3��4}};

������һ��3��2�����飬����ÿ��Ԫ�ظ�ֵ��

�ġ���ά���������

��5.4�������

��������Am��n��Bn��l��˵õ�Cm��l��ÿ��Ԫ��Cij=?aik*bk (i=1..m��n=1..n)

public class MatrixMultiply{
public static void main(String args[]){
int i��j��k;
int a[][]=new int[2][3];
int b[][]={{1��5��2��8}��{5��9��10��-3}��{2��7��-5��-18}};
int c[][]=new int[2][4];
for(i=0;i��2;i++)
for(j=0;j��3;j++)
a[i][j]=(i+1)*(j+2);
for(i=0;i��2;i++){
for(j=0;j��4;j++){
c[i][j]=0;
for(k=0;k��3;k++)
c[i][j]+=a[i][k]*b[k][j];
}
}
System.out.println("\n***MatrixA***");
for(i=0;i��2;i++){
for(j=0;j��3;j++)
System.out.print(a[i][j]+"");
System.out.println();
}
System.out.println("\n***MatrixB***");
for(i=0;i��3;i++){
for(j=0;j��4;j++)
System.out.print(b[i][j]+"");
System.out.println();
}
System.out.println("\n***MatrixC***");
for(i=0;i��2;i++){
for(j=0;j��4;j++)
System.out.print(c[i][j]+"");
System.out.println();
}
}
}

����Ϊ��

C:\��java MatrixMultiply

for(j=0;j��4;j++)
System.out.print(c[i][j]+"");
System.out.println();
}
}
}

����Ϊ��

C:\��java MatrixMultiply

***MatrixA***
2 3 4
4 6 8
***MatrixB***
1 5 2 8
5 9 10 -3
2 7 -5 -18
***MatrixC***
25 65 14 -65
50 130 28 -130


�����ѧ�����Դ�����Ӧ�ÿ��ԱȽϺõ�����ά���顣
��ά����;����Ͻ��ܡ�

a[i][j]���ǵ�i-1�еĵ�j-1�е�Ԫ�أ���Ϊ�±��Ǵ�0��ʼ�ġ�
���磺
һ�����飺1  2  3
          4  5  6
a[0][0]=1 a[0][1]=2 a[0][2]=3
a[1][0]=3 a[1][1]=5 a[1][2]=6
���Ƽ��㿴�����飺
1.Thinking in Java
2.Java 2 ���ļ���
3.Java2ʵ�ý̳�
4.���������������java���� 

�ο����ϣ� JAVA����