
drop database if exists integrador;
create database integrador;
use integrador;

create table clientes(
    id int auto_increment primary key,
    nombre varchar(20),
    apellido varchar(20),
    nacimiento varchar(20),
    direccion varchar(20),
    cuit varchar(20)
);

drop table clientes;

insert into clientes values
(null,'Alejandro', 'centurion','2017/01/09','Av marquez 2500','25359921749');

select * from clientes;