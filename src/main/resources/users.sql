/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : test1

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-10-26 13:46:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `userName` varchar(32) DEFAULT NULL COMMENT '用户名',
  `passWord` varchar(32) DEFAULT NULL COMMENT '密码',
  `user_sex` varchar(32) DEFAULT NULL,
  `nick_name` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('28', 'aa', 'a123456', 'MAN', null);
INSERT INTO `users` VALUES ('29', 'bb', 'b123456', 'WOMAN', null);
INSERT INTO `users` VALUES ('30', 'cc', 'b123456', 'WOMAN', null);
INSERT INTO `users` VALUES ('31', 'aa', 'a123456', 'MAN', null);
INSERT INTO `users` VALUES ('32', 'bb', 'b123456', 'WOMAN', null);
INSERT INTO `users` VALUES ('33', 'cc', 'b123456', 'WOMAN', null);
INSERT INTO `users` VALUES ('40', 'aa', 'a123456', 'MAN', null);
INSERT INTO `users` VALUES ('41', 'bb', 'b123456', 'WOMAN', null);
INSERT INTO `users` VALUES ('42', 'cc', 'b123456', 'WOMAN', null);
