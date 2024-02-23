public class Main {
    public static void main(String[] args) {

        if (args[0].equals("D"))
            System.out.println("Depósito de café descafeinado: verter café");
        else
            System.out.println("Depósito de café normal: verter café");

        System.out.println("Molinillo de café: muele café");

        if (args[2].equals("1"))
            System.out.println("Depósito de agua 1: verter agua");
        else
            System.out.println("Depósito de agua 2: verter agua");

        if (args[1].equals("S"))
            System.out.println("Dispensador de sacarina: echa sacarina");
        else
            System.out.println("Dispensador de azúcar: echa azúcar");

        if (args[2].equals("1"))
            System.out.println("Depósito de agua 1: enjuaga el circuito ");
        else
            System.out.println("Depósito de agua 2: enjuaga el circuito ");



    }
}