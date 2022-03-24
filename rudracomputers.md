# LET US CREATE A DATABASE FOR RUDRA COMPUTERS

## CREATE DATABASE
``` mysql
CREATE DATABASE RudraComputers;
```
## USING THE DATABASE AND CREATING TABLE
``` mysql
USE Rudracomputers;
 ```
 ```mysql
CREATE TABLE customer_details (customer_id int PRIMARY KEY AUTO_INCREMENT,customer_name VARCHAR(30) NOT NULL,customer_email VARCHAR(30) UNIQUE NOT NULL CHECK (customer_email LIKE "%_@%_.com"),customer_phone_number BIGINT UNIQUE NOT NULL CHECK(customer_phone_number LIKE "__________"));
```
```mysql
DESC customer_details;
 ```

| Field                 | Type        | Null | Key | Default | Extra          |
|:----------------------|:------------|:-----|:----|:--------|:---------------|
| customer_id           | int         | NO   | PRI | NULL    | auto_increment |
| first_name            | varchar(20) | NO   |     | NULL    |                |
| last_name             | varchar(20) | YES  |     | NULL    |                |
| username              | varchar(50) | NO   |     | NULL    |                |
| customer_email        | varchar(30) | NO   | UNI | NULL    |                |
| password              | varchar(15) | YES  |     | NULL    |                |
| address               | varchar(50) | YES  |     | NULL    |                |
| customer_phone_number | bigint      | NO   | UNI | NULL    |                |

 ``` mysql
CREATE TABLE products(product_id INT PRIMARY KEY, brand_id int , product_name VARCHAR(100) NOT NULL ,product_model VARCHAR(100), product_price BIGINT ,FOREIGN KEY (brand_id) REFERENCES brands (brand_id) );
  ```

```mysql
 DESC products;
  ```

| Field            | Type         | Null | Key | Default | Extra |
|:-----------------|:-------------|:-----|:----|:--------|:------|
| product_id       | int          | NO   | PRI | NULL    |       |
| brand_id         | int          | YES  | MUL | NULL    |       |
| product_name     | varchar(100) | NO   |     | NULL    |       |
| product_category | varchar(100) | YES  |     | NULL    |       |
| product_price    | bigint       | YES  |     | NULL    |       |

  ``` mysql
 CREATE TABLE cart(order_id int PRIMARY KEY, product_id INT , Quantity int , total_cost BIGINT UNIQUE KEY,status enum ('out for delivery', 'delivered' ,'process not started'), ordered_date timestamp not null default current_timestamp , FOREIGN KEY (product_id) REFERENCES products (product_id));
``` 
```mysql
DESC cart;
```
| Field          | Type                                                       | Null | Key | Default           | Extra             |
|:---------------|:-----------------------------------------------------------|:-----|:----|:------------------|:------------------|
| order_id       | int                                                        | NO   | PRI | NULL              |                   |
| customer_id    | int                                                        | YES  | MUL | NULL              |                   |
| product_id     | int                                                        | YES  | MUL | NULL              |                   |
| Quantity       | int                                                        | YES  |     | NULL              |                   |
| total_cost     | bigint                                                     | YES  |     | NULL              |                   |
| status         | enum('out for delivery','delivered','process not started') | YES  |     | NULL              |                   |
| ordered_date   | timestamp                                                  | YES  |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
| delivered_date | timestamp                                                  | YES  |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |

``` mysql
 CREATE TABLE payment(order_id int , amount BIGINT , payment_id int PRIMARY KEY , payment_type enum('cash on delivery','online payment') ,payment_status  enum('recieved','not recieved'), FOREIGN KEY (order_id) REFERENCES cart (order_id));
``` 
```mysql
desc payment;
```
| Field          | Type                                      | Null | Key | Default | Extra |
|:---------------|:------------------------------------------|:-----|:----|:--------|:------|
| order_id       | int                                       | YES  | MUL | NULL    |       |
| amount         | bigint                                    | YES  |     | NULL    |       |
| payment_id     | int                                       | NO   | PRI | NULL    |       |
| payment_type   | enum('cash on delivery','online payment') | YES  |     | NULL    |       |
| payment_status | enum('recieved','not recieved')           | YES  |     | NULL    |       |

 ``` mysql 
 CREATE TABLE stocks(id int primary key, brand_id int , total_stocks int , available_stocks int , no_of_stocks_sold int , availability enum('in stock','out of stock'),foreign key (brand_id) references brands (brand_id));   
   ``` 

```mysql
DESC stocks;
```
| Field             | Type                            | Null | Key | Default | Extra |
|:------------------|:--------------------------------|:-----|:----|:--------|:------|
| id                | int                             | NO   | PRI | NULL    |       |
| brand_id          | int                             | YES  | MUL | NULL    |       |
| total_stocks      | int                             | YES  |     | NULL    |       |
| available_stocks  | int                             | YES  |     | NULL    |       |
| no_of_stocks_sold | int                             | YES  |     | NULL    |       |
| availability      | enum('in stock','out of stock') | YES  |     | NULL    |       |

  ```mysql
 CREATE TABLE brands (brand_id int PRIMARY KEY,brand_name varchar(50));
 ``` 

```mysql
 DESC brands;
```
| Field      | Type        | Null | Key | Default | Extra |
|:-----------|:------------|:-----|:----|:--------|:------|
| brand_id   | int         | NO   | PRI | NULL    |       |
| brand_name | varchar(50) | YES  |     | NULL    |       |
| ratings    | float       | YES  |     | NULL    |       |

  ``` mysql
  CREATE TABLE reviews (customer_id int , review_id int PRIMARY KEY, ratings int(5) check (ratings <= 5) , comments varchar(50) ,posted_date timestamp not null default current_timestamp, FOREIGN KEY (customer_id) REFERENCES customer_details (customer_id) );
``` 
```mysql
 DESC reviews;
```
| Field       | Type        | Null | Key | Default           | Extra             |
|:------------|:------------|:-----|:----|:------------------|:------------------|
| customer_id | int         | YES  | MUL | NULL              |                   |
| review_id   | int         | NO   | PRI | NULL              |                   |
| ratings     | int         | YES  |     | NULL              |                   |
| comments    | varchar(50) | YES  |     | NULL              |                   |
| posted_date | timestamp   | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |

  ``` mysql
 CREATE TABLE services (customer_id int ,service_id int PRIMARY KEY , problem_note varchar(100),service_status varchar(100),posted_date timestamp not null default current_timestamp  FOREIGN KEY (customer_id) REFERENCES customer_details (customer_id));
 ``` 
```mysql
 DESC services;
```
| Field          | Type         | Null | Key | Default           | Extra             |
|:---------------|:-------------|:-----|:----|:------------------|:------------------|
| customer_id    | int          | YES  | MUL | NULL              |                   |
| service_id     | int          | NO   | PRI | NULL              |                   |
| problem_note   | varchar(100) | YES  |     | NULL              |                   |
| service_status | varchar(100) | YES  |     | NULL              |                   |
| posted_date    | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
| handled_by     | varchar(10)  | YES  | MUL | NULL              |                   |

```mysql
CREATE TABLE employees (emp_id varchar(10) PRIMARY KEY , emp_name varchar(100) NOT NULL,role varchar(50) not null, experience INT NOT NULL , joined_date DATE NOT NULL );
  ```
```mysql
 DESC employees;
```
| Field       | Type         | Null | Key | Default | Extra |
|:------------|:-------------|:-----|:----|:--------|:------|
| emp_id      | varchar(10)  | NO   | PRI | NULL    |       |
| emp_name    | varchar(100) | YES  |     | NULL    |       |
| role        | varchar(50)  | YES  |     | NULL    |       |
| experience  | int          | YES  |     | NULL    |       |
| joined_date | date         | YES  |     | NULL    |       |



```mysql
```

## LET US INSERT VALUES INTO TABLES

### INSERT INTO CUSTOMER DETAILS

   ``` mysql
 INSERT INTO customer_details VALUES (NULL,"gandhi",'mahaan','gandhi01',"gandhi@gmail.com",1234568,9080641774),(NULL,"sathyavaan",'soosayappan','sathya02',"sathya@gmail.com",12345678,'xyz street',9080641775)(NULL,"dadabhai",'naroji','dada03',"dada03@gmail.com",12345678,'xyz street',9080641776);
  ```
```mysql
     SELECT * FROM customer_details;
```

| customer_id | first_name | last_name   | username | customer_email   | password | address    | customer_phone_number |
|:------------|:-----------|:------------|:---------|:-----------------|:---------|:-----------|:----------------------|
|           1 | gandhi     | mahaan      | gandhi01 | gandhi@gmail.com | 12345678 | xyz street |            9080641774 |
|           2 | sathyavaan | soosayappan | sathya02 | sathya@gmail.com | 12345678 | xyz street |            9080641775 |
|           3 | dadabhai   | naroji      | dada03   | dada03@gmail.com | 12345678 | xyz street |            9080641776 |

### INSERT INTO BRANDS

``` mysql
insert into brands values (1,'dell'),(2,'lenovo'),(3,'hp'),(4,'apple');
``` 

```mysql
SELECT * FROM brands;
```
| brand_id | brand_name | ratings |
|:---------|:-----------|:--------|
|        1 | dell       |     4.8 |
|        2 | lenovo     |     4.5 |
|        3 | hp         |     4.3 |
|        4 | apple      |     4.9 |

### INSERT INTO PRODUCTS

``` mysql
insert into products values(1,1,'lenovo ideapad slim','laptop', 40000),(2,2,'dell vestro 3400','laptop', 50000),(3,3,'HP 15 db1069AU','laptop', 50000),(4,4,'Apple macbook air','laptop', 100000);
``` 

```mysql
select * from products;
```

| product_id | brand_id | product_name        | product_category | product_price |
|:-----------|:---------|:--------------------|:-----------------|:--------------|
|          1 |        1 | lenovo ideapad slim | laptop           |         40000 |
|          2 |        2 | dell vestro 3400    | laptop           |         50000 |
|          3 |        3 | HP 15 db1069AU      | laptop           |         50000 |
|          4 |        4 | Apple macbook air   | laptop           |        100000 |

### INSERT INTO CART
```mysql
insert into cart (order_id,customer_id,product_id,Quantity,total_cost,status) values(1, 1 , 1 , 1 , 40000 , 'out for delivery'),(2, 2 , 3 , 1 , 50000 , 'delivered'),(3, 3 , 2 , 1 , 50000 , 'delivered');
``` 
```mysql
select * from cart;
```
| order_id | customer_id | product_id | Quantity | total_cost | status           | ordered_date        | delivered_date      |
|:---------|:------------|:-----------|:---------|:-----------|:-----------------|:--------------------|:--------------------|
|        1 |           1 |          1 |        1 |      40000 | delivered        | 2022-03-17 15:13:30 | 2022-03-19 12:30:00 |
|        2 |           2 |          3 |        1 |      50000 | out for delivery | 2022-03-19 19:13:20 | NULL                |
|        3 |           3 |          2 |        1 |      50000 | delivered        | 2022-03-20 19:12:55 | 2022-03-19 10:15:00 |


### INSERT INTO PAYMENT
``` mysql
insert into payment values(1 , 40000 , 1 , cash on delivery ,'recieved'),(2, 50000 ,2,'online payment' ,'not recived'),(3, 50000 ,3,'online payment' ,'not recived');
 ``` 

```mysql
SELECT * FROM payment;
```

| order_id | amount | payment_id | payment_type     | payment_status |
|:---------|:-------|:-----------|:-----------------|:---------------|
|        1 |  40000 |          1 | cash on delivery | recieved       |
|        2 |  50000 |          2 | online payment   | not recieved   |
|        3 |  50000 |          3 | online payment   | not recieved   |

### INSERT VALUES INTO STOCKS
```mysql
SELECT * FROM stocks;
```
| id | brand_id | total_stocks | available_stocks | no_of_stocks_sold | availability |
|:---|:---------|:-------------|:-----------------|:------------------|:-------------|
|  1 |        1 |           10 |                9 |                 1 | in stock     |

### INSERT VALUES INTO REVIEWS
```mysql
SELECT * FROM reviews;
```
| customer_id | review_id | ratings | comments | posted_date         |
|:------------|:----------|:--------|:---------|:--------------------|
|           1 |         1 |       4 | nice app | 2022-03-19 12:54:43 |

### INSERT VALUES INTO SERVICES
```mysql
SELECT * FROM services;
```
| customer_id | service_id | problem_note  | service_status      | posted_date         | handled_by |
|:------------|:-----------|:--------------|:--------------------|:--------------------|:-----------|
|           1 |          1 | restart issue | process not started | 2022-03-19 20:31:44 | E002       |

### INSERT VALUES INTO EMPLOYEES
```mysql
SELECT * FROM employees;
 ```

| emp_id | emp_name    | role              | experience | joined_date |
|:-------|:------------|:------------------|:-----------|:------------|
| E001   | Aswath      | admin             |         15 | 2010-01-01  |
| E002   | Abdul ajees | hardware engineer |          5 | 2012-10-12  |
| E003   | sanjay      | hardware engineer |          5 | 2012-10-12  |
| E004   | musaraf     | software engineer |          2 | 2014-10-20  |

 
### CREATING A VIEW TO SEE THE ORDER PROGRESS OF CUSTOMERS
```mysql                                                                                                         
create view order_progress as select ct.customer_id , ct.order_id,ct.product_id,ct.status,ct.delivered_date,py.payment_id,py.payment_type,py.payment_status from cart ct inner join payment py on ct.order_id = py.order_id;
```


 ### CREATING A VIEW TO SEE THE PROGRESS OF CUSTOMERS
```mysql   
create view customer_progress select cus.customer_id , ct.customer_id , ct.order_id,ct.product_id,ct.status,ct.delivered_date,py.payment_id,py.payment_type,py.payment_status,sv.service_id,sv.problem_note,sv.service_status,sv.posted_date from customer_details cus left join cart ct on cus.customer_id =ct.customer_id  left join payment py on ct.order_id = py.order_id left join services sv on ct.customer_id = sv.customer_id;
 ```


![WIN_20220310_14_56_23_Pro](https://user-images.githubusercontent.com/93571042/159880846-9392daba-ef3e-4b8f-a1f1-04c2a29b649a.jpg)




 
