/* 优惠券任务表*/
create table send_coupon_task(
	id int PRIMARY key auto_increment COMMENT '主键',
	coupon_id int not null COMMENT '优惠券id',
	vip_ids varchar(1000) not null COMMENT '会员列表',
	count int not null COMMENT '数量',
	state varchar(2) not null COMMENT '状态，0:未开始,1:已开始,2:已完成,3:错误',
	create_date datetime not null COMMENT '创建时间'
)ENGINE=INNODB auto_increment=10001 DEFAULT CHARSET=utf8

/*优惠券信息表*/
create table coupon(
	id int PRIMARY key auto_increment,
	name varchar(10) not null COMMENT '券名称',
	type varchar(2) not null COMMENT '券类型,1:折扣券,2:数值券',
	use_type varchar(2) not null  COMMENT '使用类型,1:线上使用,2:线下使用,3:线上线下使用',
	is_enable varchar(1) not null DEFAULT 'Y' COMMENT '是否启用',
	val varchar(100) not null COMMENT '面值',
	create_date datetime not null COMMENT '创建时间'
)ENGINE=INNODB auto_increment=1 DEFAULT CHARSET=utf8

/*会员信息表*/
create table user_info(
	id int PRIMARY key auto_increment,
	nickname varchar(20) not null COMMENT '昵称',
	phone varchar(11) COMMENT '手机号',
	email varchar(32) COMMENT '邮箱',
	birthday varchar(20) COMMENT '生日',
	sex varchar(1) COMMENT '性别',
	create_date datetime not null COMMENT '创建时间'
)ENGINE=INNODB auto_increment=100001 DEFAULT CHARSET=utf8

/*优惠券关联会员表*/
create table user_coupon(
	id int PRIMARY key auto_increment,
	is_active char(1) not null DEFAULT 'Y' COMMENT '是否启用',
	coupon_id int not null COMMENT '优惠券id',
	user_id int not null COMMENT '会员id',
	is_use char(1) not null DEFAULT 'N' COMMENT '是否使用',
	use_date datetime not null COMMENT '使用时间',
	is_lock char(1) not null DEFAULT 'N' COMMENT '是否锁定',
	create_date datetime not null COMMENT '创建时间'
)ENGINE=INNODB auto_increment=1 DEFAULT CHARSET=utf8