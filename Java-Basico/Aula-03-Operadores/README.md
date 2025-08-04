# Aula 3: Operadores

## 🎯 Objetivos da Aula

- Conhecer os diferentes tipos de operadores em Java
- Entender operadores aritméticos e suas prioridades
- Aprender operadores de comparação e lógicos
- Compreender operadores de atribuição
- Praticar com exemplos reais

## 📚 Conteúdo

### 1. Tipos de Operadores

Java possui vários tipos de operadores:
- **Aritméticos**: +, -, *, /, %, ++, --
- **De Atribuição**: =, +=, -=, *=, /=, %=
- **De Comparação**: ==, !=, >, <, >=, <=
- **Lógicos**: &&, ||, !
- **Bit a Bit**: &, |, ^, ~, <<, >>, >>>

### 2. Operadores Aritméticos

```java
int a = 10;
int b = 3;

int soma = a + b;        // 13
int subtracao = a - b;   // 7
int multiplicacao = a * b; // 30
int divisao = a / b;     // 3
int resto = a % b;       // 1
```

#### Operadores de Incremento e Decremento

```java
int x = 5;

// Pré-incremento
int y = ++x;  // x = 6, y = 6

// Pós-incremento
int z = x++;  // z = 6, x = 7

// Pré-decremento
int w = --x;  // x = 6, w = 6

// Pós-decremento
int v = x--;  // v = 6, x = 5
```

### 3. Operadores de Atribuição

```java
int numero = 10;

numero += 5;   // numero = numero + 5 (15)
numero -= 3;   // numero = numero - 3 (12)
numero *= 2;   // numero = numero * 2 (24)
numero /= 4;   // numero = numero / 4 (6)
numero %= 4;   // numero = numero % 4 (2)
```

### 4. Operadores de Comparação

```java
int a = 10;
int b = 5;

boolean igual = (a == b);        // false
boolean diferente = (a != b);    // true
boolean maior = (a > b);         // true
boolean menor = (a < b);         // false
boolean maiorIgual = (a >= b);   // true
boolean menorIgual = (a <= b);   // false
```

### 5. Operadores Lógicos

```java
boolean x = true;
boolean y = false;

boolean and = x && y;    // false (AND lógico)
boolean or = x || y;     // true (OR lógico)
boolean not = !x;        // false (NOT lógico)
```

#### Curto-circuito
```java
// && (AND) - se o primeiro for false, não avalia o segundo
// || (OR) - se o primeiro for true, não avalia o segundo
boolean resultado = (5 > 3) && (10 < 20); // true
```

### 6. Precedência de Operadores

Ordem de prioridade (maior para menor):
1. `()` (parênteses)
2. `++`, `--` (incremento/decremento)
3. `*`, `/`, `%` (multiplicação, divisão, resto)
4. `+`, `-` (adição, subtração)
5. `<`, `>`, `<=`, `>=` (comparação)
6. `==`, `!=` (igualdade)
7. `&&` (AND lógico)
8. `||` (OR lógico)
9. `=` (atribuição)

### 7. Exemplos Práticos

#### Exemplo 1: Calculadora Avançada
```java
public class CalculadoraAvancada {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        
        System.out.println("A = " + a + ", B = " + b);
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Resto: " + (a % b));
        
        // Operadores de comparação
        System.out.println("A > B: " + (a > b));
        System.out.println("A == B: " + (a == b));
        System.out.println("A != B: " + (a != b));
    }
}
```

#### Exemplo 2: Verificação de Idade
```java
public class VerificacaoIdade {
    public static void main(String[] args) {
        int idade = 18;
        boolean temDocumento = true;
        
        boolean podeVotar = idade >= 16 && temDocumento;
        boolean podeDirigir = idade >= 18;
        boolean ehMenor = idade < 18;
        
        System.out.println("Idade: " + idade);
        System.out.println("Pode votar: " + podeVotar);
        System.out.println("Pode dirigir: " + podeDirigir);
        System.out.println("É menor de idade: " + ehMenor);
    }
}
```

## 🎯 Exercícios Práticos

### Exercício 1: Calculadora de Média
Crie um programa que calcule a média de 3 notas:
- Use operadores aritméticos
- Calcule a média ponderada (nota1*2 + nota2*3 + nota3*5) / 10
- Verifique se a média é maior ou igual a 7

### Exercício 2: Verificador de Números
Crie um programa que verifique se um número é:
- Par ou ímpar (use operador %)
- Positivo, negativo ou zero
- Múltiplo de 3 e 5 ao mesmo tempo

### Exercício 3: Calculadora de Desconto
Crie um programa que calcule desconto em uma compra:
- Preço original
- Percentual de desconto
- Preço final com desconto
- Verifique se o desconto é válido (entre 0% e 100%)

## 🔍 Dicas Importantes

1. **Precedência**: Use parênteses para deixar a ordem clara
2. **Curto-circuito**: Aproveite para otimizar expressões lógicas
3. **Incremento**: Cuidado com pré e pós incremento
4. **Comparação**: Use `==` para primitivos, `.equals()` para objetos

## 📚 Próximos Passos

Na próxima aula, aprenderemos sobre:
- Estruturas condicionais (if, else, switch)
- Estruturas de repetição (for, while, do-while)
- Controle de fluxo do programa

---

**Operadores são fundamentais para qualquer linguagem de programação! Pratique muito! 🔢** 