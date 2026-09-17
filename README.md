# 🧮 Calculadora POO em Java

Projeto desenvolvido para praticar conceitos de **Programação Orientada a Objetos (POO)** utilizando Java.

A aplicação consiste em uma calculadora capaz de realizar operações matemáticas básicas, utilizando **interfaces, classes, objetos, instanciação e polimorfismo**.

## 📚 Objetivo

O principal objetivo deste projeto é colocar em prática os conceitos fundamentais de POO estudados em Java, criando uma aplicação simples, mas estruturada de forma que cada classe tenha uma responsabilidade específica.

## ⚙️ Funcionalidades

A calculadora permite realizar:

* ➕ Soma
* ➖ Subtração
* ✖️ Multiplicação
* ➗ Divisão
* ⌨️ Entrada de dados pelo usuário
* 🔄 Escolha da operação através de um menu
* ⚠️ Tratamento de operações inválidas

## 🧠 Conceitos de Java e POO praticados

Neste projeto foram utilizados:

* Classes
* Objetos
* Instanciação
* Métodos
* Atributos
* Interfaces
* Implementação de interfaces
* Polimorfismo
* Encapsulamento
* Modificadores de acesso
* `Scanner` para entrada de dados
* `switch`
* Tratamento de exceções
* Organização em pacotes

## 📁 Estrutura do projeto

```text
src/
├── calculadora/
│   └── Calculadora.java
│
├── operacao/
│   ├── Operacao.java
│   ├── Soma.java
│   ├── Subtrair.java
│   ├── Dividir.java
│   └── Multiplicacao.java
│
└── Main.java
```

## 🔌 Interface `Operacao`

A interface define um contrato que todas as operações matemáticas devem seguir.

```java
public interface Operacao {

    double executar(double numero1, double numero2);

}
```

Dessa forma, cada operação possui sua própria implementação do método `executar()`.

### Exemplo

```java
public class Soma implements Operacao {

    @Override
    public double executar(double numero1, double numero2) {
        return numero1 + numero2;
    }
}
```

## 🔄 Polimorfismo

O projeto utiliza polimorfismo para trabalhar com diferentes operações através do tipo `Operacao`.

```java
Operacao operacao;

operacao = new Soma();
```

A mesma variável pode receber diferentes implementações:

```java
operacao = new Soma();
operacao = new Subtrair();
operacao = new Dividir();
operacao = new Multiplicacao();
```

A `Calculadora` não precisa conhecer os detalhes de cada operação. Ela recebe qualquer objeto que implemente `Operacao`:

```java
public double calcular(
        double numero1,
        double numero2,
        Operacao operacao
) {
    return operacao.executar(numero1, numero2);
}
```

Isso permite adicionar novas operações sem precisar alterar a lógica principal da calculadora.

## ⌨️ Entrada de dados

A interação com o usuário é realizada através da classe `Scanner`.

O usuário informa dois números e escolhe a operação que deseja realizar.

Exemplo:

```text
Digite o primeiro número: 10
Digite o segundo número: 5

Escolha uma operação:
1 - Soma
2 - Subtração
3 - Divisão
4 - Multiplicação

Opção: 1

Resultado: 15.0
```

## 🚀 Possíveis melhorias futuras

Como este é um projeto de estudos, novas funcionalidades podem ser adicionadas posteriormente, como:

* Tratamento de exceções personalizado
* Histórico de operações
* Potenciação
* Raiz quadrada
* Porcentagem
* Interface gráfica
* Novas formas de seleção das operações
* Melhor tratamento de entradas inválidas

## 🛠️ Tecnologias

* **Java**
* **IntelliJ IDEA**
* **Git**
* **GitHub**

## 📌 Status

🚧 Projeto desenvolvido para fins de **estudo e prática de Java e Programação Orientada a Objetos**.

O projeto poderá receber novas funcionalidades conforme novos conceitos de Java forem estudados.
