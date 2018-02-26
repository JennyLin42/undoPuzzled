CREATE DATABASE undoPuzzled;
USE undoPuzzled;
CREATE TABLE User(
userId int auto_increment PRIMARY KEY,#用户ID
userName varchar(20),#用户名
address varchar(200),#用户地址
phone varchar(20),#手机号码
headPicture varchar(200)#头像地址
);
#帖子
CREATE TABLE Card(
cardId int auto_increment PRIMARY KEY,#帖子ID
userId int,#关联用户ID
cartTimeDate varchar(50),#帖子发布时间
good int(5),#赞的个数
cartContent varchar(400),#帖子内容
isCardDelete tinyint default 0,#是否被删除
foreign key(userId) references User(userId)
);

CREATE TABLE Comment(
commentId int auto_increment PRIMARY KEY,#评论ID
userId int,#关联用户ID
cardId int,#帖子ID
commentContent varchar(400),#具体内容
commentTimeDate varchar(50),#时间毫秒值
isCommentDelete tinyint default 0,#是否被删除
foreign key(userId) references User(userId),
foreign key(cardId) references Card(cardId)
);

insert into user values('1','xingming','dizhi','13631256158','img/mmm');
insert into Card values('1','1','shijian','2','neirongbababba','0');
insert into Comment values('1','1','1','neirongbabab','shijian','0');
#insert into user values('3','xingming','dizhi','13631256158','img/mmm');
#insert into user values('3','xingming','dizhi','13631256158','img/mmm');
#insert into user values('3','xingming','dizhi','13631256158','img/mmm');


select * from user
select * from card
select * from Comment

