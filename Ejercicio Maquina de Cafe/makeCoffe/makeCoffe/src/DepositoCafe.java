public class DepositoCafe implements IDepositoCafe{

    private String Cafe;

    public DepositoCafe(String x){

        this.Cafe = x;
    }

    public void TipoCafe(){

        switch (Cafe){

            case "Normal":
                System.out.println("Vierte cafe del deposito de Cafe normal");
                break;
            case "Descafeinado":
                System.out.println("Vierte cafe del deposito de cafe descafeinado");
                break;
            default:
                System.out.println("No hay ese tipo de deposito");

        }
    }
}
