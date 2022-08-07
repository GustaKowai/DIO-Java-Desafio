public class ContaCorrente extends Conta{

    @Override
    public void extrato() {
        System.out.println("== Extrato da conta corrente ==");
        super.imprimirAtributos();

    }
}
