# notas do curso
# para inserir vario dados na tabela
INSERT INTO CADASTRO VALUES 
    (DEFAULT,'0732422321','337655','Raimundo Nonato',99768-1515,'Rua Sebastião Firmino', 
    '123','210','São Sebastião','São Raimundo Nonato','Sp',07210715,
    'Brasil','1984365','20220509','15:21','AGUA ou LUZ',127,'SMS ou WHATS'),
 # podemos adicionar cuanto dados gostaríamos de colocar logo no final colocar ";" 
    (DEFAULT,'0732422321','337655','Raimundo Nonato',99768-1515,'Rua Sebastião Firmino', 
    '123','210','São Sebastião','São Raimundo Nonato','Sp',07210715,
    'Brasil','1984365','20220509','15:21','AGUA ou LUZ',127,'SMS ou WHATS');
    
    # Alterar tabela podemos usar
    ALTER TABLE 'nome banco de dados'
    -- adicionamos uma coluna
    add column nome da coluna varchar(10);
    -- para eliminar una coluna 
    drop column nome da coluna;
    -- adicionamos una coluna em uma pocisao especifica
    add column nome da coluna varchar(10) after nome(despues de esta coluna se adicinara la nueva);
    -- para aducionar como primeira coluna
    ALTER TABLE nome da coluna
    add column nome da coluna int first;
    
    -- modificar colunas
    ALTER TABLE nome da coluna
    modify column nome da coluna varchar(20) not null default '';
    
    -- podemos renomear o nome das colunas
    ALTER TABLE nome da coluna
   change column nome velho nome novo da coluna varchar(20) not null default '';
    
    -- para renomear a tabela enteira
    ALTER TABLE nome da tabela
    rename to novo nome;
    
    -- eliminanado tabelas
    drop
    
    
    