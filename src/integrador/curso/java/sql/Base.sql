
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

create table facturas(
numero int(6) zerofill not null auto_increment primary key,
letra char,
fechaInicio varchar(20),
fechaVencimiento varchar(20),
idCliente int,
monto float(2)
);

drop table facturas;

insert into facturas values
(null,'A','2017/01/1','2017/02/01',1,'200.00'),
(null,'C','2017/01/15','2017/02/15',1,'3500.00'),
(null,'A','2017/01/18','2017/02/18',2,'50.00');

DELETE FROM facturas WHERE numero=1;

select * from facturas where idCliente=1;