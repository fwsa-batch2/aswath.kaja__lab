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


data:image/jpeg;base64,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






 
