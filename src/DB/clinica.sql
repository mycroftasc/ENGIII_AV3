

CREATE TABLE Exame (
 CodExame SERIAL NOT NULL,
 DescExame VARCHAR(60),
 ValorUnit DOUBLE PRECISION
);

ALTER TABLE Exame ADD CONSTRAINT PK_Exame PRIMARY KEY (CodExame);


CREATE TABLE Medico (
 CodMedico SERIAL NOT NULL,
 Nome VARCHAR(60),
 CRM VARCHAR(60),
 Endereco VARCHAR(60),
 Cidade VARCHAR(60),
 UF VARCHAR(2),
 Telefone VARCHAR(10),
 email VARCHAR(60)
);

ALTER TABLE Medico ADD CONSTRAINT PK_Medico PRIMARY KEY (CodMedico);


CREATE TABLE Paciente (
 CodPaciente SERIAL NOT NULL,
 CPF VARCHAR(11),
 Nome VARCHAR(60),
 Endereco VARCHAR(60),
 Cidade VARCHAR(60),
 UF VARCHAR(2),
 DtNascto DATE,
 Peso DOUBLE PRECISION,
 Altura DOUBLE PRECISION
);

ALTER TABLE Paciente ADD CONSTRAINT PK_Paciente PRIMARY KEY (CodPaciente);


CREATE TABLE Exame_Paciente (
 CodMedico INT NOT NULL,
 CodPaciente INT NOT NULL,
 CodExame INT NOT NULL,
 DtExame DATE,
 QtdExame INT,
 ValorExame DOUBLE PRECISION
);

ALTER TABLE Exame_Paciente ADD CONSTRAINT PK_Exame_Paciente PRIMARY KEY (CodMedico,CodPaciente,CodExame);


ALTER TABLE Exame_Paciente ADD CONSTRAINT FK_Exame_Paciente_0 FOREIGN KEY (CodMedico) REFERENCES Medico (CodMedico);
ALTER TABLE Exame_Paciente ADD CONSTRAINT FK_Exame_Paciente_1 FOREIGN KEY (CodPaciente) REFERENCES Paciente (CodPaciente);
ALTER TABLE Exame_Paciente ADD CONSTRAINT FK_Exame_Paciente_2 FOREIGN KEY (CodExame) REFERENCES Exame (CodExame);



INSERT INTO paciente (cpf,nome, endereco, cidade, uf, dtnascto, peso, altura)
VALUES ('91956552049','Alexandre S Carmo','Rua Senador Salgado Filho, 605','Canoas','RS','1975-06-15',103.00,1.75);
INSERT INTO paciente (cpf,nome, endereco, cidade, uf, dtnascto, peso, altura)
VALUES ('12345678901','Alfredo G de Souza','Av. Borges de Medeiros, 1501','Porto Alegre','RS','1975-06-15',83.10,1.80);
INSERT INTO paciente (cpf,nome, endereco, cidade, uf, dtnascto, peso, altura)
VALUES ('10987654321','João da Silva','Rua Riachuelo, 160','Porto Alegre','RS','1975-06-15',77.50,1.65);




INSERT INTO medico (nome, crm, endereco, cidade, uf, telefone, email)
VALUES ('Alberto Roberto','1234567890','Av. Borges de Medeiros, 504','Porto Alegre','RS','5132881269','alberto-roberto@senac.com.br');
INSERT INTO medico (nome, crm, endereco, cidade, uf, telefone, email)
VALUES ('Roberto Leitão','0987654321','Av. Borges de Medeiros, 504','Porto Alegre','RS','5132881268','roberto-leitao@senac.com.br');
INSERT INTO medico (nome, crm, endereco, cidade, uf, telefone, email)
VALUES ('Marco Porto','6812349763','Av. Borges de Medeiros, 504','Porto Alegre','RS','5132881267','marcos-porto@senac.com.br');


INSERT INTO exame (descexame, valorunit)
VALUES ('ANÁLISE CITOMORFOLÓGICA DE SANGUE PERIFÉRICO',50.00);
INSERT INTO exame (descexame, valorunit)
VALUES ('ARSANGUE',150.00);
INSERT INTO exame (descexame, valorunit)
VALUES ('ARSÊNICO, SANGUE TOTAL',100.00);
INSERT INTO exame (descexame, valorunit)
VALUES ('COBRE, SANGUE TOTAL',35.00);
INSERT INTO exame (descexame, valorunit)
VALUES ('CUSANGUE',75.00);



INSERT INTO exame_paciente (codmedico, codpaciente, codexame, dtexame, qtdexame,valorexame)
VALUES (1,1,1,'2014-12-12',1,50.00);
INSERT INTO exame_paciente (codmedico, codpaciente, codexame, dtexame, qtdexame,valorexame)
VALUES (1,1,2,'2014-12-11',1,150.00);
INSERT INTO exame_paciente (codmedico, codpaciente, codexame, dtexame, qtdexame,valorexame)
VALUES (1,2,2,'2014-12-16',1,150.00);
INSERT INTO exame_paciente (codmedico, codpaciente, codexame, dtexame, qtdexame,valorexame)
VALUES (1,2,3,'2014-12-16',1,100.00);
INSERT INTO exame_paciente (codmedico, codpaciente, codexame, dtexame, qtdexame,valorexame)
VALUES (1,2,4,'2014-12-11',1,35.00);
INSERT INTO exame_paciente (codmedico, codpaciente, codexame, dtexame, qtdexame,valorexame)
VALUES (1,3,5,'2014-12-22',1,75.00);