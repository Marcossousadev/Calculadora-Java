package calculadora;

import operacao.Operacao;

public class Calculadora {
   public double calcular(double a, double b, Operacao operacao){
       return operacao.executar(a, b);
   }
}
