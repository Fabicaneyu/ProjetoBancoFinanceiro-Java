/*
Classe Cliente com atributos private, portanto
só serão acessados dentro desta classe.
esta classe será abstrata pois de fato ela não existe
logo não faz sentido permitir que criem objeto dela
 */

public abstract class Cliente {

    private String nome;
    private int cpf;

    // Construtor será o padrão, e não é mecessário
    // colocar o seu código

    // Incluir os métodos de excrita e leitura (get e set).
    // Complementar o código padrão com restrição de acess.


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}// Fim da classe Cliente
