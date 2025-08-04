/**
 * Aula 1: Introdução ao Java
 * Exemplo: Hello World
 * 
 * Este é o primeiro programa que todo programador Java escreve.
 * Demonstra a estrutura básica de um programa Java.
 */
public class HelloWorld {
    
    /**
     * Método principal - ponto de entrada do programa
     * @param args argumentos da linha de comando (não utilizados neste exemplo)
     */
    public static void main(String[] args) {
        // Imprimindo mensagens no console
        System.out.println("Olá, mundo!");
        System.out.println("Bem-vindo ao Java!");
        System.out.println("Este é meu primeiro programa Java!");
        
        // Imprimindo uma linha em branco
        System.out.println();
        
        // Imprimindo informações sobre o programa
        System.out.println("Programa criado por: [Seu Nome]");
        System.out.println("Data: " + java.time.LocalDate.now());
    }
} 