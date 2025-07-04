# Serviço de Preço do Tomate 🍅

Este serviço calcula o preço total de caixas de tomate com base em faixas de desconto.

## 🛠 Tecnologias
- Spring Boot
- REST

## 📦 Regras de Desconto
| Quantidade de Caixas | Desconto |
|----------------------|----------|
| Até 9                | 0%       |
| 10 a 19              | 5%       |
| 20 a 29              | 11%      |
| 30 ou mais           | 22%      |

## 🔧 Como rodar
```bash
./mvnw spring-boot:run

Exemplo de requisição:
GET /preco?quantidade=25

Resposta:
{
  "precoTotal": 1112.50
}
