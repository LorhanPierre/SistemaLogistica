# 🚚 Sistema de Logística de Entregas (JDBC + Maven)

## 📌 Sobre o Projeto
Este projeto é um **sistema de logística de entregas** desenvolvido em **Java (via terminal)** com **JDBC + Maven**.  
Ele simula a gestão de uma empresa de e-commerce, permitindo o cadastro de clientes, motoristas, pedidos e entregas, além de relatórios analíticos.  

---

## 🎯 Objetivo
- Gerenciar **clientes, motoristas, pedidos e entregas**.  
- Registrar eventos de entrega e atualizar status.  
- Gerar relatórios úteis para análise da operação logística.  

---

## 🗂️ Entidades
- **Cliente**: `id, nome, cpf_cnpj, endereco, cidade, estado`  
- **Motorista**: `id, nome, cnh, veiculo, cidade_base`  
- **Pedido**: `id, cliente_id, data_pedido, volume_m3, peso_kg, status (PENDENTE, ENTREGUE, CANCELADO)`  
- **Entrega**: `id, pedido_id, motorista_id, data_saida, data_entrega, status (EM_ROTA, ENTREGUE, ATRASADA)`  
- **HistoricoEntrega**: `id, entrega_id, data_evento, descricao`  

---

## ⚙️ Regras de Negócio
- Um cliente pode ter **vários pedidos**.  
- Um pedido pode ou não estar associado a uma entrega.  
- Um motorista pode realizar **várias entregas**.  
- Cada entrega pode ter **múltiplos eventos** registrados no histórico.  

---

## 📋 Funcionalidades
O menu do sistema inclui:  

1. Cadastrar Cliente  
2. Cadastrar Motorista  
3. Criar Pedido  
4. Atribuir Pedido a Motorista (Gerar Entrega)  
5. Registrar Evento de Entrega (Histórico)  
6. Atualizar Status da Entrega  
7. Listar Todas as Entregas com Cliente e Motorista  
8. Relatório: Total de Entregas por Motorista  
9. Relatório: Clientes com Maior Volume Entregue  
10. Relatório: Pedidos Pendentes por Estado  
11. Relatório: Entregas Atrasadas por Cidade  
12. Buscar Pedido por CPF/CNPJ do Cliente  
13. Cancelar Pedido  
14. Excluir Entrega (com validação)  
15. Excluir Cliente (com verificação de dependência)  
16. Excluir Motorista (com verificação de dependência)  
0. Sair  
---

## 🚀 Como Executar
1. Clone este repositório:  
   ```bash
   git clone https://github.com/LorhanPierre/SistemaLogistica.git
   ```
2. Configure o banco de dados (MySQL ou PostgreSQL).  

---

## 📌 Observação
Este projeto foi desenvolvido como **desafio acadêmico** com foco em boas práticas de modelagem relacional, uso correto de JDBC e organização em camadas.  
