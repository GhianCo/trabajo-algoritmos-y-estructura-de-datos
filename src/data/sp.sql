create procedure sp_findAll_Producto()
	select p.producto_id, p.producto_nombre, c.categoria_nombre, p.producto_costo, p.producto_precio, p.producto_cantvendida from producto p, categoria c where c.categoria_id = p.categoria_id;

create procedure sp_findAll_Cliente()
	select c.cliente_id, c.cliente_nombres, c.cliente_apellidos, m.membresia_nombre, c.cliente_edad, c.cliente_telefono from cliente c, membresia m where c.membresia_id = m.membresia_id;

create procedure sp_find_Cliente(in cliente_id int)
	select c.cliente_id, c.cliente_nombres, c.cliente_apellidos, m.membresia_nombre, c.cliente_edad, c.cliente_telefono from cliente c, membresia m where c.membresia_id = m.membresia_id and c.cliente_id = cliente_id;
    
create procedure sp_insert_Cliente(in membresia_id int, in cliente_orden varchar(45), in cliente_nombres varchar(45), in cliente_apellidos varchar(45), in cliente_edad varchar(45), in cliente_telefono varchar(45))
	insert into cliente values(membresia_id, cliente_orden, cliente_nombres, cliente_apellidos, cliente_edad, cliente_telefono);

create procedure sp_update_Cliente(in cliente_id int, in membresia_id int, in cliente_orden varchar(45), in cliente_nombres varchar(45), in cliente_apellidos varchar(45), in cliente_edad varchar(45), in cliente_telefono varchar(45))
	update cliente set membresia_id = membresia_id, cliente_orden = cliente_orden, cliente_nombres = cliente_nombres, cliente_apellidos = cliente_apellidos, cliente_edad = cliente_edad, cliente_telefono = cliente_telefono where cliente_id = cliente_id;