# Calculadora de IMC

Uma aplicação Java com interface gráfica para calcular o Índice de Massa Corporal (IMC).

## O que é o IMC?

O IMC (Índice de Massa Corporal) é uma medida usada para avaliar se uma pessoa está com peso adequado em relação à sua altura. É calculado pela fórmula:

**IMC = Peso (kg) / (Altura (m))²**

## Classificação do IMC

| IMC | Classificação |
|-----|---------------|
| < 18,5 | Abaixo do peso |
| 18,5 - 24,9 | Peso normal |
| 25,0 - 29,9 | Sobrepeso |
| 30,0 - 34,9 | Obesidade grau I |
| 35,0 - 39,9 | Obesidade grau II |
| ≥ 40,0 | Obesidade grau III (mórbida) |

## Como usar

1. **Compile o programa:**
   ```bash
   javac CalculadoraIMC.java
   ```

2. **Execute a aplicação:**
   ```bash
   java CalculadoraIMC
   ```

3. **Insira os dados:**
   - Digite seu peso em quilogramas (kg)
   - Digite sua altura em metros (m) - ex: 1.75 para 1 metro e 75 centímetros

4. **Calcule:**
   - Clique no botão "Calcular IMC" ou pressione Enter
   - Veja seu IMC e a classificação correspondente

## Funcionalidades

- ✅ Interface gráfica intuitiva
- ✅ Validação de entrada de dados
- ✅ Cálculo automático do IMC
- ✅ Classificação com cores indicativas
- ✅ Botão para limpar campos
- ✅ Suporte para vírgula e ponto decimal
- ✅ Aviso para altura em centímetros
- ✅ Tratamento de erros

## Tecnologias utilizadas

- **Java Swing** - Interface gráfica
- **Java AWT** - Componentes visuais
- **GridBagLayout** - Layout responsivo

## Exemplo de uso

- **Peso:** 70 kg
- **Altura:** 1.75 m
- **Resultado:** IMC = 22.9 (Peso normal)

## Importante

⚠️ **Atenção:** O IMC é uma ferramenta de triagem e não deve ser usado como diagnóstico médico. Consulte sempre um profissional de saúde para uma avaliação completa.

## Estrutura do código

- `CalculadoraIMC` - Classe principal com interface gráfica
- `calcularIMC()` - Método para calcular o IMC
- `obterClassificacao()` - Método para classificar o resultado
- `obterCorClassificacao()` - Método para definir cores
- `limparCampos()` - Método para resetar a interface

## Autor

Thiago Tertuliano