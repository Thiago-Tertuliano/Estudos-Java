# Aula 10: Interfaces e Classes Abstratas

## 🎯 Objetivos da Aula

- Entender o conceito de interfaces
- Aprender sobre classes abstratas
- Compreender implementação de interfaces
- Conhecer múltiplas interfaces
- Finalizar o curso básico de Java

## 📚 Conteúdo

### 1. Interfaces

Interfaces são contratos que definem quais métodos uma classe deve implementar. Elas permitem polimorfismo e desacoplamento.

```java
public interface Forma {
    double calcularArea();
    double calcularPerimetro();
}

public class Circulo implements Forma {
    private double raio;
    
    public Circulo(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
```

### 2. Classes Abstratas

Classes abstratas são classes que não podem ser instanciadas diretamente, mas podem conter métodos concretos e abstratos.

```java
public abstract class Animal {
    protected String nome;
    
    public Animal(String nome) {
        this.nome = nome;
    }
    
    // Método abstrato (deve ser implementado pelas subclasses)
    public abstract void fazerSom();
    
    // Método concreto (já tem implementação)
    public void dormir() {
        System.out.println(nome + " está dormindo...");
    }
}

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }
    
    @Override
    public void fazerSom() {
        System.out.println(nome + " faz: Au au!");
    }
}
```

### 3. Múltiplas Interfaces

Uma classe pode implementar múltiplas interfaces.

```java
public interface Nadavel {
    void nadar();
}

public interface Voador {
    void voar();
}

public class Pato implements Nadavel, Voador {
    @Override
    public void nadar() {
        System.out.println("Pato nadando...");
    }
    
    @Override
    public void voar() {
        System.out.println("Pato voando...");
    }
}
```

### 4. Exemplos Práticos

#### Exemplo 1: Sistema de Pagamento
```java
public interface Pagavel {
    double calcularPagamento();
    void processarPagamento();
}

public class Funcionario implements Pagavel {
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    @Override
    public double calcularPagamento() {
        return salario;
    }
    
    @Override
    public void processarPagamento() {
        System.out.println("Pagando R$ " + calcularPagamento() + " para " + nome);
    }
}
```

#### Exemplo 2: Hierarquia de Formas
```java
public abstract class Forma {
    protected String cor;
    
    public Forma(String cor) {
        this.cor = cor;
    }
    
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    
    public void exibirInformacoes() {
        System.out.println("Cor: " + cor);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}

public class Retangulo extends Forma {
    private double base;
    private double altura;
    
    public Retangulo(String cor, double base, double altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return base * altura;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
```

### 5. Interfaces Funcionais (Java 8+)

```java
@FunctionalInterface
public interface Calculadora {
    double calcular(double a, double b);
}

public class TesteCalculadora {
    public static void main(String[] args) {
        // Usando lambda expressions
        Calculadora soma = (a, b) -> a + b;
        Calculadora multiplicacao = (a, b) -> a * b;
        
        System.out.println("Soma: " + soma.calcular(5, 3));
        System.out.println("Multiplicação: " + multiplicacao.calcular(5, 3));
    }
}
```

## 🎯 Exercícios Práticos

### Exercício 1: Sistema de Veículos
Crie interfaces e classes para:
- Interface: Veiculo (métodos mover, parar)
- Classes: Carro, Moto, Bicicleta

### Exercício 2: Sistema de Notificações
Crie interfaces para:
- Interface: Notificavel (método enviarNotificacao)
- Classes: Email, SMS, Push

### Exercício 3: Sistema de Banco de Dados
Crie interfaces para:
- Interface: Repositorio (métodos salvar, buscar, deletar)
- Classes: RepositorioUsuario, RepositorioProduto

### Exercício 4: Sistema de Logs
Crie classes abstratas para:
- Classe abstrata: Logger
- Subclasses: ConsoleLogger, FileLogger

### Exercício 5: Sistema de Relatórios
Crie interfaces para:
- Interface: Relatorio (método gerar)
- Classes: RelatorioPDF, RelatorioExcel

## 🔍 Dicas Importantes

1. **Interfaces**: Definem contratos, não implementação
2. **Classes Abstratas**: Podem ter implementação parcial
3. **implements**: Use para implementar interfaces
4. **extends**: Use para herdar de classes abstratas
5. **@Override**: Sempre use para métodos de interface

## 🎓 Conclusão do Curso

Parabéns! Você completou o curso básico de Java. Agora você tem uma base sólida em:

- ✅ Sintaxe básica do Java
- ✅ Variáveis e tipos de dados
- ✅ Operadores e estruturas de controle
- ✅ Arrays e coleções
- ✅ Métodos e funções
- ✅ Programação Orientada a Objetos
- ✅ Classes e objetos
- ✅ Encapsulamento
- ✅ Herança e polimorfismo
- ✅ Interfaces e classes abstratas

## 🚀 Próximos Passos

Para continuar seu aprendizado, considere:

1. **Frameworks**: Spring Boot, Hibernate
2. **Banco de Dados**: JDBC, JPA
3. **APIs**: REST, GraphQL
4. **Testes**: JUnit, Mockito
5. **Ferramentas**: Maven, Gradle

---

**Parabéns por completar o curso básico de Java! Continue praticando e aprendendo! 🎉** 