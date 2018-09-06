/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50641
Source Host           : localhost:3306
Source Database       : bbs_db

Target Server Type    : MYSQL
Target Server Version : 50641
File Encoding         : 65001

Date: 2018-08-27 17:10:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_dictionary`
-- ----------------------------
DROP TABLE IF EXISTS `t_dictionary`;
CREATE TABLE `t_dictionary` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(50) NOT NULL COMMENT '名称',
  `description` varchar(500) DEFAULT NULL COMMENT '描述',
  `is_enabled` bit(1) NOT NULL DEFAULT b'1' COMMENT '是否启用',
  `is_deleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '是否已删除',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='字典表';

-- ----------------------------
-- Records of t_dictionary
-- ----------------------------
INSERT INTO `t_dictionary` VALUES ('1', '权限', '角色权限', '', '', '2018-08-20 15:12:49');

-- ----------------------------
-- Table structure for `t_dictionary_item`
-- ----------------------------
DROP TABLE IF EXISTS `t_dictionary_item`;
CREATE TABLE `t_dictionary_item` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `parent_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '父id',
  `name` varchar(50) NOT NULL COMMENT '名称',
  `description` varchar(500) DEFAULT NULL COMMENT '描述',
  `sort_id` int(2) NOT NULL DEFAULT '0' COMMENT '排序字段',
  `is_enabled` bit(1) NOT NULL DEFAULT b'1' COMMENT '是否启用',
  `is_deleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '是否已删除',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COMMENT='字典详情表';

-- ----------------------------
-- Records of t_dictionary_item
-- ----------------------------
INSERT INTO `t_dictionary_item` VALUES ('1', '1', '添加评论', '允许用户评论', '0', '', '', '2018-08-20 15:14:16');
INSERT INTO `t_dictionary_item` VALUES ('2', '1', '删除自己评论', '允许用户删除自己的评论内容', '0', '', '', '2018-08-20 15:14:32');
INSERT INTO `t_dictionary_item` VALUES ('3', '1', '删除他人评论', '允许用户删除他人评论', '0', '', '', '2018-08-20 15:17:28');
INSERT INTO `t_dictionary_item` VALUES ('4', '1', '发表帖子', '允许用户发表帖子', '0', '', '', '2018-08-20 15:34:27');
INSERT INTO `t_dictionary_item` VALUES ('5', '1', '关闭帖子', '允许用户关闭帖子', '0', '', '', '2018-08-20 15:34:41');
INSERT INTO `t_dictionary_item` VALUES ('6', '1', '修改帖子', '允许用户修改帖子', '0', '', '', '2018-08-20 15:34:55');
INSERT INTO `t_dictionary_item` VALUES ('7', '1', '...', '允许用户查看他人帖子', '0', '', '', '2018-08-20 15:35:19');
INSERT INTO `t_dictionary_item` VALUES ('8', '1', '删除他人帖子', '允许用户删除他人帖子', '0', '', '', '2018-08-20 15:35:40');
INSERT INTO `t_dictionary_item` VALUES ('9', '1', '删除自己帖子', '允许用户删除自己发表的帖子内容', '0', '', '', '2018-08-20 15:36:09');

-- ----------------------------
-- Table structure for `t_menu`
-- ----------------------------
DROP TABLE IF EXISTS `t_menu`;
CREATE TABLE `t_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `parent_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '父级id',
  `name` varchar(50) NOT NULL COMMENT '名称',
  `description` varchar(500) DEFAULT NULL COMMENT '描述',
  `is_enabled` bit(1) NOT NULL DEFAULT b'1' COMMENT '是否启用',
  `is_deleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '是否已删除',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='菜单表';

-- ----------------------------
-- Records of t_menu
-- ----------------------------

-- ----------------------------
-- Table structure for `t_module`
-- ----------------------------
DROP TABLE IF EXISTS `t_module`;
CREATE TABLE `t_module` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `parent_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '父id',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `description` varchar(500) DEFAULT NULL COMMENT '描述',
  `is_enabled` bit(1) NOT NULL DEFAULT b'1' COMMENT '是否启用',
  `is_deleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '是否已删除',
  `create_user` bigint(20) NOT NULL DEFAULT '1' COMMENT '创建者id',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8mb4 COMMENT='模块表';

-- ----------------------------
-- Records of t_module
-- ----------------------------
INSERT INTO `t_module` VALUES ('1', '0', 'MIUI专区', null, '', '', '1', '2018-08-20 16:50:02');
INSERT INTO `t_module` VALUES ('2', '1', '产品发布', null, '', '', '1', '2018-08-20 16:50:16');
INSERT INTO `t_module` VALUES ('3', '1', 'BUG反馈', null, '', '', '1', '2018-08-20 16:50:25');
INSERT INTO `t_module` VALUES ('4', '1', '新功能建议', null, '', '', '1', '2018-08-20 16:50:38');
INSERT INTO `t_module` VALUES ('5', '1', '开发组那点事', null, '', '', '1', '2018-08-20 16:50:48');
INSERT INTO `t_module` VALUES ('6', '1', '开发者交流', null, '', '', '1', '2018-08-20 16:50:56');
INSERT INTO `t_module` VALUES ('7', '1', '小米云服务', null, '', '', '1', '2018-08-20 16:51:03');
INSERT INTO `t_module` VALUES ('8', '1', '小米金融', null, '', '', '1', '2018-08-20 16:51:54');
INSERT INTO `t_module` VALUES ('9', '1', '多看阅读', null, '', '', '1', '2018-08-20 16:52:01');
INSERT INTO `t_module` VALUES ('10', '1', '小米钱包', null, '', '', '1', '2018-08-20 16:52:06');
INSERT INTO `t_module` VALUES ('11', '1', '小米移动', null, '', '', '1', '2018-08-20 16:52:12');
INSERT INTO `t_module` VALUES ('12', '1', '应用商店', null, '', '', '1', '2018-08-20 16:52:17');
INSERT INTO `t_module` VALUES ('13', '1', '小米助手', null, '', '', '1', '2018-08-20 16:52:23');
INSERT INTO `t_module` VALUES ('14', '0', '小米/生态', null, '', '', '1', '2018-08-20 16:52:36');
INSERT INTO `t_module` VALUES ('15', '14', '小米商城', null, '', '', '1', '2018-08-20 16:52:47');
INSERT INTO `t_module` VALUES ('16', '14', '小米互娱', null, '', '', '1', '2018-08-20 16:52:55');
INSERT INTO `t_module` VALUES ('17', '14', '小米路由器', null, '', '', '1', '2018-08-20 16:53:00');
INSERT INTO `t_module` VALUES ('18', '14', '小米电视', null, '', '', '1', '2018-08-20 16:53:05');
INSERT INTO `t_module` VALUES ('19', '14', '小米手环', null, '', '', '1', '2018-08-20 16:53:12');
INSERT INTO `t_module` VALUES ('20', '14', '有品', null, '', '', '1', '2018-08-20 16:53:23');
INSERT INTO `t_module` VALUES ('21', '14', '小爱同学', null, '', '', '1', '2018-08-20 16:53:32');
INSERT INTO `t_module` VALUES ('22', '14', '黑纱游戏手机', null, '', '', '1', '2018-08-20 16:53:47');
INSERT INTO `t_module` VALUES ('23', '0', '谈天说地', null, '', '', '1', '2018-08-20 16:53:59');
INSERT INTO `t_module` VALUES ('24', '23', '米粉福利社', null, '', '', '1', '2018-08-20 16:54:24');
INSERT INTO `t_module` VALUES ('25', '23', '灌者为王', null, '', '', '1', '2018-08-20 16:54:30');
INSERT INTO `t_module` VALUES ('26', '23', '贴图自拍', null, '', '', '1', '2018-08-20 16:54:35');
INSERT INTO `t_module` VALUES ('27', '23', '极客播报', null, '', '', '1', '2018-08-20 16:54:44');
INSERT INTO `t_module` VALUES ('28', '23', '米车生活', null, '', '', '1', '2018-08-20 16:54:53');
INSERT INTO `t_module` VALUES ('29', '0', '资源分享', null, '', '', '1', '2018-08-20 16:54:58');
INSERT INTO `t_module` VALUES ('30', '29', '主题', null, '', '', '1', '2018-08-20 16:55:03');
INSERT INTO `t_module` VALUES ('31', '29', '软件', null, '', '', '1', '2018-08-20 16:55:07');
INSERT INTO `t_module` VALUES ('32', '29', '游戏', null, '', '', '1', '2018-08-20 16:55:11');
INSERT INTO `t_module` VALUES ('33', '29', '壁纸', null, '', '', '1', '2018-08-20 16:55:14');
INSERT INTO `t_module` VALUES ('34', '29', '字体', null, '', '', '1', '2018-08-20 16:55:20');
INSERT INTO `t_module` VALUES ('35', '29', '汉化资源', null, '', '', '1', '2018-08-20 16:55:24');
INSERT INTO `t_module` VALUES ('36', '0', '站务专区', null, '', '', '1', '2018-08-20 16:55:29');
INSERT INTO `t_module` VALUES ('37', '36', '版块/版务申请', null, '', '', '1', '2018-08-20 16:55:59');
INSERT INTO `t_module` VALUES ('38', '36', '投诉处理', null, '', '', '1', '2018-08-20 16:56:06');

-- ----------------------------
-- Table structure for `t_post`
-- ----------------------------
DROP TABLE IF EXISTS `t_post`;
CREATE TABLE `t_post` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `module_id` bigint(20) NOT NULL COMMENT '模块id',
  `module_title` varchar(100) NOT NULL COMMENT '模块名称',
  `first_floor` text COMMENT '第一楼内容',
  `height` bigint(20) DEFAULT '0' COMMENT '楼层高度',
  `description` varchar(500) DEFAULT NULL COMMENT '描述',
  `is_top` bit(1) NOT NULL DEFAULT b'0' COMMENT '是否置顶',
  `is_enabled` bit(1) NOT NULL DEFAULT b'1' COMMENT '是否启用',
  `is_deleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '是否已删除',
  `create_user` bigint(20) NOT NULL COMMENT '创建者id',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='帖子表';

-- ----------------------------
-- Records of t_post
-- ----------------------------
INSERT INTO `t_post` VALUES ('1', '【2018年8月17日】MIUI 第384周更新发布 祝大家七夕节日快乐！', '2', '产品发布', '▍发布时间\r\nMIUI 开发版 8.8.16 11:00 推送', '1', null, '', '', '', '1', '2018-08-20 16:57:57');

-- ----------------------------
-- Table structure for `t_post_repay`
-- ----------------------------
DROP TABLE IF EXISTS `t_post_repay`;
CREATE TABLE `t_post_repay` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `post_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '帖子id',
  `parent_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '父id',
  `floor_index` bigint(20) NOT NULL DEFAULT '0' COMMENT '楼层号',
  `content_type` bigint(20) NOT NULL DEFAULT '0' COMMENT '回复内容类型',
  `content` text NOT NULL COMMENT '回复内容',
  `is_enabled` bit(1) NOT NULL DEFAULT b'1' COMMENT '是否启用',
  `is_deleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '是否已删除',
  `create_user` bigint(20) NOT NULL COMMENT '创建者id',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='回帖表';

-- ----------------------------
-- Records of t_post_repay
-- ----------------------------

-- ----------------------------
-- Table structure for `t_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `parent_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '父级id',
  `name` varchar(50) NOT NULL COMMENT '名称',
  `sort_id` int(2) NOT NULL DEFAULT '0' COMMENT '排序字段',
  `description` varchar(500) DEFAULT NULL COMMENT '描述',
  `is_enabled` bit(1) NOT NULL DEFAULT b'1' COMMENT '是否启用',
  `is_deleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '是否已删除',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COMMENT='管理员角色表';

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('1', '0', '普通用户', '0', '普通用户', '', '', '2018-08-20 15:08:52');
INSERT INTO `t_role` VALUES ('2', '0', '超级管理员', '3', 'super manager', '', '', '2018-08-20 15:11:25');
INSERT INTO `t_role` VALUES ('3', '0', '吧务', '1', 'manager', '', '', '2018-08-20 15:28:46');
INSERT INTO `t_role` VALUES ('4', '0', '版主', '2', 'The moderator', '', '', '2018-08-20 15:29:29');

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `account` varchar(50) NOT NULL COMMENT '账号',
  `nick_name` varchar(50) DEFAULT NULL COMMENT '昵称',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机号',
  `email` varchar(50) DEFAULT NULL COMMENT '电子邮件地址',
  `gender` int(1) DEFAULT NULL COMMENT '性别,0-女,1-男',
  `role_id` bigint(20) NOT NULL DEFAULT '1' COMMENT '用户权限',
  `role_name` varchar(50) NOT NULL COMMENT '权限名称',
  `signature` varchar(500) DEFAULT NULL COMMENT '个性签名',
  `registe_time` datetime DEFAULT NULL COMMENT '注册时间',
  `registre_ip` varchar(32) DEFAULT NULL COMMENT '注册ip',
  `is_enabled` bit(1) NOT NULL DEFAULT b'1' COMMENT '是否启用',
  `is_deleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '是否已删除',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'd16f8f433e584003a50d88d02156401e', null, null, '18405814768', null, null, '1', '????', null, null, null, '', '', '2018-08-27 16:50:10');
