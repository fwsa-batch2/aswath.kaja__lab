# Aggregate functions
```syntax
SELECT * FROM students;
```
| Id | Firstname | Secondname | Email                   | Age | dateofbirth | Class |
|:---|:----------|:-----------|:------------------------|:----|:------------|:------|
|  1 | Vimal     | raj        | vimal@gmail.com         |  19 | 2002-12-20  | XII   |
|  2 | Aswath    | kaja       | Aswathkaja48@gmail.com  |  18 | 2004-02-26  | XII   |
###### 2 rows in set (0.00 sec)
### MIN
```syntax
mysql> SELECT MIN(age) FROM students;
```
| MIN(age) |
|:---------|
|       18 |
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
|:--------:|
|       36 |
###### 1 row in set (0.00 sec)
