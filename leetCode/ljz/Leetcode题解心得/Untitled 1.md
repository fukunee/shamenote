数据库类型：MySQL
连接名字：mysql
数据库名字：board_game
数据库表：

USER_INFO
CREATE TABLE `board_game`.`user_info`  (
  `U_ID` int(0) NOT NULL AUTO_INCREMENT COMMENT '识别用户的主键',
  `U_NAME` varchar(32) NULL COMMENT '用户名',
  `U_PASW` varchar(32) NULL COMMENT '用户密码',
  `U_EXP` int(0) NULL COMMENT '经验值',
  `U_LEV` int(0) NULL COMMENT '等级',
  `U_CREDIT` int(0) NULL COMMENT '积分',
  `G_HIS_ID` int(0) NULL COMMENT '游戏记录id',
  PRIMARY KEY (`U_ID`)
);

GAME_HIS_INFO
CREATE TABLE `board_game`.`game_his_info`  (
  `G_HIS_ID` int(0) NOT NULL AUTO_INCREMENT COMMENT '游戏记录id',
  `U_ID` int(0) NULL COMMENT '玩家id',
  `U_NAME` varchar(32) NULL COMMENT '玩家名字',
  `G_ID` int(0) NULL COMMENT '游戏id',
  `G_NAME` varchar(255) NULL COMMENT '游戏名字',
  `G_HIS_RET` char(1) NULL COMMENT '游戏结果 0 失败 1 胜利 2平局',
  `G_HIS_TIME` int(0) NULL COMMENT '游戏持续的时间  单位是分钟',
  `G_HIS_AEXP` int(0) NULL COMMENT '这局游戏让玩家增加的经验值',
  `G_HIS_ACREDIT` int(0) NULL COMMENT '这局游戏让玩家增加的积分',
  PRIMARY KEY (`G_HIS_ID`)
);

GAME_INFO
CREATE TABLE `board_game`.`game_info`  (
  `G_ID` int(0) NOT NULL AUTO_INCREMENT COMMENT '游戏id',
  `G_NAME` varchar(255) NULL COMMENT '游戏名字',
  PRIMARY KEY (`G_ID`)
);

框架选择：sping boot + mysql + mybatis + thymeleaf
组织名：com.bgame
项目名：boardGame
src.main.java.com.bgame->entity
                    controll
                    dao
                    service
                    config
                    exception
                    gameControll
src.main.resources->static->css
			   templates
			   js
                    
SDK: JAVA version 1.8.0_212

