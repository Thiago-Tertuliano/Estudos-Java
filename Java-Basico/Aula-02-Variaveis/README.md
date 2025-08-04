# Aula 2: Variáveis e Tipos de Dados

## 🎯 Objetivos da Aula

- Entender o conceito de variáveis
- Conhecer os tipos primitivos do Java
- Aprender a declarar e inicializar variáveis
- Compreender constantes e conversão de tipos
- Praticar com exemplos reais

## 📚 Conteúdo

### 1. O que são Variáveis?

Uma variável é um espaço na memória do computador que armazena um valor que pode ser alterado durante a execução do programa. É como uma "caixa" onde guardamos informações.

### 2. Tipos Primitivos do Java

Java possui 8 tipos primitivos:

#### Tipos Inteiros
- **byte**: 8 bits (-128 a 127)
- **short**: 16 bits (-32.768 a 32.767)
- **int**: 32 bits (-2.147.483.648 a 2.147.483.647) - **mais usado**
- **long**: 64 bits (-9.223.372.036.854.775.808 a 9.223.372.036.854.775.807)

#### Tipos de Ponto Flutuante
- **float**: 32 bits (precisão simples)
- **double**: 64 bits (precisão dupla) - **mais usado**

#### Tipos Lógicos
- **boolean**: true ou false

#### Tipo de Caractere
- **char**: 16 bits (um caractere Unicode)

### 3. Declaração de Variáveis

```java
// Sintaxe: tipo nomeDaVariavel;
int idade;
String nome;
double altura;
boolean ativo;
```

### 4. Inicialização de Variáveis

```java
// Declaração e inicialização em uma linha
int idade = 25;
String nome = "João";
double altura = 1.75;
boolean ativo = true;

// Declaração separada da inicialização
int numero;
numero = 10;
```

### 5. Constantes (final)

```java
// Constantes não podem ser alteradas após a inicialização
final double PI = 3.14159;
final String NOME_EMPRESA = "Minha Empresa";
final int IDADE_MINIMA = 18;
```

### 6. Conversão de Tipos (Casting)

```java
// Conversão implícita (automática)
int numero = 10;
double numeroDouble = numero; // OK

// Conversão explícita (manual)
double valor = 10.5;
int valorInteiro = (int) valor; // Resultado: 10
```

### 7. String - Tipo de Referência

```java
String nome = "Maria";
String sobrenome = "Silva";
String nomeCompleto = nome + " " + sobrenome; // Concatenação
```

## 🛠️ Exemplos Práticos

### Exemplo 1: Informações Pessoais
```java
public class InformacoesPessoais {
    public static void main(String[] args) {
        String nome = "Ana";
        int idade = 30;
        double altura = 1.65;
        boolean casada = false;
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Casada: " + casada);
    }
}
```

### Exemplo 2: Cálculos Matemáticos
```java
public class Calculos {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        double divisao = (double) a / b; // Casting para double
        
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}
```

## 📝 Regras Importantes

1. **Nomenclatura**: Use camelCase para variáveis (primeiraLetraMinuscula)
2. **Inicialização**: Sempre inicialize variáveis antes de usar
3. **Escopo**: Variáveis só existem dentro do bloco onde foram declaradas
4. **Tipos**: Escolha o tipo apropriado para cada dado

## 🎯 Exercícios Práticos

### Exercício 1: Calculadora de IMC
Crie um programa que calcule o IMC (Índice de Massa Corporal):
- Declare variáveis para peso e altura
- Calcule o IMC (peso / altura²)
- Exiba o resultado

### Exercício 2: Conversor de Temperatura
Crie um programa que converta temperatura de Celsius para Fahrenheit:
- Declare uma variável para temperatura em Celsius
- Calcule a temperatura em Fahrenheit (F = C * 9/5 + 32)
- Exiba ambos os valores

### Exercício 3: Calculadora de Juros
Crie um programa que calcule juros simples:
- Declare variáveis para capital, taxa e tempo
- Calcule o montante (M = C * (1 + i * t))
- Exiba o capital inicial e o montante final

## 🔍 Dicas Importantes

1. **Escolha o tipo certo**: Use `int` para números inteiros, `double` para decimais
2. **Constantes**: Use `final` para valores que não mudam
3. **Casting**: Use quando precisar converter tipos
4. **String**: Use aspas duplas para texto

## 📚 Próximos Passos

Na próxima aula, aprenderemos sobre:
- Operadores aritméticos, de comparação e lógicos
- Precedência de operadores
- Expressões matemáticas complexas

---

**Pratique muito! A programação é uma habilidade que se desenvolve com exercício constante! 💪** 