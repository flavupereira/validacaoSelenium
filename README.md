# Projeto de Automação Web com Selenium

Este projeto contém testes automatizados para validação de funcionalidades web utilizando Selenium WebDriver, TestNG e JUnit.

## 📋 Descrição

O projeto implementa testes automatizados para o módulo de login do site [The Internet Herokuapp](https://the-internet.herokuapp.com/login), validando o fluxo de autenticação bem-sucedido.

## 🛠 Tecnologias Utilizadas

- **Java 17** - Linguagem de programação
- **Selenium WebDriver 4.21.0** - Framework para automação web
- **TestNG 7.10.2** - Framework de teste para Java
- **WebDriverManager 5.8.0** - Gerenciamento automático de drivers
- **JUnit 4.12** - Framework de asserções
- **AssertJ 3.13.2** - Biblioteca de asserções fluentes
- **Maven** - Gerenciamento de dependências e build


## ⚙️ Configuração do Ambiente

### Pré-requisitos

- Java JDK 17 ou superior
- Maven 3.6 ou superior
- Navegador Chrome instalado

### Instalação

**1. Clone o repositório:**
```bash
git clone [url-do-repositorio]
```

**2. Navegue até o diretório do projeto:**

```cd demo
 ```

**3. Execute o Maven para baixar as dependências:**
```
 mvn clean install
```

## 🚀 Executando os Testes

### Executar todos os testes:

```
mvn test
```

### Executar teste específico:

```
mvn test -Dtest=TesteModuloTreze
```

## 📝 Caso de Teste Implementado

### TesteModuloTreze

**Descrição: Teste de login bem-sucedido no sistema**

**Fluxo:**

1. Acessa a página de login

2. Preenche o campo usuário com "tomsmith"

3. Preenche o campo senha com "SuperSecretPassword!"

4. Clica no botão de login

5. Valida a mensagem de sucesso "You logged into a secure area!"

## 🔧 Configurações

**WebDriverManager**

O projeto utiliza WebDriverManager para gerenciar automaticamente o ChromeDriver, eliminando a necessidade de download manual do driver.

**VS Code** 

O arquivo settings.json configura a atualização automática da configuração de build para projetos Java.

## 📊 Relatórios de Teste
Os relatórios do TestNG são gerados automaticamente na pasta target/surefire-reports após a execução dos testes.
