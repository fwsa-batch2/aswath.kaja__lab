## CREATE TABLE...
```mysql
CREATE TABLE Students(Id int primary key auto_increment, Firstname varchar(255) NOT NULL, Secondname varchar(255) NOT NULL,Email varchar(255) UNIQUE NOT
 NULL, Age int(2) NOT NULL, dateofbirth date NOT NULL);
```
## ALTER TABLE...
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

```mysql
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
```mysql
SELECT * FROM Students;
```
| Id | Firstname | Secondname | Email                       | Age | dateofbirth | Class |
|:--:|:----------|:-----------|:----------------------------|:---:|:------------|:------|
|  1 | Aswath    | kaja       | Aswathkaja48@gmail.com      |  18 | 2004-02-26  | NULL  |
|  2 | Vimal     | raj        | vimal@gmail.com             |  19 | 2002-12-20  | NULL  |
|  3 | Prasanna  | venkatesh  | prasannavenkatesh@gmail.com |  21 | 2001-01-20  | NULL  |
###### 3 rows in set (0.00 sec)
* * *

## DROP TABLE...
```mysql
DROP TABLE Students;
```
###### Query OK, 0 rows affected (0.02 sec)
```mysql
DROP DATABASE School;
```
###### Query OK, 0 rows affected (0.02 sec)

## TRUNCATE TABLE
```mysql
TRUNCATE TABLE  table_name;
```
##### Query OK, 0 rows affected 

### RENAME
 ```syntax
  RENAME TABLE school to student_list;
 ```


