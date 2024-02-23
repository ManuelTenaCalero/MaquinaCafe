public class Maquina {

    private DepositoCafe Cafe;
    private DepositoAgua1 deposito1;

    private  DepositoAgua2 deposito2;
    private Molinillo molinillo;
    private Dispensador edulcorante;

    public Maquina(){
        this.Cafe = new DepositoCafe();
        this.deposito1 = new DepositoAgua1();
        this.deposito2 = new DepositoAgua2();
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

    public void prepararCafeDescafeinado(){
        Maquina descafeinado = new Maquina();
        descafeinado.molinillo.moler();
        descafeinado.deposito1.verterAgua();
        descafeinado.Cafe.CafeDescafeinado();
        descafeinado.edulcorante.Sacarina();
    }
}
