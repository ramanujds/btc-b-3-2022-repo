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

select * from student where scores>=80 AND scores<=90;

select * from student where scores BETWEEN 80 AND 90;

select * from student where roll=102 OR roll=103; 

select * from student where roll IN(102,103);



select * from emp order by sal desc;
SELECT * FROM EMP ORDER BY DEPTNO ASC,JOB DESC;

select ename, hiredate, extract(year from curdate())-extract(year from hiredate) as 'experience'  from em
p;


select empno, ename,sal, sal/30 as 'daily-salary' from emp order by sal;

select * from emp where extract(year from hiredate)<1981;



select * from emp where mgr in( select distinct mgr from emp where mgr is not null);

-- TCL Commands --
use btc_db3;
show tables;

select * from student;

-- ACID --
-- GROUPPING of Rows --
-- Group Functions --
-- max, min, count, avg, sum --

select deptno, min(sal) as 'Min Salary' from emp where deptno=20 group by deptno;

-- Find the total employees belonging to dept no 20 --

select count(ename) from emp where deptno=20;

-- Find the total employees belonging to each dept --

select  deptno, count(ename) as 'Total Employees' from emp group by deptno;


-- where -> group by -> having -> order by --

-- JOINS and Subqueries --
-- Outer Joins : Left Join, Right Join, Full Join --
-- Inner Joins : --
-- Self Join --
-- Cross Join --

create table dept(deptno bigint(4), deptname varchar(50), location varchar(50));

insert into dept values(10,'IT','Bangalore');
insert into dept values(20,'Sales','Chennai');
insert into dept values(30,'Accounts','Delhi');
insert into dept values(40,'Management','Kolkata');

commit;

select * from dept;

select e.*, d.* from emp e left join dept d on e.deptno=d.deptno;

-- find the dept which doesn't have any employee --
select d.* from emp e RIGHT join dept d on e.deptno=d.deptno where e.empno is NULL;

-- Find the employees who are working in Delhi --

-- Find the total employees belonging to each dept where two or more employees are working --
select deptno,count(*) from emp group by deptno having count(*)>=2;

-- Find the details of each dept where two or more employees are working --


-- Find the dept, average salary, max salary, min salary where min salary>2000 --

select deptno,avg(sal),max(sal),min(sal) from emp group by deptno having min(sal)>900;

-- Display the details of the employees who are working in IT Dept. --
select * from emp join dept  using(deptno) where deptname='IT';

select * from emp where deptno = (select deptno from dept where deptname='IT');

-- Count the employees working under each manager --

select e1.empno, e1.ename, count(*) as 'Total Employees' from emp e1 join emp e2 on e1.empno=e2.mgr group by e1.empno,e1.ename;

select e1.empno, e1.ename from emp e1 join emp e2 on e1.empno=e2.mgr;

-- Subqueries --

-- show dept details with total employee count --

select d.deptno, d.deptname, count(e.empno) as 'Total Employees' from emp e right join dept d using(deptno) group by d.deptno, d.deptname;


-- co-related subquery --
select d.*, (select count(empno) from emp e where e.deptno=d.deptno) as 'Total Employees' from dept d;
