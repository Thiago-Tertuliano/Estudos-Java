/**
 * Aula 6: Métodos
 * Exemplos Práticos
 * 
 * Este arquivo contém exemplos práticos dos conceitos aprendidos.
 */
public class Exemplos {
    
    public static void main(String[] args) {
        System.out.println("=== EXEMPLOS AULA 6 ===");
        System.out.println();
        
        // Exemplo 1: Métodos básicos
        System.out.println("Exemplo 1: Métodos Básicos");
        saudacao();
        int resultado = soma(10, 5);
        System.out.println("Soma: " + resultado);
        double media = calcularMedia(8.5, 7.0, 9.0);
        System.out.println("Média: " + media);
        System.out.println();
        
        // Exemplo 2: Sobrecarga de métodos
        System.out.println("Exemplo 2: Sobrecarga de Métodos");
        System.out.println("Soma de 2 números: " + somar(5, 3));
        System.out.println("Soma de 3 números: " + somar(5, 3, 2));
        System.out.println("Soma de doubles: " + somar(5.5, 3.3));
        System.out.println();
        
        // Exemplo 3: Métodos com validação
        System.out.println("Exemplo 3: Métodos com Validação");
        verificarIdade(25);
        verificarIdade(15);
        verificarIdade(65);
        System.out.println();
        
        // Exemplo 4: Métodos que retornam boolean
        System.out.println("Exemplo 4: Métodos Boolean");
        System.out.println("15 é par? " + ehPar(15));
        System.out.println("20 é par? " + ehPar(20));
        System.out.println("7 é primo? " + ehPrimo(7));
        System.out.println("10 é primo? " + ehPrimo(10));
        System.out.println();
        
        // Exemplo 5: Métodos com arrays
        System.out.println("Exemplo 5: Métodos com Arrays");
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("Maior valor: " + encontrarMaior(numeros));
        System.out.println("Média dos valores: " + calcularMediaArray(numeros));
        System.out.println();
        
        // Exemplo 6: Métodos recursivos
        System.out.println("Exemplo 6: Métodos Recursivos");
        System.out.println("Fatorial de 5: " + fatorial(5));
        System.out.println("Fibonacci de 8: " + fibonacci(8));
        System.out.println();
        
        System.out.println("Todos os exemplos foram executados com sucesso!");
    }
    
    // Método sem retorno (void)
    public static void saudacao() {
        System.out.println("Olá! Bem-vindo ao curso de Java!");
    }
    
    // Método com retorno
    public static int soma(int a, int b) {
        return a + b;
    }
    
    // Método com múltiplos parâmetros
    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
    
    // Sobrecarga de métodos
    public static int somar(int a, int b) {
        return a + b;
    }
    
    public static int somar(int a, int b, int c) {
        return a + b + c;
    }
    
    public static double somar(double a, double b) {
        return a + b;
    }
    
    // Método com validação
    public static void verificarIdade(int idade) {
        if (idade >= 0 && idade <= 12) {
            System.out.println("Idade " + idade + ": Criança");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Idade " + idade + ": Adolescente");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Idade " + idade + ": Adulto");
        } else if (idade >= 60) {
            System.out.println("Idade " + idade + ": Idoso");
        } else {
            System.out.println("Idade inválida!");
        }
    }
    
    // Métodos que retornam boolean
    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }
    
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) return false;
        if (numero <= 3) return true;
        if (numero % 2 == 0 || numero % 3 == 0) return false;
        
        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    
    // Métodos com arrays
    public static int encontrarMaior(int[] numeros) {
        if (numeros.length == 0) return 0;
        
        int maior = numeros[0];
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        return maior;
    }
    
    public static double calcularMediaArray(int[] numeros) {
        if (numeros.length == 0) return 0;
        
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return (double) soma / numeros.length;
    }
    
    // Métodos recursivos
    public static int fatorial(int n) {
        if (n <= 1) return 1;
        return n * fatorial(n - 1);
    }
    
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
} 