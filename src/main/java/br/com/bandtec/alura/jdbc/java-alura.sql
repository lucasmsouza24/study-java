DROP DATABASE java_alura;
CREATE DATABASE java_alura;
USE java_alura;

CREATE TABLE autor(
    id_autor INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(45) NOT NULL
);

CREATE TABLE livro(
    id_livro INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(45) NOT NULL,
    fk_autor INT NOT NULL,
    FOREIGN KEY(fk_autor) REFERENCES autor(id_autor)
);

INSERT INTO autor(nome) VALUES
('Yuval Noah Harari');

INSERT INTO livro(titulo, fk_autor) VALUES 
('Homo Sapiens', 1),
('Homo God', 1);