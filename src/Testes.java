public class Testes {
    public static void main(String[] args) {
        // Testa conta corrente
        //criar uma instancia da CC e junto com ela vem as variaveis da classe conta e interface saque
        Corrente corrente001 = new Corrente();
        corrente001.setNome("Fulano de tal");
        corrente001.setSaldo(1000);
        corrente001.setCpf(123456789);
        corrente001.setNumeroConta(1234);
        corrente001.setSenha(9999);
        corrente001.setLimite(1000);

        //criar uma instancia da Poupanca e junto com ela vem as variaveis da classe conta e interface saque
        Poupanca poupanca001 = new Poupanca();
        poupanca001.setNome("Fulano de tal");
        poupanca001.setSaldo(2000);
        poupanca001.setCpf(123456789);
        poupanca001.setNumeroConta(7777);
        poupanca001.setSenha(0000);

        // verifica se os saldos são distintos
        System.out.println(corrente001.getSaldo() + "\n"+ poupanca001.getSaldo());

        // verifica depositos
        corrente001.deposito(500, 9999);
        poupanca001.deposito(1000, 0000);

        // verifica saques
        corrente001.saque(700, 9999);
        System.out.println(corrente001.getSaldo() + "\n"+ poupanca001.getSaldo());

        poupanca001.saque(200, 0000);
        System.out.println(poupanca001.getSaldo() + "\n"+ poupanca001.getSaldo());
    }
}
