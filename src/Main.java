import calculadora.Calculadora;
import operacao.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // captura dos dados através do scanner
        Calculadora minhaCalculadora = new Calculadora(); // Instanciação

        System.out.println("Digite o primeiro número");
        double numero1;
        // tratamento de exceções, esse scanner não pode receber letras
        try {
            numero1 = scanner.nextDouble(); // recebe o 1 número do terminal
        }
        catch(InputMismatchException exception) {
            System.out.println("Erro: informe apenas números.");
            return;
        }

        System.out.println("Digite o segundo número:");
        double numero2;
        // tratamento de exceções, esse scanner não pode receber letras
        try {
            numero2 = scanner.nextDouble(); // recebe o 2 número do terminal
        }
        catch(InputMismatchException exception){
            System.out.println("Erro: informe apenas números.");
            return;
        }

        System.out.println("\nEscolha a operação");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");

        System.out.println("Opção: ");
        int opcao;
        // tratamento de exceções, esse scanner não pode receber letras
        try {
            opcao = scanner.nextInt();
        }
        catch (InputMismatchException expection) {
            System.out.println("Erro: informe apenas o número da operação!");
            return;
        }

        Operacao operacao;
        String nome_operacao;
        switch(opcao){
            case 1:
                operacao = new Soma();
                nome_operacao = "soma";
                break;
            case 2:
                operacao = new Subtrair();
                nome_operacao = "subtração";
                break;
            case 3:
                operacao = new Dividir();
                nome_operacao = "divisão";
                break;
            case 4:
                operacao = new Multiplicacao();
                nome_operacao = "multiplicação";
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

       double resultado = minhaCalculadora.calcular(numero1, numero2, operacao);

        System.out.println("Resultado " + nome_operacao + ": " + resultado);

        scanner.close();
    }
}