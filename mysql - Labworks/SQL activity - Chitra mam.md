 ## QUESTION 1:-

 ```mysql
insert into students (id,name,email,mobile_no,password,gender,dob) values (NULL,'Annamalai' ,'annamalai@gmail.com' , 7695883749 , '1234' ,'M',' 2003-08-19'),(NULL,'Haiden' ,'haiden@gmail.com' , 9043494315, '1234' ,'M''2002-01-31'),(NULL,'jerusheya' ,'jerusheya@gmail.com' , 7695883749 , '1234' ,'F','2002-08-26'),(NULL,'Abisha' ,'abisha@gmail.com' , 6379481526 , '1234' ,'F',' 2003-06-03'), (NULL,'Swetha' ,'swetha@gmail.com' , 9025336748 , '1234' ,'F',' 2004-11-16'),(NULL,'Selva' ,'selva@gmail.com' , 6374336552 , '1234' ,'M',' 2000-11-13');
```

## QUESTION 2 :-
```mysql       
select * from students;
```

## QUESTION 3:-
```mysql
select * from students natural join student_class where email ="kingaswath46@gmail.com" and password="1234";
 ```

## QUESTION 4:-
```mysql
update students set password = 'as1234' where id = '1';
```

## QUESTION 5:-
```mysql
 INSERT INTO student_class (id,Student_id,Class,status) VALUES (1,1,1,'ACTIVE'),(2,2,1,'ACTIVE'),(3,3,2,'ACTIVE'),(4,4,5,'ACTIVE'),(5,5,5,'INACTIVE'),(6,6,5,'INACTIVE'),(7,7,5,'INACTIVE');
```
## QUESTION 6:-
```mysql
select * from students natural join student_class;
```

## QUESTION 7 :-
```mysql
Update student_class set class = 6 where class = 5;
```

## QUESTION 8 :-
```mysql
delete  from student_class where id = 8;
```
Query OK, 1 row affected (0.01 sec)

## QUESTION 9:-
```mysql
select * from students where dob is NULL;
 ```
| id | name   | email            | mobile_no  | password | gender | dob  | created_date        |
|:---|:-------|:-----------------|:-----------|:---------|:-------|:-----|:--------------------|
|  7 | Swetha | swetha@gmail.com | 9025336748 | 1234     | F      | NULL | 2022-03-01 22:27:46 |

## QUESTION 10
```mysql
 select * from students NATURAL JOIN student_class where status = 'INACTIVE';
 ```
| id | name   | email            | mobile_no  | password | gender | dob        | created_date        | student_id | class | status   |
|:---|:-------|:-----------------|:-----------|:---------|:-------|:-----------|:--------------------|:-----------|:------|:---------|
|  4 | Haiden | haiden@gmail.com | 9043494315 | 1234     | M      | 2002-01-31 | 2022-03-01 22:22:57 |          4 |     6 | INACTIVE |
|  6 | Abisha | abisha@gmail.com | 6379481526 | 1234     | F      | 2003-06-03 | 2022-03-01 22:26:01 |          6 |     6 | INACTIVE |

2 rows in set (0.00 sec)

## QUESTION 11
```mysql  
Select count(status) from student_class where status = 'ACTIVE';
```

## QUESTION 12
```mysql
Select class, count(status) as Total from student_class  where status = 'ACTIVE' group by class;
```

## QUESTION 13
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

## QUESTION 13

```mysql
SELECT *, (select student_class.class from student_class WHERE student_class.student_id = students.id) as class from students;
```
       
## QUESTION 14

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

## QUESTION 15 
```mysql
 SELECT class FROM student_class WHERE student_id = (SELECT id FROM students WHERE email LIKE ('%n@gmail.com'));
```

## QUESTION 16
```mysql
 SELECT * FROM students WHERE id NOT IN (SELECT student_id FROM student_class);
```

## QUESTION 17

```mysql
 SELECT students.name,student_class.class FROM students LEFT OUTER JOIN student_class ON students.id = student_class.student_id;
 ```








      
       
      


