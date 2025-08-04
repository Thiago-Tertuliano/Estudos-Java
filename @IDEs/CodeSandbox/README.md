# CodeSandbox

O CodeSandbox é uma plataforma de desenvolvimento online que permite criar, compartilhar e colaborar em projetos de código. Embora seja mais popular para JavaScript/React, também suporta Java através de templates e configurações especiais.

## Vantagens do CodeSandbox

### Para Desenvolvimento
- **Editor Online**: Funciona no navegador
- **Templates Prontos**: Projetos pré-configurados
- **Colaboração**: Desenvolvimento em tempo real
- **Deploy Automático**: Preview instantâneo
- **Gratuito**: Plano básico gratuito

### Recursos Especiais
- **Multiplataforma**: Qualquer dispositivo
- **Integração Git**: Controle de versão
- **Customização**: Temas e extensões
- **Compartilhamento**: Links diretos

## Como Acessar

### 1. Criar Conta
1. Acesse [codesandbox.io](https://codesandbox.io/)
2. Clique em "Sign In"
3. Use conta GitHub, Google ou email
4. Confirme seu email

### 2. Criar Primeiro Projeto
1. Clique em "Create Sandbox"
2. Escolha um template (Node.js para Java)
3. Configure o nome do projeto
4. Clique em "Create"

## Configuração para Java

### 1. Template Node.js para Java
Como o CodeSandbox não tem template Java nativo, use Node.js:

1. Crie sandbox Node.js
2. Adicione arquivos `.java`
3. Configure script de compilação
4. Use terminal para executar

### 2. package.json para Java
```json
{
  "name": "java-project",
  "version": "1.0.0",
  "description": "Projeto Java no CodeSandbox",
  "scripts": {
    "compile": "javac *.java",
    "run": "java Main",
    "start": "npm run compile && npm run run"
  },
  "dependencies": {},
  "devDependencies": {}
}
```

### 3. Estrutura de Projeto
```
./
├── package.json         # Configuração Node.js
├── Main.java           # Classe principal
├── HelloWorld.java     # Exemplo da Aula 1
├── Variaveis.java      # Exemplo da Aula 2
└── README.md           # Documentação
```

## Interface do CodeSandbox

### Áreas Principais
- **Editor**: Área de código principal
- **Preview**: Visualização do resultado
- **Console**: Terminal integrado
- **Files**: Gerenciador de arquivos

### Menu Principal
- **File**: Gerenciar arquivos
- **Edit**: Editar código
- **View**: Visualizar painéis
- **Terminal**: Abrir terminal
- **Share**: Compartilhar projeto

## Como Usar para o Curso

### 1. Criar Projeto para Aula 1
1. Crie sandbox Node.js
2. Adicione arquivo `HelloWorld.java`:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
        System.out.println("Bem-vindo ao CodeSandbox!");
    }
}
```

### 2. Executar Código
1. Abra terminal (Ctrl+`)
2. Execute: `javac HelloWorld.java`
3. Execute: `java HelloWorld`
4. Veja saída no terminal

### 3. Organizar por Aulas
```
curso-java/
├── aula1/
│   ├── HelloWorld.java
│   └── Exercicios.java
├── aula2/
│   ├── Variaveis.java
│   └── Exercicios.java
└── package.json
```

## Recursos Avançados

### 1. Terminal Integrado
- `Ctrl+`` (backtick): Abrir terminal
- Execute comandos Java
- Compile e execute programas
- Instale ferramentas se necessário

### 2. Dependencies
- Adicione dependências no package.json
- Use npm para gerenciar
- Instale ferramentas Java se necessário

### 3. Environment Variables
```json
{
  "env": {
    "JAVA_HOME": "/usr/lib/jvm/java-17-openjdk-amd64",
    "PATH": "$JAVA_HOME/bin:$PATH"
  }
}
```

## Dicas de Uso

### 1. Organização
- Crie sandbox para cada aula
- Use nomes descritivos
- Mantenha estrutura organizada
- Documente no README

### 2. Colaboração
- Compartilhe links dos sandboxes
- Use comentários no código
- Colabore em tempo real
- Versionamento via Git

### 3. Debugging
- Use `System.out.println()` para debug
- Verifique console para erros
- Teste código passo a passo
- Use breakpoints se disponível

## Exemplos Práticos

### Aula 1: Hello World
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("=== AULA 1: HELLO WORLD ===");
        System.out.println("Olá, mundo!");
        System.out.println("Este é meu primeiro programa Java!");
        System.out.println("Desenvolvido no CodeSandbox");
    }
}
```

### Aula 2: Variáveis
```java
public class Variaveis {
    public static void main(String[] args) {
        System.out.println("=== AULA 2: VARIÁVEIS ===");
        
        String nome = "Maria Silva";
        int idade = 30;
        double altura = 1.65;
        boolean estudante = true;
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + "m");
        System.out.println("É estudante? " + estudante);
    }
}
```

## Solução de Problemas

### Java não Funciona
1. Verifique se está no ambiente Node.js
2. Use terminal para executar Java
3. Instale Java se necessário
4. Configure JAVA_HOME

### Erro de Compilação
1. Verifique sintaxe do código
2. Certifique-se de que há método main
3. Verifique nomes de classes
4. Use terminal para ver erros detalhados

### Sandbox Lento
1. Feche abas desnecessárias
2. Limpe cache do navegador
3. Use navegador atualizado
4. Verifique conexão com internet

## Recursos Adicionais

### Documentação
- [CodeSandbox Docs](https://codesandbox.io/docs)
- [Templates](https://codesandbox.io/templates)
- [Community](https://codesandbox.io/community)

### Templates Úteis
- **Node.js**: Base para Java
- **Vanilla**: JavaScript puro
- **React**: Para desenvolvimento web
- **Vue**: Framework JavaScript

## Comparação com Outros IDEs

### Vantagens do CodeSandbox
- Sem instalação
- Interface moderna
- Colaboração fácil
- Deploy automático

### Desvantagens
- Suporte limitado a Java
- Depende de internet
- Recursos limitados
- Menos plugins

## Configurações Recomendadas

### package.json
```json
{
  "name": "curso-java",
  "version": "1.0.0",
  "description": "Curso básico de Java",
  "scripts": {
    "compile": "javac *.java",
    "run": "java Main",
    "test": "npm run compile && npm run run"
  },
  "keywords": ["java", "curso", "programacao"],
  "author": "Seu Nome",
  "license": "MIT"
}
```

### README.md
```markdown
# Curso Java - CodeSandbox

Este projeto contém exemplos e exercícios do curso básico de Java.

## Como Executar

1. Abra o terminal (Ctrl+`)
2. Execute: `npm run compile`
3. Execute: `npm run run`

## Estrutura

- `aula1/`: Primeira aula - Hello World
- `aula2/`: Segunda aula - Variáveis
- `aula3/`: Terceira aula - Operadores
```

---

**Próximo Passo**: O CodeSandbox é uma opção interessante para desenvolvimento online! Use-o para experimentar e compartilhar código Java facilmente. 