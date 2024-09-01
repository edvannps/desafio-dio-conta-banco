# Challenge Bootcamp Claro Spring Boot DIO

## Simulando uma conta báncaria via terminal/console

### Introdução

- Primeiro desafio DIO na trilha Java básico, criar uma aplicação que se pareça com uma conta bancária.

### Sintaxe - Desafio

Exercício para praticar o conteúdo do primeiro módulo de sintaxe básica, codificando o seguinte cenário.

1. Crie o projeto ContaBanco que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo;

2. Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a codificação do nosso programa.

| *Atributo*  |  *Tipo*  |  *Exemplo*     |
|------------ | -------- | -------------- |
| Numero      | Inteiro  | 1021           |
| Agencia     | Texto    | 067-8          |
| Nome Cliente| Texto    | MARIO ANDRADE  |
| Saldo       | Decimal  | 237.48         |

3. Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:
   - Progama: "Digite o número da Agência!"
   - Usuário: 067-8 (depois ENTER para o próximo campo)

4. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
   - "Olá [Nome Cliente], obrigado por criar sua conta em nosso banco, sua agência é Ag: [Agencia], conta nº: [Numero] e seu saldo atual de R$ [Saldo] já está disponível para saque".

**Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.**

## Ferramentas utilizadas
~~~
 - Java
 - Intellij Idea
