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
CREATE TABLE brands (brand_id int PRIMARY KEY,brand_name varchar(50));
 ``` 

  ``` mysql
CREATE TABLE products(product_id INT PRIMARY KEY, brand_id int , product_name VARCHAR(100) NOT NULL ,product_model VARCHAR(100), product_price BIGINT ,FOREIGN KEY (brand_id) REFERENCES brands (brand_id) );
  ``` 

  ``` mysql
 CREATE TABLE cart(order_id int PRIMARY KEY, product_id INT , Quantity int , total_cost BIGINT UNIQUE KEY,status enum ('out for delivery', 'delivered' ,'process not started'), ordered_date timestamp not null default current_timestamp , FOREIGN KEY (product_id) REFERENCES products (product_id));
``` 

``` mysql
 CREATE TABLE payment(order_id int , amount BIGINT , payment_id int PRIMARY KEY , payment_type enum('cash on delivery','online payment') ,payment_status  enum('recieved','not recieved'), FOREIGN KEY (order_id) REFERENCES cart (order_id));
``` 

  ``` mysql
  CREATE TABLE reviews (customer_id int , review_id int PRIMARY KEY, ratings int(5) check (ratings <= 5) , comments varchar(50) ,posted_date timestamp not null default current_timestamp, FOREIGN KEY (customer_id) REFERENCES customer_details (customer_id) );
``` 

  ``` mysql
 CREATE TABLE services (customer_id int ,service_id int PRIMARY KEY , problem_note varchar(100),service_status varchar(100),posted_date timestamp not null default current_timestamp  FOREIGN KEY (customer_id) REFERENCES customer_details (customer_id));
 ``` 

 ``` mysql 
 CREATE TABLE stocks(id int primary key, brand_id int , total_stocks int , available_stocks int , no_of_stocks_sold int , availability enum('in stock','out of stock'),foreign key (brand_id) references brands (brand_id));   
   ```   

 ``` mysql
 INSERT INTO customer_details VALUES (NULL,"dada","dada@gmail.com",'xyz street',9080641776);
  ```
 ``` mysql
 INSERT INTO customer_details VALUES (NULL,"gandhi",'mahaan','gandhi01',"gandhi@gmail.com",1234568,9080641774);
  ```
   ``` mysql
 INSERT INTO customer_details VALUES (NULL,"sathyavaan",'soosayappan','sathya02',"sathya@gmail.com",12345678,'xyz street',9080641775);
  ```
 ``` mysql
  INSERT INTO customer_details VALUES (NULL,"dadabhai",'naroji','dada03',"dada03@gmail.com",12345678,'xyz street',9080641776);
  ```
 ``` mysql
 INSERT INTO customer_details VALUES (NULL,"dadabhai",'naroji','dada03',"dada03@gmail.com",12345678,'xyz street',9080641776);
  ```

 ``` mysql
insert into brands values (1,'dell');
 ``` 

 ``` mysql
 insert into brands values (2,'lenovo');
  ```
 ``` mysql
 insert into brands values (3,'hp');
  ```
 ``` mysql
 insert into brands values (4,'apple');
 ```
 ``` mysql
insert into products values(1,1,'lenovo ideapad slim','laptop', 40000);
 ``` 
  ``` mysql
 insert into products values(2,2,'dell vestro 3400','laptop', 50000);
 ``` 
  ``` mysql
 insert into products values(3,3,'HP 15 db1069AU','laptop', 50000);
 ``` 
  ``` mysql
 insert into products values(4,4,'Apple macbook air','laptop', 100000);
 ```

 ``` mysql
insert into cart values(1, 1 , 1 , 1 , 40000 , 'out for delivery');
 ``` 
  ``` mysql
insert into cart values(2, 2 , 3 , 1 , 50000 , 'delivered');
 ``` 

  ``` mysql
insert into cart(order_id,customer_id,product_id,Quantity,total_cost,status)values(3, 3 , 2 , 1 , 50000 , 'delivered');
 ``` 


 ``` mysql
insert into payment values(1 , 40000 , 1 , cash on delivery ,)
 ``` 
  ``` mysql
insert into payment values(2, 50000 ,2,'online payment' ,'not recived');
 ``` 
  ``` mysql
insert into payment values(3, 50000 ,3,'online payment' ,'not recived');
 ``` 

   ```mysql                                                                                                         
 create view order_progress as select ct.customer_id , ct.order_id,ct.product_id,ct.status,ct.delivered_date,py.payment_id,py.payment_type,py.payment_status from cart ct inner join payment py on ct.order_id = py.order_id;
```
```mysql   
 create view customer_progress select cus.customer_id , ct.customer_id , ct.order_id,ct.product_id,ct.status,ct.delivered_date,py.payment_id,py.payment_type,py.payment_status,sv.service_id,sv.problem_note,sv.service_status,sv.posted_date from customer_details cus left join cart ct on cus.customer_id =ct.customer_id  left join payment py on ct.order_id = py.order_id left join services sv on ct.customer_id = sv.customer_id;
 ```









 
