package operacao;

public class Multiplicacao implements Operacao {
    @Override
    public double executar(double a, double b) {
        return a * b;
    }
}
