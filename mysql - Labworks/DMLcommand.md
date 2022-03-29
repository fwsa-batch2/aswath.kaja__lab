### MySQL SELECT
```syntax
SELECT * FROM Students;
```
| Id | Firstname | Secondname | Email                       | Age | dateofbirth |
|:--:|:----------|:--------:|:------------------------|:---:|:------------|
|  1 | Aswath    | kaja       | Aswathkaja48@gmail.com      |  18 | 2004-02-26  |
|  2 | Vimal     | raj        | vimal@gmail.com             |  19 | 2002-12-20  |
|  3 | Prasanna  | venkatesh  | prasannavenkatesh@gmail.com |  21 | 2001-01-20  |
###### 3 rows in set (0.00 sec)
* * *
### MySQL INSERT INTO...
```syntax
INSERT INTO Students (Firstname,Secondname,Email,Age,dateofbirth) VALUES
('Aswath','kaja','Aswathkaja48@gmail.com','18','2004-02-26');
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

### MySQL UPDATE...
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
|  1 | Aswath    | kaja       | Aswathkaja48@gmail.com      |  18 | 2004-02-26  | XII   |
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
|  1 | Aswath    | kaja       | Aswathkaja48@gmail.com  |  17 | 2004-02-26  | XII   |
|  2 | Vimal     | raj        | vimal@gmail.com         |  19 | 2002-12-20  | X     |
###### 2 rows in set (0.00 sec)
* * *
```syntax
SHOW DATABASES;
```
| Database           |
|:-------------------|
| information_schema |
| Aswath             |
| mysql              |
| performance_schema |
| sys                |
###### 5 rows in set (0.00 sec)
* * *
