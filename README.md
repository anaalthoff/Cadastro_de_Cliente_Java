# Cadastro de Cliente - CRUD Java

Aplicação desktop simples em Java com NetBeans que faz operações CRUD (Create, Read, Update, Delete) em uma entidade `Cliente`.

## 📦 Tecnologias

- Java 17
- Maven
- Swing (GUI NetBeans)
- MySQL

## 🚀 Funcionalidades

- Visualização de clientes em lista/tabela
- Adição de novos clientes
- Edição de clientes existentes
- Exclusão de clientes

## 📋 Estrutura do projeto

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
   git clone https://github.com/anaalthoff/crud-java.git
   
2. Vá para a pasta do projeto:
  `cd crud-java`

3. Execute no NetBeans:
- Importar como “Maven Project”
- Botão direito → Run
