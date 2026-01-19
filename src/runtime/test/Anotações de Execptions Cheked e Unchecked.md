
# 1. **_Exceções Checked (Checadas)

##  São exceções que o compilador obriga você a tratar.
## Elas geralmente representam situações fora do controle do programador (problemas externos).

Herança: Herdam diretamente da classe Exception (mas não de RuntimeException).

## Quando ocorrem: Problemas com arquivos (FileNotFoundException), conexão de rede ou banco de dados (SQLException).

* ## Regra: Se você chamar um método que lança uma exceção checada, 
* ## você deve obrigatoriamente usar um bloco try-catch ou declarar que
## * o seu método também lança essa exceção usando throws.


-----------------------------------------------------------------------------------------------------

# 2. **_Exceções Unchecked (Não Checadas)_**

## São aquelas que você viu na sua imagem anterior (como ArrayIndexOutOfBoundsException).
## * O compilador não verifica se você as tratou. Elas geralmente indicam falhas na lógica do código.

Herança: Herdam da classe RuntimeException.

## Quando ocorrem: Erros de programação (bugs), 

## como tentar acessar um índice que não existe, 
## dividir por zero ou usar um objeto nulo (NullPointerException).

## Regra: Você não é obrigado a tratar com try-catch. 

##  O ideal aqui, segundo o Clean Code, é corrigir a lógica 

(ex: colocar um if para checar se o objeto é nulo) em vez de apenas "esconder" o erro com um catch.


--------------------------------------------------------------------------------------------------------

## Característica	Checked (Checada)
 Classe Pai	Exception

## Checada pelo Compilador?Sim (o código não compila sem o tratamento)

## Causa comum	Fatores externos (Rede, Arquivos)
## Exemplos	IOException, SQLException

----------------------------------------------------------------------------------------------------------SSS

## Unchecked (Não Checada)

RuntimeException

## Não (o erro aparece apenas ao rodar)

## Erro de lógica (Bugs do programador)

## NullPointerException, ArithmeticException

