# Aula 6: Métodos

## 🎯 Objetivos da Aula

- Entender o conceito de métodos (funções)
- Aprender a declarar e chamar métodos
- Compreender parâmetros e retorno
- Conhecer sobrecarga de métodos
- Entender escopo de variáveis

## 📚 Conteúdo

### 1. O que são Métodos?

Métodos são blocos de código que realizam uma tarefa específica. Eles permitem organizar o código, reutilizar lógica e tornar o programa mais legível.

### 2. Estrutura de um Método

```java
modificador tipoRetorno nomeMetodo(parametros) {
    // corpo do método
    return valor; // se necessário
}
```

### 3. Tipos de Métodos

#### Método sem retorno (void)
```java
public void saudacao() {
    System.out.println("Olá, mundo!");
}
```

#### Método com retorno
```java
public int soma(int a, int b) {
    return a + b;
}
```

#### Método com múltiplos parâmetros
```java
public double media(double n1, double n2, double n3) {
    return (n1 + n2 + n3) / 3;
}
```

### 4. Chamando Métodos

```java
public class Exemplo {
    public static void main(String[] args) {
        // Chamando método sem retorno
        saudacao();
        
        // Chamando método com retorno
        int resultado = soma(5, 3);
        System.out.println("Soma: " + resultado);
        
        // Chamando método com múltiplos parâmetros
        double media = media(8.5, 7.0, 9.0);
        System.out.println("Média: " + media);
    }
    
    public static void saudacao() {
        System.out.println("Olá, mundo!");
    }
    
    public static int soma(int a, int b) {
        return a + b;
    }
    
    public static double media(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
}
```

### 5. Sobrecarga de Métodos (Overloading)

```java
public class Calculadora {
    // Método para somar dois inteiros
    public static int soma(int a, int b) {
        return a + b;
    }
    
    // Método para somar três inteiros
    public static int soma(int a, int b, int c) {
        return a + b + c;
    }
    
    // Método para somar dois doubles
    public static double soma(double a, double b) {
        return a + b;
    }
}
```

### 6. Escopo de Variáveis

```java
public class Escopo {
    public static void main(String[] args) {
        int x = 10; // Variável local do main
        
        if (x > 5) {
            int y = 20; // Variável local do if
            System.out.println("x = " + x + ", y = " + y);
        }
        
        // System.out.println(y); // Erro! y não existe aqui
    }
}
```

### 7. Exemplos Práticos

#### Exemplo 1: Calculadora Simples
```java
public class Calculadora {
    public static void main(String[] args) {
        int resultado = soma(10, 5);
        System.out.println("10 + 5 = " + resultado);
        
        double media = calcularMedia(8.5, 7.0, 9.0);
        System.out.println("Média: " + media);
    }
    
    public static int soma(int a, int b) {
        return a + b;
    }
    
    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
}
```

#### Exemplo 2: Verificador de Idade
```java
public class VerificadorIdade {
    public static void main(String[] args) {
        verificarIdade(25);
        verificarIdade(15);
        verificarIdade(65);
    }
    
    public static void verificarIdade(int idade) {
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
```

## 🎯 Exercícios Práticos

### Exercício 1: Calculadora de Área
Crie métodos para calcular:
- Área do círculo (π * r²)
- Área do retângulo (base * altura)
- Área do triângulo (base * altura / 2)

### Exercício 2: Conversor de Temperatura
Crie métodos para converter:
- Celsius para Fahrenheit
- Fahrenheit para Celsius
- Celsius para Kelvin

### Exercício 3: Verificador de Números
Crie métodos para verificar:
- Se um número é par
- Se um número é primo
- Se um número é positivo

### Exercício 4: Calculadora de Fatorial
Crie um método recursivo para calcular o fatorial de um número.

### Exercício 5: Gerador de Senha
Crie um método que gere uma senha aleatória com letras e números.

## 🔍 Dicas Importantes

1. **Nomenclatura**: Use camelCase para nomes de métodos
2. **Parâmetros**: Passe apenas o necessário
3. **Retorno**: Use tipos apropriados
4. **Sobrecarga**: Métodos com mesmo nome, parâmetros diferentes
5. **Escopo**: Variáveis só existem onde foram declaradas

## 📚 Próximos Passos

Na próxima aula, aprenderemos sobre:
- Classes e Objetos
- Conceitos básicos de POO
- Criação de classes
- Instanciação de objetos

---

**Métodos são fundamentais para organizar e reutilizar código! Pratique muito! 🔧** 