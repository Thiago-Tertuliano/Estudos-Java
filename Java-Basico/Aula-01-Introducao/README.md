# Aula 1: Introdução ao Java

## 🎯 Objetivos da Aula

- Entender o que é Java e suas características
- Configurar o ambiente de desenvolvimento
- Criar o primeiro programa "Hello World"
- Compreender a estrutura básica de um programa Java

## 📚 Conteúdo

### 1. O que é Java?

Java é uma linguagem de programação orientada a objetos criada pela Sun Microsystems (agora Oracle) em 1995. Suas principais características são:

- **Portabilidade**: "Write Once, Run Anywhere" - um programa Java pode rodar em qualquer plataforma
- **Orientação a Objetos**: Baseada em classes e objetos
- **Segurança**: Possui recursos de segurança integrados
- **Robustez**: Tratamento de erros e exceções
- **Simplicidade**: Sintaxe clara e fácil de aprender

### 2. Configuração do Ambiente

#### Instalando o JDK (Java Development Kit)

1. **Baixe o JDK**: Acesse [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) ou [OpenJDK](https://openjdk.org/)
2. **Instale o JDK**: Execute o instalador e siga as instruções
3. **Configure as variáveis de ambiente**:
   - Windows: Adicione `C:\Program Files\Java\jdk-version\bin` ao PATH
   - Linux/Mac: Configure JAVA_HOME e PATH

#### Verificando a Instalação

Abra o terminal/prompt e digite:
```bash
java -version
javac -version
```

### 3. Estrutura Básica de um Programa Java

```java
// Comentário de uma linha
/*
 * Comentário de múltiplas linhas
 */

// Declaração do pacote (opcional)
package com.exemplo;

// Importações (opcional)
import java.util.Scanner;

// Declaração da classe
public class NomeDaClasse {
    
    // Método principal - ponto de entrada do programa
    public static void main(String[] args) {
        // Código do programa aqui
        System.out.println("Olá, mundo!");
    }
}
```

### 4. Primeiro Programa: Hello World

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
        System.out.println("Bem-vindo ao Java!");
    }
}
```

## 🛠️ Como Compilar e Executar

### Compilação
```bash
javac HelloWorld.java
```

### Execução
```bash
java HelloWorld
```

## 📝 Conceitos Importantes

- **Classe**: É um modelo/template para criar objetos
- **Método**: É uma função dentro de uma classe
- **main()**: Método especial que é o ponto de entrada do programa
- **System.out.println()**: Método para imprimir texto no console
- **String[] args**: Parâmetros passados via linha de comando

## 🎯 Exercícios Práticos

### Exercício 1: Meu Primeiro Programa
Crie um programa que imprima seu nome e idade.

### Exercício 2: Informações Pessoais
Crie um programa que imprima:
- Seu nome completo
- Sua cidade
- Sua profissão
- Uma mensagem motivacional

### Exercício 3: Calculadora Simples
Crie um programa que imprima o resultado de uma operação matemática simples.

## 🔍 Dicas Importantes

1. **Nomenclatura**: Nomes de classes começam com maiúscula
2. **Indentação**: Use espaços ou tabs para organizar o código
3. **Comentários**: Documente seu código
4. **Teste sempre**: Execute seu código após cada modificação

## 📚 Próximos Passos

Na próxima aula, aprenderemos sobre:
- Variáveis e tipos de dados
- Como armazenar e manipular informações
- Constantes e conversão de tipos

---

**Lembre-se: A prática é fundamental para aprender programação! 💻** 