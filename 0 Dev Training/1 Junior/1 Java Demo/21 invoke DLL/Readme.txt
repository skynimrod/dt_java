. 运行

   java TestJNA

   返回以下错误:


Exception in thread "main" java.lang.NoClassDefFoundError: TestJNA (wrong name:
com/sun/jna/examples/TestJNA)
        at java.lang.ClassLoader.defineClass1(Native Method)
        at java.lang.ClassLoader.defineClass(Unknown Source)
        at java.security.SecureClassLoader.defineClass(Unknown Source)
        at java.net.URLClassLoader.defineClass(Unknown Source)
        at java.net.URLClassLoader.access$100(Unknown Source)
        at java.net.URLClassLoader$1.run(Unknown Source)
        at java.security.AccessController.doPrivileged(Native Method)
        at java.net.URLClassLoader.findClass(Unknown Source)
        at java.lang.ClassLoader.loadClass(Unknown Source)
        at sun.misc.Launcher$AppClassLoader.loadClass(Unknown Source)
        at java.lang.ClassLoader.loadClass(Unknown Source)
        at java.lang.ClassLoader.loadClassInternal(Unknown Source)

F:\Tools\6 R & D\1 Dev Tools\0 Java\0 Dev Training\1 Junior\1 Java Demo\21 invoke DLL>

  原因是 TestJNA.java  中定义了 Package， 但是通过命令行编译不会自动部署到相关目录下， 注释
    
     //package com.sun.jna.examples;

. 重新编译， 执行， 返回以下错误:

   java TestJNA

   返回如下错误:

Exception in thread "main" java.lang.NoClassDefFoundError: com/sun/jna/Library
        at java.lang.ClassLoader.defineClass1(Native Method)
        at java.lang.ClassLoader.defineClass(Unknown Source)
        at java.security.SecureClassLoader.defineClass(Unknown Source)
        at java.net.URLClassLoader.defineClass(Unknown Source)
        at java.net.URLClassLoader.access$100(Unknown Source)
        at java.net.URLClassLoader$1.run(Unknown Source)
        at java.security.AccessController.doPrivileged(Native Method)
        at java.net.URLClassLoader.findClass(Unknown Source)
        at java.lang.ClassLoader.loadClass(Unknown Source)
        at sun.misc.Launcher$AppClassLoader.loadClass(Unknown Source)
        at java.lang.ClassLoader.loadClass(Unknown Source)
        at java.lang.ClassLoader.loadClassInternal(Unknown Source)
        at TestJNA.main(TestJNA.java:19)

F:\Tools\6 R & D\1 Dev Tools\0 Java\0 Dev Training\1 Junior\1 Java Demo\21 invok
e DLL>

. 按如下格式执行:

     java -classpath .;jna.jar TestJNA

  OK， 运行成功.

. ava—C和操作系统数据类型的对应表

Java Type
	

C Type
	

Native Representation

boolean
	

int
	

32-bit integer (customizable)

byte
	

char
	

8-bit integer

char
	

wchar_t
	

platform-dependent

short
	

short
	

16-bit integer

int
	

int
	

32-bit integer

long
	

long long, __int64
	

64-bit integer

float
	

float
	

32-bit floating point

double
	

double
	

64-bit floating point

Buffer
Pointer
	

pointer
	

platform-dependent (32- or 64-bit pointer to memory)

<T>[] (array of primitive type)
	

pointer
array
	

32- or 64-bit pointer to memory (argument/return)
contiguous memory (struct member)

除了上面的类型，JNA还支持常见的数据类型的映射。

String
	

char*
	

NUL-terminated array (native encoding or jna.encoding)

WString
	

wchar_t*
	

NUL-terminated array (unicode)

String[]
	

char**
	

NULL-terminated array of C strings

WString[]
	

wchar_t**
	

NULL-terminated array of wide C strings

Structure
	

struct*
struct
	

pointer to struct (argument or return) (or explicitly)
struct by value (member of struct) (or explicitly)

Union
	

union
	

same as Structure

Structure[]
	

struct[]
	

array of structs, contiguous in memory

Callback
	

<T> (*fp)()
	

function pointer (Java or native)

NativeMapped
	

varies
	

depends on definition

NativeLong
	

long
	

platform-dependent (32- or 64-bit integer)

PointerType
	

pointer
	

same as Pointer
