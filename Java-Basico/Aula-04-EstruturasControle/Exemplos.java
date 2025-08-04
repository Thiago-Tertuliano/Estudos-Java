/**
 * Aula 4: Estruturas de Controle
 * Exemplos Práticos
 * 
 * Este arquivo contém exemplos práticos dos conceitos aprendidos.
 */
public class Exemplos {
    
    public static void main(String[] args) {
        System.out.println("=== EXEMPLOS AULA 4 ===");
        System.out.println();
        
        // Exemplo 1: Verificador de Notas
        System.out.println("Exemplo 1: Verificador de Notas");
        double nota = 8.5;
        
        if (nota >= 9.0) {
            System.out.println("Nota: " + nota + " - Excelente!");
        } else if (nota >= 7.0) {
            System.out.println("Nota: " + nota + " - Bom!");
        } else if (nota >= 5.0) {
            System.out.println("Nota: " + nota + " - Regular!");
        } else {
            System.out.println("Nota: " + nota + " - Reprovado!");
        }
        System.out.println();
        
        // Exemplo 2: Calculadora com Switch
        System.out.println("Exemplo 2: Calculadora com Switch");
        char operacao = '+';
        int a = 10;
        int b = 5;
        int resultado = 0;
        
        switch (operacao) {
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                resultado = a / b;
                break;
            default:
                System.out.println("Operação inválida!");
                return;
        }
        
        System.out.println(a + " " + operacao + " " + b + " = " + resultado);
        System.out.println();
        
        // Exemplo 3: Tabuada com For
        System.out.println("Exemplo 3: Tabuada com For");
        int numero = 7;
        
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        System.out.println();
        
        // Exemplo 4: Contador com While
        System.out.println("Exemplo 4: Contador com While");
        int contador = 1;
        
        System.out.println("Contando de 1 a 10:");
        while (contador <= 10) {
            System.out.println("Número: " + contador);
            contador++;
        }
        System.out.println();
        
        // Exemplo 5: Do-While
        System.out.println("Exemplo 5: Do-While");
        int valor = 0;
        
        System.out.println("Usando do-while:");
        do {
            System.out.println("Valor: " + valor);
            valor++;
        } while (valor < 5);
        System.out.println();
        
        // Exemplo 6: Break
        System.out.println("Exemplo 6: Break");
        System.out.println("Números de 1 a 10 (parando no 5):");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        
        // Exemplo 7: Continue
        System.out.println("Exemplo 7: Continue");
        System.out.println("Números de 1 a 10 (pulando o 5):");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        
        // Exemplo 8: Verificador de Idade
        System.out.println("Exemplo 8: Verificador de Idade");
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
        
        System.out.println("Todos os exemplos foram executados com sucesso!");
    }
} 