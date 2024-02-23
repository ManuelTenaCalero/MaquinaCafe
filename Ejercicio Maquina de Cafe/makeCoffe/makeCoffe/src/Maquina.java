public class Maquina {

    private DepositoCafe Cafe;
    private DepositoAgua deposito;
    private Molinillo molinillo;
    private Dispensador edulcorante;

    public Maquina(DepositoCafe x, DepositoAgua y, Molinillo z, Dispensador t){
        this.Cafe = x;
        this.deposito = y;
        this.molinillo = z;
        this.edulcorante = t;
    }

    public void prepararCafeNormal(){


    }
}
