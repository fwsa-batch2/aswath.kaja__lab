# TO DO STUDENT MANAGEMENT APP

### GIVEN TABLES

```mysql
desc students;
```
| Field    | Type         | Null | Key | Default | Extra          |
|:---------|:-------------|:-----|:----|:--------|:---------------|
| id       | int          | NO   | PRI | NULL    | auto_increment |
| name     | varchar(100) | NO   |     | NULL    |                |
| email    | varchar(100) | NO   |     | NULL    |                |
| mobile   | bigint       | NO   |     | NULL    |                |
| password | varchar(100) | NO   |     | NULL    |                |
| gender   | char(1)      | NO   |     | NULL    |                |
| dob      | date         | NO   |     | NULL    |                |

```mysql 
desc student_class;
```
| Field      | Type        | Null | Key | Default | Extra          |
|:-----------|:------------|:-----|:----|:--------|:---------------|
| id         | int         | NO   | PRI | NULL    | auto_increment |
| student_id | int         | NO   | MUL | NULL    |                |
| class      | int         | NO   |     | NULL    |                |
| status     | varchar(20) | NO   |     | NULL    |                |

 ## Feature 1:-
### Student Registration:
 ```mysql
insert into students (id,name,email,mobile_no,password,gender,dob) values (NULL,'Annamalai' ,'annamalai@gmail.com' , 7695883749 , '1234' ,'M',' 2003-08-19'),(NULL,'Haiden' ,'haiden@gmail.com' , 9043494315, '1234' ,'M''2002-01-31'),(NULL,'jerusheya' ,'jerusheya@gmail.com' , 7695883749 , '1234' ,'F','2002-08-26'),(NULL,'Abisha' ,'abisha@gmail.com' , 6379481526 , '1234' ,'F',' 2003-06-03'), (NULL,'Swetha' ,'swetha@gmail.com' , 9025336748 , '1234' ,'F',' 2004-11-16'),(NULL,'Selva' ,'selva@gmail.com' , 6374336552 , '1234' ,'M',' 2000-11-13');
```

## Feature 2 :-
### List all students:
```mysql       
select * from students;
```

## Feature 3:-
### Login with Email and Password:
```mysql
select * from students natural join student_class where email ="kingaswath46@gmail.com" and password="1234";
 ```

## Feature 4:-
### Update password:
```mysql
update students set password = 'as1234' where id = '1';
```

## Feature 5:-
### Enroll Student into Class:
```mysql
 INSERT INTO student_class (id,Student_id,Class,status) VALUES (1,1,1,'ACTIVE'),(2,2,1,'ACTIVE'),(3,3,2,'ACTIVE'),(4,4,5,'ACTIVE'),(5,5,5,'INACTIVE'),(6,6,5,'INACTIVE'),(7,7,5,'INACTIVE');
```

## Feature 6:
###  Find Students who are studying in 5th standard.
```mysql
select * from students natural join student_class;
```

## Feature 7:
###  Update Student Class information #
#### Update student from 5th standard to 6th standard
```mysql
Update student_class set class = 6 where class = 5;
```

## Feature 8:
### Student withdrawn from a Class:
```mysql
delete  from student_class where id = 8;
```
Query OK, 1 row affected (0.01 sec)

## Feature 9:
### Find student details who have not updated their Date Of Birth #
```mysql
select * from students where dob is NULL;
 ```
| id | name   | email            | mobile_no  | password | gender | dob  | created_date        |
|:---|:-------|:-----------------|:-----------|:---------|:-------|:-----|:--------------------|
|  7 | Swetha | swetha@gmail.com | 9025336748 | 1234     | F      | NULL | 2022-03-01 22:27:46 |

## Feature 10:
### Find Total no of students actively studying in this school
```mysql
 select * from students NATURAL JOIN student_class where status = 'INACTIVE';
 ```
| id | name   | email            | mobile_no  | password | gender | dob        | created_date        | student_id | class | status   |
|:---|:-------|:-----------------|:-----------|:---------|:-------|:-----------|:--------------------|:-----------|:------|:---------|
|  4 | Haiden | haiden@gmail.com | 9043494315 | 1234     | M      | 2002-01-31 | 2022-03-01 22:22:57 |          4 |     6 | INACTIVE |
|  6 | Abisha | abisha@gmail.com | 6379481526 | 1234     | F      | 2003-06-03 | 2022-03-01 22:26:01 |          6 |     6 | INACTIVE |
```
2 rows in set (0.00 sec)

## Feature 11:
### Find Total no of students actively studying in each class:
```mysql  
Select count(status) from student_class where status = 'ACTIVE';
```

## Feature 12:
### Find Total no of students actively studying each class which has less than 5 students:
```mysql
Select class, count(status) as Total from student_class  where status = 'ACTIVE' group by class;
```

## Feature 13:
### Display student and class details # Using Joins (Inner Join):
```mysql 
Select sd.id ,sd.name , st.class  from students sd inner join student_class st on sd.id = st.student_id;
```

| id | name      | class |
|:---|:----------|:------|
|  1 | Aswath    |     6 |
|  2 | Rishi     |     6 |
|  3 | Annamalai |     6 |
|  4 | Haiden    |     6 |
|  5 | jerusheya |     6 |
|  6 | Abisha    |     6 |
|  7 | Swetha    |     6 |

7 rows in set (0.00 sec)

#### ALTERNATE METHOD USING SUB QUERY 

## Feature 13

```mysql
SELECT *, (select student_class.class from student_class WHERE student_class.student_id = students.id) as class from students;
```
       
## Feature 14:
### Display Student Details for the given input class # Class : 10th Standard
```mysql
select st.id,st.name,st.email,st.mobile_no,st.password,st.gender,st.dob,st.created_date from students st inner join student_class on st.id=student_class.student_id where student_class.class=6 ;
```

| id | name      | email                  | mobile_no  | password | gender | dob        | created_date        |
|:---|:----------|:-----------------------|:-----------|:---------|:-------|:-----------|:--------------------|
|  1 | Aswath    | kingaswath46@gmail.com | 7449050819 | as1234   | M      | 2004-02-26 | 2022-03-01 22:04:01 |
|  2 | Rishi     | rishi@gmail.com        | 6381950080 | rs1234   | M      | 2002-08-13 | 2022-03-03 12:01:22 |
|  3 | Annamalai | annamalai@gmail.com    | 7695883749 | 1234     | M      | 2003-08-19 | 2022-03-01 22:22:57 |
|  4 | Haiden    | haiden@gmail.com       | 9043494315 | 1234     | M      | 2002-01-31 | 2022-03-01 22:22:57 |
|  5 | jerusheya | jerusheya@gmail.com    | 7695883749 | 1234     | F      | 2002-08-26 | 2022-03-01 22:22:57 |
|  6 | Abisha    | abisha@gmail.com       | 6379481526 | 1234     | F      | 2003-06-03 | 2022-03-01 22:26:01 |
|  7 | Swetha    | swetha@gmail.com       | 9025336748 | 1234     | F      | NULL       | 2022-03-01 22:27:46 |

7 rows in set (0.00 sec)

## Feature 15:
### Find Class for the given student email id # Email: n@fwsa.freshworks.com
```mysql
 SELECT class FROM student_class WHERE student_id = (SELECT id FROM students WHERE email LIKE ('%n@gmail.com'));
```

## Feature 16:
### Find Students who has not enrolled in a class #
```mysql
 SELECT * FROM students WHERE id NOT IN (SELECT student_id FROM student_class);
```

## Feature 17:
### Display all students name with class - include both enrolled and not enrolled #
```mysql
 SELECT students.name,student_class.class FROM students LEFT OUTER JOIN student_class ON students.id = student_class.student_id;
 ```








      
       
      


