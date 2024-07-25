public class Main {
    public static void main(String[] args) {
        Cliente Bruno = new Cliente();
        Bruno.setNome("Bruno");

        Conta cc = new ContaCorrente(Bruno);
        Conta poupanca = new ContaPopanca(Bruno);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
