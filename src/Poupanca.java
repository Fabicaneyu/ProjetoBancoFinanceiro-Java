/*
Classe Poupanca é um tipo de conta então
herda a classe conta
com o implements obriga a usar a interface
 */

public class Poupanca extends Conta implements Saque {
    final private String tipo = "Conta Poupança";
    private double rendimento;
    // Construtor padrão

    // Metodos get e set

    public String getTipo() {
        return tipo;
    }

    // Implementar metodo rendimento
    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    @Override
    public void saque(double valor, int senha) {

        //verificar se a senha esta correta, instanciando a variavel da classe conta, por isso usa o get.
        if (getSenha() == senha) {
            // se a senha esta correta, verifica o saldo
            if (getSaldo() >= valor) {
                double novoSaldo = getSaldo() - valor;
                setSaldo(novoSaldo);
                System.out.println("Saque realizado. Saldo atual: " + novoSaldo);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Senha incorreta.");
        }
// Fim Poupança
    }
}