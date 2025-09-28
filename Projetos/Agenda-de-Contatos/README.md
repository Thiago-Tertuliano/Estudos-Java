# 📒 Agenda de Contatos

Um sistema simples de gerenciamento de contatos em Java com interface de linha de comando (CLI) que permite realizar operações CRUD básicas.

## 🚀 Funcionalidades

- ✅ **Adicionar Contato** - Inserir novo contato com nome, telefone e email
- 📋 **Listar Contatos** - Visualizar todos os contatos cadastrados
- 🔍 **Buscar Contato** - Localizar contatos por nome
- ✏️ **Editar Contato** - Modificar dados de contatos existentes
- 🗑️ **Remover Contato** - Excluir contatos da agenda
- 💾 **Persistência** - Dados salvos automaticamente em arquivo `.txt`

## 🛠️ Tecnologias Utilizadas

- **Java** - Linguagem de programação
- **I/O Streams** - Para leitura e escrita de arquivos
- **Collections Framework** - Para gerenciamento de dados
- **Scanner** - Para entrada de dados do usuário

## 📁 Estrutura do Projeto

```
Agenda-de-Contatos/
├── AgendaContatos.java    # Classe principal com toda a lógica
├── contatos.txt          # Arquivo de persistência (criado automaticamente)
└── README.md             # Este arquivo
```

## 🏃‍♂️ Como Executar

### Pré-requisitos

- Java JDK 8 ou superior instalado
- Terminal/Command Prompt

### Passos para Execução

1. **Navegue até o diretório do projeto:**

   ```bash
   cd Estudos-Java/Projetos/Agenda-de-Contatos
   ```

2. **Compile o programa:**

   ```bash
   javac AgendaContatos.java
   ```

3. **Execute o programa:**
   ```bash
   java AgendaContatos
   ```

## 📖 Como Usar

Ao executar o programa, você verá um menu com as seguintes opções:

```
==================================================
        📒 AGENDA DE CONTATOS 📒
==================================================
1. ➕ Adicionar Contato
2. 📋 Listar Contatos
3. 🔍 Buscar Contato
4. ✏️  Editar Contato
5. 🗑️  Remover Contato
6. 💾 Salvar Contatos
0. 🚪 Sair
==================================================
```

### Exemplos de Uso

#### Adicionar Contato

```
Nome: João Silva
Telefone: (11) 99999-9999
Email: joao@email.com
```

#### Buscar Contato

```
Digite o nome (ou parte dele): João
```

#### Editar Contato

```
Digite o número do contato a ser editado: 1
Nome [João Silva]: João Santos
Telefone [(11) 99999-9999]:
Email [joao@email.com]: joao.santos@email.com
```

## 💾 Persistência de Dados

Os dados são salvos automaticamente no arquivo `contatos.txt` no formato:

```
Nome|Telefone|Email
João Silva|(11) 99999-9999|joao@email.com
Maria Santos|(11) 88888-8888|maria@email.com
```

## ✨ Características

- **Interface Amigável** - Menu intuitivo com emojis
- **Validação de Dados** - Verificação de email e campos obrigatórios
- **Busca Inteligente** - Busca por parte do nome
- **Confirmação de Exclusão** - Proteção contra remoções acidentais
- **Tratamento de Erros** - Mensagens claras para o usuário
- **Persistência Automática** - Dados salvos automaticamente

## 🔧 Possíveis Melhorias

- [ ] Validação mais robusta de telefone e email
- [ ] Ordenação de contatos por nome
- [ ] Backup automático dos dados
- [ ] Interface gráfica (GUI)
- [ ] Importação/Exportação de contatos
- [ ] Categorização de contatos (trabalho, pessoal, etc.)
- [ ] Histórico de alterações

## 👨‍💻 Autor

**Thiago Tertuliano** - Desenvolvedor Java em aprendizado

---

_Este projeto faz parte dos estudos de Java básico e demonstra conceitos fundamentais como orientação a objetos, manipulação de arquivos e interfaces de linha de comando._
