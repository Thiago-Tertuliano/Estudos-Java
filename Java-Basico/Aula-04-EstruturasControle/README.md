# Aula 4: Estruturas de Controle

## 🎯 Objetivos da Aula

- Entender estruturas condicionais (if, else, switch)
- Aprender estruturas de repetição (for, while, do-while)
- Compreender break e continue
- Praticar controle de fluxo do programa
- Desenvolver lógica de programação

## 📚 Conteúdo

### 1. Estruturas Condicionais

#### If Simples
```java
if (condicao) {
    // código executado se a condição for true
}
```

#### If-Else
```java
if (condicao) {
    // código executado se a condição for true
} else {
    // código executado se a condição for false
}
```

#### If-Else If-Else
```java
if (condicao1) {
    // código executado se condicao1 for true
} else if (condicao2) {
    // código executado se condicao2 for true
} else {
    // código executado se nenhuma condição for true
}
```

#### Switch
```java
switch (variavel) {
    case valor1:
        // código para valor1
        break;
    case valor2:
        // código para valor2
        break;
    default:
        // código padrão
        break;
}
```

### 2. Estruturas de Repetição

#### For
```java
for (inicializacao; condicao; incremento) {
    // código que será repetido
}

// Exemplo
for (int i = 0; i < 5; i++) {
    System.out.println("Número: " + i);
}
```

#### While
```java
while (condicao) {
    // código que será repetido enquanto a condição for true
}

// Exemplo
int contador = 0;
while (contador < 5) {
    System.out.println("Contador: " + contador);
    contador++;
}
```

#### Do-While
```java
do {
    // código que será executado pelo menos uma vez
} while (condicao);

// Exemplo
int numero = 0;
do {
    System.out.println("Número: " + numero);
    numero++;
} while (numero < 5);
```

### 3. Break e Continue

#### Break
```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break; // sai do loop quando i == 5
    }
    System.out.println(i);
}
```

#### Continue
```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        continue; // pula a iteração quando i == 5
    }
    System.out.println(i);
}
```

### 4. Exemplos Práticos

#### Exemplo 1: Verificador de Notas
```java
public class VerificadorNotas {
    public static void main(String[] args) {
        double nota = 8.5;
        
        if (nota >= 9.0) {
            System.out.println("Excelente!");
        } else if (nota >= 7.0) {
            System.out.println("Bom!");
        } else if (nota >= 5.0) {
            System.out.println("Regular!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
```

#### Exemplo 2: Calculadora com Switch
```java
public class Calculadora {
    public static void main(String[] args) {
        char operacao = '+';
        int a = 10;
        int b = 5;
        int resultado = 0;
        
        switch (operacao) {
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                resultado = a / b;
                break;
            default:
                System.out.println("Operação inválida!");
                return;
        }
        
        System.out.println(a + " " + operacao + " " + b + " = " + resultado);
    }
}
```

#### Exemplo 3: Tabuada com For
```java
public class Tabuada {
    public static void main(String[] args) {
        int numero = 7;
        
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
```

#### Exemplo 4: Contador com While
```java
public class Contador {
    public static void main(String[] args) {
        int contador = 1;
        
        System.out.println("Contando de 1 a 10:");
        while (contador <= 10) {
            System.out.println("Número: " + contador);
            contador++;
        }
    }
}
```

## 🎯 Exercícios Práticos

### Exercício 1: Verificador de Idade
Crie um programa que verifique a idade e informe:
- Se é criança (0-12 anos)
- Se é adolescente (13-17 anos)
- Se é adulto (18-59 anos)
- Se é idoso (60+ anos)

### Exercício 2: Calculadora de Média
Crie um programa que calcule a média de 3 notas e informe:
- "Aprovado" se média >= 7
- "Recuperação" se média >= 5
- "Reprovado" se média < 5

### Exercício 3: Tabuada Completa
Crie um programa que mostre a tabuada de 1 a 10 usando loops aninhados.

### Exercício 4: Verificador de Números Primos
Crie um programa que verifique se um número é primo usando loops.

### Exercício 5: Calculadora de Fatorial
Crie um programa que calcule o fatorial de um número usando loop.

## 🔍 Dicas Importantes

1. **Indentação**: Mantenha o código bem organizado
2. **Chaves**: Sempre use chaves, mesmo para blocos de uma linha
3. **Break**: Sempre use break no switch
4. **Loops infinitos**: Cuidado para não criar loops que nunca terminam
5. **Condições**: Teste sempre os casos extremos

## 📚 Próximos Passos

Na próxima aula, aprenderemos sobre:
- Arrays (vetores)
- Declaração e inicialização
- Percorrendo arrays
- Arrays multidimensionais

---

**As estruturas de controle são o coração da programação! Domine-as bem! 🧠** 