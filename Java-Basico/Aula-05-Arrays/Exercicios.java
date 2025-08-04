/**
 * Aula 5: Arrays
 * Exercícios Práticos
 * 
 * Resolva os exercícios abaixo para praticar os conceitos aprendidos.
 */
public class Exercicios {
    
    public static void main(String[] args) {
        System.out.println("=== EXERCÍCIOS AULA 5 ===");
        System.out.println();
        
        // Exercício 1: Média de Notas
        System.out.println("Exercício 1: Média de Notas");
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
        
        // Encontrando maior e menor nota
        double maiorNota = notas[0];
        double menorNota = notas[0];
        
        for (double nota : notas) {
            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }
        }
        
        System.out.println("Média da turma: " + media);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
        System.out.println();
        
        // Exercício 2: Inversão de Array
        System.out.println("Exercício 2: Inversão de Array");
        int[] numeros = {1, 2, 3, 4, 5};
        int[] numerosInvertidos = new int[numeros.length];
        
        System.out.println("Array original: " + java.util.Arrays.toString(numeros));
        
        // Invertendo o array
        for (int i = 0; i < numeros.length; i++) {
            numerosInvertidos[i] = numeros[numeros.length - 1 - i];
        }
        
        System.out.println("Array invertido: " + java.util.Arrays.toString(numerosInvertidos));
        System.out.println();
        
        // Exercício 3: Soma de Matrizes
        System.out.println("Exercício 3: Soma de Matrizes");
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
        
        // Exercício 4: Busca de Nome
        System.out.println("Exercício 4: Busca de Nome");
        String[] nomes = {"João", "Maria", "Pedro", "Ana", "Carlos"};
        String nomeProcurado = "Ana";
        boolean nomeEncontrado = false;
        
        System.out.println("Lista de nomes: " + java.util.Arrays.toString(nomes));
        System.out.println("Nome procurado: " + nomeProcurado);
        
        for (String nome : nomes) {
            if (nome.equals(nomeProcurado)) {
                nomeEncontrado = true;
                break;
            }
        }
        
        if (nomeEncontrado) {
            System.out.println("Nome encontrado!");
        } else {
            System.out.println("Nome não encontrado!");
        }
        System.out.println();
        
        // Exercício 5: Estatísticas de Array
        System.out.println("Exercício 5: Estatísticas de Array");
        int[] numeros2 = {15, 8, 23, 4, 12, 19, 7, 30, 11, 6};
        
        System.out.println("Array: " + java.util.Arrays.toString(numeros2));
        
        // Calculando soma e média
        int soma2 = 0;
        for (int numero : numeros2) {
            soma2 += numero;
        }
        double media2 = (double) soma2 / numeros2.length;
        
        // Encontrando maior e menor
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
        
        // Contando pares e ímpares
        int pares = 0;
        int impares = 0;
        
        for (int numero : numeros2) {
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        
        System.out.println("Soma: " + soma2);
        System.out.println("Média: " + media2);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);
        System.out.println();
        
        System.out.println("Parabéns! Você completou os exercícios da Aula 5!");
    }
} 