/**
 * Aula 2: Variáveis e Tipos de Dados
 * Exemplos Práticos
 * 
 * Este arquivo contém exemplos práticos dos conceitos aprendidos.
 */
public class Exemplos {
    
    public static void main(String[] args) {
        System.out.println("=== EXEMPLOS AULA 2 ===");
        System.out.println();
        
        // Exemplo 1: Informações Pessoais
        System.out.println("Exemplo 1: Informações Pessoais");
        String nome = "Ana";
        int idade = 30;
        double altura = 1.65;
        boolean casada = false;
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Casada: " + casada);
        System.out.println();
        
        // Exemplo 2: Cálculos Matemáticos
        System.out.println("Exemplo 2: Cálculos Matemáticos");
        int a = 10;
        int b = 3;
        
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        double divisao = (double) a / b; // Casting para double
        
        System.out.println("A = " + a + ", B = " + b);
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println();
        
        // Exemplo 3: Constantes
        System.out.println("Exemplo 3: Constantes");
        final double PI = 3.14159;
        final String NOME_EMPRESA = "Minha Empresa";
        final int IDADE_MINIMA = 18;
        
        System.out.println("PI = " + PI);
        System.out.println("Nome da Empresa: " + NOME_EMPRESA);
        System.out.println("Idade Mínima: " + IDADE_MINIMA + " anos");
        System.out.println();
        
        // Exemplo 4: Conversão de Tipos
        System.out.println("Exemplo 4: Conversão de Tipos");
        double valorDouble = 10.7;
        int valorInteiro = (int) valorDouble;
        char letra = 'A';
        int codigoAscii = (int) letra;
        
        System.out.println("Valor double: " + valorDouble);
        System.out.println("Valor convertido para int: " + valorInteiro);
        System.out.println("Letra: " + letra);
        System.out.println("Código ASCII: " + codigoAscii);
        System.out.println();
        
        // Exemplo 5: Strings e Concatenação
        System.out.println("Exemplo 5: Strings e Concatenação");
        String primeiroNome = "João";
        String sobrenome = "Silva";
        String nomeCompleto = primeiroNome + " " + sobrenome;
        
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println();
        
        System.out.println("Todos os exemplos foram executados com sucesso!");
    }
} 