# Controle de Fluxo em Programação

## Conceito

Controle de fluxo é a habilidade de ajustar a maneira como um programa realiza suas tarefas. Por meio de instruções especiais, chamadas de comandos, essas tarefas podem ser executadas seletivamente, repetidamente ou excepcionalmente.

## Classificação

O controle de fluxo pode ser classificado em três categorias principais:

### 1. Estruturas Condicionais

As estruturas condicionais permitem que o programa tome decisões e execute diferentes blocos de código com base em condições específicas. As principais estruturas condicionais são:

* **if-else:** Executa um bloco de código se uma condição for verdadeira e outro bloco se for falsa.
* **switch-case:** Permite escolher entre várias opções com base no valor de uma variável.

### 2. Estruturas de Repetição

As estruturas de repetição permitem que o programa execute um bloco de código várias vezes. As principais estruturas de repetição são:

* **for:** Executa um bloco de código um número específico de vezes.
* **while:** Executa um bloco de código enquanto uma condição for verdadeira.
* **do-while:** Semelhante ao while, mas garante que o bloco de código seja executado pelo menos uma vez.

### 3. Estruturas de Exceções

As estruturas de exceções permitem que o programa lide com erros e situações inesperadas de forma controlada. As principais estruturas de exceções são:

* **try-catch-finally:** O bloco `try` contém o código que pode gerar uma exceção. O bloco `catch` lida com a exceção se ela ocorrer. O bloco `finally` é executado independentemente de ocorrer ou não uma exceção.
* **throw:** Permite lançar uma exceção explicitamente.

## Importância

O controle de fluxo é um conceito fundamental em programação. Ele permite criar programas que:

* Tomam decisões com base em dados e condições.
* Repetem tarefas de forma eficiente.
* Lidam com erros e situações inesperadas de forma controlada.

Dominar o controle de fluxo é essencial para qualquer programador que deseja criar programas eficientes, confiáveis e que atendam às necessidades dos usuários.

# Estruturas Excepcionais

## Exceções

Ao executar um código Java, diferentes erros podem acontecer: erros de codificação feitos pelo programador, erros devido a entrada errada ou outros imprevistos.

Quando ocorre um erro, o Java normalmente para e gera uma mensagem de erro. O termo técnico para isso é: Java lançará uma exceção (jogará um erro).

De forma interpretativa em Java, um erro é algo irreparável, a aplicação trava ou é encerrada drasticamente. Já exceções são fluxos inesperados da nossa aplicação, como:
- Querer dividir um valor por zero.
- Tentar abrir um arquivo que não existe.
- Abrir uma conexão de banco com usuário ou senha inválida.

Todos estes cenários e outros similares não são erros, mas sim fluxos não previstos pela aplicação. Aqui entra a responsabilidade do desenvolvedor em prever essas situações e realizar o **Tratamento de Exceções**.

---

## Mão na massa

Vamos trazer um cenário estudado na aula sobre Terminal e Argumentos, onde via terminal informamos alguns dados pessoais:

```java
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        // Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        // Imprimindo os dados obtidos pelo usuário
        System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();   
    }
}
```

Aparentemente é um programa simples, mas vamos listar algumas possíveis exceções que podem acontecer:

1. Não informar o nome e sobrenome.
2. O valor da idade conter um caractere **não numérico**.
3. O valor da altura ter uma **vírgula** ao invés de um **ponto** (conforme padrão americano).

Executando o programa com os seguintes valores, vamos entender qual exceção ocorrerá:

| Entrada | Valor | Exceção | Causa |
|---------|-------|----------|-------|
| Digite sua idade: | quinze (15) | `java.util.InputMismatchException` | O programa esperava um valor numérico inteiro. |
| Digite sua altura: | 1,65 | `java.util.InputMismatchException` | O programa esperava um valor decimal no formato americano (exemplo: `1.65`). |

A melhor forma de prever uma exceção é pensar que ela pode ocorrer. **Lei de Murphy**

---

## Conhecendo algumas exceções comuns

A linguagem Java dispõe de uma vasta lista de classes que representam exceções. Abaixo estão algumas das mais comuns:

| Nome | Causa |
|------|-------|
| `java.lang.NullPointerException` | Quando tentamos acessar uma informação de uma variável nula. |
| `java.lang.ArithmeticException` | Quando tentamos dividir um valor por zero. |
| `java.sql.SQLException` | Quando existe algum erro relacionado à interação com o banco de dados. |
| `java.io.FileNotFoundException` | Quando tentamos ler ou escrever em um arquivo que não existe. |

---

## Tratamento de exceções

E quando inevitavelmente ocorrer uma exceção? Como os desenvolvedores podem ajustar seus algoritmos para amenizar o ocorrido?

A instrução **`try`** permite definir um bloco de código para ser testado quanto a erros enquanto está sendo executado.

A instrução **`catch`** permite definir um bloco de código a ser executado caso ocorra um erro no bloco `try`.

A instrução **`finally`** permite definir um bloco de código a ser executado independentemente de ocorrer um erro ou não.

As palavras-chave **`try`** e **`catch`** vêm em pares:

### Estrutura de um bloco com `try` e `catch`

```java
try {
  // Bloco de código conforme esperado
} catch(Exception e); { // Precisamos saber qual exceção pode ocorrer
  // Bloco de código que captura as exceções
  // Em caso de um fluxo não previsto
}
```

---

Com esse conhecimento, os desenvolvedores podem criar sistemas mais robustos e confiáveis, prevenindo travamentos inesperados e fornecendo mensagens mais amigáveis ao usuário final.

