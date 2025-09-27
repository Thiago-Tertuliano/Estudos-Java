import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Calculadora de IMC (Índice de Massa Corporal)
 * 
 * Esta aplicação permite calcular o IMC baseado no peso e altura do usuário
 * e fornece uma classificação do resultado.
 * 
 * @author Thiago Matos Tertuliano
 */

public class CalculadoraIMC extends JFrame {

      // Componentes da interface
      private JTextField campoPeso;
      private JTextField campoAltura;
      private JLabel labelResultado;
      private JLabel labelClassificacao;
      private JButton botaoCalcular;
      private JButton botaoLimpar;

      // Construtor
      public CalculadoraIMC() {
            inicializarInterface();
            configurarEventos();
      }

      /**
       * Inicializa todos os componentes da interface
       */
      private void inicializarInterface() {
            setTitle("Calculadora de IMC");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new BorderLayout());
            setSize(450, 350);
            setLocationRelativeTo(null);
            setResizable(false);

            // Painel principal
            JPanel painelPrincipal = new JPanel(new GridBagLayout());
            painelPrincipal.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
            painelPrincipal.setBackground(new Color(240, 240, 240));

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(15, 15, 15, 15);

            // Título
            JLabel titulo = new JLabel("Calculadora de IMC");
            titulo.setFont(new Font("Arial", Font.BOLD, 24));
            titulo.setForeground(new Color(25, 25, 112));
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.gridwidth = 2;
            gbc.anchor = GridBagConstraints.CENTER;
            painelPrincipal.add(titulo, gbc);

            // Campo Peso
            gbc.gridwidth = 1;
            gbc.anchor = GridBagConstraints.WEST;
            gbc.gridy = 1;
            gbc.gridx = 0;
            JLabel labelPeso = new JLabel("Peso (kg):");
            labelPeso.setFont(new Font("Arial", Font.PLAIN, 14));
            painelPrincipal.add(labelPeso, gbc);

            gbc.gridx = 1;
            campoPeso = new JTextField(15);
            campoPeso.setFont(new Font("Arial", Font.PLAIN, 14));
            campoPeso.setPreferredSize(new Dimension(150, 30));
            campoPeso.setBackground(Color.WHITE);
            campoPeso.setForeground(Color.BLACK);
            campoPeso.setCaretColor(Color.BLACK);
            campoPeso.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
            campoPeso.setToolTipText("Digite seu peso em quilogramas (ex: 70.5)");
            painelPrincipal.add(campoPeso, gbc);

            // Campo Altura
            gbc.gridy = 2;
            gbc.gridx = 0;
            JLabel labelAltura = new JLabel("Altura (m):");
            labelAltura.setFont(new Font("Arial", Font.PLAIN, 14));
            painelPrincipal.add(labelAltura, gbc);

            gbc.gridx = 1;
            campoAltura = new JTextField(15);
            campoAltura.setFont(new Font("Arial", Font.PLAIN, 14));
            campoAltura.setPreferredSize(new Dimension(150, 30));
            campoAltura.setBackground(Color.WHITE);
            campoAltura.setForeground(Color.BLACK);
            campoAltura.setCaretColor(Color.BLACK);
            campoAltura.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
            campoAltura.setToolTipText("Digite sua altura em metros (ex: 1.75)");
            painelPrincipal.add(campoAltura, gbc);

            // Botões
            gbc.gridy = 3;
            gbc.gridx = 0;
            botaoCalcular = new JButton("Calcular IMC");
            botaoCalcular.setFont(new Font("Arial", Font.PLAIN, 14));
            botaoCalcular.setBackground(new Color(0, 100, 200));
            botaoCalcular.setForeground(Color.WHITE);
            botaoCalcular.setPreferredSize(new Dimension(140, 40));
            painelPrincipal.add(botaoCalcular, gbc);

            gbc.gridx = 1;
            botaoLimpar = new JButton("Limpar");
            botaoLimpar.setFont(new Font("Arial", Font.PLAIN, 14));
            botaoLimpar.setBackground(new Color(200, 100, 0));
            botaoLimpar.setForeground(Color.WHITE);
            botaoLimpar.setPreferredSize(new Dimension(140, 40));
            painelPrincipal.add(botaoLimpar, gbc);

            // Resultado
            gbc.gridy = 4;
            gbc.gridx = 0;
            gbc.gridwidth = 2;
            gbc.anchor = GridBagConstraints.CENTER;
            labelResultado = new JLabel("");
            labelResultado.setFont(new Font("Arial", Font.BOLD, 16));
            labelResultado.setForeground(new Color(25, 25, 112));
            painelPrincipal.add(labelResultado, gbc);

            // Classificação
            gbc.gridy = 5;
            labelClassificacao = new JLabel("");
            labelClassificacao.setFont(new Font("Arial", Font.PLAIN, 14));
            painelPrincipal.add(labelClassificacao, gbc);

            add(painelPrincipal, BorderLayout.CENTER);
      }

      /**
       * Configura os eventos dos botões
       */
      private void configurarEventos() {
            botaoCalcular.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        calcularIMC();
                  }
            });

            botaoLimpar.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        limparCampos();
                  }
            });

            // Permitir calcular pressionando Enter
            campoPeso.addActionListener(event -> calcularIMC());
            campoAltura.addActionListener(event -> calcularIMC());
      }

      /**
       * Calcular o IMC e exibe o resultado
       */
      private void calcularIMC() {
            try {
                  double peso = Double.parseDouble(campoPeso.getText().replace(",", "."));
                  double altura = Double.parseDouble(campoAltura.getText().replace(",", "."));

                  if (peso <= 0 || altura <= 0) {
                        JOptionPane.showMessageDialog(this, "Por favor, insira valores válidos para peso e altura.",
                                    "Erro", JOptionPane.ERROR_MESSAGE);
                        return;
                  }

                  if (altura > 3.0) {
                        JOptionPane.showMessageDialog(this,
                                    "Altura parece estar em centímetros. Por favor, insira em metros (ex: 1.75).",
                                    "Aviso", JOptionPane.WARNING_MESSAGE);
                        return;
                  }

                  double imc = peso / (altura * altura);
                  String classificacao = obterClassificacao(imc);
                  Color corClassificacao = obterCorClassificacao(imc);

                  labelResultado.setText(String.format("IMC: %.1f", imc));
                  labelClassificacao.setText(classificacao);
                  labelClassificacao.setForeground(corClassificacao);

            } catch (NumberFormatException ex) {
                  JOptionPane.showMessageDialog(this, "Por favor, insira valores numéricos válidos para peso e altura.",
                              "Erro de Formato", JOptionPane.ERROR_MESSAGE);
            }
      }

      /**
       * Retorna a classificação do IMC
       */
      private String obterClassificacao(double imc) {
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
                  return "Obesidade grau III";
            }
      }

      /**
       * Retorna a cor baseada na classificação do IMC
       */
      private Color obterCorClassificacao(double imc) {
            if (imc < 18.5) {
                  return new Color(255, 165, 0);
            } else if (imc < 25.0) {
                  return new Color(0, 128, 0);
            } else if (imc < 30.0) {
                  return new Color(255, 140, 0);
            } else {
                  return new Color(220, 20, 60);
            }
      }

      /**
       * Limpa todos os campos da interface
       */
      private void limparCampos() {
            campoPeso.setText("");
            campoAltura.setText("");
            labelResultado.setText("");
            labelClassificacao.setText("");
            campoPeso.requestFocus();
      }

      /**
       * Método principal para executar a aplicação
       */
      public static void main(String[] args) {
            // Define o Look and Feel do sistema
            // Usar Look and Feel padrão do sistema (opcional)
            // Este bloco pode ser removido se causar problemas de compilação

            // Executa a aplicação na EDT (Event Dispatch Thread)
            SwingUtilities.invokeLater(new Runnable() {
                  @Override
                  public void run() {
                        new CalculadoraIMC().setVisible(true);
                  }
            });
      }
}