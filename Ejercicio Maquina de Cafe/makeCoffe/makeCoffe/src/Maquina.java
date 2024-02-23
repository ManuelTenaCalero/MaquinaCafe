public class Maquina {

    private DepositoCafe Cafe;
    private DepositoAgua1 deposito1;
    private Molinillo molinillo;
    private Dispensador edulcorante;

    public Maquina(){
        this.Cafe = new DepositoCafe();
        this.deposito1 = new DepositoAgua1();
        this.molinillo = new Molinillo();
        this.edulcorante = new Dispensador();
    }

    public void prepararCafeNormal(){
        Maquina normal = new Maquina();
        normal.molinillo.moler();
        normal.deposito1.verterAgua();
        normal.Cafe.CafeNormal();
        normal.edulcorante.Azucar();
    }
}
