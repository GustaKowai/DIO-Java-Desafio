public class ContaPoupanca extends Conta{

    @Override
    public void extrato() {
        System.out.println("== Extrato conta poupança ==");
        super.imprimirAtributos();
    }


}

