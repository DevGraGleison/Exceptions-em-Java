# Exceções em Java: Checked e Unchecked

Este repositório contém exemplos práticos sobre o tratamento de exceções em Java, explorando a hierarquia da classe `Throwable`.

## 📚 O que são Exceções?
Exceções são eventos que interrompem o fluxo normal de execução do programa. Em Java, elas são divididas principalmente em dois tipos:

### 1. Exceções Checked (Verificadas)
São exceções que o compilador **obriga** você a tratar ou declarar. Elas geralmente representam condições fora do controle do programa (ex: arquivo não encontrado).
- **Exemplo:** `IOException`, `SQLException`.
- **Tratamento:** Requer bloco `try-catch` ou declaração `throws` na assinatura do método.

### 2. Exceções Unchecked (Não Verificadas)
São exceções que herdam de `RuntimeException`. O compilador não obriga o tratamento, pois geralmente indicam erros de lógica ou mau uso da API.
- **Exemplo:** `NullPointerException`, `ArrayIndexOutOfBoundsException`, `ArithmeticException`.
- **Tratamento:** O ideal é evitar através de uma lógica de programação melhor, mas também podem ser capturadas se necessário.

---

## 🚀 Como executar o projeto
1. Clone o repositório.
2. Abra na sua IDE preferida (IntelliJ, Eclipse, VS Code).
3. Navegue até a pasta `src` para visualizar os exemplos de código.

## 🛠️ Tecnologias
- Java 17+ (ou a versão que você estiver usando)
- Git/GitHub
- IDE: IntelliJ
