/*
Classe conta herda as caracteristicas do cliente
 */


public class Conta extends Cliente{
    private int numeroConta;
    private double saldo = 0; // Saldo deve iniciar com 0
    private int senha;
    // Para exemplificar, faremos a agência e nome do bamco ser fixa para todos clientes
    final private int agencia = 3497;
    final private String Banco ="Banco da Gente";

    // Construtor padrão

    // Métodos get e set


    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    //devido a ser final não sera set, só get
    public int getAgencia() {
        return agencia;
    }

    public String getBanco() {
        return Banco;
    }

    //implementar o metodo de deposito, deve retornar o valor depositado e
    // e o saldo atualizado. Somente o cliente pode fazer o deposito
    // void pois retorna
    public void deposito(double valor, int senha) {
        // verificar senha
        if (this.senha == senha) {
            // se senha conferir, efetuar o deposito
            saldo = saldo + valor;
            System.out.println("Deposito: "+valor);

            //if (getTipo == "Conta Corrente") {
                System.out.println("Saldo atual: "+saldo);
            //} else {
            //System.out.println("Saldo atual Poupança: "+saldo);
            //}

        }
        else {
            System.out.println("Senha incorreta");
        }
    }


}// Fim da classe conta
