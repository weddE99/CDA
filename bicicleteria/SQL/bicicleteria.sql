use bicicleteria;
drop table if exists bicicletas;

CREATE TABLE bicicletas(
	id INT(4) NOT NULL AUTO_INCREMENT,
    modelo VARCHAR(20) NOT NULL,
    rodado VARCHAR(10) NOT NULL,
    precio DOUBLE NOT NULL,
    color VARCHAR(20) NOT NULL,
    anio DATE NOT NULL,
    PRIMARY KEY(id)
)

INSERT INTO bicicletas VALUES (1,'bicicletas de Montaña',17,14510,'rojo','2010:12:12'),
(2,'Bicicletas de Ruta',15,10500,'verde','2010:12:12'),
(3,'Bicicletas Urbanas',13,8500,'amarillo','2010:12:12');