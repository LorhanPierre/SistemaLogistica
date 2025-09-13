package org.sistemalogistica.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDatabase {

    private static final String URL = "jdbc:mysql://localhost:3356/SistemaLogistica?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection conectar() throws SQLException{
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }
}

/*
 -- Tabela Cliente
 CREATE TABLE Cliente (
 id INT PRIMARY KEY AUTO_INCREMENT,
 nome VARCHAR(150) NOT NULL,
 cpf_cnpj VARCHAR(20) UNIQUE NOT NULL,
 endereco VARCHAR(255),
 cidade VARCHAR(100),
 estado CHAR(2)
 );

 -- Tabela Motorista
 CREATE TABLE Motorista (
 id INT PRIMARY KEY AUTO_INCREMENT,
 nome VARCHAR(150) NOT NULL,
 cnh VARCHAR(20) UNIQUE NOT NULL,
 veiculo VARCHAR(100),
 cidade_base VARCHAR(100)
 );

 -- Tabela Pedido
 CREATE TABLE Pedido (
 id INT PRIMARY KEY AUTO_INCREMENT,
 cliente_id INT NOT NULL,
 data_pedido DATE NOT NULL,
 volume_m3 DECIMAL(10,2),
 peso_kg DECIMAL(10,2),
 status ENUM('PENDENTE', 'ENTREGUE', 'CANCELADO') DEFAULT 'PENDENTE',
 FOREIGN KEY (cliente_id) REFERENCES Cliente(id)
 );

 -- Tabela Entrega
 CREATE TABLE Entrega (
 id INT PRIMARY KEY AUTO_INCREMENT,
 pedido_id INT NOT NULL,
 motorista_id INT NOT NULL,
 data_saida DATE NOT NULL,
 data_entrega DATE,
 status ENUM('EM_ROTA', 'ENTREGUE', 'ATRASADA') DEFAULT 'EM_ROTA',
 FOREIGN KEY (pedido_id) REFERENCES Pedido(id),
 FOREIGN KEY (motorista_id) REFERENCES Motorista(id)
 );

 -- Tabela HistoricoEntrega
 CREATE TABLE HistoricoEntrega (
 id INT PRIMARY KEY AUTO_INCREMENT,
 entrega_id INT NOT NULL,
 data_evento DATETIME NOT NULL,
 descricao VARCHAR(255),
 FOREIGN KEY (entrega_id) REFERENCES Entrega(id)
 );

 */