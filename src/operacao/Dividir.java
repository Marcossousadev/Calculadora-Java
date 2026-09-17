package operacao;

public class Dividir implements Operacao {
    @Override
    public double executar(double a, double b) {
       if(b == 0) {
           throw  new ArithmeticException("Não é possível dividir um número por 0");
       }
       return a / b;
    }
}
