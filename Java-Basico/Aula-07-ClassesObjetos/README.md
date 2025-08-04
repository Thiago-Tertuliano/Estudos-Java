# Aula 7: Classes e Objetos

## 🎯 Objetivos da Aula

- Entender conceitos básicos de POO
- Aprender a criar classes
- Compreender instanciação de objetos
- Conhecer construtores
- Praticar programação orientada a objetos

## 📚 Conteúdo

### 1. O que é Programação Orientada a Objetos (POO)?

POO é um paradigma de programação que organiza o código em objetos que contêm dados e código. Os principais conceitos são:
- **Encapsulamento**: Agrupar dados e métodos relacionados
- **Herança**: Reutilizar código de classes existentes
- **Polimorfismo**: Usar interfaces comuns para diferentes implementações
- **Abstração**: Simplificar complexidade através de interfaces

### 2. Estrutura de uma Classe

```java
public class NomeDaClasse {
    // Atributos (variáveis da classe)
    private String nome;
    private int idade;
    
    // Construtor
    public NomeDaClasse(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    // Métodos
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
```

### 3. Criando Objetos

```java
public class Exemplo {
    public static void main(String[] args) {
        // Criando um objeto (instância da classe)
        Pessoa pessoa1 = new Pessoa("João", 25);
        Pessoa pessoa2 = new Pessoa("Maria", 30);
        
        // Chamando métodos do objeto
        pessoa1.exibirInformacoes();
        pessoa2.exibirInformacoes();
    }
}
```

### 4. Construtores

```java
public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    
    // Construtor padrão
    public Carro() {
        this.marca = "Desconhecida";
        this.modelo = "Desconhecido";
        this.ano = 0;
    }
    
    // Construtor com parâmetros
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    // Método para exibir informações
    public void exibirCarro() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
```

### 5. Exemplos Práticos

#### Exemplo 1: Classe Pessoa
```java
public class Pessoa {
    private String nome;
    private int idade;
    private String cidade;
    
    public Pessoa(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }
    
    public void apresentar() {
        System.out.println("Olá! Sou " + nome + ", tenho " + idade + " anos e moro em " + cidade);
    }
    
    public void fazerAniversario() {
        idade++;
        System.out.println("Feliz aniversário! Agora tenho " + idade + " anos!");
    }
}
```

#### Exemplo 2: Classe Calculadora
```java
public class Calculadora {
    private double resultado;
    
    public Calculadora() {
        this.resultado = 0;
    }
    
    public void somar(double valor) {
        resultado += valor;
    }
    
    public void subtrair(double valor) {
        resultado -= valor;
    }
    
    public void multiplicar(double valor) {
        resultado *= valor;
    }
    
    public void dividir(double valor) {
        if (valor != 0) {
            resultado /= valor;
        } else {
            System.out.println("Erro: Divisão por zero!");
        }
    }
    
    public double getResultado() {
        return resultado;
    }
    
    public void limpar() {
        resultado = 0;
    }
}
```

## 🎯 Exercícios Práticos

### Exercício 1: Classe Aluno
Crie uma classe Aluno com:
- Atributos: nome, matricula, notas (array)
- Métodos: calcular média, verificar aprovação, exibir dados

### Exercício 2: Classe Conta Bancária
Crie uma classe ContaBancaria com:
- Atributos: número, titular, saldo
- Métodos: depositar, sacar, exibir saldo

### Exercício 3: Classe Produto
Crie uma classe Produto com:
- Atributos: código, nome, preço, quantidade
- Métodos: calcular valor total, aplicar desconto

### Exercício 4: Classe Retângulo
Crie uma classe Retangulo com:
- Atributos: base, altura
- Métodos: calcular área, calcular perímetro

### Exercício 5: Classe Agenda
Crie uma classe Agenda com:
- Atributos: nome, telefone, email
- Métodos: adicionar contato, buscar contato, listar contatos

## 🔍 Dicas Importantes

1. **Nomenclatura**: Classes começam com maiúscula
2. **Encapsulamento**: Use private para atributos
3. **Construtores**: Sempre crie construtores apropriados
4. **This**: Use para referenciar atributos da classe
5. **Objetos**: São instâncias de classes

## 📚 Próximos Passos

Na próxima aula, aprenderemos sobre:
- Encapsulamento
- Modificadores de acesso
- Getters e Setters
- Proteção de dados

---

**Classes e objetos são a base da programação orientada a objetos! 🏗️** 