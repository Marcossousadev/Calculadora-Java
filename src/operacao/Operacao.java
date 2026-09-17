package operacao;
 // definindo contrato das classes de operação
// dentro de uma interface não temos implementação, apenas assinatura
// por exemplo, um método que as classes que implementam essa interface, devem ter
public interface Operacao {
    double executar(double a, double b);
}
