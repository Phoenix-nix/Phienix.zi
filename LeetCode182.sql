编写一个 SQL 查询，查找 Person 表中所有重复的电子邮箱。

示例：

+----+---------+
| Id | Email   |
+----+---------+
| 1  | a@b.com |
| 2  | c@d.com |
| 3  | a@b.com |
+----+---------+

create database leetcode_182 charest utf8mb4;
use leetcode_182;

create table Person (
    Id int primary key,
	Email varchar(20)
);

insert into Person(Id,Email) values 
   (1 ,'a@b.com')
   (2 ,'c@d.com') 
   (3 ,'a@b.com'); 
   
 --方法1 利用聚合查询
 select Email from group by Email having count(*) >1;
 
--方法2 利用子查询的exist查询
select distinct Email from Person p1 where exists (
   select Email from Person p2 where p1.Id != p2.Id and p1.Email = p2.Email
);
