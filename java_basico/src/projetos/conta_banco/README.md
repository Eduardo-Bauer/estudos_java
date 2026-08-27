# ContaBanco

Este projeto em Java tem como objetivo praticar conceitos básicos de sintaxe, entrada e saída de dados utilizando a classe `Scanner`.

## Funcionalidades

- Solicita ao usuário informações sobre sua conta bancária via terminal.
- Armazena os dados fornecidos pelo usuário.
- Exibe uma mensagem formatada com os dados da conta.

## Estrutura do Código

O código está contido no arquivo `ContaTerminal.java` e segue os seguintes passos:

1. Solicita ao usuário o número da agência.
2. Solicita o número da conta.
3. Solicita o nome do cliente.
4. Solicita o saldo inicial.
5. Exibe uma mensagem confirmando os dados da conta.

## Tecnologias Utilizadas

- Linguagem: Java
- Ferramentas: Terminal, Scanner

## Como Executar o Programa

1. Certifique-se de ter o Java instalado em seu sistema.
2. Compile o arquivo usando:
   ```sh
   javac ContaTerminal.java
   ```
3. Execute o programa:
   ```sh
   java ContaTerminal
   ```
4. Insira as informações conforme solicitado no terminal.

## Exemplo de Saída

```
Por favor, digite o número da Agência:
067-8
Por favor, digite o número da Conta:
1021
Por favor, digite o nome do Cliente:
MARIO ANDRADE
Por favor, digite o saldo:
237.48

Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.
```
