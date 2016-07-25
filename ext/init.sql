CREATE TABLE IF NOT EXISTS `fitness`.`user` (
  `user_id` INT NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `open_id` VARCHAR(64) NULL,
  `union_id` VARCHAR(64) NULL,
  `user_name` VARCHAR(64) NULL COMMENT '用户名称',
  `sex` TINYINT NULL COMMENT '性别(0:未知,1:男,2:女)',
  `phone` VARCHAR(11) NULL COMMENT '手机号',
  `city` VARCHAR(128) NULL COMMENT '城市',
  `province` VARCHAR(128) NULL COMMENT '省份',
  `country` VARCHAR(128) NULL COMMENT '国家',
  `icon` VARCHAR(256) NULL COMMENT '用户头像',
  `create_time` DATETIME NULL COMMENT '注册时间',
  `login_time` DATETIME NULL COMMENT '最后登录时间',
  PRIMARY KEY (`user_id`),
  UNIQUE INDEX `user_id_UNIQUE` (`user_id` ASC),
  UNIQUE INDEX `open_id_UNIQUE` (`open_id` ASC))
ENGINE = InnoDB
COMMENT = '用户表';

CREATE TABLE IF NOT EXISTS `fitness`.`store` (
  `store_id` INT NOT NULL AUTO_INCREMENT,
  `store_name` VARCHAR(45) NULL COMMENT '门店名称',
  `lng` VARCHAR(10) NULL COMMENT '经度',
  `lat` VARCHAR(10) NULL COMMENT '纬度',
  `tel_number` VARCHAR(20) NULL COMMENT '电话',
  `phone` VARCHAR(11) NULL COMMENT '手机',
  `manager` VARCHAR(64) NULL COMMENT '门店管理人',
  `introduction` VARCHAR(120) NULL COMMENT '门店介绍',
  `logo` VARCHAR(64) NULL COMMENT '门店logo',
  `province` INT NULL COMMENT '省',
  `city` INT NULL COMMENT '市',
  `create_time` DATETIME NULL COMMENT '创建时间',
  `update_time` DATETIME NULL COMMENT '修改时间',
  PRIMARY KEY (`store_id`),
  UNIQUE INDEX `store_id_UNIQUE` (`store_id` ASC))
ENGINE = InnoDB
COMMENT = '门店表';

CREATE TABLE IF NOT EXISTS `fitness`.`course` (
  `course_id` INT NOT NULL AUTO_INCREMENT COMMENT '课程id',
  `course_name` VARCHAR(64) NULL COMMENT '课程名称',
  `store_id` INT NULL COMMENT '门店id',
  `type` TINYINT(4) NULL COMMENT '课程类型 (0:未知,1:团操,2:crossfit)',
  `start_time` DATETIME NULL COMMENT '上课开始时间',
  `end_time` DATETIME NULL COMMENT '上课结束时间',
  `coach_name` VARCHAR(64) NULL COMMENT '任课教练',
  `classroom` VARCHAR(64) NULL COMMENT '教室',
  `train_level` INT NULL COMMENT '虐练指数',
  `logo` VARCHAR(50) NULL,
  `slide_pic` VARCHAR(150) NULL COMMENT '轮播图，最多3张',
  `remark` VARCHAR(500) NULL COMMENT '课程简介',
  PRIMARY KEY (`course_id`),
  UNIQUE INDEX `course_id_UNIQUE` (`course_id` ASC))
ENGINE = InnoDB
COMMENT = '课程表';

CREATE TABLE IF NOT EXISTS `fitness`.`province` (
  `province_id` INT NOT NULL,
  `name` VARCHAR(64) NULL,
  PRIMARY KEY (`province_id`),
  UNIQUE INDEX `province_id_UNIQUE` (`province_id` ASC))
ENGINE = InnoDB
COMMENT = '省表';

CREATE TABLE IF NOT EXISTS `fitness`.`city` (
  `city_id` INT NOT NULL,
  `name` VARCHAR(64) NULL,
  `province_id` INT NULL,
  PRIMARY KEY (`city_id`),
  UNIQUE INDEX `city_id_UNIQUE` (`city_id` ASC))
ENGINE = InnoDB
COMMENT = '城市表';

