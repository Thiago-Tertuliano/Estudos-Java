# Aula 9: Herança

## 🎯 Objetivos da Aula

- Entender o conceito de herança
- Aprender a estender classes
- Compreender polimorfismo básico
- Conhecer super e this
- Praticar reutilização de código

## 📚 Conteúdo

### 1. O que é Herança?

Herança é um mecanismo que permite criar uma nova classe baseada em uma classe existente, reutilizando código e estabelecendo uma relação "é um" entre as classes.

### 2. Sintaxe de Herança

```java
// Classe pai (superclasse)
public class Animal {
    protected String nome;
    protected int idade;
    
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void fazerSom() {
        System.out.println("Som genérico");
    }
}

// Classe filha (subclasse)
public class Cachorro extends Animal {
    private String raca;
    
    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade); // Chama o construtor da superclasse
        this.raca = raca;
    }
    
    @Override
    public void fazerSom() {
        System.out.println("Au au!");
    }
    
    public void abanarRabo() {
        System.out.println("Abanando o rabo!");
    }
}
```

### 3. Palavras-chave: super e this

```java
public class Funcionario {
    protected String nome;
    protected double salario;
    
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
}

public class Gerente extends Funcionario {
    private String departamento;
    
    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario); // Chama construtor da superclasse
        this.departamento = departamento; // this refere-se à classe atual
    }
    
    public void gerenciar() {
        System.out.println("Gerenciando o departamento: " + departamento);
    }
}
```

### 4. Polimorfismo

```java
public class TestePolimorfismo {
    public static void main(String[] args) {
        // Polimorfismo: referência da superclasse, objeto da subclasse
        Animal animal1 = new Cachorro("Rex", 3, "Labrador");
        Animal animal2 = new Gato("Mimi", 2);
        
        // Chama o método da subclasse
        animal1.fazerSom(); // "Au au!"
        animal2.fazerSom(); // "Miau!"
    }
}
```

### 5. Exemplos Práticos

#### Exemplo 1: Hierarquia de Veículos
```java
public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}

public class Carro extends Veiculo {
    private int numPortas;
    
    public Carro(String marca, String modelo, int ano, int numPortas) {
        super(marca, modelo, ano);
        this.numPortas = numPortas;
    }
    
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // Chama método da superclasse
        System.out.println("Número de portas: " + numPortas);
    }
}

public class Moto extends Veiculo {
    private int cilindradas;
    
    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }
    
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cilindradas: " + cilindradas);
    }
}
```

#### Exemplo 2: Hierarquia de Funcionários
```java
public class Funcionario {
    protected String nome;
    protected double salario;
    
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    public double calcularSalario() {
        return salario;
    }
}

public class Gerente extends Funcionario {
    private double bonus;
    
    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }
    
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonus;
    }
}
```

## 🎯 Exercícios Práticos

### Exercício 1: Hierarquia de Formas
Crie uma hierarquia de formas geométricas:
- Classe base: Forma (com método calcularArea)
- Subclasses: Circulo, Retangulo, Triangulo

### Exercício 2: Hierarquia de Contas
Crie uma hierarquia de contas bancárias:
- Classe base: Conta (com métodos depositar, sacar)
- Subclasses: ContaCorrente, ContaPoupanca

### Exercício 3: Hierarquia de Produtos
Crie uma hierarquia de produtos:
- Classe base: Produto (com métodos básicos)
- Subclasses: Livro, Eletronico, Roupa

### Exercício 4: Hierarquia de Animais
Crie uma hierarquia de animais:
- Classe base: Animal (com método fazerSom)
- Subclasses: Mamifero, Ave, Peixe

### Exercício 5: Hierarquia de Funcionários
Crie uma hierarquia de funcionários:
- Classe base: Funcionario
- Subclasses: Vendedor, Administrativo, Tecnico

## 🔍 Dicas Importantes

1. **extends**: Use para herdar de uma classe
2. **super()**: Chame o construtor da superclasse
3. **@Override**: Indique sobrescrita de métodos
4. **protected**: Use para atributos acessíveis às subclasses
5. **Polimorfismo**: Referência da superclasse, objeto da subclasse

## 📚 Próximos Passos

Na próxima aula, aprenderemos sobre:
- Interfaces
- Classes abstratas
- Implementação de interfaces
- Múltiplas interfaces

---

**Herança permite reutilizar código e criar hierarquias organizadas! 🏗️** 