import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        Cliente gustavo = new Cliente();
        gustavo.setNome("Gustavo");
        Conta cc = new ContaCorrente(gustavo);
        Conta cp = new ContaPoupanca(gustavo);

        cc.depositar(100.0);

        cc.transferir(cp,100.0);
        cp.transferir(cc,50.0);
        cc.sacar(100.0);
        System.out.println();
        cc.extrato();
        cp.extrato();
        System.out.println();
        cc.transferir(cc,550.0);
        System.out.println();
        cc.extrato();
        cp.extrato();


    }

}
