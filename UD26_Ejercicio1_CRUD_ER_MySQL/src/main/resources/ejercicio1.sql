DROP DATABASE ejercicio1;
CREATE DATABASE ejercicio1;
USE ejercicio1;

CREATE TABLE Piezas (
  id int not null,
  nombre varchar(100) NOT NULL,
  PRIMARY KEY (id)
)ENGINE=InnoDB;
;

CREATE TABLE Proveedores (
  id char(4) NOT NULL,
  nombre varchar(100) NOT NULL,
  PRIMARY KEY (id)
)ENGINE=InnoDB;


CREATE TABLE Suministra (
  id int AUTO_INCREMENT,
  codigopieza int not null,
  proveedorid char(4) NOT NULL,
  precio int not NULL,
  PRIMARY KEY (id),
  CONSTRAINT Suministra_ibfk_1 FOREIGN KEY (codigopieza) REFERENCES piezas (id),
  CONSTRAINT Suministra_ibfk_2 FOREIGN KEY (proveedorid) REFERENCES proveedores (id)
)ENGINE=InnoDB;


INSERT INTO Piezas (nombre) VALUES ("Tornillo");
INSERT INTO Piezas (nombre) VALUES ("Claves");
INSERT INTO Piezas (nombre) VALUES ("Bisagra");
INSERT INTO Piezas (nombre) VALUES ("Llave");

INSERT INTO Proveedores (id, nombre) VALUES ('AAAA',"Bosh");
INSERT INTO Proveedores (id, nombre) VALUES ('BBBB',"LG");
INSERT INTO Proveedores (id, nombre) VALUES ('CCCC',"Brother");
INSERT INTO Proveedores (id, nombre) VALUES ('DDDD',"Balay");

INSERT INTO Suministra (codigopieza,proveedorid,precio) VALUES (1,'AAAA',90);
INSERT INTO Suministra (codigopieza,proveedorid,precio) VALUES (2,'BBBB',91);
INSERT INTO Suministra (codigopieza,proveedorid,precio) VALUES (3,'CCCC',92);
INSERT INTO Suministra (codigopieza,proveedorid,precio) VALUES (2,'DDDD',93);

