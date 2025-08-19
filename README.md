# ✨ ForumHub API

Uma API REST completa para a plataforma de fóruns ForumHub, desenvolvida como parte do desafio da Alura.

Esta API permite gerenciar tópicos de discussão, usuários, cursos, perfis e respostas, oferecendo endpoints para operações CRUD (Create, Read, Update, Delete) com um sistema de segurança baseado em JSON Web Tokens (JWT).

---

## 🚀 Tecnologias Utilizadas

Este projeto foi construído com as seguintes ferramentas e frameworks:

* **Java 21**: Linguagem de programação robusta e moderna.
* **Spring Boot**: Framework para desenvolvimento rápido e simplificado de aplicações.
* **Spring Data JPA**: Para a persistência de dados e interações com o banco de forma eficiente.
* **Spring Security**: Para implementar segurança, autenticação e autorização em nível de API.
* **MySQL**: Banco de dados relacional amplamente utilizado.
* **Flyway**: Ferramenta para controle de versão e migração do esquema do banco de dados.
* **Maven**: Gerenciador de dependências e automação de builds.
* **Lombok**: Para reduzir o código repetitivo (boilerplate) e manter as classes limpas.
* **JWT**: Para a autenticação stateless e segura via tokens.
* **Validação**: Garantia da integridade dos dados de entrada através de validações automáticas.

## 🛠️ Instalação e Execução

### Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas em sua máquina:

* JDK 21
* Maven
* MySQL 8.0 (ou superior)

### Configuração do Banco de Dados

Crie um banco de dados MySQL chamado `forumhub`.

No seu arquivo de configuração `src/main/resources/application.properties` (ou `application.yml`), adicione as credenciais do seu banco de dados:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/forumhub
spring.datasource.username=usuario
spring.datasource.password=senha
