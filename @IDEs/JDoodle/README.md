# JDoodle

O JDoodle é um compilador e IDE online específico para Java e outras linguagens de programação. É ideal para testar código rapidamente, resolver exercícios e aprender Java sem instalar nada no computador.

## Vantagens do JDoodle

### Para Iniciantes
- **Específico para Java**: Otimizado para desenvolvimento Java
- **Sem Instalação**: Funciona diretamente no navegador
- **Rápido**: Compilação e execução instantâneas
- **Gratuito**: Plano básico gratuito disponível

### Recursos Especiais
- **Múltiplas Versões Java**: JDK 8, 11, 17, 21
- **Input/Output**: Simulação de entrada do usuário
- **Compartilhamento**: Links diretos para código
- **API**: Integração com outros sistemas

## Como Acessar

### 1. Acesso Direto
1. Acesse [jdoodle.com](https://www.jdoodle.com/)
2. Clique em "Online Java Compiler"
3. Comece a programar imediatamente
4. Não é necessário criar conta

### 2. Criar Conta (Opcional)
1. Clique em "Sign Up"
2. Use email ou conta Google
3. Confirme seu email
4. Salve seus códigos

## Interface do JDoodle

### Áreas Principais
- **Editor**: Área de código principal
- **Input**: Entrada do programa
- **Output**: Saída do programa
- **Settings**: Configurações

### Menu Principal
- **Run**: Executar código
- **Save**: Salvar código
- **Load**: Carregar código
- **Share**: Compartilhar
- **Settings**: Configurações

## Configuração para Java

### 1. Versões Java Disponíveis
- **JDK 8**: Versão LTS tradicional
- **JDK 11**: Versão LTS moderna
- **JDK 17**: Versão LTS atual (recomendada)
- **JDK 21**: Versão mais recente

### 2. Configurações Recomendadas
- **Language**: Java
- **Version**: JDK 17
- **Input**: Deixe vazio ou adicione dados de teste
- **Theme**: Escuro ou claro

### 3. Estrutura de Código
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Seu código aqui
        System.out.println("Olá, mundo!");
    }
}
```

## Como Usar para o Curso

### 1. Aula 1: Hello World
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("=== AULA 1: HELLO WORLD ===");
        System.out.println("Olá, mundo!");
        System.out.println("Bem-vindo ao JDoodle!");
        System.out.println("Este é meu primeiro programa Java!");
    }
}
```

### 2. Aula 2: Variáveis
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== AULA 2: VARIÁVEIS ===");
        
        String nome = "João Silva";
        int idade = 25;
        double altura = 1.75;
        boolean estudante = true;
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + "m");
        System.out.println("É estudante? " + estudante);
        
        // Usando Scanner para entrada
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nomeDigitado = scanner.nextLine();
        System.out.println("Olá, " + nomeDigitado + "!");
    }
}
```

### 3. Aula 3: Operadores
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("=== AULA 3: OPERADORES ===");
        
        int a = 10;
        int b = 5;
        
        System.out.println("A = " + a + ", B = " + b);
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Módulo: " + (a % b));
        
        // Operadores de comparação
        System.out.println("A > B? " + (a > b));
        System.out.println("A == B? " + (a == b));
        System.out.println("A != B? " + (a != b));
    }
}
```

## Recursos Avançados

### 1. Input/Output
- **Input**: Adicione dados de entrada
- **Output**: Veja resultado imediatamente
- **Scanner**: Para entrada do usuário
- **BufferedReader**: Para entrada avançada

### 2. Múltiplos Arquivos
- Crie classes separadas
- Use imports para conectar
- Organize por funcionalidade
- Mantenha estrutura clara

### 3. Debugging
- Use `System.out.println()` para debug
- Verifique output para erros
- Teste com diferentes inputs
- Valide resultados

## Dicas de Uso

### 1. Organização
- Salve códigos importantes
- Use nomes descritivos
- Comente seu código
- Teste diferentes cenários

### 2. Compartilhamento
- Use links para compartilhar
- Adicione comentários explicativos
- Documente o código
- Mantenha versões organizadas

### 3. Aprendizado
- Experimente diferentes abordagens
- Teste casos extremos
- Compare soluções
- Aprenda com erros

## Exemplos Práticos

### Calculadora Simples
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CALCULADORA SIMPLES ===");
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        
        int opcao = scanner.nextInt();
        double resultado = 0;
        
        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Soma: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Subtração: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Multiplicação: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Divisão: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero!");
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
```

### Verificador de Números
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("=== VERIFICADOR DE NÚMEROS ===");
        
        int[] numeros = {10, 25, 30, 15, 40, 35};
        
        for (int numero : numeros) {
            System.out.print("Número " + numero + ": ");
            
            if (numero % 2 == 0) {
                System.out.print("Par, ");
            } else {
                System.out.print("Ímpar, ");
            }
            
            if (numero > 0) {
                System.out.print("Positivo, ");
            } else if (numero < 0) {
                System.out.print("Negativo, ");
            } else {
                System.out.print("Zero, ");
            }
            
            if (numero % 5 == 0) {
                System.out.println("Múltiplo de 5");
            } else {
                System.out.println("Não é múltiplo de 5");
            }
        }
    }
}
```

## Solução de Problemas

### Código não Executa
1. Verifique sintaxe
2. Certifique-se de que há método main
3. Verifique nomes de classes
4. Clique em "Run"

### Erro de Compilação
1. Verifique mensagens de erro
2. Corrija sintaxe
3. Verifique imports
4. Teste com código simples

### Input não Funciona
1. Verifique se há dados no campo Input
2. Use Scanner corretamente
3. Teste com valores simples
4. Verifique formato dos dados

## Recursos Adicionais

### Documentação
- [JDoodle Docs](https://www.jdoodle.com/docs)
- [Java API](https://docs.oracle.com/en/java/)
- [Tutorial Java](https://docs.oracle.com/javase/tutorial/)

### Recursos Úteis
- **API Integration**: Use JDoodle via API
- **Code Embedding**: Embaixe em websites
- **Batch Processing**: Processe múltiplos códigos
- **Custom Input**: Teste com diferentes dados

## Comparação com Outros IDEs

### Vantagens do JDoodle
- Específico para Java
- Interface simples
- Execução rápida
- Sem instalação

### Desvantagens
- Recursos limitados
- Sem debugger avançado
- Menos plugins
- Depende de internet

## Configurações Recomendadas

### Para o Curso
- **Language**: Java
- **Version**: JDK 17
- **Theme**: Dark (menos cansaço visual)
- **Font Size**: 14px
- **Tab Size**: 4 spaces

### Para Exercícios
- **Input**: Dados de teste
- **Output**: Resultados esperados
- **Comments**: Explicações no código
- **Structure**: Código organizado

---

**Próximo Passo**: O JDoodle é perfeito para testar código Java rapidamente! Use-o para praticar exercícios e experimentar conceitos do curso. 