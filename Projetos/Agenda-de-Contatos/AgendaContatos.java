import java.io.*;
import java.util.*;

/**
 * Sistema de Agenda de Contatos
 * CRUD simples no terminal com persistência em arquivo .txt
 * 
 * @author Thiago Tertuliano
 * @version 1.0
 */
public class AgendaContatos {

      private static final String ARQUIVO_CONTATOS = "contatos.txt";
      private static List<Contato> contatos = new ArrayList<>();
      private static Scanner scanner = new Scanner(System.in);

      public static void main(String[] args) {
            carregarContatos();
            exibirMenu();
      }

      /**
       * Exibe o menu principal da agenda
       */
      private static void exibirMenu() {
            int opcao;

            do {
                  System.out.println("\n" + "=".repeat(50));
                  System.out.println("        📒 AGENDA DE CONTATOS 📒");
                  System.out.println("=".repeat(50));
                  System.out.println("1. ➕ Adicionar Contato");
                  System.out.println("2. 📋 Listar Contatos");
                  System.out.println("3. 🔍 Buscar Contato");
                  System.out.println("4. ✏️  Editar Contato");
                  System.out.println("5. 🗑️  Remover Contato");
                  System.out.println("6. 💾 Salvar Contatos");
                  System.out.println("0. 🚪 Sair");
                  System.out.println("=".repeat(50));
                  System.out.print("Escolha uma opção: ");

                  try {
                        opcao = scanner.nextInt();
                        scanner.nextLine(); // Limpar buffer

                        switch (opcao) {
                              case 1:
                                    adicionarContato();
                                    break;
                              case 2:
                                    listarContatos();
                                    break;
                              case 3:
                                    buscarContato();
                                    break;
                              case 4:
                                    editarContato();
                                    break;
                              case 5:
                                    removerContato();
                                    break;
                              case 6:
                                    salvarContatos();
                                    break;
                              case 0:
                                    salvarContatos();
                                    System.out.println("\n👋 Obrigado por usar a Agenda de Contatos!");
                                    break;
                              default:
                                    System.out.println("\n❌ Opção inválida! Tente novamente.");
                        }
                  } catch (InputMismatchException e) {
                        System.out.println("\n❌ Por favor, digite apenas números!");
                        scanner.nextLine(); // Limpar buffer
                        opcao = -1;
                  }

            } while (opcao != 0);
      }

      /**
       * Adiciona um novo contato à agenda
       */
      private static void adicionarContato() {
            System.out.println("\n" + "-".repeat(30));
            System.out.println("➕ ADICIONAR NOVO CONTATO");
            System.out.println("-".repeat(30));

            try {
                  System.out.print("Nome: ");
                  String nome = scanner.nextLine().trim();

                  if (nome.isEmpty()) {
                        System.out.println("❌ Nome não pode estar vazio!");
                        return;
                  }

                  System.out.print("Telefone: ");
                  String telefone = scanner.nextLine().trim();

                  System.out.print("Email: ");
                  String email = scanner.nextLine().trim();

                  // Validações básicas
                  if (telefone.isEmpty() && email.isEmpty()) {
                        System.out.println("❌ Pelo menos telefone ou email deve ser informado!");
                        return;
                  }

                  if (!email.isEmpty() && !isValidEmail(email)) {
                        System.out.println("❌ Email inválido!");
                        return;
                  }

                  Contato novoContato = new Contato(nome, telefone, email);
                  contatos.add(novoContato);

                  System.out.println("\n✅ Contato adicionado com sucesso!");
                  System.out.println("📝 Contato: " + novoContato);

            } catch (Exception e) {
                  System.out.println("❌ Erro ao adicionar contato: " + e.getMessage());
            }
      }

      /**
       * Lista todos os contatos da agenda
       */
      private static void listarContatos() {
            System.out.println("\n" + "-".repeat(50));
            System.out.println("📋 LISTA DE CONTATOS");
            System.out.println("-".repeat(50));

            if (contatos.isEmpty()) {
                  System.out.println("📭 Nenhum contato encontrado na agenda.");
                  return;
            }

            for (int i = 0; i < contatos.size(); i++) {
                  System.out.printf("%d. %s%n", i + 1, contatos.get(i));
            }

            System.out.println("-".repeat(50));
            System.out.printf("📊 Total de contatos: %d%n", contatos.size());
      }

      /**
       * Busca contatos por nome
       */
      private static void buscarContato() {
            System.out.println("\n" + "-".repeat(30));
            System.out.println("🔍 BUSCAR CONTATO");
            System.out.println("-".repeat(30));

            System.out.print("Digite o nome (ou parte dele): ");
            String termo = scanner.nextLine().trim().toLowerCase();

            if (termo.isEmpty()) {
                  System.out.println("❌ Termo de busca não pode estar vazio!");
                  return;
            }

            List<Contato> resultados = new ArrayList<>();

            for (Contato contato : contatos) {
                  if (contato.getNome().toLowerCase().contains(termo)) {
                        resultados.add(contato);
                  }
            }

            System.out.println("\n📋 RESULTADOS DA BUSCA:");
            System.out.println("-".repeat(30));

            if (resultados.isEmpty()) {
                  System.out.println("🔍 Nenhum contato encontrado com o termo: '" + termo + "'");
            } else {
                  for (int i = 0; i < resultados.size(); i++) {
                        System.out.printf("%d. %s%n", i + 1, resultados.get(i));
                  }
                  System.out.println("-".repeat(30));
                  System.out.printf("📊 %d contato(s) encontrado(s)%n", resultados.size());
            }
      }

      /**
       * Edita um contato existente
       */
      private static void editarContato() {
            if (contatos.isEmpty()) {
                  System.out.println("\n📭 Nenhum contato para editar!");
                  return;
            }

            listarContatos();
            System.out.println("\n" + "-".repeat(30));
            System.out.println("✏️ EDITAR CONTATO");
            System.out.println("-".repeat(30));

            System.out.print("Digite o número do contato a ser editado: ");

            try {
                  int indice = scanner.nextInt() - 1;
                  scanner.nextLine(); // Limpar buffer

                  if (indice < 0 || indice >= contatos.size()) {
                        System.out.println("❌ Número inválido!");
                        return;
                  }

                  Contato contato = contatos.get(indice);
                  System.out.println("\n📝 Contato atual: " + contato);
                  System.out.println("\nDigite os novos dados (pressione Enter para manter o atual):");

                  System.out.print("Nome [" + contato.getNome() + "]: ");
                  String novoNome = scanner.nextLine().trim();
                  if (!novoNome.isEmpty()) {
                        contato.setNome(novoNome);
                  }

                  System.out.print("Telefone [" + contato.getTelefone() + "]: ");
                  String novoTelefone = scanner.nextLine().trim();
                  if (!novoTelefone.isEmpty()) {
                        contato.setTelefone(novoTelefone);
                  }

                  System.out.print("Email [" + contato.getEmail() + "]: ");
                  String novoEmail = scanner.nextLine().trim();
                  if (!novoEmail.isEmpty()) {
                        if (!isValidEmail(novoEmail)) {
                              System.out.println("❌ Email inválido! Alteração não realizada.");
                              return;
                        }
                        contato.setEmail(novoEmail);
                  }

                  System.out.println("\n✅ Contato editado com sucesso!");
                  System.out.println("📝 Contato atualizado: " + contato);

            } catch (InputMismatchException e) {
                  System.out.println("❌ Por favor, digite apenas números!");
                  scanner.nextLine(); // Limpar buffer
            }
      }

      /**
       * Remove um contato da agenda
       */
      private static void removerContato() {
            if (contatos.isEmpty()) {
                  System.out.println("\n📭 Nenhum contato para remover!");
                  return;
            }

            listarContatos();
            System.out.println("\n" + "-".repeat(30));
            System.out.println("🗑️ REMOVER CONTATO");
            System.out.println("-".repeat(30));

            System.out.print("Digite o número do contato a ser removido: ");

            try {
                  int indice = scanner.nextInt() - 1;
                  scanner.nextLine(); // Limpar buffer

                  if (indice < 0 || indice >= contatos.size()) {
                        System.out.println("❌ Número inválido!");
                        return;
                  }

                  Contato contatoRemovido = contatos.get(indice);
                  System.out.println("\n⚠️ Contato a ser removido: " + contatoRemovido);
                  System.out.print("Tem certeza? (s/N): ");

                  String confirmacao = scanner.nextLine().trim().toLowerCase();

                  if (confirmacao.equals("s") || confirmacao.equals("sim")) {
                        contatos.remove(indice);
                        System.out.println("✅ Contato removido com sucesso!");
                  } else {
                        System.out.println("❌ Operação cancelada.");
                  }

            } catch (InputMismatchException e) {
                  System.out.println("❌ Por favor, digite apenas números!");
                  scanner.nextLine(); // Limpar buffer
            }
      }

      /**
       * Carrega os contatos do arquivo
       */
      private static void carregarContatos() {
            File arquivo = new File(ARQUIVO_CONTATOS);

            if (!arquivo.exists()) {
                  System.out.println("📁 Arquivo de contatos não encontrado. Criando novo arquivo...");
                  return;
            }

            try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
                  String linha;
                  while ((linha = reader.readLine()) != null) {
                        String[] dados = linha.split("\\|");
                        if (dados.length >= 3) {
                              String nome = dados[0];
                              String telefone = dados[1];
                              String email = dados[2];
                              contatos.add(new Contato(nome, telefone, email));
                        }
                  }
                  System.out.println("✅ " + contatos.size() + " contato(s) carregado(s) do arquivo.");

            } catch (IOException e) {
                  System.out.println("❌ Erro ao carregar contatos: " + e.getMessage());
            }
      }

      /**
       * Salva os contatos no arquivo
       */
      private static void salvarContatos() {
            try (PrintWriter writer = new PrintWriter(new FileWriter(ARQUIVO_CONTATOS))) {
                  for (Contato contato : contatos) {
                        writer.println(contato.getNome() + "|" +
                                    contato.getTelefone() + "|" +
                                    contato.getEmail());
                  }
                  System.out.println("💾 Contatos salvos com sucesso!");

            } catch (IOException e) {
                  System.out.println("❌ Erro ao salvar contatos: " + e.getMessage());
            }
      }

      /**
       * Valida formato básico de email
       */
      private static boolean isValidEmail(String email) {
            return email.contains("@") && email.contains(".") && email.length() > 5;
      }
}

/**
 * Classe que representa um contato
 */
class Contato {
      private String nome;
      private String telefone;
      private String email;

      public Contato(String nome, String telefone, String email) {
            this.nome = nome;
            this.telefone = telefone;
            this.email = email;
      }

      // Getters e Setters
      public String getNome() {
            return nome;
      }

      public void setNome(String nome) {
            this.nome = nome;
      }

      public String getTelefone() {
            return telefone;
      }

      public void setTelefone(String telefone) {
            this.telefone = telefone;
      }

      public String getEmail() {
            return email;
      }

      public void setEmail(String email) {
            this.email = email;
      }

      @Override
      public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("👤 ").append(nome);

            if (!telefone.isEmpty()) {
                  sb.append(" | 📞 ").append(telefone);
            }

            if (!email.isEmpty()) {
                  sb.append(" | 📧 ").append(email);
            }

            return sb.toString();
      }
}