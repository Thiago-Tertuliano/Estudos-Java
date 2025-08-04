/**
 * Aula 3: Operadores
 * Exemplos Práticos
 * 
 * Este arquivo contém exemplos práticos dos conceitos aprendidos.
 */
public class Exemplos {
    
    public static void main(String[] args) {
        System.out.println("=== EXEMPLOS AULA 3 ===");
        System.out.println();
        
        // Exemplo 1: Operadores Aritméticos
        System.out.println("Exemplo 1: Operadores Aritméticos");
        int a = 15;
        int b = 4;
        
        System.out.println("A = " + a + ", B = " + b);
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Resto: " + (a % b));
        System.out.println();
        
        // Exemplo 2: Operadores de Incremento/Decremento
        System.out.println("Exemplo 2: Operadores de Incremento/Decremento");
        int x = 5;
        System.out.println("Valor inicial de x: " + x);
        
        int y = ++x;  // Pré-incremento
        System.out.println("Após ++x: x = " + x + ", y = " + y);
        
        int z = x++;  // Pós-incremento
        System.out.println("Após x++: x = " + x + ", z = " + z);
        
        int w = --x;  // Pré-decremento
        System.out.println("Após --x: x = " + x + ", w = " + w);
        System.out.println();
        
        // Exemplo 3: Operadores de Atribuição
        System.out.println("Exemplo 3: Operadores de Atribuição");
        int numero = 10;
        System.out.println("Valor inicial: " + numero);
        
        numero += 5;
        System.out.println("Após += 5: " + numero);
        
        numero -= 3;
        System.out.println("Após -= 3: " + numero);
        
        numero *= 2;
        System.out.println("Após *= 2: " + numero);
        
        numero /= 4;
        System.out.println("Após /= 4: " + numero);
        
        numero %= 4;
        System.out.println("Após %= 4: " + numero);
        System.out.println();
        
        // Exemplo 4: Operadores de Comparação
        System.out.println("Exemplo 4: Operadores de Comparação");
        int valor1 = 10;
        int valor2 = 5;
        
        System.out.println("Valor1 = " + valor1 + ", Valor2 = " + valor2);
        System.out.println("Valor1 == Valor2: " + (valor1 == valor2));
        System.out.println("Valor1 != Valor2: " + (valor1 != valor2));
        System.out.println("Valor1 > Valor2: " + (valor1 > valor2));
        System.out.println("Valor1 < Valor2: " + (valor1 < valor2));
        System.out.println("Valor1 >= Valor2: " + (valor1 >= valor2));
        System.out.println("Valor1 <= Valor2: " + (valor1 <= valor2));
        System.out.println();
        
        // Exemplo 5: Operadores Lógicos
        System.out.println("Exemplo 5: Operadores Lógicos");
        boolean x1 = true;
        boolean y1 = false;
        
        System.out.println("x = " + x1 + ", y = " + y1);
        System.out.println("x && y: " + (x1 && y1));
        System.out.println("x || y: " + (x1 || y1));
        System.out.println("!x: " + (!x1));
        System.out.println("!y: " + (!y1));
        System.out.println();
        
        // Exemplo 6: Verificação de Idade
        System.out.println("Exemplo 6: Verificação de Idade");
        int idade = 18;
        boolean temDocumento = true;
        
        boolean podeVotar = idade >= 16 && temDocumento;
        boolean podeDirigir = idade >= 18;
        boolean ehMenor = idade < 18;
        
        System.out.println("Idade: " + idade);
        System.out.println("Tem documento: " + temDocumento);
        System.out.println("Pode votar: " + podeVotar);
        System.out.println("Pode dirigir: " + podeDirigir);
        System.out.println("É menor de idade: " + ehMenor);
        System.out.println();
        
        // Exemplo 7: Precedência de Operadores
        System.out.println("Exemplo 7: Precedência de Operadores");
        int resultado1 = 2 + 3 * 4;
        int resultado2 = (2 + 3) * 4;
        
        System.out.println("2 + 3 * 4 = " + resultado1);
        System.out.println("(2 + 3) * 4 = " + resultado2);
        System.out.println();
        
        System.out.println("Todos os exemplos foram executados com sucesso!");
    }
} 