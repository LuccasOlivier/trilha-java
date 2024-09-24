# Desafio Conta Banco

Este projeto consiste em um programa simples de gerenciamento de contas bancárias. O objetivo é coletar informações do usuário sobre uma conta e exibir uma mensagem de confirmação personalizada.

## Estrutura do Projeto

- **Classe:** `ContaTerminal.java`
  - Responsável por toda a lógica do programa, incluindo a coleta de dados e a exibição da mensagem final.

## Atributos da Conta

O programa utiliza os seguintes atributos para representar uma conta bancária:

| Atributo      | Tipo     | Exemplo         |
|---------------|----------|------------------|
| Numero        | Inteiro  | 1021             |
| Agencia       | Texto    | 067-8            |
| Nome Cliente   | Texto    | MARIO ANDRADE    |
| Saldo         | Decimal  | 237.48           |

## Como Funciona

1. O programa solicita ao usuário que insira as seguintes informações, uma de cada vez:
   - Número da conta
   - Número da agência
   - Nome do cliente
   - Saldo da conta

2. As mensagens exibidas serão, por exemplo:
   - "Por favor, digite o número da Agência!"
   - "Por favor, digite o número da Conta!"
   - "Por favor, digite o nome do Cliente!"
   - "Por favor, digite o saldo!"

3. Após a coleta de todos os dados, o programa exibe a seguinte mensagem:
 "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".
