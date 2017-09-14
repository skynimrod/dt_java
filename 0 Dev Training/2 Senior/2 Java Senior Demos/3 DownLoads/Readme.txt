. 由于2 DownLoad 中的下载部分实现有问题， 但是想保留技术验证过程， 不再继续在其基础上进行修改， 重新建了一个目录 3 DownLoads 来进行实现。

  该目录下 testDownLoad.java  已经测试通过， 可以下载.  不过该例子中无法获取文件长度, 因为 返回的Heads 

. 实现思路:

  1. 下载部分采用 Package 的方式实现. 

     com/AquGen/Util            实现一些 工具接口

                    /file         文件相关处理的包
                    /download     下载相关处理的包
                    /Exception    自定义的异常包
                    /DBOperator   数据库操作

     com/AquGen/ShareSys        简易股票信息系统

     需要注意的是, 所有的 interface 均类似于 C/C++的头文件(.h)， 属于抽象类， 只定义接口, 不进行实现. 

  2. 从 ShareSys  的需求来丰富 Util 中的功能.

  3. ShareSys 需求如下:
    
     a. 通过页面 录入Share 基本信息， 存储到DB Server

     b. 更新Share  主力数据变化, 存储到 DB Server

        这部分分为2部分. 

        b.1 下载 Share 主力数据详单到Server 指定目录

        b.2  解析 下载的数据文件, 将处理后的数据存储到 DB Server

     c. 数据挖掘

        c.1  查询基本面好的前5名share

        c.2  查询 当日 加仓前5名股票

        c.3  查询 当日 减仓前5名股票

        c.4  查询 连续3日下跌的股票

        c.5  查询 净现值小于xx的股票
  
        c.6  
    
    
  4. ShareSys 体系结构

   B/S结构, 数据存放在 Web Server DB 中. 