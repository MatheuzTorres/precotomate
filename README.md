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
git clone https://github.com/SEU_USUARIO/preco-tomate.git
cd preco-tomate

