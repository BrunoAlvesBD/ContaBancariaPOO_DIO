public class ContaPopanca extends Conta{
    public ContaPopanca(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Conta popanca");
        super.imprimirInfosComuns();
    }
}
