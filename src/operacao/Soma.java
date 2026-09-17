package operacao;

// aqui dentro entra o conceito de polimorfismo, muitas outras classes vão utilizar essa interface,
// mas a implementação de cada uma vai realizar uma operação diferente, mesmo que o método seja o mesmo nome
public class Soma implements Operacao{
    @Override
    public double executar(double a, double b) {
        return a + b;
    }
}
