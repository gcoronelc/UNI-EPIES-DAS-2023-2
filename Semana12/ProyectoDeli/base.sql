use master
GO

--Cierra todas las conexiones a la base de datos y luego elimna ProyectoDeli:


DROP DATABASE ProyectoDeli;
GO

CREATE DATABASE ProyectoDeli;
GO

USE ProyectoDeli;
GO


CREATE TABLE CLIENTES
( 
	ID_CLIENTE           INT IDENTITY ( 1,1 ) ,
	DNI                  VARCHAR(20)  NOT NULL ,
	APELLIDOP            VARCHAR(50)  NOT NULL ,
	APELLIDOM            VARCHAR(50)  NOT NULL ,
	CELULAR              VARCHAR(20)  NOT NULL ,
	CORREO               VARCHAR(50)  NOT NULL ,
	CLAVE                VARCHAR(50)  NOT NULL ,
	NOMBRE               VARCHAR(50)  NOT NULL 
)
go



ALTER TABLE CLIENTES
	ADD  PRIMARY KEY  CLUSTERED (ID_CLIENTE ASC)
go



CREATE TABLE ENVIOS
( 
	ID_ENVIO             INT IDENTITY ( 1,1 ) ,
	FECHA                DATETIME  NOT NULL ,
	ESTADO               VARCHAR(50)  NOT NULL ,
	TOTAL                NUMERIC(8,2)  NOT NULL ,
	ID_EMPLEADO          INT  NOT NULL ,
	ID_CLIENTE           INT  NOT NULL 
)
go



ALTER TABLE ENVIOS
	ADD  PRIMARY KEY  CLUSTERED (ID_ENVIO ASC)
go



CREATE TABLE ENVIOS_DETALLE
( 
	LARGO                NUMERIC(8,2)  NOT NULL ,
	ANCHO                NUMERIC(8,2)  NOT NULL ,
	ALTO                 NUMERIC(8,2)  NOT NULL ,
	PESO                 NUMERIC(8,2)  NOT NULL ,
	ID_ENVIO             INT  NOT NULL ,
	ID_ENVIO_DETALLES    INT IDENTITY ( 1,1 ) 
)
go



ALTER TABLE ENVIOS_DETALLE
	ADD  PRIMARY KEY  CLUSTERED (ID_ENVIO_DETALLES ASC)
go



CREATE TABLE ENVIOS_RECEPTOR
( 
	NOMBRE               VARCHAR(50)  NOT NULL ,
	APELLIDOP            VARCHAR(50)  NOT NULL ,
	APELLIDOM            VARCHAR(50)  NOT NULL ,
	DNI                  VARCHAR(20)  NOT NULL ,
	CELULAR              VARCHAR(20)  NOT NULL ,
	ID_ENVIO             INT  NOT NULL ,
	ID_RECEPTORES        INT IDENTITY ( 1,1 ) 
)
go



ALTER TABLE ENVIOS_RECEPTOR
	ADD  PRIMARY KEY  CLUSTERED (ID_RECEPTORES ASC)
go



CREATE TABLE USUARIOS
( 
	ID_EMPLEADO          INT IDENTITY ( 1,1 ) ,
	CODIGO               VARCHAR(10)  NOT NULL ,
	NOMBRE               varchar(50)  NOT NULL ,
	APELLIDO             varchar(50)  NOT NULL ,
	CLAVE                varchar(50)  NOT NULL ,
	CARGO                varchar(50)  NULL 
)
go



ALTER TABLE USUARIOS
	ADD  PRIMARY KEY  CLUSTERED (ID_EMPLEADO ASC)
go






--inserta el usuario admin con contraseña 1234

INSERT INTO USUARIOS(CODIGO, NOMBRE, APELLIDO, CLAVE, CARGO) VALUES('admin', 'admin', 'admin', '1234', 'admin');

--inserta un cliente cualquiera para poder hacer pruebas

INSERT INTO CLIENTES(DNI, NOMBRE, APELLIDOP, APELLIDOM, CELULAR, CORREO, CLAVE) VALUES('12345678', 'Juan', 'Perez', 'Campos', '12345678', 'jperez@mail.pe' , '1234');


select * from CLIENTES
select * from USUARIOS


select * from ENVIOS
SELECT * FROM ENVIOS_DETALLE
SELECT * FROM ENVIOS_RECEPTOR