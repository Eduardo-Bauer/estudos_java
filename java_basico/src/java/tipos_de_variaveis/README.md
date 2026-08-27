# 📦 Controle de Pacotes

- `import`: Importa pacotes ou classes para dentro do código.
- `package`: Especifica a que pacote todas as classes de um arquivo pertencem.

---

# 🔒 Modificadores de Acesso

- `public`: Acesso de qualquer classe.
- `private`: Acesso apenas dentro da classe.
- `protected`: Acesso por classes no mesmo pacote e subclasses.

---

# 🔢 Tipos Primitivos

| Tipo     | Descrição |
|----------|----------------------------------|
| `boolean` | Valor verdadeiro ou falso. |
| `byte`    | Inteiro de 8 bits (signed). |
| `char`    | Caractere Unicode (16-bit unsigned). |
| `double`  | Número de ponto flutuante de 64 bits (signed). |
| `float`   | Número de ponto flutuante de 32 bits (signed). |
| `int`     | Inteiro de 32 bits (signed). |
| `long`    | Inteiro de 64 bits (signed). |
| `short`   | Inteiro de 16 bits (signed). |
| `void`    | Indica que o método não retorna valor. |

---

# 🏷️ Modificadores de Classes, Variáveis ou Métodos

- `abstract`: Classe que não pode ser instanciada ou método a ser implementado por uma subclasse não abstrata.
- `class`: Define uma classe.
- `extends`: Indica a superclasse de uma subclasse.
- `final`: Impede extensão de classe, sobrescrita de métodos ou reinicialização de variáveis.
- `implements`: Define interfaces que uma classe implementa.
- `interface`: Define uma interface.
- `native`: Método escrito em outra linguagem, como C.
- `new`: Instancia um novo objeto.
- `static`: Define um método ou variável pertencente à classe e não à instância.
- `strictfp`: Garante que cálculos de ponto flutuante sigam as regras da linguagem.
- `synchronized`: Restringe acesso simultâneo a um método por múltiplas threads.
- `transient`: Impede a serialização de um campo.
- `volatile`: Indica que uma variável pode ser alterada por threads concorrentes.

---

# 🔄 Controle de Fluxo

| Palavra-chave | Descrição |
|--------------|--------------------------------|
| `break` | Sai do bloco de código. |
| `case` | Bloco executado dentro de `switch`. |
| `continue` | Pula para a próxima iteração do loop. |
| `default` | Bloco executado quando `case` não é verdadeiro. |
| `do` | Executa um bloco antes de testar a condição. |
| `else` | Executa um bloco alternativo ao `if`. |
| `for` | Laço de repetição. |
| `if` | Avalia uma condição lógica. |
| `instanceof` | Verifica se um objeto pertence a uma classe/interface. |
| `return` | Retorna um valor e sai do método. |
| `switch` | Avalia múltiplas condições. |
| `while` | Executa enquanto a condição for verdadeira. |

---

# ⚠️ Tratamento de Erros

- `assert`: Verifica uma suposição do programador.
- `catch`: Declara o bloco de código que trata exceções.
- `finally`: Bloco executado após `try-catch`, independente do resultado.
- `throw`: Lança uma exceção manualmente.
- `throws`: Declara que um método pode lançar exceções.
- `try`: Bloco de código que pode gerar uma exceção.

---

# 🔗 Variáveis de Referência

- `super`: Refere-se à superclasse imediata.
- `this`: Refere-se à instância atual do objeto.

---

# 🚫 Palavras Reservadas Não Utilizadas

- `const`: Não utilizado; substituído por `public static final`.
- `goto`: Não implementado no Java.

---

# 📌 Literais Reservados

`null`, `true` e `false` são valores literais e não palavras-chave. Tentativas de utilizá-los como identificadores resultarão em erro de compilação.

---

# 🔍 Escopo de Uso

| Contexto | Palavras-chave |
|----------|--------------------------------------------------|
| Arquivo  | `package`, `import`, `static` |
| Classe   | `public`, `protected`, `private`, `final`, `abstract`, `extends`, `implements` |
| Método   | `public`, `protected`, `private`, `static`, `final`, `abstract`, `void`, `return` |
| Atributo | `public`, `protected`, `private`, `static`, `final`, *tipo primitivo* |

---

# 🔄 Palavras "Opostas" no Java

| Palavra | Palavra Oposta | Explicação |
|---------|----------------|----------------------------------|
| `package` | `import` | Define diretório vs. importa classe. |
| `extends` | `implements` | Extende classe vs. Implementa interface. |
| `final` | `abstract` | Impede mudanças vs. Exige implementação. |
| `throws` | `throw` | Declara exceções vs. Lança exceção. |

---