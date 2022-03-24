# Msql-labworks
### MySQL SHOW DATABASES Statement
```syntax
SHOW DATABASES;
```
| Database           |
|:-----|
| information_schema |
| Aswath             |
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
| Aswath             |
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

### MySQL WHERE 
```syntax
SELECT * FROM Students WHERE Id='1';
```
| Id | Firstname | Secondname | Email                   | Age | dateofbirth |
|:--:|:----------|:---------|:------------------------|:---:|:------------|
|  1 | Aswath    | kaja       | Aswathkaja48@gmail.com |  18 | 2004-02-26  |
###### 1 row in set (0.00 sec)
* * *


