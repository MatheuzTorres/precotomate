# Serviço de Preço do Tomate 🍅

## Descrição

Este microserviço calcula o valor total para uma quantidade informada de caixas de tomate, aplicando descontos progressivos conforme faixas de quantidade.  
O preço base por caixa é parametrizável, com valor padrão de R$ 50,00.  

---

## Tecnologias Utilizadas

- Java 17  
- Spring Boot 
- Maven  
- REST (endpoints HTTP)  

---

## Tabela de Descontos

| Quantidade de Caixas | Desconto Aplicado |
|----------------------|-------------------|
| Até 9                | 0%                |
| 10 a 19              | 5%                |
| 20 a 29              | 11%               |
| 30 ou mais           | 22%               |

---

## Endpoints

### GET /preco

Retorna o preço total para uma quantidade de caixas com desconto aplicado.

#### Parâmetros de Query

- `quantidade` (obrigatório): número de caixas de tomate.

#### Exemplo de Requisição

```http
GET http://localhost:8080/preco?quantidade=25

