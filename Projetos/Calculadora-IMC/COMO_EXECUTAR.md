# Como Executar a Calculadora de IMC

## Pré-requisitos

- Java JDK instalado (versão 8 ou superior)
- Terminal/Command Prompt

## Passos para executar

### 1. Navegar para o diretório

```bash
cd "Estudos-Java/Projetos/Calculadora-IMC"
```

### 2. Compilar o programa

```bash
javac CalculadoraIMC.java
```

### 3. Executar a aplicação

```bash
java CalculadoraIMC
```

## Como usar a calculadora

1. **Digite o peso** em quilogramas (kg) - exemplo: 70
2. **Digite a altura** em metros (m) - exemplo: 1.75
3. **Clique em "Calcular IMC"** ou pressione Enter
4. **Veja o resultado** com a classificação correspondente
5. **Use "Limpar"** para resetar os campos

## Classificações do IMC

| IMC         | Classificação  | Cor               |
| ----------- | -------------- | ----------------- |
| < 18,5      | Abaixo do peso | 🟠 Laranja        |
| 18,5 - 24,9 | Peso normal    | 🟢 Verde          |
| 25,0 - 29,9 | Sobrepeso      | 🟠 Laranja escuro |
| ≥ 30,0      | Obesidade      | 🔴 Vermelho       |

## Funcionalidades

✅ Interface gráfica intuitiva
✅ Validação de dados
✅ Suporte para vírgula e ponto decimal
✅ Classificação com cores
✅ Aviso para altura em centímetros
✅ Tratamento de erros

## Exemplo de uso

- **Entrada:** Peso: 70kg, Altura: 1.75m
- **Resultado:** IMC: 22.9 (Peso normal)

---

**Autor:** Thiago Matos Tertuliano
