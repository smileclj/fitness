CREATE TABLE IF NOT EXISTS `fitness`.`user` (
  `user_id` INT NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `open_id` VARCHAR(64) NOT NULL,
  `union_id` VARCHAR(64) NULL,
  `user_name` VARCHAR(64) NOT NULL COMMENT '用户名称',
  `sex` TINYINT NULL DEFAULT 0 COMMENT '性别(0:未知,1:男,2:女)',
  `phone` VARCHAR(11) NULL COMMENT '手机号',
  `city` VARCHAR(128) NULL COMMENT '城市',
  `province` VARCHAR(128) NULL COMMENT '省份',
  `country` VARCHAR(128) NULL COMMENT '国家',
  `icon` VARCHAR(256) NOT NULL COMMENT '用户头像',
  `type` TINYINT(4) NULL DEFAULT 0 COMMENT '会员类别(0: 非会员,2:健身会员,3:crossfit会员,4:顶级会员[健身+crossfit])',
  `state` TINYINT(4) NULL DEFAULT 0 COMMENT '用户状态(0:正常用户[可预约],1:限制用户[只能排队],2:禁用用户)',
  `regular_store_id` INT NULL COMMENT '常去门店',
  `common_time_start` DATETIME NULL COMMENT '普通健身卡生效日',
  `common_time_end` DATETIME NULL COMMENT '普通健身卡失效日',
  `common_num` INT NULL DEFAULT 0 COMMENT '普通健身卡次数',
  `crossfit_time_start` DATETIME NULL COMMENT 'crossfit卡生效日',
  `crossfit_time_end` DATETIME NULL COMMENT 'crossfit卡失效日',
  `crossfit_num` INT NULL DEFAULT 0 COMMENT 'crossfit卡次数',
  `login_time` DATETIME NULL COMMENT '最后登录时间',
  `create_time` DATETIME NULL COMMENT '注册时间',
  PRIMARY KEY (`user_id`),
  UNIQUE INDEX `user_id_UNIQUE` (`user_id` ASC),
  UNIQUE INDEX `open_id_UNIQUE` (`open_id` ASC))
ENGINE = InnoDB
COMMENT = '用户表';

CREATE TABLE IF NOT EXISTS `fitness`.`store` (
  `store_id` INT NOT NULL AUTO_INCREMENT,
  `store_name` VARCHAR(45) NOT NULL COMMENT '门店名称',
  `lng` VARCHAR(10) NOT NULL COMMENT '经度',
  `lat` VARCHAR(10) NOT NULL COMMENT '纬度',
  `tel_number` VARCHAR(20) NULL COMMENT '电话',
  `phone` VARCHAR(11) NULL COMMENT '手机',
  `manager` VARCHAR(64) NULL COMMENT '门店管理人',
  `introduction` VARCHAR(120) NULL COMMENT '门店介绍',
  `logo` VARCHAR(64) NULL COMMENT '门店logo',
  `province` INT NOT NULL COMMENT '省',
  `city` INT NOT NULL COMMENT '市',
  `create_time` DATETIME NULL COMMENT '创建时间',
  `update_time` DATETIME NULL COMMENT '修改时间',
  `is_delete` TINYINT(4) NULL DEFAULT 0 COMMENT '是否删除(0:有效,1:删除)',
  PRIMARY KEY (`store_id`),
  UNIQUE INDEX `store_id_UNIQUE` (`store_id` ASC))
ENGINE = InnoDB
COMMENT = '门店表';

CREATE TABLE IF NOT EXISTS `fitness`.`course` (
  `course_id` INT NOT NULL AUTO_INCREMENT COMMENT '课程id',
  `course_name` VARCHAR(64) NOT NULL COMMENT '课程名称',
  `store_id` INT NULL COMMENT '门店id',
  `type` TINYINT(4) NULL DEFAULT 0 COMMENT '课程类型 (0:未知,1:团操,2:crossfit)',
  `coach_id` INT NULL COMMENT '任课教练',
  `classroom` VARCHAR(64) NULL COMMENT '教室',
  `train_level` INT NULL COMMENT '虐练指数',
  `logo` VARCHAR(50) NULL,
  `slide_pic` VARCHAR(150) NULL COMMENT '轮播图，最多3张',
  `remark` VARCHAR(500) NULL COMMENT '课程简介',
  `is_delete` TINYINT(4) NULL DEFAULT 0,
  PRIMARY KEY (`course_id`),
  UNIQUE INDEX `course_id_UNIQUE` (`course_id` ASC))
ENGINE = InnoDB
COMMENT = '课程表';

CREATE TABLE IF NOT EXISTS `fitness`.`course_plan` (
  `course_plan_id` INT NOT NULL AUTO_INCREMENT,
  `course_id` INT NULL COMMENT '关联课程id',
  `start_time` DATETIME NULL COMMENT '开始时间',
  `end_time` DATETIME NULL COMMENT '结束时间',
  `effect_time` DATETIME NULL COMMENT '生效日，yyyy-MM-dd',
  `stock` INT NULL DEFAULT 0 COMMENT '库存',
  `create_time` DATETIME NULL,
  `is_delete` TINYINT(4) NULL DEFAULT 0,
  PRIMARY KEY (`course_plan_id`),
  UNIQUE INDEX `course_plan_id_UNIQUE` (`course_plan_id` ASC))
ENGINE = InnoDB
COMMENT = '课程计划表';

CREATE TABLE IF NOT EXISTS `fitness`.`course_comment` (
  `course_comment_id` INT NOT NULL AUTO_INCREMENT,
  `course_id` INT NULL COMMENT '关联课程id',
  `user_id` INT NULL,
  `star` DECIMAL(1,1) NULL,
  `train_feel` TINYINT(4) NULL COMMENT '虐恋感受(0:未知,1:很轻松,2:顶得住,3:有点累,4:累成狗)',
  `content` VARCHAR(120) NULL,
  `create_time` DATETIME NULL,
  PRIMARY KEY (`course_comment_id`))
ENGINE = InnoDB
COMMENT = '课程评价';

CREATE TABLE IF NOT EXISTS `fitness`.`coach` (
  `coach_id` INT NOT NULL,
  `coach_name` VARCHAR(64) NOT NULL COMMENT '姓名',
  `logo` VARCHAR(50) NULL COMMENT '教练logo',
  `type` TINYINT(4) NULL DEFAULT 0 COMMENT '教练类别(0:普通教练,1:私人教练)',
  `remark` VARCHAR(256) NULL COMMENT '说明',
  `detail` TEXT NULL COMMENT '详情',
  `create_time` DATETIME NULL,
  `update_time` DATETIME NULL,
  `is_delete` TINYINT(4) NULL DEFAULT 0 COMMENT '是否删除(0:有效,1:删除)',
  PRIMARY KEY (`coach_id`))
ENGINE = InnoDB
COMMENT = '教练表';

CREATE TABLE IF NOT EXISTS `fitness`.`coach_item` (
  `coach_item_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(64) NULL COMMENT '名称',
  `remark` VARCHAR(64) NULL COMMENT '描述',
  `price` INT NULL COMMENT '项目单价',
  PRIMARY KEY (`coach_item_id`),
  UNIQUE INDEX `coach_item_id_UNIQUE` (`coach_item_id` ASC))
ENGINE = InnoDB
COMMENT = '教练购买项目表';

CREATE TABLE IF NOT EXISTS `fitness`.`coach_comment` (
  `coach_comment_id` INT NOT NULL,
  `coach_id` INT NULL,
  `user_id` INT NULL,
  `star` DECIMAL(1,1) NULL,
  `content` VARCHAR(120) NULL,
  `create_time` DATETIME NULL,
  PRIMARY KEY (`coach_comment_id`),
  UNIQUE INDEX `coach_comment_id_UNIQUE` (`coach_comment_id` ASC))
ENGINE = InnoDB
COMMENT = '教练评价';

CREATE TABLE IF NOT EXISTS `fitness`.`card` (
  `card_id` INT NOT NULL AUTO_INCREMENT,
  `card_name` VARCHAR(64) NOT NULL,
  `logo` VARCHAR(50) NULL,
  `remark` VARCHAR(20) NULL,
  `price` DECIMAL(10,2) NOT NULL,
  `bill_method` TINYINT(4) NOT NULL DEFAULT 0 COMMENT '计费方式(0:未知,1:时间,2:次数)',
  `bill_number` INT NULL DEFAULT 0 COMMENT '计费数,若采用时间计费方式，则表示天数，一个月按30天计；若采用次数计费方式，则表示次数',
  `type` TINYINT(4) NULL DEFAULT 0 COMMENT '卡类型(0:未知,1:普通卡,2:crossfit卡)',
  `id_delete` TINYINT(4) NULL,
  UNIQUE INDEX `card_id_UNIQUE` (`card_id` ASC),
  PRIMARY KEY (`card_id`))
ENGINE = InnoDB
COMMENT = '健身卡表';

CREATE TABLE IF NOT EXISTS `fitness`.`card_record` (
  `card_record_id` INT NOT NULL AUTO_INCREMENT,
  `user_id` INT NULL,
  `card_id` INT NULL,
  `store_id` INT NULL,
  `create_time` DATETIME NULL,
  PRIMARY KEY (`card_record_id`),
  UNIQUE INDEX `card_record_id_UNIQUE` (`card_record_id` ASC))
ENGINE = InnoDB
COMMENT = '购卡记录表';

CREATE TABLE IF NOT EXISTS `fitness`.`province` (
  `province_id` INT NOT NULL,
  `name` VARCHAR(64) NULL,
  PRIMARY KEY (`province_id`),
  UNIQUE INDEX `province_id_UNIQUE` (`province_id` ASC))
ENGINE = InnoDB
COMMENT = '省表';

CREATE TABLE IF NOT EXISTS `fitness`.`city` (
  `city_id` INT NOT NULL COMMENT '城市表',
  `name` VARCHAR(64) NULL,
  `province_id` INT NULL,
  PRIMARY KEY (`city_id`),
  UNIQUE INDEX `city_id_UNIQUE` (`city_id` ASC))
ENGINE = InnoDB
COMMENT = '市表';

CREATE TABLE IF NOT EXISTS `fitness`.`account` (
  `account_id` INT NOT NULL AUTO_INCREMENT,
  `account_name` VARCHAR(64) NULL COMMENT '账户名',
  `pwd` VARCHAR(64) NULL COMMENT '账户密码',
  `create_time` DATETIME NULL COMMENT '账户类型',
  `login_time` DATETIME NULL,
  `state` TINYINT(4) NULL DEFAULT 0 COMMENT '状态(0:正常,1:禁用)',
  PRIMARY KEY (`account_id`),
  UNIQUE INDEX `account_id_UNIQUE` (`account_id` ASC))
ENGINE = InnoDB
COMMENT = '账户表，用于登录管理后台';






