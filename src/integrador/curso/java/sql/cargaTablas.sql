create table clientes(
    id int auto_increment primary key,
    nombre varchar(20),
    apellido varchar(20),
    nacimiento varchar(20),
    direccion varchar(20),
    cuit varchar(11)
);

create table facturas(
    numero int(6) zerofill not null auto_increment primary key,
    letra char,
    fechaInicio varchar(20),
    fechaVencimiento varchar(20),
    idCliente int,
    monto float(2)
);

create table articulos(
    codigoBarra int(8) primary key,
    nombre varchar(50),
    descripcion varchar(80),
    precio float(2),
    stock int
);


insert into clientes values
(null,'Alejandro', 'centurion','2017/01/09','Av marquez 2500','25359921749');

insert into facturas values
(null,'A','2017/01/1','2017/02/01',1,'200.00'),
(null,'C','2017/01/15','2017/02/15',1,'3500.00'),
(null,'A','2017/01/18','2017/02/18',2,'50.00');

insert into articulos values
(12345678,'Serenisima Colonial','Dulce de leche',35.50,20),
(44445555,'Lux','Jabon de tocador, olor frutos del bosque',15.00,10);
