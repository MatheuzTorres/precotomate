# 🍅 Preço do Tomate – Serviço REST

Este serviço calcula o **preço total da venda de caixas de tomate**, aplicando automaticamente descontos progressivos conforme a quantidade solicitada.

Projeto desenvolvido para a disciplina **Sistemas Web 3** – UFRRJ  
Aluno: **Matheus Torres**

---

## 🧰 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Web (REST)
- Maven

---

## 🎯 Objetivo

Fornecer um endpoint REST que receba a **quantidade de caixas** como entrada e retorne o **preço total com desconto** aplicado automaticamente conforme as regras do negócio.

---

## 📦 Regras de Desconto por Quantidade

| Quantidade de caixas | Desconto aplicado |
|----------------------|-------------------|
| até 9                | 0%                |
| 10 a 19              | 5%                |
| 20 a 29              | 11%               |
| 30 ou mais           | 22%               |

> 💰 Preço base por caixa: **R$ 50,00**

---

## 🚀 Como Executar o Projeto

### 1. Clonar o repositório

```bash
git clone https://github.com/SEU_USUARIO/precotomate.git
cd precotomate

```

2. Rodar com Maven
Se você tiver o Maven Wrapper (mvnw):
```bash
./mvnw spring-boot:run
```
Ou, se usa Maven instalado globalmente:
```bash
mvn spring-boot:run
```

O serviço ficará disponível em:

```arduino
http://localhost:8081
```

📲 Como Usar a API
Endpoint:
```bash
GET /api/preco/{quantidade}
```
{quantidade}: número de caixas de tomate
Retorno: valor total com desconto (em formato double)

🔍 Exemplos de Uso
Exemplo 1 – 5 caixas (sem desconto)
```bash
http://localhost:8081/api/preco/5
```
Resposta:
250.0


Exemplo 2 – 25 caixas (11% de desconto)
```bash
http://localhost:8081/api/preco/25
```
Resposta:
1112.5

Exemplo 3 – 50 caixas (22% de desconto)
```bash
http://localhost:8081/api/preco/50
```
Resposta:
1950.0
