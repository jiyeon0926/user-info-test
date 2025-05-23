create table info(
	id bigint not null auto_increment,
	email varchar(50) not null,
	name varchar(20) not null,
	book_title varchar(50) not null,
	author varchar(20) not null,
	publisher varchar(20) not null,
	primary key (id),
	unique key uq_email (email)
)
