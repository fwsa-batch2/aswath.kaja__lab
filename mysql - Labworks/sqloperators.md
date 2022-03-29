# MySQL Operators
```syntax
SELECT * FROM students;
```
| Id | Firstname | Secondname | Email                   | Age | dateofbirth | Class |
|:--:|:----------|:---------|:------------------------|:---:|:------------|:--------|
|  1 | Vimal     | raj        | vimal@gmail.com         |  19 | 2002-12-20  | XII   |
|  2 | Aswath    | kaja       | Aswathkaja48@gmail.com  |  18 | 2004-02-26  | XII   |
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
|  2 | Aswath    | kaja       | Aswathkaja48@gmail.com  |  18 | 2004-02-26  | XII   |
###### 2 rows in set (0.00 sec)
### BETWEEN
```syntax
SELECT * FROM students WHERE Age BETWEEN 10 AND 22;
```
| Id | Firstname | Secondname | Email                   | Age | dateofbirth | Class |
|:---|:----------|:-----------|:------------------------|:----|:------------|:------|
|  1 | Vimal     | raj        | vimal@gmail.com         |  19 | 2002-12-20  | XII   |
|  2 | Aswath    | kaja       | Aswathkaja48@gmail.com  |  18 | 2004-02-26  | XII   |
###### 2 rows in set (0.00 sec)
### IN
```syntax
mysql> SELECT * FROM students WHERE Class IN ('XII');
```
| Id | Firstname | Secondname | Email                   | Age | dateofbirth | Class |
|:---|:----------|:-----------|:------------------------|:----|:------------|:------|
|  1 | Vimal     | raj        | vimal@gmail.com         |  19 | 2002-12-20  | XII   |
|  2 | Aswath    | kaja       | Aswathkaja48@gmail.com  |  18 | 2004-02-26  | XII   |
###### 2 rows in set (0.00 sec)
### LIKE
```syntax
mysql> SELECT * FROM students WHERE Firstname LIKE 'As%';
```
| Id | Firstname | Secondname | Email                   | Age | dateofbirth | Class |
|:---|:----------|:-----------|:------------------------|:----|:------------|:------|
|  2 | Aswath    | kaja       | Aswathkaja48@gmail.com  |  18 | 2004-02-26  | XII   |
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
