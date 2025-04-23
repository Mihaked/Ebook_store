create database eBookStore;

/*the first thing create table publisher
and create table for phone because i't multi valiue 
*/
create table publisher
(
publisher_id int primary key,
frist_name varchar(10),
laste_name varchar(10),
city varchar(10)


);
create table phone
(
phone_number varchar(12),
publisher_id int,
foreign key (publisher_id) references publisher(publisher_id)
);

/*creat table for book and also is in relationshipe one to many with publisher
and many to many with Author
*/

create table book
(
ISBN varchar(10) primary key not null,
title varchar(30) ,
typee varchar(10),
price float,
page_count int,
publisher_id int,
foreign key (publisher_id) references publisher(publisher_id)
);

/*
create table Author
*/

create table Author
(
author_id varchar(10) primary key,
firste_name varchar(10),
laste_name varchar(10)
);


create table Author_Book
(
author_id varchar(10),
ISBN varchar(10) ,
primary key (author_id,ISBN),
foreign key (author_id) references Author (author_id),
foreign key (ISBN) references book (ISBN));
select * from  book


