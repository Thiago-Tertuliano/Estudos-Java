# Gitpod

O Gitpod é um ambiente de desenvolvimento na nuvem que oferece uma experiência similar ao VS Code, mas executando em containers na nuvem. É ideal para desenvolvimento colaborativo e para quem quer um ambiente consistente.

## Vantagens do Gitpod

### Para Desenvolvimento Java
- **Ambiente Consistente**: Mesmo ambiente para todos
- **Baseado no VS Code**: Interface familiar
- **Integração Git**: Controle de versão nativo
- **Containers**: Isolamento e portabilidade
- **Gratuito**: Plano gratuito disponível

### Recursos Especiais
- **Prebuilds**: Ambientes pré-configurados
- **Multiplataforma**: Funciona em qualquer dispositivo
- **Colaboração**: Desenvolvimento em tempo real
- **Deploy Automático**: Integração com CI/CD

## Como Acessar

### 1. Criar Conta
1. Acesse [gitpod.io](https://gitpod.io/)
2. Clique em "Sign In"
3. Use conta GitHub, GitLab ou Bitbucket
4. Autorize o acesso aos repositórios

### 2. Primeiro Workspace
1. Conecte um repositório GitHub
2. Clique em "Open in Gitpod"
3. Aguarde a inicialização do workspace
4. Comece a programar

## Configuração para Java

### 1. .gitpod.yml
Crie este arquivo na raiz do projeto:

```yaml
image: gitpod/workspace-full:latest

tasks:
  - name: Setup Java
    init: |
      # Instalar JDK
      sudo apt update
      sudo apt install -y openjdk-17-jdk
      
      # Configurar JAVA_HOME
      echo 'export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64' >> ~/.bashrc
      echo 'export PATH=$JAVA_HOME/bin:$PATH' >> ~/.bashrc
      
      # Verificar instalação
      java -version
      javac -version

  - name: Compile and Run
    command: |
      # Compilar todos os arquivos Java
      javac *.java
      # Executar classe principal
      java Main

ports:
  - port: 8080
    onOpen: open-preview

vscode:
  extensions:
    - vscjava.vscode-java-pack
    - vscjava.vscode-java-debug
    - vscjava.vscode-java-test
    - vscjava.vscode-maven
    - vscjava.vscode-gradle
```

### 2. Estrutura de Projeto
```
./
├── .gitpod.yml         # Configuração do Gitpod
├── src/
│   ├── aula1/
│   │   ├── HelloWorld.java
│   │   └── Exercicios.java
│   ├── aula2/
│   │   ├── Variaveis.java
│   │   └── Exercicios.java
│   └── ...
├── README.md
└── .gitignore
```

## Interface do Gitpod

### Áreas Principais
- **Editor**: VS Code na nuvem
- **Terminal**: Terminal integrado
- **Explorer**: Navegador de arquivos
- **Extensions**: Extensões do VS Code

### Menu Principal
- **File**: Gerenciar arquivos
- **Edit**: Editar código
- **View**: Visualizar painéis
- **Terminal**: Abrir terminal
- **Help**: Ajuda

## Como Usar para o Curso

### 1. Criar Repositório
1. Crie um repositório no GitHub
2. Adicione o arquivo `.gitpod.yml`
3. Adicione arquivos Java
4. Commit e push

### 2. Abrir no Gitpod
1. Vá para o repositório no GitHub
2. Clique em "Open in Gitpod"
3. Aguarde a inicialização
4. Comece a programar

### 3. Estrutura Recomendada
```
curso-java/
├── .gitpod.yml
├── src/
│   ├── aula1/
│   │   ├── HelloWorld.java
│   │   └── Exercicios.java
│   ├── aula2/
│   │   ├── Variaveis.java
│   │   └── Exercicios.java
│   └── ...
├── README.md
└── .gitignore
```

## Extensões Recomendadas

### Java Development
- **Extension Pack for Java**: Pacote completo
- **Language Support for Java**: Suporte à linguagem
- **Debugger for Java**: Debugging integrado
- **Java Test Runner**: Execução de testes
- **Maven for Java**: Suporte ao Maven
- **Gradle for Java**: Suporte ao Gradle

### Produtividade
- **GitLens**: Git integrado avançado
- **Auto Rename Tag**: Renomeia tags
- **Bracket Pair Colorizer**: Destaque de parênteses
- **Material Icon Theme**: Ícones bonitos

## Atalhos Importantes

### Navegação
- `Ctrl+P`: Buscar arquivo
- `Ctrl+Shift+P`: Comando palette
- `Ctrl+G`: Ir para linha
- `Ctrl+Shift+O`: Ir para símbolo

### Edição
- `Ctrl+X/C/V`: Recortar/Copiar/Colar
- `Ctrl+Z`: Desfazer
- `Ctrl+Shift+K`: Deletar linha
- `Alt+Shift+F`: Formatar código

### Java Específicos
- `F5`: Debug
- `Ctrl+F5`: Executar sem debug
- `F9`: Toggle breakpoint
- `Ctrl+Shift+F5`: Restart debug

## Configurações Recomendadas

### settings.json
```json
{
    "java.home": "/usr/lib/jvm/java-17-openjdk-amd64",
    "java.configuration.updateBuildConfiguration": "automatic",
    "java.compile.nullAnalysis.mode": "automatic",
    "editor.formatOnSave": true,
    "editor.codeActionsOnSave": {
        "source.organizeImports": true
    },
    "files.autoSave": "afterDelay",
    "files.autoSaveDelay": 1000
}
```

### launch.json
```json
{
    "version": "0.2.0",
    "configurations": [
        {
            "type": "java",
            "name": "Launch Current File",
            "request": "launch",
            "mainClass": "${file}"
        }
    ]
}
```

## Recursos Avançados

### 1. Prebuilds
- Ambientes pré-configurados
- Inicialização mais rápida
- Configuração automática

### 2. Collaboration
- Desenvolvimento em tempo real
- Compartilhamento de workspaces
- Chat integrado

### 3. Custom Images
```dockerfile
FROM gitpod/workspace-full:latest

# Instalar Java
RUN sudo apt update && \
    sudo apt install -y openjdk-17-jdk

# Configurar JAVA_HOME
ENV JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
ENV PATH=$JAVA_HOME/bin:$PATH
```

## Solução de Problemas

### Workspace não Inicia
1. Verifique conexão com internet
2. Aguarde inicialização completa
3. Verifique logs do Gitpod
4. Reinicie o workspace

### Java não Detectado
1. Verifique o arquivo `.gitpod.yml`
2. Aguarde a instalação do Java
3. Abra novo terminal
4. Execute `java -version`

### Extensões não Funcionam
1. Aguarde carregamento completo
2. Reinicie o workspace
3. Verifique permissões
4. Reinstale extensões

## Recursos Adicionais

### Documentação
- [Gitpod Docs](https://www.gitpod.io/docs)
- [VS Code Java](https://code.visualstudio.com/docs/languages/java)
- [Community](https://community.gitpod.io/)

### Templates Úteis
- **Java Spring Boot**: Web application
- **Java Maven**: Projeto Maven
- **Java Gradle**: Projeto Gradle
- **Java JUnit**: Testes unitários

## Comparação com Outros IDEs

### Vantagens do Gitpod
- Ambiente consistente
- Sem instalação local
- Colaboração fácil
- Integração Git nativa

### Desvantagens
- Depende de internet
- Latência de rede
- Recursos limitados (plano gratuito)
- Menos controle sobre ambiente

## Workflow Recomendado

### 1. Desenvolvimento
1. Clone repositório no Gitpod
2. Desenvolva no workspace
3. Commit e push regularmente
4. Use branches para features

### 2. Colaboração
1. Compartilhe link do workspace
2. Use chat integrado
3. Code review em tempo real
4. Deploy automático

### 3. Backup
1. Mantenha repositório atualizado
2. Use branches para experimentos
3. Documente configurações
4. Backup local se necessário

---

**Próximo Passo**: O Gitpod oferece uma experiência profissional na nuvem! Configure seu repositório e comece a programar Java com colaboração em tempo real. 