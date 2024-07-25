import java.util.*;
import lombok.Data;

@Data
public class Banco {
    private String nome;
    private List<Conta> contas;

    //metodo para adicionar contas
    public void adicionaConta(Conta conta) {
        this.contas.add(conta);
    }
/*
    //metodo para percorrer e mostrar todas as contas
    public void listarContas() {
        contas.ForEach(conta -> {
            System.out.println("Cliente: "+ conta.getCliente().getNome());
            System.out.println("Agência: "+ conta.getAgencia());
            System.out.println("Número: "+ conta.getNumero());
            System.out.println("Número: "+ conta.getSaldo());
            System.out.println();
        });
    }*/

}
