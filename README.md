# Msql-labworks
### MySQL SHOW DATABASES Statement
```syntax
SHOW DATABASES;
```
| Database           |
|:-----|
| information_schema |
| kaushik            |
| mysql              |
| performance_schema |
| sys                |
###### 5 rows in set (0.01 sec)
* * *
### CREATE DATABASE...
```syntax
CREATE DATABASE School;
```
```syntax
SHOW DATABASES;
```
| Database           |
|:-----|
| School             |
| information_schema |
| kaushik            |
| mysql              |
| performance_schema |
| sys                |
### 6 rows in set (0.00 sec)
* * *
### USE DATABASE...
```syntax
USE School;
```
###### Database changed
* * *
### CREATE TABLE...
```syntax
CREATE TABLE Students(Id int primary key auto_increment, Firstname varchar(255) NOT NULL, Secondname varchar(255) NOT NULL,Email varchar(255) UNIQUE NOT
 NULL, Age int(2) NOT NULL, dateofbirth date NOT NULL);
```
###### Query OK, 0 rows affected, 1 warning (0.04 sec)
* * *
### SHOW TABLES..
```syntax
SHOW TABLES;
```
| Tables_in_School |
|:-----|
| Students         |
###### 1 row in set (0.00 sec)
* * *
### DESCRIBE TABLE..
```syntax
DESC Students;
```
| Field       | Type         | Null | Key | Default | Extra          |
|:----|:----|:----:|:----:|:----:|:----|
| Id          | int          | NO   | PRI | NULL    | auto_increment |
| Firstname   | varchar(255) | NO   |     | NULL    |                |
| Secondname  | varchar(255) | NO   |     | NULL    |                |
| Email       | varchar(255) | NO   | UNI | NULL    |                |
| Age         | int          | NO   |     | NULL    |                |
| dateofbirth | date         | NO   |     | NULL    |                |
###### 6 rows in set (0.00 sec)
* * *
### MySQL INSERT INTO...
```syntax
INSERT INTO Students (Firstname,Secondname,Email,Age,dateofbirth) VALUES
('Aswath','kaja','Aswathkaja007@gmail.com','17','2004-02-16');
```
###### Query OK, 1 row affected (0.01 sec)
```syntax
INSERT INTO Students (Firstname,Secondname,Email,Age,dateofbirth) VALUES
('Vimal','raj','vimal@gmail.com','19','2002-12-20');
```
###### Query OK, 1 row affected (0.00 sec)
```syntax
INSERT INTO Students (Firstname,Secondname,Email,Age,dateofbirth) VALUES
('Prasanna','venkatesh','prasannavenkatesh@gmail.com','21','2001-01-20');
```
###### Query OK, 1 row affected (0.02 sec)
* * *
### MySQL SELECT
```syntax
SELECT * FROM Students;
```
| Id | Firstname | Secondname | Email                       | Age | dateofbirth |
|:--:|:----------|:--------:|:------------------------|:---:|:------------|
|  1 | Aswath    | kaja       | Aswathkaja007@gmail.com     |  17 | 2004-02-16  |
|  2 | Vimal     | raj        | vimal@gmail.com             |  19 | 2002-12-20  |
|  3 | Prasanna  | venkatesh  | prasannavenkatesh@gmail.com |  21 | 2001-01-20  |
###### 3 rows in set (0.00 sec)
* * *
### MySQL WHERE 
```syntax
SELECT * FROM Students WHERE Id='1';
```
| Id | Firstname | Secondname | Email                   | Age | dateofbirth |
|:--:|:----------|:---------|:------------------------|:---:|:------------|
|  1 | Aswath    | kaja       | Aswathkaja007@gmail.com |  17 | 2004-02-16  |
###### 1 row in set (0.00 sec)
* * *
### ALTER TABLE...
```syntax
 ALTER TABLE Students ADD Class varchar(70);
```
###### Query OK, 0 rows affected (0.02 sec)
###### Records: 0  Duplicates: 0  Warnings: 0
```syntax
mysql> ALTER TABLE Students MODIFY COLUMN Class char(100);
```
###### Query OK, 3 rows affected (0.05 sec)
###### Records: 3  Duplicates: 0  Warnings: 0
```syntax
DESC students;
```
| Field       | Type         | Null | Key | Default | Extra          |
|:----|:----|:----:|:----:|:----:|:----|
| Id          | int          | NO   | PRI | NULL    | auto_increment |
| Firstname   | varchar(255) | NO   |     | NULL    |                |
| Secondname  | varchar(255) | NO   |     | NULL    |                |
| Email       | varchar(255) | NO   | UNI | NULL    |                |
| Age         | int          | NO   |     | NULL    |                |
| dateofbirth | date         | NO   |     | NULL    |                |
| Class       | char(100)    | YES  |     | NULL    |                |
###### 7 rows in set (0.00 sec)
```syntax
SELECT * FROM Students;
```
| Id | Firstname | Secondname | Email                       | Age | dateofbirth | Class |
|:--:|:----------|:-----------|:----------------------------|:---:|:------------|:------|
|  1 | Aswath    | kaja       | Aswathkaja007@gmail.com     |  17 | 2004-02-16  | NULL  |
|  2 | Vimal     | raj        | vimal@gmail.com             |  19 | 2002-12-20  | NULL  |
|  3 | Prasanna  | venkatesh  | prasannavenkatesh@gmail.com |  21 | 2001-01-20  | NULL  |
###### 3 rows in set (0.00 sec)
* * *
### MySQL UPDATE...
```syntax
UPDATE Students SET Class = "XII" WHERE Id = 1;
```
###### Query OK, 1 row affected (0.01 sec)
###### Rows matched: 1  Changed: 1  Warnings: 0
```syntax
 UPDATE Students SET Class = "X" WHERE Id = 2;
```
###### Query OK, 1 row affected (0.01 sec)
###### Rows matched: 1  Changed: 1  Warnings: 0
```syntax
UPDATE Students SET Class = "XII" WHERE Id = 3;
```
###### Query OK, 1 row affected (0.01 sec)
###### Rows matched: 1  Changed: 1  Warnings: 0
```syntax
SELECT * FROM Students;
```
| Id | Firstname | Secondname | Email                       | Age | dateofbirth | Class |
|:--:|:----------|:-----------|:----------------------------|:---:|:------------|:------|
|  1 | Aswath    | kaja       | Aswathkaja007@gmail.com     |  17 | 2004-02-16  | XII   |
|  2 | Vimal     | raj        | vimal@gmail.com             |  19 | 2002-12-20  | X     |
|  3 | Prasanna  | venkatesh  | prasannavenkatesh@gmail.com |  21 | 2001-01-20  | XII   |
###### 3 rows in set (0.00 sec)
* * *
### MySQL DELETE...
```syntax
 DELETE FROM Students WHERE Id=3;
``` 
###### Query OK, 1 row affected (0.01 sec)
```syntax
SELECT * FROM Students;
```
| Id | Firstname | Secondname | Email                   | Age | dateofbirth | Class |
|:--:|:----------|:-----------|:------------------------|:---:|:------------|:------|
|  1 | Aswath    | kaja       | Aswathkaja007@gmail.com |  17 | 2004-02-16  | XII   |
|  2 | Vimal     | raj        | vimal@gmail.com         |  19 | 2002-12-20  | X     |
###### 2 rows in set (0.00 sec)
* * *
### DROP TABLE...
```syntax
DROP TABLE Students;
```
###### Query OK, 0 rows affected (0.02 sec)
```syntax
DROP DATABASE School;
```
###### Query OK, 0 rows affected (0.02 sec)
```syntax
SHOW DATABASES;
```
| Database           |
|:-------------------|
| information_schema |
| kaushik            |
| mysql              |
| performance_schema |
| sys                |
###### 5 rows in set (0.00 sec)
* * *
# MySQL Constraints
### NOT NULL
```syntax
 CREATE TABLE Constraints(Firstname varchar(255) NOT NULL);
```
### UNIQUE
```syntax
 CREATE TABLE Constraints(Email varchar(255) UNIQUE);
```
### DEFAULT
```syntax
CREATE TABLE Constraints(Department varchar(255) DEFAULT 'Tech');
```
### CHECK
```syntax
CREATE TABLE Constraints(Age int(2) NOT NULL, CHECK (Age>=21));
```
### PRIMARY KEY
```syntax
CREATE TABLE Constraints(Id int(3) PRIMARY KEY AUTO_INCREMENT);
```
### CREATE TABLE with all Constraints without FOREIGN KEY
```syntax
CREATE TABLE students(Id int(3) PRIMARY KEY AUTO_INCREMENT, Firstname varchar(255) NOT NULL, Secondname varchar(255) NOT NULL, Email varchar(255) UNIQUE, Age int(2) NOT NULL, dateofbirth date NOT NULL, Class varchar(255) DEFAULT 'XII', CHECK (Age>=3));
```
###### Query OK, 0 rows affected, 2 warnings (0.03 sec)
### INSERT INTO
```syntax
INSERT INTO students (Firstname,Secondname,Email,Age,dateofbirth) VALUES ('Aswath','kaja','Aswathkaja007@gmail.com','17','2004-02-16');
```
###### Query OK, 1 row affected (0.01 sec)
### SELECT
```syntax
SELECT * FROM students;
```
| Id | Firstname | Secondname | Email                   | Age | dateofbirth | Class |
|:---|:----------|:-----------|:------------------------|:----|:------------|:------|
|  1 | Vimal     | raj        | vimal@gmail.com         |  19 | 2002-12-20  | XII   |
|  2 | Aswath    | kaja       | Aswathkaja007@gmail.com |  17 | 2004-02-16  | XII   |
###### 2 rows in set (0.00 sec)
### FOREIGN KEY
```syntax
mysql> CREATE TABLE Coach(studId int PRIMARY KEY AUTO_INCREMENT, mark int(3), Id int, FOREIGN KEY(Id) REFERENCES students(Id));
```
###### Query OK, 0 rows affected, 1 warning (0.03 sec)
### INSERT INTO
```syntax
mysql> INSERT INTO Coach(mark,Id) VALUES (100,1);
```
###### Query OK, 1 row affected (0.01 sec)
```syntax
DESC Coach;
```
| Field  | Type | Null | Key | Default | Extra          |
|:-------|:-----|:-----|:---:|:--------|:---------------|
| studId | int  | NO   | PRI | NULL    | auto_increment |
| mark   | int  | YES  |     | NULL    |                |
| Id     | int  | YES  | MUL | NULL    |                |
###### 3 rows in set (0.00 sec)
### SELECT
```syntax
SELECT * FROM Coach;
```
| studId | mark | Id   |
|:-------|:-----|:-----|
|      1 |  100 |    1 |
###### 1 row in set (0.00 sec)
* * * 
# MySQL Operators
```syntax
SELECT * FROM students;
```
| Id | Firstname | Secondname | Email                   | Age | dateofbirth | Class |
|:--:|:----------|:---------|:------------------------|:---:|:------------|:--------|
|  1 | Vimal     | raj        | vimal@gmail.com         |  19 | 2002-12-20  | XII   |
|  2 | Aswath    | kaja       | Aswathkaja007@gmail.com |  17 | 2004-02-16  | XII   |
###### 2 rows in set (0.00 sec)
### AND
```syntax
SELECT * FROM students WHERE Class = 'XII' AND Age = 19;
```
| Id | Firstname | Secondname | Email           | Age | dateofbirth | Class |
|:---|:----------|:-----------|:----------------|:----|:------------|:------|
|  1 | Vimal     | raj        | vimal@gmail.com |  19 | 2002-12-20  | XII   |
###### 1 row in set (0.00 sec)
### NOT
```syntax
SELECT * FROM students WHERE NOT Age = 21;
```
| Id | Firstname | Secondname | Email                   | Age | dateofbirth | Class |
|:---|:----------|:-----------|:------------------------|:----|:------------|:------|
|  1 | Vimal     | raj        | vimal@gmail.com         |  19 | 2002-12-20  | XII   |
|  2 | Aswath    | kaja       | Aswathkaja007@gmail.com |  17 | 2004-02-16  | XII   |
###### 2 rows in set (0.00 sec)
### BETWEEN
```syntax
SELECT * FROM students WHERE Age BETWEEN 10 AND 22;
```
| Id | Firstname | Secondname | Email                   | Age | dateofbirth | Class |
|:---|:----------|:-----------|:------------------------|:----|:------------|:------|
|  1 | Vimal     | raj        | vimal@gmail.com         |  19 | 2002-12-20  | XII   |
|  2 | Aswath    | kaja       | Aswathkaja007@gmail.com |  17 | 2004-02-16  | XII   |
###### 2 rows in set (0.00 sec)
### IN
```syntax
mysql> SELECT * FROM students WHERE Class IN ('XII');
```
| Id | Firstname | Secondname | Email                   | Age | dateofbirth | Class |
|:---|:----------|:-----------|:------------------------|:----|:------------|:------|
|  1 | Vimal     | raj        | vimal@gmail.com         |  19 | 2002-12-20  | XII   |
|  2 | Aswath    | kaja       | Aswathkaja007@gmail.com |  17 | 2004-02-16  | XII   |
###### 2 rows in set (0.00 sec)
### LIKE
```syntax
mysql> SELECT * FROM students WHERE Firstname LIKE 'As%';
```
| Id | Firstname | Secondname | Email                   | Age | dateofbirth | Class |
|:---|:----------|:-----------|:------------------------|:----|:------------|:------|
|  2 | Aswath    | kaja       | Aswathkaja007@gmail.com |  17 | 2004-02-16  | XII   |
###### 1 row in set (0.00 sec)
### ANY
```syntax
CREATE TABLE Markclass_A(Id int,Mark int,Name varchar(100));
```
```syntax
INSERT INTO Markclass_A (Id,Mark,Name) VALUES (1,10,'Vimal'),(2,0,'Aswath');
```
```syntax
SELECT * FROM Markclass_A;
```
| Id   | Mark | Name   |
|:-----|:-----|:-------|
|    1 |   10 | Vimal  |
|    2 |    0 | Aswath |
###### 2 rows in set (0.00 sec)
```syntax
CREATE TABLE Markclass_B(Id int,Mark int,Name varchar(100));
```
```syntax
INSERT INTO Markclass_B (Id,Mark,Name) VALUES (1,10,'haiden'),(2,0,'prasana');
```
```syntax
mysql> SELECT * FROM Markclass_B;
```
| Id   | Mark | Name    |
|:-----|:-----|:--------|
|    1 |   10 | haiden  |
|    2 |    0 | prasana |
###### 2 rows in set (0.00 sec)
```syntax
mysql> SELECT Mark FROM Markclass_A WHERE mark = ANY(SELECT mark FROM Markclass_B);
```
| Mark |
|:-----|
|   10 |
|    0 |
###### 2 rows in set (0.00 sec)
*  *  *
# Aggregate functions
```syntax
SELECT * FROM students;
```
| Id | Firstname | Secondname | Email                   | Age | dateofbirth | Class |
|:---|:----------|:-----------|:------------------------|:----|:------------|:------|
|  1 | Vimal     | raj        | vimal@gmail.com         |  19 | 2002-12-20  | XII   |
|  2 | Aswath    | kaja       | Aswathkaja007@gmail.com |  17 | 2004-02-16  | XII   |
###### 2 rows in set (0.00 sec)
### MIN
```syntax
mysql> SELECT MIN(age) FROM students;
```
| MIN(age) |
|:---------|
|       17 |
###### 1 row in set (0.00 sec)
### MAX
```syntax
SELECT MAX(age) FROM students;
```
| MAX(age) |
|:---------|
|       19 |
###### 1 row in set (0.00 sec)
### AVG
```syntax
mysql> SELECT AVG(age) FROM students;
```
| AVG(age) |
|:---------|
|  18.0000 |
###### 1 row in set (0.00 sec)
### COUNT
```syntax
mysql> SELECT COUNT(age) FROM students;
```
| COUNT(age) |
|:-----------|
|          2 |
###### 1 row in set (0.00 sec)
### SUM
```syntax
mysql> SELECT SUM(age) FROM students;
```
| SUM(age) |
|:---------|
|       36 |
###### 1 row in set (0.00 sec
