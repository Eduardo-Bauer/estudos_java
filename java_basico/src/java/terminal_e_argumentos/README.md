# 📟 Terminal e Argumentos

Nem sempre executamos nosso programa Java pela IDE. Já imaginou nossos clientes tendo que instalar o Eclipse ou VS Code para rodar o sistema em sua empresa? 😵

Com a JVM devidamente configurada, podemos criar um executável do nosso programa e disponibilizar o instalador para qualquer sistema operacional.

No nosso caso, vamos aprender como executar um programa Java via terminal, como MS-DOS ou o terminal do VS Code.

---

## 🚀 Criando e Executando um Programa Java pelo Terminal

Vamos criar uma classe chamada `MinhaClasse.java` com o seguinte código:

```java
public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Oi, fui executado pelo Terminal");
    }
}
```

### 📌 Passos para executar:

1. **Abrir o terminal** (MS-DOS, PowerShell ou terminal do VS Code).
2. **Localizar o diretório do projeto**:
   ```sh
   cd C:\estudos\dio-trilha-java-basico\java-terminal
   ```
3. **Acessar a pasta `bin`**:
   ```sh
   cd bin
   ```
4. **Compilar o código**:
   ```sh
   javac MinhaClasse.java
   ```
5. **Executar o programa** (nome da classe sem `.class`):
   ```sh
   java MinhaClasse
   ```

Se tudo estiver correto, o terminal exibirá:
```
Oi, fui executado pelo Terminal
```

Agora, você pode rodar seus programas Java sem precisar de uma IDE! 🚀

---

## 🎯 Argumentos no Terminal

Quando executamos uma classe que contém o método `main`, podemos passar argumentos para ele como um array `String[] args`.

### 📌 Exemplo de execução com argumentos:
```sh
java AboutMe Joao Silva 25 1.75
```

### 📝 Exemplo de código:
```java
public class AboutMe {
    public static void main(String[] args) {
        // Os argumentos começam no índice 0
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.parseInt(args[2]); // Conversão usando Wrapper
        double altura = Double.parseDouble(args[3]);

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "m");
    }
}
```

### 📌 Explicação:
- `args[0]`: Nome.
- `args[1]`: Sobrenome.
- `args[2]`: Idade convertida de `String` para `int`.
- `args[3]`: Altura convertida de `String` para `double`.

Ao executar o código acima com os argumentos informados, a saída será:
```
Olá, me chamo Joao Silva
Tenho 25 anos
Minha altura é 1.75m
```
Agora você pode passar valores dinâmicos para seu programa via terminal! 🚀

---

## 🖥️ Entrada de Dados com Scanner

Nos exemplos anteriores, vimos que os argumentos precisam ser passados em uma única linha no terminal. Porém, isso pode levar a erros caso o usuário insira os valores incorretamente. Para tornar a entrada de dados mais segura e intuitiva, podemos usar a classe `Scanner`.

### 📝 Exemplo de código com `Scanner`:
```java
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        // Criando o objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome:");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        // Imprimindo os dados obtidos pelo usuário
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "m");
    }
}
```

### 📌 Explicação:
- Criamos um objeto `Scanner` para capturar a entrada do usuário.
- Usamos `scanner.next()` para ler palavras e `scanner.nextInt()`/`scanner.nextDouble()` para números.
- O usuário insere os valores um por um, tornando a entrada de dados mais interativa e segura.

### 📌 Exemplo de entrada e saída:
```
Digite seu nome:
João
Digite seu sobrenome:
Silva
Digite sua idade:
25
Digite sua altura:
1.75

Olá, me chamo João Silva
Tenho 25 anos
Minha altura é 1.75m
```

Com essa abordagem, evitamos erros comuns de entrada de dados e melhoramos a experiência do usuário! 🚀
