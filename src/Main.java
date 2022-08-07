import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.depositar(100.0);

        cc.transferir(cp,100.0);
        cp.transferir(cc,50.0);

        cc.extrato();
        cp.extrato();

    }

}
