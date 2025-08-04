# Visual Studio Code

O Visual Studio Code (VS Code) é um editor de código leve e poderoso da Microsoft. Com as extensões corretas, torna-se uma excelente opção para desenvolvimento Java.

## Vantagens do VS Code

### Para Desenvolvimento Java
- **Leve e Rápido**: Inicia rapidamente
- **Gratuito**: Totalmente gratuito
- **Extensível**: Milhares de extensões disponíveis
- **Multiplataforma**: Windows, macOS, Linux
- **Integração Git**: Controle de versão integrado

### Interface Moderna
- Interface limpa e intuitiva
- Suporte a temas personalizados
- Terminal integrado
- IntelliSense avançado

## Instalação

### Windows
1. Acesse [code.visualstudio.com](https://code.visualstudio.com/)
2. Baixe o instalador para Windows
3. Execute o `.exe`
4. Siga o assistente de instalação

### macOS
1. Baixe o arquivo `.dmg`
2. Arraste o VS Code para Applications
3. Execute pela primeira vez

### Linux
```bash
# Ubuntu/Debian
sudo apt update
sudo apt install code

# Ou via snap
sudo snap install code --classic

# Ou via tar.gz
tar -xzf code-stable-*.tar.gz
sudo mv VSCode-linux-x64 /opt/vscode
```

## Configuração Inicial

### 1. Instalar Java Extension Pack
1. Abra o VS Code
2. `Ctrl+Shift+X` (Windows/Linux) ou `Cmd+Shift+X` (macOS)
3. Busque "Extension Pack for Java"
4. Instale a extensão da Microsoft

### 2. Configurar JDK
1. Instale o JDK no seu sistema
2. Configure a variável `JAVA_HOME`
3. O VS Code detectará automaticamente

### 3. Configurar Tema
1. `Ctrl+K Ctrl+T` (Windows/Linux) ou `Cmd+K Cmd+T` (macOS)
2. Escolha um tema (recomendado: Dark+)

## Extensões Essenciais para Java

### Java Development
- **Extension Pack for Java**: Pacote completo para Java
- **Language Support for Java**: Suporte à linguagem
- **Debugger for Java**: Debugging integrado
- **Java Test Runner**: Execução de testes
- **Maven for Java**: Suporte ao Maven
- **Gradle for Java**: Suporte ao Gradle

### Produtividade
- **Auto Rename Tag**: Renomeia tags automaticamente
- **Bracket Pair Colorizer**: Destaque de parênteses
- **GitLens**: Git integrado avançado
- **Live Server**: Servidor local para desenvolvimento
- **Prettier**: Formatação de código
- **ESLint**: Linting para JavaScript

### Temas e Ícones
- **Material Icon Theme**: Ícones bonitos
- **One Dark Pro**: Tema escuro popular
- **Dracula Official**: Tema Dracula
- **GitHub Theme**: Tema do GitHub

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
- `Ctrl+/`: Comentar/descomentar

### Java Específicos
- `F5`: Debug
- `Ctrl+F5`: Executar sem debug
- `F9`: Toggle breakpoint
- `Ctrl+Shift+F5`: Restart debug

## Configurações para o Curso

### 1. Configurar Workspace
1. `File > Open Folder`
2. Selecione a pasta do curso
3. Salve o workspace: `File > Save Workspace As`

### 2. Estrutura de Pastas
```
curso-java/
├── aula1/
│   ├── HelloWorld.java
│   └── Exercicios.java
├── aula2/
│   ├── Variaveis.java
│   └── Exercicios.java
└── ...
```

### 3. Configurar Launch
1. `Run and Debug` (ícone de play)
2. `create a launch.json file`
3. Selecione `Java`
4. Configure o arquivo de debug

## Configurações Recomendadas

### settings.json
```json
{
    "java.home": "/path/to/your/jdk",
    "java.configuration.updateBuildConfiguration": "automatic",
    "java.compile.nullAnalysis.mode": "automatic",
    "java.format.settings.url": "https://raw.githubusercontent.com/google/styleguide/gh-pages/eclipse-java-google-style.xml",
    "java.format.settings.profile": "GoogleStyle",
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

## Dicas de Uso

### 1. Terminal Integrado
- `Ctrl+`` (backtick): Abrir terminal
- Execute comandos Java diretamente
- Compile e execute: `javac HelloWorld.java && java HelloWorld`

### 2. IntelliSense
- `Ctrl+Space`: Trigger suggestions
- `Ctrl+Shift+Space`: Trigger parameter hints
- `F12`: Go to definition

### 3. Multi-cursor
- `Alt+Click`: Adicionar cursor
- `Ctrl+Alt+Up/Down`: Adicionar cursor acima/abaixo
- `Ctrl+D`: Selecionar próxima ocorrência

## Solução de Problemas

### Java não Detectado
1. Verifique se o JDK está instalado
2. Configure `JAVA_HOME`
3. Reinicie o VS Code
4. Verifique em `Java > Configure Java Runtime`

### Extensões não Funcionam
1. `Ctrl+Shift+P` > "Java: Reload Projects"
2. `Ctrl+Shift+P` > "Java: Clean Java Language Server Workspace"
3. Reinicie o VS Code

### Performance Lenta
1. Desative extensões desnecessárias
2. Aumente a memória: `java.jdt.ls.vmargs`
3. Limpe workspace: `Java: Clean Java Language Server Workspace`

## Recursos Adicionais

### Documentação
- [VS Code Java](https://code.visualstudio.com/docs/languages/java)
- [Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
- [Debugging Java](https://code.visualstudio.com/docs/java/java-debugging)

### Extensões Avançadas
- **Spring Boot Extension Pack**: Para Spring Boot
- **Quarkus Tools**: Para Quarkus
- **MicroProfile Tools**: Para MicroProfile
- **Docker**: Para containers
- **Remote Development**: Para desenvolvimento remoto

## Comparação com IDEs Tradicionais

### Vantagens do VS Code
- Mais leve e rápido
- Interface moderna
- Excelente para múltiplas linguagens
- Gratuito e open-source

### Desvantagens
- Menos recursos específicos para Java
- Configuração inicial mais complexa
- Debugging menos avançado

---

**Próximo Passo**: Após instalar e configurar o VS Code com as extensões Java, você estará pronto para começar o curso! 