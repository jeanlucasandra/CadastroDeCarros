# 🚗 Cadastro de Carros

Sistema de cadastro de carros executado no terminal, desenvolvido em **Java** com **IntelliJ IDEA**.

## ✨ Funcionalidades

- **Cadastrar** um carro (marca, cor, modelo e valor)
- **Listar** todos os carros cadastrados
- **Editar** os dados de um carro já cadastrado
- **Excluir** um carro da lista

## 🧠 Conceitos utilizados

- Classes e objetos
- Encapsulamento ("private", getters e setters)
- Métodos
- "ArrayList"
- "switch...case"
- Validação de entradas (lista vazia e posição inválida)

## 🛠️ Tecnologias

- Java (JDK 14 ou superior, por causa do "switch" moderno com "->")
- IntelliJ IDEA

## 📁 Estrutura do projeto

src/
├── Main.java               # Menu e interação com o usuário
├── Carros.java             # Classe que representa um carro
└── CadastroDeCarros.java   # Lógica de cadastro, listagem, edição e exclusão

## ▶️ Como executar

### Pré-requisitos

Verifique se o Java está instalado:


java -version
javac -version


### Pelo terminal

1. Clone o repositório:


git clone https://github.com/jeanlucasandra/CadastroDeCarros.git


2. Entre na pasta do projeto:


cd CadastroDeCarros/src


3. Compile os arquivos:


javac Carros.java CadastroDeCarros.java Main.java


4. Execute o programa:


java Main


> **Obs.:** no comando "java Main", não coloque ".java" nem ".class", apenas o nome da classe que contém o método "main".

### Pela IDE (IntelliJ, Eclipse, VS Code)

1. Abra a pasta do projeto na IDE (**File > Open**).
2. Confirme que os três arquivos ("Carros.java", "CadastroDeCarros.java" e "Main.java") estão na mesma pasta.
3. Abra o "Main.java" e clique no botão **Run** (▶) ao lado do método "main", ou use o atalho:
   - **IntelliJ:** "Shift + F10"
   - **Eclipse:** "Ctrl + F11"
   - **VS Code:** botão **Run** acima do "public static void main"

O menu do programa vai aparecer no terminal integrado da IDE.

## 📋 Menu do programa

1 - Cadastrar carro
2 - Excluir carro
3 - Listar carros
4 - Editar carro
0 - Sair
