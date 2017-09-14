
set names gbk;

DROP DATABASE IF EXISTS `BLOG_DB`;

create database `BLOG_DB`;
 
use `BLOG_DB`;

--
-- Table structure for table `ReadmeTbl`
--

DROP TABLE IF EXISTS `ReadmeTbl`;

CREATE TABLE `ReadmeTbl` (
  `DBGenTime` 				varchar(20) 				NOT NULL,
  `SupportVer` 				varchar(20) ,
  `SupportDetail`			varchar(512), 
  `ProdID`						int 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ReadmeTbl`
--

LOCK TABLES `ReadmeTbl` WRITE;
/*!40000 ALTER TABLE `ReadmeTbl` DISABLE KEYS */;
INSERT INTO `ReadmeTbl` VALUES ( "2014-05-05",'1.2.7.203.0','BLOG ϵͳ',1);
/*!40000 ALTER TABLE `ReadmeTbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userinfoTbl`
--

DROP TABLE IF EXISTS `userinfoTbl`;

CREATE TABLE `userinfoTbl` (
  `id` 				varchar(32)			NOT NULL,
  `name` 			varchar(32) 			NOT NULL unique,
  `password`			varchar(32)			NOT NULL, 
  primary key(id)
  
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `userinfoTbl`
--

LOCK TABLES `userinfoTbl` WRITE;
/*!40000 ALTER TABLE `userinfoTbl` DISABLE KEYS */;
INSERT INTO `userinfoTbl` VALUES ( "01",'admin','helloworld');
/*!40000 ALTER TABLE `userinfoTbl` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `messageTbl`
--

DROP TABLE IF EXISTS `messageTbl`;

CREATE TABLE `messageTbl` (
  `id` 				varchar(32)			NOT NULL,
  `title` 			varchar(32) 			NOT NULL,
  `content` 			varchar(2000) 			NOT NULL,
  `user_id` 			varchar(32) 			NOT NULL,
  primary key(id),
  foreign key(user_id) references userinfoTbl(id)
  
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `messageTbl`
--


--
-- Table structure for table `replymessageTbl`
--

DROP TABLE IF EXISTS `replymessageTbl`;

CREATE TABLE `replymessageTbl` (
  `id` 				varchar(32)			NOT NULL,
  `username` 			varchar(32) 			NOT NULL,
  `title` 			varchar(32) 			NOT NULL,
  `content` 			varchar(2000) 			NOT NULL,
  `message_id` 			varchar(32) 			NOT NULL,
  primary key(id),
  foreign key(message_id) references messageTbl(id)
  
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `replymessageTbl`
--






