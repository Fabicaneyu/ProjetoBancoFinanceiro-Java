/*
Classe corrente é um tipo de conta,
a classe correte herda clase conta
devido a saque ser uma interface, se usa o Implements
 */


public class Corrente extends Conta implements Saque {
    // Característica da classe é o tipo de conta
    final private String tipo = "Conta Corrente";
    private double limite = 0;

    // Construtor padrão

    //Metodos get e set

    public String getTipo() {
        return tipo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    // o override indica que esse metodo não pode tirar, deixa lá
    @Override
    public void saque(double valor, int senha) {
        //verificar se a senha esta correta, instanciando a variavel da classe conta, por isso usa o get.
        if (getSenha() == senha) {
            double disponivel = getSaldo() + getLimite();
            // se a senha esta correta, verifica o saldo
            if (disponivel >= valor) {
                double novoSaldo = getSaldo() - valor;
                setSaldo(novoSaldo);
                System.out.println("Saque realizado. Saldo atual: "+ novoSaldo);
            } else {
                System.out.println("Saque insuficiente");
            }
        } else {
            System.out.println("Senha incorreta.");
        }
        //double disponivel =  + limite;
        //if (valor <= disponivel ) {
            //setSaldo(getSaldo()-valor);
            //System.out.println("Saque realizado com sucesso!");
            //System.out.println(getSaldo());
        //} else {
            //System.out.println("Saque não realizado");
        //}

    } // Fim do metodo saque
} // Fim classe Corrente