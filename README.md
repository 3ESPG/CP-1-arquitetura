# Checkpoint 1 - WebService SOAP em Java

Projeto desenvolvido para a disciplina **Arquitetura SOA e Web Services**.

## Integrantes
- Felipe Braunstein e Silva - RM554483
- Felipe do Nascimento Fernandes - RM554598
- Henrique Ignacio Bartalo - RM555274
- Gustavo Henrique Martins - RM556956

## Objetivo
Desenvolver uma aplicacao em **Java** com **Web Services SOAP**, composta por um projeto publicador e dois projetos consumidores.

## Estrutura do Projeto

```text
Arquitetura/
├── Publisher/
│   └── WinerySys/
│       ├── pom.xml
│       └── src/main/java/br/com/fiap/winery/
│           ├── Loader.java
│           ├── WineStockService.java
│           ├── WineStockServiceImplementation.java
│           ├── WineWarningService.java
│           └── WineWarningServiceImplementation.java
└── Consumer/
    ├── WineStockClient/
    │   ├── pom.xml
    │   └── src/main/java/br/com/fiap/winery/ApplicationClient1.java
    └── WineOrderClient/
        ├── pom.xml
        └── src/main/java/br/com/fiap/winery/ApplicationClient2.java
```

## Tecnologias Utilizadas
- Java 17
- Maven
- JAX-WS (SOAP)

## Servicos Publicados
- `WineStockService`: disponibiliza operacoes relacionadas ao estoque de vinhos.
- `WineWarningService`: disponibiliza mensagens de alerta/aviso.

Os servicos sao publicados localmente nos endpoints:
- `http://localhost:8085/WineStockService?wsdl`
- `http://localhost:8086/WineWarningService?wsdl`

## Como Executar

### 1. Subir o projeto publicador
No diretorio `Publisher/WinerySys`, execute:

```bash
mvn clean compile exec:java
```

### 2. Executar o cliente de estoque
No diretorio `Consumer/WineStockClient`, execute:

```bash
mvn clean compile exec:java
```

### 3. Executar o cliente de pedidos
No diretorio `Consumer/WineOrderClient`, execute:

```bash
mvn clean compile exec:java
```

## Observacoes
- O publicador deve estar em execucao antes dos consumidores.
- Os clientes consomem os WSDLs publicados localmente pelo projeto `WinerySys`.
