/**
 * Aula 2: Variáveis e Tipos de Dados
 * Exercícios Práticos
 * 
 * Resolva os exercícios abaixo para praticar os conceitos aprendidos.
 */
public class Exercicios {
    
    public static void main(String[] args) {
        System.out.println("=== EXERCÍCIOS AULA 2 ===");
        System.out.println();
        
        // Exercício 1: Calculadora de IMC
        System.out.println("Exercício 1: Calculadora de IMC");
        double peso = 70.5;
        double altura = 1.75;
        double imc = peso / (altura * altura);
        
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("IMC: " + imc);
        System.out.println();
        
        // Exercício 2: Conversor de Temperatura
        System.out.println("Exercício 2: Conversor de Temperatura");
        double celsius = 25.0;
        double fahrenheit = celsius * 9/5 + 32;
        
        System.out.println("Temperatura em Celsius: " + celsius + "°C");
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + "°F");
        System.out.println();
        
        // Exercício 3: Calculadora de Juros
        System.out.println("Exercício 3: Calculadora de Juros");
        double capital = 1000.0;
        double taxa = 0.05; // 5% ao mês
        int tempo = 12; // 12 meses
        double montante = capital * (1 + taxa * tempo);
        double juros = montante - capital;
        
        System.out.println("Capital inicial: R$ " + capital);
        System.out.println("Taxa de juros: " + (taxa * 100) + "% ao mês");
        System.out.println("Tempo: " + tempo + " meses");
        System.out.println("Juros: R$ " + juros);
        System.out.println("Montante final: R$ " + montante);
        System.out.println();
        
        // Exercício 4: Calculadora de Área e Perímetro
        System.out.println("Exercício 4: Calculadora de Área e Perímetro");
        double comprimento = 10.0;
        double largura = 5.0;
        double area = comprimento * largura;
        double perimetro = 2 * (comprimento + largura);
        
        System.out.println("Comprimento: " + comprimento + " metros");
        System.out.println("Largura: " + largura + " metros");
        System.out.println("Área: " + area + " metros quadrados");
        System.out.println("Perímetro: " + perimetro + " metros");
        System.out.println();
        
        // Exercício 5: Conversor de Moeda
        System.out.println("Exercício 5: Conversor de Moeda");
        double reais = 100.0;
        double cotacaoDolar = 5.0; // R$ 5,00 = US$ 1,00
        double dolares = reais / cotacaoDolar;
        
        System.out.println("Valor em Reais: R$ " + reais);
        System.out.println("Cotação do Dólar: R$ " + cotacaoDolar);
        System.out.println("Valor em Dólares: US$ " + dolares);
        System.out.println();
        
        System.out.println("Parabéns! Você completou os exercícios da Aula 2!");
    }
} 