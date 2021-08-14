DROP table IF EXISTS cliente;

create table cliente(
	id int auto_increment,
	nombre varchar(250),
	trabajo varchar(250),
	sueldo varchar(250)
	);

insert into cliente (nombre, trabajo ,sueldo)values('Jose','Policia',1000);