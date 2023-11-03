drop table if exists mago;

create table mago(
    id int auto_increment,
    nombre varchar(100),
    primary key (id)
);

insert into mago(nombre) values ('Gandalf el Gris'),
                                ('Saruman el Blanco'),
                                ('Khadgar'),
                                ('Antonidas'),
                                ('Albus Dumbeldores'),
                                ('Albus Severus Potter');