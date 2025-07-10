# Cadastro de Cliente - CRUD Java

Aplicação desktop simples em Java com NetBeans que realiza operações CRUD (Create, Read, Update, Delete) na entidade `Cliente`, com persistência em banco de dados MySQL.

## 📦 Tecnologias

- Java 17
- Maven
- Swing (GUI NetBeans)
- MySQL (via JDBC)

## 🚀 Funcionalidades

- Conexão com banco de dados MySQL
- Visualização de clientes em lista/tabela
- Adição de novos clientes
- Edição de clientes existentes
- Exclusão de clientes
- Consulta de clientes por nome

## 📁 Estrutura do projeto


src/

└─ main/java/

├─ modelo/ → entidades (ex: Cliente.java)

├─ dao/ → acesso a dados (ex: ClienteDAO.java)

├─ visao/ → telas Swing (ex: FrmCadastroCliente.java)

└─ principal/ → classe Principal.java com o main

pom.xml → configuração do Maven


## 🔧 Como rodar

1. Clone este repositório:

   ```bash
   git clone https://github.com/anaalthoff/Cadastro_de_Cliente_Java.git
   cd Cadastro_de_Cliente_Java

2. Abra o projeto no NetBeans como um projeto Maven.
3. Configure o arquivo de conexão:
4. Edite a classe TesteConexaoMySQL.java com os dados do seu banco (URL, usuário e senha).
5. Execute:
- Clique com o botão direito sobre o projeto → Run
- Ou use o botão de play no NetBeans

## 🔒 Requisitos
- Java 17 instalado
- NetBeans com suporte a Maven
- MySQL com banco e tabela cliente criados

## 📄 Licença
Este projeto está licenciado sob a licença MIT.
