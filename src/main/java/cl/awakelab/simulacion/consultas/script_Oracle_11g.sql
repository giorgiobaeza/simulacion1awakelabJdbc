/*
DROP table agendas CASCADE CONSTRAINTS;
DROP table doctores CASCADE CONSTRAINTS;
DROP table especialidades CASCADE CONSTRAINTS;
DROP table pacientes CASCADE CONSTRAINTS;
*/

CREATE TABLE agendas (
    idpaciente  INTEGER NOT NULL,
    iddoctor    INTEGER NOT NULL,
    idagenda    INTEGER NOT NULL,
    fecha       VARCHAR2(10),
    horadesde   VARCHAR2(5),
    duracion    INTEGER
);

ALTER TABLE agendas ADD CONSTRAINT agendas_pk PRIMARY KEY ( idagenda );

CREATE TABLE doctores (
    iddoctor        INTEGER NOT NULL,
    rutdoctor       VARCHAR2(11),
    nombre          VARCHAR2(50),
    apellido        VARCHAR2(50),
    idespecialidad  INTEGER NOT NULL
);

ALTER TABLE doctores ADD CONSTRAINT doctores_pk PRIMARY KEY ( iddoctor );

CREATE TABLE especialidades (
    idespecialidad  INTEGER NOT NULL,
    descripcion     VARCHAR2(50)
);

ALTER TABLE especialidades ADD CONSTRAINT especialidades_pk PRIMARY KEY ( idespecialidad );

CREATE TABLE pacientes (
    idpaciente   INTEGER NOT NULL,
    rutpaciente  VARCHAR2(11),
    nombre       VARCHAR2(50),
    apellido     VARCHAR2(50)
);

ALTER TABLE pacientes ADD CONSTRAINT pacientes_pk PRIMARY KEY ( idpaciente );

ALTER TABLE agendas
    ADD CONSTRAINT agendas_doctores_fk FOREIGN KEY ( iddoctor )
        REFERENCES doctores ( iddoctor );

ALTER TABLE agendas
    ADD CONSTRAINT agendas_pacientes_fk FOREIGN KEY ( idpaciente )
        REFERENCES pacientes ( idpaciente );

ALTER TABLE doctores
    ADD CONSTRAINT doctores_especialidades_fk FOREIGN KEY ( idespecialidad )
        REFERENCES especialidades ( idespecialidad );


INSERT INTO pacientes (idpaciente,rutPaciente,nombre,apellido) VALUES (1,'15940287-3','Rodolfo','Nalgonius');
INSERT INTO pacientes (idpaciente,rutPaciente,nombre,apellido) VALUES (11,'92521621-8','Valerie','Panzoni');
INSERT INTO pacientes (idpaciente,rutPaciente,nombre,apellido) VALUES (21,'71488692-0','Ochovia','Beloseno');
INSERT INTO pacientes (idpaciente,rutPaciente,nombre,apellido) VALUES (31,'10748295-7','Quinn','Shelton');
INSERT INTO pacientes (idpaciente,rutPaciente,nombre,apellido) VALUES (41,'03528514-0','Arthur','Sanders');

INSERT INTO especialidades (idespecialidad, descripcion) values (1, 'Proctología');
INSERT INTO especialidades (idespecialidad, descripcion) values (2, 'Gastroenterología');
INSERT INTO especialidades (idespecialidad, descripcion) values (3, 'Ginecología');
INSERT INTO especialidades (idespecialidad, descripcion) values (4, 'Neurología');
INSERT INTO especialidades (idespecialidad, descripcion) values (5, 'Traumatología');
INSERT INTO especialidades (idespecialidad, descripcion) values (6, 'Cardiología');
INSERT INTO especialidades (idespecialidad, descripcion) values (7, 'Psiquiatría');

INSERT INTO doctores (iddoctor,rutdoctor,nombre,apellido,idespecialidad) VALUES (1,'88043333-8','Emerson','Lucas',6);
INSERT INTO doctores (iddoctor,rutdoctor,nombre,apellido,idespecialidad) VALUES (11,'75287688-3','Chanda','Sanford',7);
INSERT INTO doctores (iddoctor,rutdoctor,nombre,apellido,idespecialidad) VALUES (21,'91861215-8','Peter','Hale',4);
INSERT INTO doctores (iddoctor,rutdoctor,nombre,apellido,idespecialidad) VALUES (31,'79410617-6','Tamekah','Bond',3);
INSERT INTO doctores (iddoctor,rutdoctor,nombre,apellido,idespecialidad) VALUES (41,'78920002-5','Juan','Manogrande',1);
INSERT INTO doctores (iddoctor,rutdoctor,nombre,apellido,idespecialidad) VALUES (51,'92757073-0','Rebeca','Güatuzi',1);
INSERT INTO doctores (iddoctor,rutdoctor,nombre,apellido,idespecialidad) VALUES (61,'91223342-7','Galvin','Lee',5);
INSERT INTO doctores (iddoctor,rutdoctor,nombre,apellido,idespecialidad) VALUES (71,'07017187-1','Jamal','Hinton',7);
INSERT INTO doctores (iddoctor,rutdoctor,nombre,apellido,idespecialidad) VALUES (81,'80724757-8','Josefa','Amasabubis',2);
INSERT INTO doctores (iddoctor,rutdoctor,nombre,apellido,idespecialidad) VALUES (91,'87427572-5','Nasim','Branch',3);
INSERT INTO doctores (iddoctor,rutdoctor,nombre,apellido,idespecialidad) VALUES (101,'53345395-4','Alika','Nixon',5);

INSERT INTO agendas (idpaciente,iddoctor,idagenda,fecha,horadesde,duracion) VALUES (1,41,1,'24/08/20','12:00',15);
INSERT INTO agendas (idpaciente,iddoctor,idagenda,fecha,horadesde,duracion) VALUES (11,51,2,'24/08/20','14:15',15);
INSERT INTO agendas (idpaciente,iddoctor,idagenda,fecha,horadesde,duracion) VALUES (21,81,3,'24/08/20','17:30',15);
INSERT INTO agendas (idpaciente,iddoctor,idagenda,fecha,horadesde,duracion) VALUES (31,11,4,'24/08/20','18:00',15);
INSERT INTO agendas (idpaciente,iddoctor,idagenda,fecha,horadesde,duracion) VALUES (41,1,5,'28/08/20','18:15',15);
INSERT INTO agendas (idpaciente,iddoctor,idagenda,fecha,horadesde,duracion) VALUES (1,31,6,'25/08/20','09:00',15);
INSERT INTO agendas (idpaciente,iddoctor,idagenda,fecha,horadesde,duracion) VALUES (11,21,7,'31/08/20','10:45',15);
INSERT INTO agendas (idpaciente,iddoctor,idagenda,fecha,horadesde,duracion) VALUES (21,71,8,'28/08/20','11:30',15);
INSERT INTO agendas (idpaciente,iddoctor,idagenda,fecha,horadesde,duracion) VALUES (31,101,9,'24/08/20','19:45',15);

COMMIT;
