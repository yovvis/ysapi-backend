-- 接口表
create table if not exists ysapi.`interface_info`
(
    `id` bigint not null auto_increment comment '主键' primary key,
    `userId` bigint(256) not null comment '创建人',
    `name` varchar(256) not null comment '接口名称',
    `description` varchar(256) null comment '描述',
    `url` varchar(512) not null comment '接口地址',
    `method` varchar(256) not null comment '请求类型',
    `requestHeader` text null comment '请求头',
    `requestParams` text null comment '请求头',
    `reponseHeader` text null comment '响应头',
    `status` int default 0 not null comment '接口状态',
    `updateTime` datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    `createTime` datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    `isDeleted` tinyint default 0 not null comment '是否删除(0-未删, 1-已删)'
) comment '接口表';

insert into ysapi.`interface_info` (`id`, `userId`, `name`, `description`, `url`, `method`, `reqestHeader`, `reponseHeader`, `status`) values (288, 6086904328, '11nH', '雷笑愚', 'www.hoa-stokes.com', '郝哲瀚', '尹俊驰', '雷彬', 0);
insert into ysapi.`interface_info` (`id`, `userId`, `name`, `description`, `url`, `method`, `reqestHeader`, `reponseHeader`, `status`) values (833989, 103, 'vBNpW', '王伟诚', 'www.hsiu-bernier.com', '王伟泽', '何聪健', '胡文', 0);
insert into ysapi.`interface_info` (`id`, `userId`, `name`, `description`, `url`, `method`, `reqestHeader`, `reponseHeader`, `status`) values (2921549932, 708169340, '2Ubf', '梁浩', 'www.karina-rohan.net', '卢思源', '林雪松', '冯鹏涛', 0);
insert into ysapi.`interface_info` (`id`, `userId`, `name`, `description`, `url`, `method`, `reqestHeader`, `reponseHeader`, `status`) values (2535206, 7, 'Exwl', '杜哲瀚', 'www.santiago-torp.co', '傅俊驰', '韩航', '韦博文', 0);
insert into ysapi.`interface_info` (`id`, `userId`, `name`, `description`, `url`, `method`, `reqestHeader`, `reponseHeader`, `status`) values (5745, 1954906768, 'aQtN', '曾文昊', 'www.pearle-bartoletti.io', '夏嘉懿', '苏明辉', '史凯瑞', 0);
insert into ysapi.`interface_info` (`id`, `userId`, `name`, `description`, `url`, `method`, `reqestHeader`, `reponseHeader`, `status`) values (80184, 58, 'ULYH', '李涛', 'www.moshe-raynor.io', '程语堂', '夏天磊', '许苑博', 0);
insert into ysapi.`interface_info` (`id`, `userId`, `name`, `description`, `url`, `method`, `reqestHeader`, `reponseHeader`, `status`) values (565605928, 9442348242, '9caN', '谢果', 'www.willy-mosciski.co', '黎远航', '侯智辉', '江懿轩', 0);
insert into ysapi.`interface_info` (`id`, `userId`, `name`, `description`, `url`, `method`, `reqestHeader`, `reponseHeader`, `status`) values (207578904, 79569, 'mlQ', '董睿渊', 'www.alfreda-mckenzie.name', '严鹏涛', '孔立轩', '卢修洁', 0);
insert into ysapi.`interface_info` (`id`, `userId`, `name`, `description`, `url`, `method`, `reqestHeader`, `reponseHeader`, `status`) values (26, 44, 'T6', '史果', 'www.ramona-greenholt.name', '邹潇然', '邹乐驹', '覃擎宇', 0);
insert into ysapi.`interface_info` (`id`, `userId`, `name`, `description`, `url`, `method`, `reqestHeader`, `reponseHeader`, `status`) values (57, 60924, 'ig1', '郑伟宸', 'www.enoch-shields.net', '卢明', '孙聪健', '冯峻熙', 0);
insert into ysapi.`interface_info` (`id`, `userId`, `name`, `description`, `url`, `method`, `reqestHeader`, `reponseHeader`, `status`) values (870228, 274506368, '4Sbf', '蔡晋鹏', 'www.omega-kunde.io', '江鸿煊', '钱哲瀚', '曹浩宇', 0);
insert into ysapi.`interface_info` (`id`, `userId`, `name`, `description`, `url`, `method`, `reqestHeader`, `reponseHeader`, `status`) values (4328613, 4, '43', '侯智渊', 'www.lyda-kris.io', '薛越泽', '于立果', '朱煜祺', 0);
insert into ysapi.`interface_info` (`id`, `userId`, `name`, `description`, `url`, `method`, `reqestHeader`, `reponseHeader`, `status`) values (170535, 83, 'Li', '赵雨泽', 'www.lawerence-koch.co', '阎涛', '宋泽洋', '韦嘉熙', 0);
insert into ysapi.`interface_info` (`id`, `userId`, `name`, `description`, `url`, `method`, `reqestHeader`, `reponseHeader`, `status`) values (497, 185489169, 'HvvJ0', '郝熠彤', 'www.santos-johns.io', '韦晟睿', '程梓晨', '许昊天', 0);
insert into ysapi.`interface_info` (`id`, `userId`, `name`, `description`, `url`, `method`, `reqestHeader`, `reponseHeader`, `status`) values (1827107889, 15770805, 'vS8ZX', '陆鹏涛', 'www.kerry-larkin.biz', '吴鹭洋', '袁荣轩', '武子涵', 0);
insert into ysapi.`interface_info` (`id`, `userId`, `name`, `description`, `url`, `method`, `reqestHeader`, `reponseHeader`, `status`) values (8488, 362, 'jC', '石鹏煊', 'www.isidra-keeling.net', '侯鹏', '余子涵', '卢聪健', 0);
insert into ysapi.`interface_info` (`id`, `userId`, `name`, `description`, `url`, `method`, `reqestHeader`, `reponseHeader`, `status`) values (1145317, 129898, 'Ax', '薛志泽', 'www.yuette-lindgren.net', '叶君浩', '杜钰轩', '傅博文', 0);
insert into ysapi.`interface_info` (`id`, `userId`, `name`, `description`, `url`, `method`, `reqestHeader`, `reponseHeader`, `status`) values (690201, 249637, 'iJMe', '朱晓啸', 'www.gilma-ruecker.info', '陆远航', '廖果', '陶钰轩', 0);
insert into ysapi.`interface_info` (`id`, `userId`, `name`, `description`, `url`, `method`, `reqestHeader`, `reponseHeader`, `status`) values (509, 9559, '1L', '范志泽', 'www.treasa-spinka.name', '魏子默', '吴思聪', '江文昊', 0);
insert into ysapi.`interface_info` (`id`, `userId`, `name`, `description`, `url`, `method`, `reqestHeader`, `reponseHeader`, `status`) values (82881, 8491, 'O8e', '任黎昕', 'www.domenic-larson.io', '袁聪健', '龙文轩', '王语堂', 0);
