create database btc_db3;
use btc_db3;

create table student(roll numeric(4) primary key, student_name varchar(50) not null, dob date, scores numeric(5,2) default 0.0);

alter table student add primary key(roll);

desc student;

insert into student values(101, 'Harish Sharma', '2010-10-15',89.24);
insert into student values(102, 'Suraj Kumar', '2009-5-10',94.28);
insert into student values(103, 'Gaurav Dutta', '2010-12-25',82.74);

select * from student;

truncate table student;

drop table student;

update student set scores=95.45 where roll=101;

delete from student where roll = 102;

-- DQL --

select * from student where scores>90;

select roll, scores from student where scores>90;




