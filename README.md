# Bank Account Management System

Este projeto é um sistema de gerenciamento de contas bancárias que permite criar, visualizar, atualizar e deletar contas e transações. Foi desenvolvido usando Spring Boot para o backend e PostgreSQL como banco de dados.

## 🔨 Funcionalidades do Projeto

- **Gerenciamento de Contas Bancárias:**
    - Criar novas contas bancárias.
    - Buscar contas por ID.
    - Atualizar informações de contas existentes.
    - Deletar contas bancárias.

- **Gerenciamento de Transações:**
    - Registrar transações associadas a contas bancárias.
    - Buscar transações por ID e conta.
    - Atualizar transações existentes.
    - Deletar transações.

### Exemplo Visual do Projeto
![Screenshot 2024-08-18 222701](https://github.com/user-attachments/assets/9a6dcfcf-1edb-452b-b297-b4a52450cc37)
![Screenshot 2024-08-18 222923](https://github.com/user-attachments/assets/6523a344-2705-4465-9cb1-8aa3987dcad5)
![Screenshot 2024-08-18 222949](https://github.com/user-attachments/assets/cf660c86-5eb1-4b50-aba0-5fc68ed83fb5)
![Screenshot 2024-08-18 224313](https://github.com/user-attachments/assets/f023e7af-f2da-4be3-8c9e-eaa0f3ee3f4b)

## ✔️ Técnicas e Tecnologias Utilizadas

- **Linguagem:** Java
- **Framework:** Spring Boot
- **Banco de Dados:** PostgreSQL
- **ORM:** Hibernate/JPA
- **Dependências:** Spring Data JPA, Spring Web, Jakarta Persistence API, etc.

## 📁 Estrutura do Projeto

1. **Configurações:**
    - `DatabaseConfig.java`: Configurações do banco de dados.

2. **Controladores:**
    - `AccountController.java`: Gerenciamento das rotas de contas bancárias.
    - `TransactionController.java`: Gerenciamento das rotas de transações.

3. **Serviços:**
    - `AccountService.java`: Lógica de negócios para contas bancárias.
    - `TransactionService.java`: Lógica de negócios para transações.

4. **Repositórios:**
    - `AccountRepository.java`: Acesso ao banco de dados para contas bancárias.
    - `TransactionRepository.java`: Acesso ao banco de dados para transações.

5. **Modelos:**
    - `Account.java`: Representação de uma conta bancária.
    - `Transaction.java`: Representação de uma transação.

6. **Configurações Adicionais:**
    - `application.properties`: Configurações gerais da aplicação.

## 🛠️ Abrir e rodar o projeto

1. **Pré-requisitos:**
    - Java 17 ou superior instalado.
    - PostgreSQL configurado.

2. **Passos para rodar:**
    1. Clone o repositório.
    2. Configure o banco de dados em `application.properties`.
    3. Rode o comando `./gradlew bootRun` para iniciar o servidor.

## 🌐 Deploy

- Para o deploy, você pode usar serviços como Heroku, AWS ou DigitalOcean. Garanta que as variáveis de ambiente estejam configuradas corretamente para o ambiente de produção.
