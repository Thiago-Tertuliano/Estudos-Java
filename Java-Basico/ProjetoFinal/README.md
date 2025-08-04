# Projeto Final: Sistema de Gerenciamento de Biblioteca

## 🎯 Objetivo do Projeto

Este projeto final integra todos os conceitos aprendidos no curso básico de Java, criando um sistema simples de gerenciamento de biblioteca.

## 📚 Funcionalidades do Sistema

### 1. Gerenciamento de Livros
- Cadastrar livros
- Buscar livros por título
- Listar todos os livros
- Verificar disponibilidade

### 2. Gerenciamento de Usuários
- Cadastrar usuários
- Buscar usuários por nome
- Listar todos os usuários

### 3. Sistema de Empréstimos
- Realizar empréstimo
- Devolver livro
- Verificar livros emprestados
- Calcular multas

## 🏗️ Estrutura do Projeto

### Classes Principais

#### 1. Livro.java
```java
public class Livro {
    private String isbn;
    private String titulo;
    private String autor;
    private int ano;
    private boolean disponivel;
    
    // Construtor, getters, setters e métodos
}
```

#### 2. Usuario.java
```java
public class Usuario {
    private String cpf;
    private String nome;
    private String email;
    private List<Livro> livrosEmprestados;
    
    // Construtor, getters, setters e métodos
}
```

#### 3. Emprestimo.java
```java
public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    
    // Construtor, getters, setters e métodos
}
```

#### 4. Biblioteca.java
```java
public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;
    private List<Emprestimo> emprestimos;
    
    // Métodos de gerenciamento
}
```

## 🎯 Conceitos Aplicados

### Aula 1-2: Variáveis e Tipos
- Uso de tipos primitivos (int, boolean, String)
- Declaração e inicialização de variáveis
- Constantes (final)

### Aula 3: Operadores
- Operadores de comparação
- Operadores lógicos
- Operadores aritméticos

### Aula 4: Estruturas de Controle
- Loops for e while
- Estruturas condicionais if-else
- Switch statements

### Aula 5: Arrays
- Arrays de objetos
- Listas (ArrayList)
- Percorrendo coleções

### Aula 6: Métodos
- Métodos com parâmetros e retorno
- Sobrecarga de métodos
- Métodos estáticos

### Aula 7-8: Classes e Encapsulamento
- Criação de classes
- Atributos privados
- Getters e setters
- Construtores

### Aula 9: Herança
- Hierarquia de classes
- Polimorfismo
- Uso de super()

### Aula 10: Interfaces
- Definição de contratos
- Implementação de interfaces
- Classes abstratas

## 🚀 Como Executar

1. **Compilar o projeto**:
   ```bash
   javac *.java
   ```

2. **Executar o programa principal**:
   ```bash
   java SistemaBiblioteca
   ```

## 📝 Exemplo de Uso

```java
public class SistemaBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        
        // Cadastrar livros
        Livro livro1 = new Livro("123", "Java Básico", "João Silva", 2024);
        Livro livro2 = new Livro("456", "POO Avançado", "Maria Santos", 2023);
        
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        
        // Cadastrar usuário
        Usuario usuario = new Usuario("123.456.789-00", "Pedro Costa", "pedro@email.com");
        biblioteca.adicionarUsuario(usuario);
        
        // Realizar empréstimo
        biblioteca.emprestarLivro("123", "123.456.789-00");
        
        // Listar livros emprestados
        biblioteca.listarLivrosEmprestados();
        
        // Devolver livro
        biblioteca.devolverLivro("123", "123.456.789-00");
    }
}
```

## 🎓 Objetivos de Aprendizado

Este projeto permite praticar:

1. **Organização de código**: Estrutura clara e modular
2. **Encapsulamento**: Proteção de dados
3. **Herança**: Reutilização de código
4. **Polimorfismo**: Flexibilidade no código
5. **Interfaces**: Contratos bem definidos
6. **Coleções**: Manipulação de dados
7. **Validações**: Dados consistentes
8. **Documentação**: Código legível

## 🔧 Extensões Possíveis

1. **Persistência**: Salvar dados em arquivo
2. **Interface gráfica**: Usar Swing ou JavaFX
3. **Banco de dados**: Integração com JDBC
4. **Relatórios**: Gerar estatísticas
5. **Multas**: Sistema de penalidades
6. **Categorias**: Organizar livros por tema

---

**Este projeto demonstra como aplicar todos os conceitos aprendidos em um sistema real! 🎉** 