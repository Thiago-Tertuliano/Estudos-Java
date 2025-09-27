/**
 * Classe para testar os cálculos da Calculadora de IMC
 * 
 * Esta classe demonstra como usar os métodos de cálculo
 * sem interface gráfica, útil para testes unitários.
 */
public class ExemploTestes {
    
      /**
       * Calcula o IMC baseado no peso e altura
       */
      public static double calcularIMC(double peso, double altura) {
          if (peso <= 0 || altura <= 0) {
              throw new IllegalArgumentException("Peso e altura devem ser positivos");
          }
          return peso / (altura * altura);
      }
      
      /**
       * Retorna a classificação do IMC
       */
      public static String obterClassificacao(double imc) {
          if (imc < 18.5) {
              return "Abaixo do peso";
          } else if (imc < 25.0) {
              return "Peso normal";
          } else if (imc < 30.0) {
              return "Sobrepeso";
          } else if (imc < 35.0) {
              return "Obesidade grau I";
          } else if (imc < 40.0) {
              return "Obesidade grau II";
          } else {
              return "Obesidade grau III (mórbida)";
          }
      }
      
      /**
       * Método principal para executar os testes
       */
      public static void main(String[] args) {
          System.out.println("=== TESTES DA CALCULADORA DE IMC ===\n");
          
          // Casos de teste
          double[][] casosTeste = {
              {60.0, 1.70, 20.8},   // Peso normal
              {80.0, 1.75, 26.1},   // Sobrepeso
              {50.0, 1.65, 18.4},   // Abaixo do peso
              {95.0, 1.80, 29.3},   // Sobrepeso
              {110.0, 1.70, 38.1},  // Obesidade grau II
              {70.0, 1.75, 22.9}    // Peso normal
          };
          
          for (int i = 0; i < casosTeste.length; i++) {
              double peso = casosTeste[i][0];
              double altura = casosTeste[i][1];
              double imcEsperado = casosTeste[i][2];
              
              double imcCalculado = calcularIMC(peso, altura);
              String classificacao = obterClassificacao(imcCalculado);
              
              System.out.printf("Teste %d:\n", i + 1);
              System.out.printf("  Peso: %.1f kg\n", peso);
              System.out.printf("  Altura: %.2f m\n", altura);
              System.out.printf("  IMC calculado: %.1f\n", imcCalculado);
              System.out.printf("  IMC esperado: %.1f\n", imcEsperado);
              System.out.printf("  Classificação: %s\n", classificacao);
              System.out.printf("  Status: %s\n\n", 
                  Math.abs(imcCalculado - imcEsperado) < 0.1 ? "✅ PASSOU" : "❌ FALHOU");
          }
          
          // Teste de erro
          System.out.println("=== TESTE DE VALIDAÇÃO ===");
          try {
              calcularIMC(-10, 1.70);
              System.out.println("❌ FALHOU - Deveria ter lançado exceção");
          } catch (IllegalArgumentException e) {
              System.out.println("✅ PASSOU - Exceção lançada corretamente: " + e.getMessage());
          }
      }
  }