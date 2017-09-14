. 参见:
 
      http://blog.163.com/xx_jun_/blog/static/208275209201262693422730/

. Map 简介

      将键映射到值的对象. 一个映射不能包含重复的键; 每个键最多只能映射到一个值.   此接口取代Dictionary 类, 后者完全是一个抽象类, 而不是一个接口.

      Map 接口提供三种collection 视图, 允许以键集、值集 或 键-值映射关系集 的形式查看某个映射的内容.   映射顺序定义为迭代器 在映射的collection 视图上返回其元素的顺序. 某些映射实现可明确保证其顺序, 如 TreeMap 类; 另一些映射实现则不保证顺序, 如 HashMap 类.

      注: 将可变对象用作映射键时必须格外小心. 当对象是映射中某个键时, 如果以影响equals 比较的方式更改了对象的值, 则映射的行为将是不确定的.  此项精致的一种特殊情况是不允许某个 映射将自身作为一个键包含. 虽然允许某个映射将自身作为值包含, 但请格外小心: 在这样的映射上 equals 和 hashCode 方法的定义将不再是明确的.

      所有通用的映射实现类 应该提供两个"标准的"构造方法: 一个void(无参数)构造方法, 用于创建空映射; 一个是带有单个Map 类型参数的构造方法, 用于创建一个与其参数具有相同键-值映射关系的新映射. 实际上, 后一个构造方法允许用户复制任意映射, 生成所需类的一个等价映射.  经过无法强制执行此建议(因为接口不能包含构造方法), 但是JDK 中所有通用的映射实现都遵从它.

      此接口中包含的"破坏" 方法可修改其操作的映射, 如果此映射不支持该操作, 和谐方法将抛出 UnsupportedOperationException.  如果是这样, 那么在调用对映射无效时, 这些方法可以(但不要求) 抛出 UnsupportedOperationException . 例如, 如果某个不可修改的映射(其映射关系是"重叠"的) 为空, 则对该映射调用 putAll(Map) 方法时, 可以(但不要求) 抛出异常.

      某些映射实现对可能包含的键和值有所限制. 例如, 某些实现禁止 null 键和值, 另一些则对其键的类型有限制. 尝试插入不合格的键或值将抛出一个未经检查的异常, 通常是 NullPointerException 或 ClassCastException。   视图查询是否存在不合格的键或值 可能抛出异常, 或者返回false; 某些实现将表现出前一种行为, 而另一些则表现后一种. 一般来说, 视图对不合格的键或值执行操作且该操作的完成不会导致不合格的元素被插入映射中时, 将可能抛出一个异常, 也可能操作成功, 这取决于实现本身. 这样的异常在此接口的规范中标记为"可选".

      此接口是 Java Collections Framework 的成员.

      Collections Framework 接口中的很多方法是根据equals 方法定义的. 例如, containsKey( Object key) 方法的规范中写道:" 当且仅当此映射包含针对满足( key == null ? k == null : key.equals(k) ) 的键 k 的映射关系时, 返回true"。  不应将此规范解释为: 调用具有非空参数 key 的Map.containsKey 将导致对任意的键k 调用 key.equals(k)。  实现可随意进行优化, 以避免调用 equals, 例如, 可首先比较两个键的哈希码( Object.hashCode() 规范保证哈希码不相等的两个对象不会相等). 一般来说, 只要实现者认为合适, 各种 Collections Framework 接口 的实现可随意利用底层 Object 方法的指定行为.

      常用操作说明

      void clear()     从映射中移除所有映射关系( 可选操作 ).

      boolean containsKey(Object key)

          如果此映射包含指定键的映射关系, 则返回true.

      boolean containsValue(Object value)
    
          如果此映射将一个或多个键值映射到指定值, 则返回true。

      Set<Map.Entry<K,V>> entrySet()    
 
          返回此映射中包含的映射关系的Set 视图.

      boolean equals(Object o)    比较指定的对象与此映射是否相等.

      V get(Object key)   

          返回指定键所映射的值; 如果此映射不包含改建的映射关系, 则返回null.

      int hashCode()       返回此映射的哈希码值

      boolean isEmpty()    如果此映射为包含键-值映射关系, 则返回true.

      Set<K> keySet()      返回此映射中包含的键的Set 视图.

      V put(K key, V value)   将指定的值与此映射中的指定键关联(可选操作).

      void putAll(Map<? extends K, ? extends V>m)   从指定映射中将所有映射关系复制到此映射中(可选操作)

      V remove(Object key) 如果存在一个键的映射关系, 则将其从此映射中移除(可选操作).

      int size()           返回此映射中的键-值映射关系数.

      Collection<V> values()   返回此映射中包含的值的Collection 视图.

. Map 的一般用法

  1. 声明一个Map

     Map map = new HashMap();

  2. 向 map 中放值, 注意: map 是key-value 的形式存放的, 如:

     map.put("sa", "dd");

  3. 从map 中取值

     String str = map.get("sa").toString;

     结果是: str = "dd"

  4. 遍历一个map, 从中取得key 和value:

     Map m=new HashMap();

     for ( Object obj: map.keySet() ) {
         Object value = map.get(obj);
     }
          
. 关于 HashMap 和LinkedHashmap 

参见:

    http://www.blogjava.net/japper/archive/2012/09/05/387091.html

 java为数据结构中的映射定义了一个接口java.util.Map;它有四个实现类,分别是HashMap 
Hashtable LinkedHashMap 和TreeMap.

Map主要用于存储健值对，根据键得到值，因此不允许键重复(重复了覆盖了),但允许值重复。
Hashmap 
是一个最常用的Map,它根据键的HashCode值存储数据,根据键可以直接获取它的值，具有很快的访问速度，遍历时，取得数据的顺序是完全随机的。 
HashMap最多只允许一条记录的键为Null;允许多条记录的值为 
Null;HashMap不支持线程的同步，即任一时刻可以有多个线程同时写HashMap;可能会导致数据的不一致。如果需要同步，可以用 
Collections的synchronizedMap方法使HashMap具有同步的能力，或者使用ConcurrentHashMap。

Hashtable与 
HashMap类似,它继承自Dictionary类，不同的是:它不允许记录的键或者值为空;它支持线程的同步，即任一时刻只有一个线程能写Hashtable,因此也导致了 
Hashtable在写入时会比较慢。

LinkedHashMap 
是HashMap的一个子类，保存了记录的插入顺序，在用Iterator遍历LinkedHashMap时，先得到的记录肯定是先插入的.也可以在构造时用带参数，按照应用次数排序。在遍历的时候会比HashMap慢，不过有种情况例外，当HashMap容量很大，实际数据较少时，遍历起来可能会比 
LinkedHashMap慢，因为LinkedHashMap的遍历速度只和实际数据有关，和容量无关，而HashMap的遍历速度和他的容量有关。

TreeMap实现SortMap接口，能够把它保存的记录根据键排序,默认是按键值的升序排序，也可以指定排序的比较器，当用Iterator 
遍历TreeMap时，得到的记录是排过序的。

一般情况下，我们用的最多的是HashMap,在Map 中插入、删除和定位元素，HashMap 
是最好的选择。但如果您要按自然顺序或自定义顺序遍历键，那么TreeMap会更好。如果需要输出的顺序和输入的相同,那么用LinkedHashMap 
可以实现,它还可以按读取顺序来排列.

HashMap是一个最常用的Map，它根据键的hashCode值存储数据，根据键可以直接获取它的值，具有很快的访问速度。HashMap最多只允许一条记录的键为NULL，允许多条记录的值为NULL。

HashMap不支持线程同步，即任一时刻可以有多个线程同时写HashMap，可能会导致数据的不一致性。如果需要同步，可以用Collections的synchronizedMap方法使HashMap具有同步的能力。

Hashtable与HashMap类似，不同的是：它不允许记录的键或者值为空；它支持线程的同步，即任一时刻只有一个线程能写Hashtable，因此也导致了Hashtable在写入时会比较慢。

LinkedHashMap保存了记录的插入顺序，在用Iterator遍历LinkedHashMap时，先得到的记录肯定是先插入的。

在遍历的时候会比HashMap慢TreeMap能够把它保存的记录根据键排序，默认是按升序排序，也可以指定排序的比较器。当用Iterator遍历TreeMap时，得到的记录是排过序的。
 

LinkedHashmap 的特点是put进去的对象位置未发生变化,而HashMap会发生变化