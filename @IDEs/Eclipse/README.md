# Eclipse

O Eclipse é um dos IDEs mais tradicionais e populares para desenvolvimento Java. É open-source, gratuito e oferece uma plataforma robusta para desenvolvimento.

## Versões Disponíveis

### Eclipse IDE for Java Developers
- **Vantagens**: Gratuito, completo para Java
- **Inclui**: Java Development Tools (JDT), Git, Maven
- **Ideal para**: Desenvolvimento Java básico e avançado

### Eclipse IDE for Enterprise Java Developers
- **Vantagens**: Inclui ferramentas para desenvolvimento web
- **Inclui**: Java EE, Web Tools, Database Tools
- **Ideal para**: Desenvolvimento web e enterprise

### Eclipse IDE for Java EE Developers
- **Vantagens**: Foco em aplicações enterprise
- **Inclui**: Servlets, JSP, EJB, Web Services
- **Ideal para**: Desenvolvimento de aplicações corporativas

## Instalação

### Windows
1. Acesse [eclipse.org/downloads](https://www.eclipse.org/downloads/)
2. Baixe "Eclipse IDE for Java Developers"
3. Extraia o arquivo `.zip` em `C:\eclipse`
4. Execute `eclipse.exe`
5. Escolha um workspace (pasta para projetos)

### macOS
1. Baixe o arquivo `.dmg`
2. Arraste o Eclipse para Applications
3. Execute pela primeira vez
4. Aceite os termos de uso

### Linux
```bash
# Ubuntu/Debian
sudo apt update
sudo apt install eclipse

# Ou via tar.gz
tar -xzf eclipse-java-*.tar.gz
sudo mv eclipse /opt/
```

## Configuração Inicial

### 1. Configurar JDK
1. Abra o Eclipse
2. `Window > Preferences`
3. `Java > Installed JREs`
4. Adicione seu JDK se não estiver listado
5. Marque como padrão

### 2. Configurar Tema
1. `Window > Preferences`
2. `General > Appearance`
3. Escolha um tema (Dark ou Light)

### 3. Configurar Workspace
1. `File > Switch Workspace`
2. Escolha uma pasta para seus projetos
3. Reinicie o Eclipse

## Extensões Recomendadas

### Essenciais para Java
- **Checkstyle**: Verificação de estilo de código
- **SpotBugs**: Detecção de bugs
- **SonarLint**: Análise de código em tempo real
- **Eclipse Color Theme**: Temas coloridos

### Para Desenvolvimento
- **Maven Integration**: Gerenciamento de dependências
- **Gradle Integration**: Build automation
- **Git Integration**: Controle de versão
- **Spring Tools**: Suporte a Spring Framework

### Para Produtividade
- **Quick Access**: Navegação rápida
- **Code Recommenders**: Sugestões inteligentes
- **Eclipse Memory Analyzer**: Análise de memória
- **Eclipse Test Framework**: Testes unitários

## Atalhos Importantes

### Navegação
- `Ctrl+Shift+R`: Abrir recurso (arquivo)
- `Ctrl+Shift+T`: Abrir tipo (classe)
- `Ctrl+Shift+G`: Buscar referências
- `Ctrl+H`: Busca avançada

### Edição
- `Ctrl+Shift+F`: Formatar código
- `Ctrl+Shift+O`: Organizar imports
- `Ctrl+1`: Quick Fix
- `Alt+Shift+R`: Renomear

### Debugging
- `F11`: Debug
- `F5`: Step Into
- `F6`: Step Over
- `F7`: Step Return

## Configurações para o Curso

### 1. Criar Projeto Java
1. `File > New > Java Project`
2. Digite o nome do projeto
3. Selecione o JDK
4. Clique em `Finish`

### 2. Configurar Estrutura
```
src/
├── aula1/
│   ├── HelloWorld.java
│   └── Exercicios.java
├── aula2/
│   ├── Variaveis.java
│   └── Exercicios.java
└── ...
```

### 3. Configurar Run/Debug
1. Clique com botão direito no arquivo `.java`
2. `Run As > Java Application`
3. Ou use `Ctrl+F11` para executar

## Dicas de Uso

### 1. Perspectives
- **Java**: Para desenvolvimento Java
- **Debug**: Para debugging
- **Git**: Para controle de versão

### 2. Views Importantes
- **Package Explorer**: Navegação de projetos
- **Outline**: Estrutura da classe atual
- **Problems**: Erros e warnings
- **Console**: Saída do programa

### 3. Code Templates
Configure templates em `Window > Preferences > Java > Editor > Templates`:
- `main` → método main
- `sysout` → System.out.println()

## Solução de Problemas

### Eclipse Lento
1. Aumente a memória: edite `eclipse.ini`
2. Limpe workspace: `File > Clean`
3. Desative plugins desnecessários

### Erro de Compilação
1. Verifique se o JDK está configurado
2. `Project > Clean`
3. `Project > Build Automatically`

### Workspace Corrompido
1. Feche o Eclipse
2. Delete a pasta `.metadata` do workspace
3. Reabra o Eclipse

## Recursos Adicionais

### Documentação
- [Guia Oficial](https://help.eclipse.org/)
- [Tutoriais](https://www.eclipse.org/resources/)
- [Fórum](https://www.eclipse.org/forums/)

### Plugins Úteis
- **Eclipse Marketplace**: Repositório de plugins
- **Eclipse Web Tools**: Desenvolvimento web
- **Eclipse Data Tools**: Banco de dados
- **Eclipse Modeling Tools**: Modelagem UML

## Comparação com Outros IDEs

### Vantagens do Eclipse
- Gratuito e open-source
- Muito estável
- Grande comunidade
- Muitos plugins disponíveis

### Desvantagens
- Interface menos moderna
- Pode ser mais lento
- Curva de aprendizado maior

---

**Próximo Passo**: Após instalar e configurar o Eclipse, você estará pronto para começar o curso de Java! 