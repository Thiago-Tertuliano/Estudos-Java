# Aula 8: Encapsulamento

## 🎯 Objetivos da Aula

- Entender o conceito de encapsulamento
- Aprender modificadores de acesso
- Compreender getters e setters
- Conhecer proteção de dados
- Praticar boas práticas de POO

## 📚 Conteúdo

### 1. O que é Encapsulamento?

Encapsulamento é um dos pilares da POO que agrupa dados e métodos relacionados em uma classe, controlando o acesso aos dados através de métodos específicos.

### 2. Modificadores de Acesso

```java
public class Exemplo {
    public String publico;      // Acessível de qualquer lugar
    protected String protegido; // Acessível na classe, pacote e subclasses
    String padrao;             // Acessível apenas no pacote
    private String privado;     // Acessível apenas na classe
}
```

### 3. Getters e Setters

```java
public class Pessoa {
    private String nome;
    private int idade;
    
    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    // Getter para nome
    public String getNome() {
        return nome;
    }
    
    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // Getter para idade
    public int getIdade() {
        return idade;
    }
    
    // Setter para idade com validação
    public void setIdade(int idade) {
        if (idade >= 0 && idade <= 150) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
    }
}
```

### 4. Exemplos Práticos

#### Exemplo 1: Classe Conta Bancária
```java
public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;
    
    public ContaBancaria(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }
    
    // Getters
    public String getNumero() {
        return numero;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    // Métodos de operação
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado.");
        } else {
            System.out.println("Valor inválido para depósito!");
        }
    }
    
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
            return false;
        }
    }
}
```

#### Exemplo 2: Classe Produto
```java
public class Produto {
    private String codigo;
    private String nome;
    private double preco;
    private int quantidade;
    
    public Produto(String codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }
    
    // Getters
    public String getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getQuantidade() { return quantidade; }
    
    // Setters com validação
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }
    }
    
    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
    }
    
    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        }
    }
    
    // Métodos de negócio
    public double calcularValorTotal() {
        return preco * quantidade;
    }
    
    public void aplicarDesconto(double percentual) {
        if (percentual >= 0 && percentual <= 100) {
            preco = preco * (1 - percentual / 100);
        }
    }
}
```

## 🎯 Exercícios Práticos

### Exercício 1: Classe Aluno
Crie uma classe Aluno com encapsulamento:
- Atributos privados: nome, matricula, notas
- Getters e setters apropriados
- Métodos: calcular média, verificar aprovação

### Exercício 2: Classe Retângulo
Crie uma classe Retangulo com:
- Atributos privados: base, altura
- Getters e setters com validação
- Métodos: calcular área e perímetro

### Exercício 3: Classe Carro
Crie uma classe Carro com:
- Atributos privados: marca, modelo, ano, velocidade
- Métodos: acelerar, frear, exibir informações

### Exercício 4: Classe Livro
Crie uma classe Livro com:
- Atributos privados: título, autor, páginas, preço
- Métodos: aplicar desconto, verificar se é caro

### Exercício 5: Classe Funcionário
Crie uma classe Funcionario com:
- Atributos privados: nome, salário, departamento
- Métodos: aumentar salário, calcular bônus

## 🔍 Dicas Importantes

1. **Private**: Use para atributos
2. **Public**: Use para métodos que precisam ser acessados externamente
3. **Validação**: Sempre valide dados nos setters
4. **Getters**: Forneça acesso controlado aos dados
5. **Setters**: Permita modificação segura dos dados

## 📚 Próximos Passos

Na próxima aula, aprenderemos sobre:
- Herança
- Extensão de classes
- Polimorfismo básico
- Super e This

---

**Encapsulamento protege seus dados e torna seu código mais seguro! 🔒** 