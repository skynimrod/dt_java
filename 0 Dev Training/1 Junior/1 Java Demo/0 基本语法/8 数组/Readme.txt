数组是有序数据的集合，数组中的每个元素具有相同的数组名和下标来唯一地确定数组中的元素。

§5.1一维数组

一、一维数组的定义

type arrayName[];

其中类型(type)可以为Java中任意的数据类型，包括简单类型组合类型，数组名arrayName为一个合法的标识符，[]指明该变量是一个数组类型变量。例如：

int intArray[];

声明了一个整型数组，数组中的每个元素为整型数据。与C、C++不同，Java在数组的定义中并不为数组元素分配内存，因此[]中不用指出数组中元素个数，即数组长度，而且对于如上定义的一个数组是不能访问它的任何元素的。我们必须为它分配内存空间，这时要用到运算符new，其格式如下：

arrayName=new type[arraySize];

其中，arraySize指明数组的长度。如：

intArray=new int[3];

为一个整型数组分配3个int型整数所占据的内存空间。

通常，这两部分可以合在一起，格式如下：

type arrayName=new type[arraySize]; 

例如：

int intArray=new int[3];

二、一维数组元素的引用

定义了一个数组，并用运算符new为它分配了内存空间后，就可以引用数组中的每一个元素了。数组元素的引用方式为：

arrayName[index]

其中：index为数组下标，它可以为整型常数或表达式。如a[3]，b[i](i为整型)，c[6*I]等。下标 从0开始，一直到数组的长度减1。对于上面例子中的in-tArray数来说，它有3个元素，分别为： 

intArray[0]，intArray[1]，intArray[2]。注意：没有intArray[3]。

另外，与C、C++中不同，Java对数组元素要进行越界检查以保证安全性。同时，对于每个数组都有一个属性length指明它的长度，例如：intArray.length指明数组intArray的长度。

例5.1

public class ArrayTest{
public static void main(String args[]){
int i;
int a[]=newint[5];
for(i=0;i＜5;i++)
a[i]=i;
for(i=a.length-1;i＞=0;i--)
System.out.println("a["+i+"]="+a[i]);
}
}

运行结果如下：

C:\＞java ArrayTest

a[4]=4
a[3]=3
a[2]=2
a[1]=1
a[0]=0

该程序对数组中的每个元素赋值，然后按逆序输出。

三、一维数组的初始化

对数组元素可以按照上述的例子进行赋值。也可以在定义数组的同时进行初始化。

例如：

int a[]={1，2，3，4，5};

用逗号(，)分隔数组的各个元素，系统自动为数组分配一定空间。

与C中不同，这时Java不要求数组为静态(static)。

四、一维数组程序举例：

例5.2Fibonacci数列

Fibonacci数列的定义为：

F1=F2=1，Fn=Fn-1+Fn-2(n＞=3)

public classFibonacci{
public static void main(String args[]){
int i;
int f[]=new int[10];
f[0]=f[1]=1;
for(i=2;i＜10;i++)
f[i]=f[i-1]+f[i-2];
for(i=1;i＜=10;i++)
System.out.println("F["+i+"]="+f[i-1]);
}
}

运行结果为：

C:\＞java Fibonacci

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

例5.3冒泡法排序(从小到大)

冒泡法排序对相邻的两个元素进行比较，并把小的元素交到前面。

public class BubbleSort{
public static void main(String args[]){
int i，j;
int intArray[]={30，1，-9，70，25};
int l=intArray.length;
for(i=0;i＜l-1;i++)
for(j=i+1;j＜l;j++)
if(intArray[i]＞intArray[j]){
int t=intArray[i];
intArray[i]=intArray[j];
intArray[j]=t;
}
for(i=0;i＜l;i++)
System.out.println(intArray[i]+"");
}
}

运行结果为：

C:\＞java BubbleSort
-9
1
25
30
70

§5.2多维数组

与C、C++一样，Java中多维数组被看作数组的数组。例如二维数组为一个特殊的一维数组，其每个元素又是一个一维数组。下面我们主要以二维数为例来进行说明，高维的情况是类似的。

一、二维数组的定义

二维数组的定义方式为：

type arrayName[][];

例如：

int intArray[][];

与一维数组一样，这时对数组元素也没有分配内存空间，同要使用运算符new来分配内存，然后才可以访问每个元素。

对高维数组来说，分配内存空间有下面几种方法：

1直接为每一维分配空间，如：

int a[][]=new int[2][3];

2从最高维开始，分别为每一维分配空间，如：

int a[][]=new int[2][];
a[0]=new int[3];
a[1]=new int[3];

完成1中相同的功能。这一点与C、C++是不同的，在C、C++中必须一次指明每一维的长度。

二、二维数组元素的引用

对二维数组中每个元素，引用方式为：arrayName[index1][index2] 其中index1、index2为下标，可为整型常数或表达式，如a[2][3]等，同样，每一维的下标都从0开始。

三、二维数组的初始化

有两种方式：

1直接对每个元素进行赋值。

2在定义数组的同时进行初始化。

如：int a[][]={{2，3}，{1，5}，{3，4}};

定义了一个3×2的数组，并对每个元素赋值。

四、二维数组举例：

例5.4矩阵相乘

两个矩阵Am×n、Bn×l相乘得到Cm×l，每个元素Cij=?aik*bk (i=1..m，n=1..n)

public class MatrixMultiply{
public static void main(String args[]){
int i，j，k;
int a[][]=new int[2][3];
int b[][]={{1，5，2，8}，{5，9，10，-3}，{2，7，-5，-18}};
int c[][]=new int[2][4];
for(i=0;i＜2;i++)
for(j=0;j＜3;j++)
a[i][j]=(i+1)*(j+2);
for(i=0;i＜2;i++){
for(j=0;j＜4;j++){
c[i][j]=0;
for(k=0;k＜3;k++)
c[i][j]+=a[i][k]*b[k][j];
}
}
System.out.println("\n***MatrixA***");
for(i=0;i＜2;i++){
for(j=0;j＜3;j++)
System.out.print(a[i][j]+"");
System.out.println();
}
System.out.println("\n***MatrixB***");
for(i=0;i＜3;i++){
for(j=0;j＜4;j++)
System.out.print(b[i][j]+"");
System.out.println();
}
System.out.println("\n***MatrixC***");
for(i=0;i＜2;i++){
for(j=0;j＜4;j++)
System.out.print(c[i][j]+"");
System.out.println();
}
}
}

其结果为：

C:\＞java MatrixMultiply

for(j=0;j＜4;j++)
System.out.print(c[i][j]+"");
System.out.println();
}
}
}

其结果为：

C:\＞java MatrixMultiply

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


如果你学过线性代数，应该可以比较好地理解多维数组。
多维数组和矩阵结合紧密。

a[i][j]就是第i-1行的第j-1列的元素，因为下标是从0开始的。
比如：
一个数组：1  2  3
          4  5  6
a[0][0]=1 a[0][1]=2 a[0][2]=3
a[1][0]=3 a[1][1]=5 a[1][2]=6
我推荐你看几本书：
1.Thinking in Java
2.Java 2 核心技术
3.Java2实用教程
4.面向对象程序设计与java语言 

参考资料： JAVA概述