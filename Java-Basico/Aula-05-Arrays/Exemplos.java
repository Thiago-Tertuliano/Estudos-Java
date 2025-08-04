/**
 * Aula 5: Arrays
 * Exemplos Práticos
 * 
 * Este arquivo contém exemplos práticos dos conceitos aprendidos.
 */
public class Exemplos {
    
    public static void main(String[] args) {
        System.out.println("=== EXEMPLOS AULA 5 ===");
        System.out.println();
        
        // Exemplo 1: Array de Números
        System.out.println("Exemplo 1: Array de Números");
        int[] numeros = {10, 20, 30, 40, 50};
        
        System.out.println("Elementos do array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }
        System.out.println();
        
        // Exemplo 2: Array de Strings
        System.out.println("Exemplo 2: Array de Strings");
        String[] frutas = {"maçã", "banana", "laranja", "uva", "morango"};
        
        System.out.println("Lista de frutas:");
        for (String fruta : frutas) {
            System.out.println("- " + fruta);
        }
        System.out.println();
        
        // Exemplo 3: Lista de Notas
        System.out.println("Exemplo 3: Lista de Notas");
        double[] notas = {8.5, 7.0, 9.5, 6.5, 8.0};
        
        System.out.println("Notas dos alunos:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Aluno " + (i+1) + ": " + notas[i]);
        }
        
        // Calculando a média
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.length;
        
        System.out.println("Média da turma: " + media);
        System.out.println();
        
        // Exemplo 4: Busca em Array
        System.out.println("Exemplo 4: Busca em Array");
        int[] valores = {10, 25, 30, 45, 50};
        int valorProcurado = 30;
        boolean encontrado = false;
        
        for (int valor : valores) {
            if (valor == valorProcurado) {
                encontrado = true;
                break;
            }
        }
        
        if (encontrado) {
            System.out.println("Valor " + valorProcurado + " encontrado!");
        } else {
            System.out.println("Valor " + valorProcurado + " não encontrado!");
        }
        System.out.println();
        
        // Exemplo 5: Maior e Menor Valor
        System.out.println("Exemplo 5: Maior e Menor Valor");
        int[] numeros2 = {15, 8, 23, 4, 12, 19, 7};
        
        int maior = numeros2[0];
        int menor = numeros2[0];
        
        for (int numero : numeros2) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        
        System.out.println("Array: " + java.util.Arrays.toString(numeros2));
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println();
        
        // Exemplo 6: Matriz 2D
        System.out.println("Exemplo 6: Matriz 2D");
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Matriz 3x3:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        // Exemplo 7: Soma de Matrizes
        System.out.println("Exemplo 7: Soma de Matrizes");
        int[][] matrizA = {{1, 2}, {3, 4}};
        int[][] matrizB = {{5, 6}, {7, 8}};
        int[][] matrizSoma = new int[2][2];
        
        // Calculando a soma
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        
        System.out.println("Matriz A:");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Matriz B:");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Soma das matrizes:");
        for (int i = 0; i < matrizSoma.length; i++) {
            for (int j = 0; j < matrizSoma[i].length; j++) {
                System.out.print(matrizSoma[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        // Exemplo 8: Array com Valores Padrão
        System.out.println("Exemplo 8: Array com Valores Padrão");
        int[] arrayVazio = new int[5];
        
        System.out.println("Array inicializado com valores padrão:");
        for (int i = 0; i < arrayVazio.length; i++) {
            System.out.println("Índice " + i + ": " + arrayVazio[i]);
        }
        System.out.println();
        
        System.out.println("Todos os exemplos foram executados com sucesso!");
    }
} 