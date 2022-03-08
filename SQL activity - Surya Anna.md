# SQL ACTIVITY GIVEN BY SURYA ANNA

## AVAILABLE TABLES

## TASK 1 & 2  CREATE AND INSERT VALUES IN TABLES

### TABLE 1

```syntax
SELECT * FROM user;
```
| id | Name   |
|:---|:-------|
|  1 | Aswath |
|  2 | Haiden |

```syntax
DESC user;
```
| Field    | Type     | Null | Key | Default | Extra          |
|:---------|:---------|:-----|-----|:--------|:---------------|
| id       | tinyint  | NO   | PRI | NULL    | auto_increment |
| name     | varchar  | NO   |     |         |                |

### TABLE 2

```syntax
SELECT * FROM Batch;
```
| id | Name    |
|:---|:--------|
|  1 | Batch 1 |
|  2 | Batch 2 |

```syntax
DESC Batch;
```

| Field    | Type     | Null | Key | Default | Extra          |
|:---------|:---------|:-----|-----|:--------|:---------------|
| id       | tinyint  | NO   | PRI | NULL    | auto_increment |
| name     | varchar  | NO   | MUL |         |                |


## TASK 3 : Take username,student_id and batch value

```syntax
 select user.id user_id,user.name name ,Batch.id batch_id,Batch.name batch_name,courses.id course_id,courses.name course_name from user join Batch on user.id= Batch.id join courses on user.id = courses.id;
 ```

| id | username | batch_id | batch_name | course_id | course_name |
|:---|:---------|:---------|:-----------|:----------|:------------|
|  1 | Aswath   | 1        | Batch1     |  1        | HTML        |
|  2 | Haiden   | 2        | Batch2     |  2        | CSS         |

### TASK 4 : Take user id, username,batch id, batch name, courses id,courses name for who learn HTML only

```syntax
select user.id user_id,user.name name,Batch.id batch_id,Batch.name batch_name,courses.id course_id,courses.name course_name from user join Batch on user.id= Batch.id join courses on user.id = courses.id  where courses.name in (select courses.name from courses where courses.name = 'HTML');
```
|user_id | user_name | course_id | course_name | batch_id | batch_name | 
|:-------|:----------|:----------|:------------|:---------|:-----------|
|   1    | Aswath    |         1 | HTML        |        1 | Batch1     |

### TASK 5 : Take user id, username,batch id, batch name, courses id,courses name for whose name is Aswath

```syntax
SELECT courses.id AS course_id,courses.name AS course_name, batch.id AS batch_id , batch.name AS batch_name , user.id AS user_id , user.name AS user_name FROM batch_courses inner join courses ON courses.id = batch_courses.id join batch ON batch.id = batch_courses.id join user ON user.id = batch_courses.id AND user.name = 'Aswath';
```
|user_id | user_name | course_id | course_name | batch_id | batch_name | 
|:-------|:----------|:----------|:------------|:---------|:-----------|
|   1    | Aswath    |         1 | HTML        |        1 | Batch1     |
