create database studentdb;
use studentdb;
create table studenttbl(
	id int auto_increment not null primary key,
    name char(4) not null,
    birth date,
    phone char(15),
    gender char(1),
    kor int,
    eng int,
    mat int
);

show tables;

select * from studenttbl;

select * from studenttbl where birth < date_format('1987-1-1','%Y-%m-%d');

