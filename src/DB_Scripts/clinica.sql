CREATE TABLE Exame (
 CodExame INT NOT NULL,
 DescExame VARCHAR(60),
 ValorUnit DOUBLE PRECISION
);

ALTER TABLE Exame ADD CONSTRAINT PK_Exame PRIMARY KEY (CodExame);


CREATE TABLE Medico (
 CodMedico INT NOT NULL,
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
 CodPaciente INT NOT NULL,
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


