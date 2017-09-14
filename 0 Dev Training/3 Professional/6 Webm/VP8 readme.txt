参见:

    http://zh.wikipedia.org/wiki/VP8

. 编码

   目前 VP8 只能通过libvpx 来进行编码, google 聘用了FFmpeg 的开发者 Ronald Bultje 来开发基于x264 架构的VP8编码器, 称为 xvp8， 将来发布后会继承在x264中.  而芬兰的WebM硬件开发团队则是发布了暂存器 转换 层次结构(Register transfer level) 的VP8硬件编码器, 提供给半导体制造商免费试用.

. 解码

   libvpx 可以解码VP8的图像, 在2010年7月23日, FFmpeg 的开发者 Jason Garrett-Glaser、Ronald Bultje 和 David Conrad 发布了名为 ffvp8 的VP8 解码器, 测试结果显示 ffvp8 比 google 自己的 libvpx 解码器性能更佳.  另外 WebM 项目的硬件团队也有发布暂存器 转换层次结构( Register transfer level) 的硬件解码器，同样是免费使用.

. 和 H.264 的比较

  H.264 是目前使用最多的网络图像编码格式, 因此最常拿来和VP8做比较.

  H.264 的编码技术包括技术(由 MPEG-LA提供授权), 而且在硬件上使用需要取得授权, VP8 则不需要. 即使有Google 的背书, 但VP8 仍然很难避过所有的专利, 其下场可能跟VC-1 如出一辙.  管理H.264 专利池的MPEG LA 声称 有12家公司持有 Google VP8 的相关专利.  

  美国MPEG LA 表示:"创建VP8 专利池的相关准备正在进行"。 2013年三月, Google 与 MPEG LA 及11个专利持有者达成协议, 让Google 取得VP8 以及其之前的VPx 等编码所可能侵犯的专利授权, 同时 Google 也可以无偿再次授权相关专利给VP8 的用户, 此协议同时 适用于下一代VPx 编码. 

   至此 MPEG LA 放弃成立 VP8 专利集中授权联盟, VP8 的用户将可确定无偿使用此编码而无需担心 可能的 专利侵权授权金的问题。

   根据 MSU Graphics & Media Lab 在 2011年5月的测试, VP8 需要约213%的数据量, 才能达到和H.264 相同的图像质量.

   x264 的开发者之一: Jason Garrett-Glaser, 给了一些针对VP8 的评论, 他认为VP8 目前并没有实现真正的比特流规范, 而且在一些编码的技术上有所欠缺.


