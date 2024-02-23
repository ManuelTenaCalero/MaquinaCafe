public class DepositoAgua implements IDepositoAgua {

    private int Agua;

    public DepositoAgua(int x){

        this.Agua = x;
    }

    public void TipoDeposito(){

        switch (Agua){

            case 1:
                System.out.println("Vierte agua del deposito 1");
                break;
            case 2:
                System.out.println("Vierte agua del deposito 2");
                break;
            default:
                System.out.println("No hay ese tipo de deposito");

        }
    }
}
