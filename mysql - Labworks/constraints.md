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
|  2 | Aswath    | kaja       | Aswathkaja48@gmail.com  |  18 | 2004-02-26  | XII   |
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
