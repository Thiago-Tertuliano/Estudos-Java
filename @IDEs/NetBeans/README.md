# NetBeans

O NetBeans é um IDE open-source desenvolvido pela Apache Software Foundation. É conhecido por sua facilidade de uso e excelente suporte para desenvolvimento Java, especialmente para aplicações desktop.

## Vantagens do NetBeans

### Para Desenvolvimento Java
- **Interface Intuitiva**: Fácil de usar para iniciantes
- **Gratuito**: Totalmente open-source
- **Multiplataforma**: Windows, macOS, Linux
- **Suporte Completo**: Java SE, Java EE, Java ME
- **GUI Builder**: Construtor visual de interfaces

### Recursos Especiais
- **Matisse GUI Builder**: Construtor visual de Swing
- **Profiler Integrado**: Análise de performance
- **Debugger Avançado**: Depuração poderosa
- **Suporte a Maven/Gradle**: Gerenciamento de dependências

## Instalação

### Windows
1. Acesse [netbeans.apache.org](https://netbeans.apache.org/)
2. Baixe "NetBeans IDE" (inclui JDK)
3. Execute o instalador `.exe`
4. Siga o assistente de instalação
5. Escolha os componentes (Java SE é essencial)

### macOS
1. Baixe o arquivo `.dmg`
2. Arraste o NetBeans para Applications
3. Execute pela primeira vez
4. Aceite os termos de uso

### Linux
```bash
# Ubuntu/Debian
sudo apt update
sudo apt install netbeans

# Ou via tar.gz
tar -xzf netbeans-*.tar.gz
sudo mv netbeans-* /opt/netbeans
```

## Configuração Inicial

### 1. Configurar JDK
1. Abra o NetBeans
2. `Tools > Java Platforms`
3. Adicione seu JDK se não estiver listado
4. Configure como padrão

### 2. Configurar Tema
1. `Tools > Options`
2. `Appearance > Look and Feel`
3. Escolha um tema (Dark ou Light)

### 3. Configurar Editor
1. `Tools > Options`
2. `Editor > Fonts & Colors`
3. Configure fonte e cores

## Extensões Recomendadas

### Essenciais para Java
- **Checkstyle**: Verificação de estilo de código
- **SpotBugs**: Detecção de bugs
- **SonarLint**: Análise de código em tempo real
- **Rainbow Brackets**: Destaque de parênteses

### Para Desenvolvimento
- **Maven Integration**: Gerenciamento de dependências
- **Gradle Integration**: Build automation
- **Git Integration**: Controle de versão
- **Spring Framework**: Suporte a Spring

### Para Produtividade
- **Code Templates**: Templates de código
- **Auto Save**: Salvamento automático
- **Code Folding**: Dobrar código
- **Multiple Cursors**: Múltiplos cursores

## Atalhos Importantes

### Navegação
- `Ctrl+O`: Abrir arquivo
- `Ctrl+Shift+O`: Abrir tipo
- `Ctrl+Shift+F`: Buscar em arquivos
- `Ctrl+Shift+H`: Buscar e substituir

### Edição
- `Ctrl+S`: Salvar
- `Ctrl+Z`: Desfazer
- `Ctrl+Y`: Refazer
- `Ctrl+D`: Duplicar linha
- `Ctrl+Shift+F`: Formatar código

### Execução
- `F6`: Executar projeto
- `Ctrl+F5`: Executar arquivo
- `F5`: Debug
- `Ctrl+F8`: Parar execução

## Configurações para o Curso

### 1. Criar Projeto Java
1. `File > New Project`
2. Selecione `Java with Ant`
3. Escolha `Java Application`
4. Configure nome e localização
5. Clique em `Finish`

### 2. Estrutura de Projeto
```
src/
├── java/
│   └── com/
│       └── curso/
│           ├── aula1/
│           │   ├── HelloWorld.java
│           │   └── Exercicios.java
│           ├── aula2/
│           │   ├── Variaveis.java
│           │   └── Exercicios.java
│           └── ...
└── test/
    └── java/
        └── com/
            └── curso/
                └── ...
```

### 3. Configurar Run/Debug
1. Clique com botão direito no projeto
2. `Properties > Run`
3. Configure a classe principal
4. Adicione argumentos se necessário

## Recursos Especiais

### 1. GUI Builder (Matisse)
- Construtor visual de interfaces Swing
- Arraste e solte componentes
- Geração automática de código
- Preview em tempo real

### 2. Profiler
- Análise de performance
- Monitoramento de memória
- Análise de threads
- Detecção de gargalos

### 3. Debugger
- Breakpoints condicionais
- Watch expressions
- Call stack
- Variables view

## Dicas de Uso

### 1. Code Templates
Configure templates em `Tools > Options > Editor > Code Templates`:
- `main` → método main
- `sout` → System.out.println()
- `fori` → for loop
- `while` → while loop

### 2. Code Completion
- `Ctrl+Space`: Trigger completion
- `Ctrl+Shift+Space`: Smart completion
- `Ctrl+Shift+P`: Parameter info

### 3. Refactoring
- `Ctrl+R`: Rename
- `Ctrl+Alt+M`: Extract method
- `Ctrl+Alt+V`: Extract variable
- `Ctrl+Alt+C`: Extract constant

## Solução de Problemas

### NetBeans Lento
1. Aumente a memória: edite `netbeans.conf`
2. Desative plugins desnecessários
3. Limpe caches: `Tools > Options > General`

### Erro de Compilação
1. Verifique se o JDK está configurado
2. `Clean and Build`: `Run > Clean and Build Project`
3. Verifique dependências

### GUI Builder não Funciona
1. Verifique se o projeto é Java Application
2. Clique com botão direito no arquivo `.java`
3. Selecione `Open in GUI Builder`

## Recursos Adicionais

### Documentação
- [Guia Oficial](https://netbeans.apache.org/kb/)
- [Tutoriais](https://netbeans.apache.org/tutorials/)
- [Fórum](https://netbeans.apache.org/community/)

### Plugins Úteis
- **NetBeans Marketplace**: Repositório de plugins
- **Spring Framework**: Suporte a Spring
- **GlassFish**: Servidor de aplicação
- **JUnit**: Testes unitários

## Comparação com Outros IDEs

### Vantagens do NetBeans
- Interface intuitiva
- GUI Builder integrado
- Profiler avançado
- Gratuito e open-source

### Desvantagens
- Pode ser mais lento
- Menos plugins que Eclipse
- Interface menos moderna

## Configurações Avançadas

### netbeans.conf
```bash
# Aumentar memória
netbeans_default_options="-J-Xms512m -J-Xmx2048m -J-XX:PermSize=256m -J-XX:MaxPermSize=512m"
```

### settings.xml (Maven)
```xml
<settings>
    <localRepository>${user.home}/.m2/repository</localRepository>
    <mirrors>
        <mirror>
            <id>central</id>
            <url>https://repo1.maven.org/maven2</url>
        </mirror>
    </mirrors>
</settings>
```

---

**Próximo Passo**: Após instalar e configurar o NetBeans, você terá um IDE robusto e completo para desenvolvimento Java! 