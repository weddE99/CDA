DROP DATABASE afip;
CREATE DATABASE afip;
USE afip;

CREATE TABLE impuesto(
	id INT(4) PRIMARY KEY AUTO_INCREMENT NOT NULL,
	tipo_impuesto VARCHAR(80) NOT NULL,
    fecha_liquidacion DATE
);

CREATE TABLE contribuyente(
	clave_fiscal INT(8) PRIMARY KEY NOT NULL,
    nombre VARCHAR(30),
    apellido VARCHAR(50)
);

CREATE TABLE impuesto_por_contribuyente(
	id INT(4) PRIMARY KEY AUTO_INCREMENT NOT NULL,
    clave_fiscal INT(8) NOT NULL,
    id_impuesto INT(4) NOT NULL,
    FOREIGN KEY (numero_fiscal) REFERENCES contribuyente(numero_fiscal),
    FOREIGN KEY (id_impuesto) REFERENCES impuesto(id)
);

INSERT INTO impuesto VALUES (1111,'Impuesto a las Ganancias','2010-10-10'),
(2222,'Impuesto al Valor Agregado (IVA)','2010-10-10'),
(3333,'Impuesto a la Ganancia Minima Presunta','2010-10-10'),
(4444,'Impuesto a los Bienes Personales','2010-10-10'),
(5555,'Impuesto sobre los Debitos y creditos Bancarios','2010-10-10'),
(6666,'Impuesto sobre los Ingresos Brutos','2010-10-10'),
(7777,'Impuesto al Sello','2010-10-10'),
(8888,'Impuesto a la Transferencia de Inmuebles','2010-10-10');

INSERT INTO contribuyente VALUES (11111111,'Alfredo','Palacios'),
(22222222,'Benites','Angie'),
(33333333,'Lucas','Askiara'),
(44444444,'Wilson','Dabrowski'),
(55555555,'Emanuel','Frank');