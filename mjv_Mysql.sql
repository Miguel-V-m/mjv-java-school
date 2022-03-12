-- elimina banco de dados drop database mjv_school_db;
CREATE DATABASE mjv_school_db;

-- DDL  CRIACAO DA TABELA PARA CADASTRO
CREATE TABLE CADASTRO 
  ( 
     ID               INT NOT NULL AUTO_INCREMENT,
     CPF              INT NOT NULL, 
     RG               INT NOT NULL, 
     NOME             VARCHAR(50) NOT NULL,
     CELULAR          INT NOT NULL, 
     LOGRADOURO       VARCHAR(50) NOT NULL,
     NUMERO           INT NOT NULL,
     COMPLEMENTO      INT NOT NULL,
     BAIRRO           VARCHAR(50) NOT NULL,
     CIDADE           VARCHAR(50) NOT NULL,
     UF               VARCHAR(50) NOT NULL,
     CEP              INT NOT NULL,
     PAIS             VARCHAR(50) NOT NULL,
     PROTOCOLO        INT NOT NULL,
     DATA_CADASTRO    DATE NOT NULL, 
     HORA             TIME NOT NULL,
     TIPO_SERVIÇO     VARCHAR(50) NOT NULL,
     VALOR            INT NOT NULL,
     TIPO_NOTIFICACAO VARCHAR(50) NOT NULL,
     PRIMARY KEY (id)
  )ENGINE = InnoDB    DEFAULT CHARSET=utf8;
  
-- DML SELECT
-- CADASTRO SELECT
SELECT * FROM CADASTRO;

-- DML INSERT
INSERT INTO CADASTRO
    (CPF,RG,NOME,CELULAR,LOGRADOURO,NUMERO,COMPLEMENTO,BAIRRO,CIDADE,UF,CEP,
     PAIS,PROTOCOLO,DATA_CADASTRO,HORA,TIPO_SERVIÇO,VALOR,TIPO_NOTIFICACAO)
 VALUES 
    ('0732422321','337655','Raimundo Nonato',99768-1515,'Rua Sebastião Firmino', 
    '123','210','São Sebastião','São Raimundo Nonato','Sp',07210715,
    'Brasil','1984365','20220509','15:21','AGUA ou LUZ',127,'SMS ou WHATS');
 -- Uma maneira simplificada é: se a ordem dos nomes dos cabeçahos é a mesma que a 
 -- "columns" o código do insert pode ser simplifocado da forma:
 -- INSERT INTO CADASTRO VALUES (
 -- DEFAULT,resto dos nomes);
  
  
# criando uma nova Tabela
CREATE TABLE IF NOT EXISTS public_tab_aluno (
    id             INT NOT NULL AUTO_INCREMENT,
    nome           varchar(50) NOT NULL,
    altura         numeric(3, 2) NULL,
    sexo           char(1)  NOT NULL,
    ativo          bool NULL,
    cd_cidade      numeric(8) NULL,
    CONSTRAINT tab_aluno_pk PRIMARY KEY (id)
);



  