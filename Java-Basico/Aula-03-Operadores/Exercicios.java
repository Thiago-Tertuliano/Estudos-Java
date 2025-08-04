/**
 * Aula 3: Operadores
 * Exercícios Práticos
 * 
 * Resolva os exercícios abaixo para praticar os conceitos aprendidos.
 */
public class Exercicios {
    
    public static void main(String[] args) {
        System.out.println("=== EXERCÍCIOS AULA 3 ===");
        System.out.println();
        
        // Exercício 1: Calculadora de Média
        System.out.println("Exercício 1: Calculadora de Média");
        double nota1 = 8.5;
        double nota2 = 7.0;
        double nota3 = 9.0;
        
        double mediaPonderada = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
        boolean aprovado = mediaPonderada >= 7.0;
        
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Média ponderada: " + mediaPonderada);
        System.out.println("Aprovado: " + aprovado);
        System.out.println();
        
        // Exercício 2: Verificador de Números
        System.out.println("Exercício 2: Verificador de Números");
        int numero = 15;
        
        boolean ehPar = numero % 2 == 0;
        boolean ehPositivo = numero > 0;
        boolean ehNegativo = numero < 0;
        boolean ehZero = numero == 0;
        boolean ehMultiploDe3 = numero % 3 == 0;
        boolean ehMultiploDe5 = numero % 5 == 0;
        boolean ehMultiploDe3E5 = ehMultiploDe3 && ehMultiploDe5;
        
        System.out.println("Número: " + numero);
        System.out.println("É par: " + ehPar);
        System.out.println("É positivo: " + ehPositivo);
        System.out.println("É negativo: " + ehNegativo);
        System.out.println("É zero: " + ehZero);
        System.out.println("É múltiplo de 3: " + ehMultiploDe3);
        System.out.println("É múltiplo de 5: " + ehMultiploDe5);
        System.out.println("É múltiplo de 3 e 5: " + ehMultiploDe3E5);
        System.out.println();
        
        // Exercício 3: Calculadora de Desconto
        System.out.println("Exercício 3: Calculadora de Desconto");
        double precoOriginal = 100.0;
        double percentualDesconto = 15.0; // 15%
        
        boolean descontoValido = percentualDesconto >= 0 && percentualDesconto <= 100;
        double valorDesconto = precoOriginal * (percentualDesconto / 100);
        double precoFinal = precoOriginal - valorDesconto;
        
        System.out.println("Preço original: R$ " + precoOriginal);
        System.out.println("Percentual de desconto: " + percentualDesconto + "%");
        System.out.println("Desconto válido: " + descontoValido);
        System.out.println("Valor do desconto: R$ " + valorDesconto);
        System.out.println("Preço final: R$ " + precoFinal);
        System.out.println();
        
        // Exercício 4: Calculadora de Idade
        System.out.println("Exercício 4: Calculadora de Idade");
        int anoNascimento = 1990;
        int anoAtual = 2024;
        int idade = anoAtual - anoNascimento;
        
        boolean ehMaiorIdade = idade >= 18;
        boolean podeVotar = idade >= 16;
        boolean podeDirigir = idade >= 18;
        boolean ehIdoso = idade >= 60;
        
        System.out.println("Ano de nascimento: " + anoNascimento);
        System.out.println("Ano atual: " + anoAtual);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("É maior de idade: " + ehMaiorIdade);
        System.out.println("Pode votar: " + podeVotar);
        System.out.println("Pode dirigir: " + podeDirigir);
        System.out.println("É idoso: " + ehIdoso);
        System.out.println();
        
        // Exercício 5: Verificador de Senha
        System.out.println("Exercício 5: Verificador de Senha");
        String senha = "abc123";
        int tamanhoSenha = senha.length();
        
        boolean tamanhoValido = tamanhoSenha >= 6;
        boolean contemLetras = senha.matches(".*[a-zA-Z].*");
        boolean contemNumeros = senha.matches(".*\\d.*");
        boolean senhaValida = tamanhoValido && contemLetras && contemNumeros;
        
        System.out.println("Senha: " + senha);
        System.out.println("Tamanho da senha: " + tamanhoSenha);
        System.out.println("Tamanho válido (>=6): " + tamanhoValido);
        System.out.println("Contém letras: " + contemLetras);
        System.out.println("Contém números: " + contemNumeros);
        System.out.println("Senha válida: " + senhaValida);
        System.out.println();
        
        System.out.println("Parabéns! Você completou os exercícios da Aula 3!");
    }
} 