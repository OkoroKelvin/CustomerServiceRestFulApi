# CustomerServiceRestFulApi

## To set up MYSQL Data Base
## Run 
```

create database customerdb;

create user 'customer_user'@'localhost' identified by 'customer_password';
grant all privileges on customerdb.* to 'customer_user'@'localhost';
flush privileges;
```

# Controller Documentation

```
http://localhost:8080/api/v1/swagger-ui/index.html#/
```
