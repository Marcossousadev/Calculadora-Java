package operacao;
// se fosse uma classe abstrata, seria extends, pq estaríamos herdando
public class Subtrair implements Operacao {
    @Override
    public double executar(double a, double b) {
        return a - b;
    }
}
