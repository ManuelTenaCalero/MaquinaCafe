public class Dispensador implements IDispensador{

    private String Edulcorante;

    public Dispensador(String x){

        this.Edulcorante = x;
    }

    public void TipoEdulcorante(){

        switch (Edulcorante){

            case "Azucar":
                System.out.println("Vierte Azucar al cafe");
                break;
            case "Sacarina":
                System.out.println("Vierte Sacarina");
                break;
            default:
                System.out.println("No hay ese tipo de deposito");

        }
    }

}
