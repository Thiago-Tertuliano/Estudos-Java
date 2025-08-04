/**
 * Aula 4: Estruturas de Controle
 * Exercícios Práticos
 * 
 * Resolva os exercícios abaixo para praticar os conceitos aprendidos.
 */
public class Exercicios {
    
    public static void main(String[] args) {
        System.out.println("=== EXERCÍCIOS AULA 4 ===");
        System.out.println();
        
        // Exercício 1: Verificador de Idade
        System.out.println("Exercício 1: Verificador de Idade");
        int idade = 25;
        
        if (idade >= 0 && idade <= 12) {
            System.out.println("Idade: " + idade + " - Criança");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Idade: " + idade + " - Adolescente");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Idade: " + idade + " - Adulto");
        } else if (idade >= 60) {
            System.out.println("Idade: " + idade + " - Idoso");
        } else {
            System.out.println("Idade inválida!");
        }
        System.out.println();
        
        // Exercício 2: Calculadora de Média
        System.out.println("Exercício 2: Calculadora de Média");
        double nota1 = 8.5;
        double nota2 = 7.0;
        double nota3 = 9.0;
        double media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Média: " + media);
        
        if (media >= 7.0) {
            System.out.println("Resultado: Aprovado");
        } else if (media >= 5.0) {
            System.out.println("Resultado: Recuperação");
        } else {
            System.out.println("Resultado: Reprovado");
        }
        System.out.println();
        
        // Exercício 3: Tabuada Completa
        System.out.println("Exercício 3: Tabuada Completa");
        System.out.println("Tabuadas de 1 a 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Tabuada do " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
        
        // Exercício 4: Verificador de Números Primos
        System.out.println("Exercício 4: Verificador de Números Primos");
        int numero = 17;
        boolean ehPrimo = true;
        
        if (numero <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }
        
        System.out.println("Número: " + numero);
        if (ehPrimo) {
            System.out.println("É primo!");
        } else {
            System.out.println("Não é primo!");
        }
        System.out.println();
        
        // Exercício 5: Calculadora de Fatorial
        System.out.println("Exercício 5: Calculadora de Fatorial");
        int n = 5;
        int fatorial = 1;
        
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        
        System.out.println("Fatorial de " + n + " = " + fatorial);
        System.out.println();
        
        // Exercício 6: Soma de Números
        System.out.println("Exercício 6: Soma de Números");
        int soma = 0;
        
        for (int i = 1; i <= 10; i++) {
            soma += i;
        }
        
        System.out.println("Soma dos números de 1 a 10: " + soma);
        System.out.println();
        
        // Exercício 7: Múltiplos de 3
        System.out.println("Exercício 7: Múltiplos de 3");
        System.out.println("Múltiplos de 3 de 1 a 30:");
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println();
        
        // Exercício 8: Padrão de Asteriscos
        System.out.println("Exercício 8: Padrão de Asteriscos");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("Parabéns! Você completou os exercícios da Aula 4!");
    }
} 