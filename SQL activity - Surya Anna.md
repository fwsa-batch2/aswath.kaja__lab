# SQL ACTIVITY GIVEN BY SURYA ANNA

## AVAILABLE TABLES
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
|:---------|:---------|:-----------|:--------|:---------------|
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
|:---------|:---------|:-----------|:--------|:---------------|
| id       | tinyint  | NO   | PRI | NULL    | auto_increment |
| name     | varchar  | NO   | MUL |         |                |

### CREATE child TABLE 2 called batch_courses
```syntax
CREATE TABLE batch_courses(Id int PRIMARY KEY AUTO_INCREMENT,Batch_id int,Course_id int, FOREIGN KEY(Batch_id) REFERENCES batch(id),FOREIGN KEY(Course_id) REFERENCES user(id));
```
```syntax
DESC batch_courses;
```

| Field     | Type | Null | Key | Default | Extra          |
|:----------|:-----|:-----|:----|:--------|:---------------|
| Id        | int  | NO   | PRI | NULL    | auto_increment |
| Batch_id  | int  | YES  | MUL | NULL    |                |
| Course_id | int  | YES  | MUL | NULL    |                |


### TASK 3 : Take username,student_id and batch value

```syntax
SELECT user.id,user.name AS username,batch.name AS batch FROM batch_user JOIN user ON batch_user.user_id = user.id JOIN batch ON batch_user.batch_id = batch.id;
```

| id | username | name   |
|:---|:---------|:-------|
|  2 | Dhaya    | Batch1 |
|  2 | Dhaya    | Batch1 |
|  1 | Surya    | Batch1 |

### TASK 4 : Take user id, username,batch id, batch name, courses id,courses name for who learn HTML only

```syntax
SELECT courses.id AS course_id,courses.name AS course_name, batch.id AS batch_id , batch.name AS batch_name , user.id AS user_id , user.name AS user_name FROM batch_courses INNER JOIN courses ON courses.id = batch_courses.id AND courses.name = 'HTML' join batch ON batch.id = batch_courses.id join user ON user.id = batch_courses.id;
```
| course_id | course_name | batch_id | batch_name | user_id | user_name |
|:----------|:------------|:---------|:-----------|:--------|:----------|
|         1 | HTML        |        1 | Batch1     |       1 | Aswath    |

### TASK 5 : Take user id, username,batch id, batch name, courses id,courses name for who name is Aswath

```syntax
SELECT courses.id AS course_id,courses.name AS course_name, batch.id AS batch_id , batch.name AS batch_name , user.id AS user_id , user.name AS user_name FROM batch_courses inner join courses ON courses.id = batch_courses.id join batch ON batch.id = batch_courses.id join user ON user.id = batch_courses.id AND user.name = 'Aswath';
```
| course_id | course_name | batch_id | batch_name | user_id | user_name |
|:----------|:------------|:---------|:-----------|:--------|:----------|
|         1 | HTML        |        1 | Batch1     |       1 | Aswath    |