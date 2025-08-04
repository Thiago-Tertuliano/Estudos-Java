# Aula 5: Arrays

## 🎯 Objetivos da Aula

- Entender o conceito de arrays (vetores)
- Aprender a declarar e inicializar arrays
- Compreender como acessar e modificar elementos
- Conhecer arrays multidimensionais
- Praticar com exemplos reais

## 📚 Conteúdo

### 1. O que são Arrays?

Um array é uma estrutura de dados que armazena uma coleção de elementos do mesmo tipo. É como uma "caixa" com compartimentos numerados, onde cada compartimento guarda um valor.

### 2. Declaração de Arrays

```java
// Declaração de array de inteiros
int[] numeros;

// Declaração de array de strings
String[] nomes;

// Declaração de array de doubles
double[] precos;
```

### 3. Inicialização de Arrays

#### Inicialização com tamanho
```java
// Cria um array de 5 inteiros (valores padrão: 0)
int[] numeros = new int[5];

// Cria um array de 3 strings (valores padrão: null)
String[] nomes = new String[3];
```

#### Inicialização com valores
```java
// Array inicializado com valores
int[] numeros = {1, 2, 3, 4, 5};
String[] frutas = {"maçã", "banana", "laranja"};
double[] precos = {10.50, 5.25, 8.75};
```

### 4. Acesso a Elementos

```java
int[] numeros = {10, 20, 30, 40, 50};

// Acessando elementos (índice começa em 0)
int primeiro = numeros[0];  // 10
int segundo = numeros[1];   // 20
int ultimo = numeros[4];    // 50

// Modificando elementos
numeros[2] = 35;  // Altera o terceiro elemento para 35
```

### 5. Percorrendo Arrays

#### Usando for tradicional
```java
int[] numeros = {1, 2, 3, 4, 5};

for (int i = 0; i < numeros.length; i++) {
    System.out.println("Elemento " + i + ": " + numeros[i]);
}
```

#### Usando for-each (enhanced for)
```java
int[] numeros = {1, 2, 3, 4, 5};

for (int numero : numeros) {
    System.out.println("Número: " + numero);
}
```

### 6. Propriedades dos Arrays

```java
int[] numeros = {10, 20, 30, 40, 50};

// Tamanho do array
int tamanho = numeros.length;  // 5

// Último índice
int ultimoIndice = numeros.length - 1;  // 4
```

### 7. Arrays Multidimensionais

#### Arrays 2D (Matrizes)
```java
// Declaração de matriz 3x3
int[][] matriz = new int[3][3];

// Inicialização com valores
int[][] matriz = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Acesso a elementos
int elemento = matriz[1][2];  // 6
```

#### Percorrendo matrizes
```java
int[][] matriz = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Percorrendo com loops aninhados
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println();
}
```

### 8. Exemplos Práticos

#### Exemplo 1: Lista de Notas
```java
public class ListaNotas {
    public static void main(String[] args) {
        double[] notas = {8.5, 7.0, 9.5, 6.5, 8.0};
        
        System.out.println("Notas dos alunos:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Aluno " + (i+1) + ": " + notas[i]);
        }
        
        // Calculando a média
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.length;
        
        System.out.println("Média da turma: " + media);
    }
}
```

#### Exemplo 2: Busca em Array
```java
public class BuscaArray {
    public static void main(String[] args) {
        int[] numeros = {10, 25, 30, 45, 50};
        int valorProcurado = 30;
        boolean encontrado = false;
        
        for (int numero : numeros) {
            if (numero == valorProcurado) {
                encontrado = true;
                break;
            }
        }
        
        if (encontrado) {
            System.out.println("Valor " + valorProcurado + " encontrado!");
        } else {
            System.out.println("Valor " + valorProcurado + " não encontrado!");
        }
    }
}
```

#### Exemplo 3: Matriz de Multiplicação
```java
public class MatrizMultiplicacao {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        
        // Preenchendo a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (i + 1) * (j + 1);
            }
        }
        
        // Exibindo a matriz
        System.out.println("Matriz de multiplicação:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
```

## 🎯 Exercícios Práticos

### Exercício 1: Média de Notas
Crie um programa que:
- Armazene 5 notas em um array
- Calcule e exiba a média
- Encontre a maior e menor nota

### Exercício 2: Inversão de Array
Crie um programa que:
- Crie um array com 5 números
- Inverta a ordem dos elementos
- Exiba o array original e o invertido

### Exercício 3: Soma de Matrizes
Crie um programa que:
- Crie duas matrizes 2x2
- Calcule a soma das matrizes
- Exiba o resultado

### Exercício 4: Busca de Nome
Crie um programa que:
- Armazene 5 nomes em um array
- Busque um nome específico
- Informe se o nome foi encontrado

### Exercício 5: Estatísticas de Array
Crie um programa que:
- Crie um array com 10 números
- Calcule a soma, média, maior e menor valor
- Conte quantos números são pares e ímpares

## 🔍 Dicas Importantes

1. **Índices**: Lembre-se que começam em 0
2. **Length**: Use `.length` para obter o tamanho
3. **Bounds**: Cuidado com índices fora dos limites
4. **For-each**: Use quando não precisar do índice
5. **Multidimensional**: Arrays de arrays

## 📚 Próximos Passos

Na próxima aula, aprenderemos sobre:
- Métodos (funções)
- Parâmetros e retorno
- Sobrecarga de métodos
- Escopo de variáveis

---

**Arrays são fundamentais para trabalhar com coleções de dados! Pratique muito! 📊** 