# IntelliJ IDEA

O IntelliJ IDEA é um dos IDEs mais populares para desenvolvimento Java, desenvolvido pela JetBrains. Oferece recursos avançados de desenvolvimento, debugging e refatoração.

## Versões Disponíveis

### Community Edition (Gratuita)
- **Vantagens**: Gratuita, open-source, suporte completo a Java
- **Limitações**: Sem suporte a frameworks web, banco de dados, etc.
- **Ideal para**: Desenvolvimento Java básico e intermediário

### Ultimate Edition (Paga)
- **Vantagens**: Suporte completo a todos os frameworks e tecnologias
- **Limitações**: Versão paga (com trial gratuito)
- **Ideal para**: Desenvolvimento profissional completo

## Instalação

### Windows
1. Acesse [jetbrains.com/idea](https://www.jetbrains.com/idea/)
2. Baixe a versão Community (gratuita)
3. Execute o instalador `.exe`
4. Siga o assistente de instalação
5. Reinicie o computador se necessário

### macOS
1. Baixe o arquivo `.dmg`
2. Arraste o IntelliJ IDEA para a pasta Applications
3. Execute pela primeira vez
4. Aceite os termos de uso

### Linux
```bash
# Ubuntu/Debian
sudo snap install intellij-idea-community --classic

# Ou via tar.gz
tar -xzf ideaIC-*.tar.gz
sudo mv idea-IC-* /opt/intellij-idea
```

## Configuração Inicial

### 1. Configurar JDK
1. Abra o IntelliJ IDEA
2. Vá em `File > Project Structure`
3. Em `Project Settings > Project`, configure:
   - **Project SDK**: Selecione sua versão do JDK
   - **Project language level**: Java 8 ou superior

### 2. Configurar Tema e Interface
1. `File > Settings` (Windows/Linux) ou `IntelliJ IDEA > Preferences` (macOS)
2. `Appearance & Behavior > Appearance`
3. Escolha um tema (Dark ou Light)

## Extensões Recomendadas

### Essenciais para Java
- **Rainbow Brackets**: Destaque de parênteses coloridos
- **String Manipulation**: Ferramentas para manipular strings
- **Key Promoter X**: Mostra atalhos de teclado
- **Material Theme UI**: Temas modernos

### Para Desenvolvimento
- **Git Integration**: Controle de versão integrado
- **Maven Integration**: Gerenciamento de dependências
- **Gradle Integration**: Build automation
- **Lombok**: Reduz boilerplate code

### Para Produtividade
- **CodeGlance**: Mini-mapa do código
- **AceJump**: Navegação rápida no código
- **IdeaVim**: Emulação do Vim
- **Presentation Assistant**: Melhora apresentações

## Atalhos Importantes

### Navegação
- `Ctrl+N` (Windows/Linux) / `Cmd+N` (macOS): Buscar classe
- `Ctrl+Shift+N`: Buscar arquivo
- `Ctrl+Shift+A`: Buscar ação
- `Ctrl+E`: Arquivos recentes

### Edição
- `Ctrl+D`: Duplicar linha
- `Ctrl+Y`: Deletar linha
- `Ctrl+/`: Comentar/descomentar
- `Ctrl+Shift+Enter`: Completar linha

### Refatoração
- `Shift+F6`: Renomear
- `Ctrl+Alt+M`: Extrair método
- `Ctrl+Alt+V`: Extrair variável
- `Ctrl+Alt+C`: Extrair constante

## Configurações para o Curso

### 1. Criar Projeto
1. `File > New > Project`
2. Selecione `Java`
3. Escolha `IntelliJ` como build system
4. Configure o JDK
5. Clique em `Create`

### 2. Configurar Estrutura
```
src/
├── main/
│   └── java/
│       └── com/
│           └── curso/
│               ├── aula1/
│               ├── aula2/
│               └── ...
```

### 3. Configurar Run/Debug
1. Clique com botão direito no arquivo `.java`
2. Selecione `Run 'NomeDaClasse.main()'`
3. Ou use `Shift+F10` para executar

## Dicas de Uso

### 1. Live Templates
Configure templates para código comum:
- `sout` → `System.out.println()`
- `psvm` → `public static void main(String[] args)`

### 2. Code Completion
- Use `Ctrl+Space` para autocompletar
- Use `Ctrl+Shift+Space` para completar inteligente

### 3. Debugging
- `F9`: Executar
- `F8`: Step Over
- `F7`: Step Into
- `Shift+F8`: Step Out

## Solução de Problemas

### IDE Lenta
1. Aumente a memória: `Help > Edit Custom VM Options`
2. Desative plugins desnecessários
3. Limpe caches: `File > Invalidate Caches`

### Erro de Compilação
1. Verifique se o JDK está configurado
2. Sincronize o projeto: `File > Sync Project with Gradle Files`
3. Rebuild: `Build > Rebuild Project`

## Recursos Adicionais

### Documentação
- [Guia Oficial](https://www.jetbrains.com/help/idea/)
- [Tutoriais em Vídeo](https://www.jetbrains.com/idea/documentation/)
- [Comunidade](https://intellij-support.jetbrains.com/)

### Plugins Úteis
- **SonarLint**: Análise de código
- **SpotBugs**: Detecção de bugs
- **CheckStyle-IDEA**: Verificação de estilo
- **JRebel**: Hot reload para desenvolvimento

---

**Próximo Passo**: Após instalar e configurar o IntelliJ IDEA, você estará pronto para começar o curso de Java! 