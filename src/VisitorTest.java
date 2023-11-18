public class VisitorTest {

    public static void main(String[] args) {

        TaxVisitorRS taxCalcRS = new TaxVisitorRS();

        TaxVisitorRJ taxCalcRJ = new TaxVisitorRJ();

        TaxVisitorAM taxCalcAM = new TaxVisitorAM();

        Alimento leite = new Alimento("leite",3.47);

        Combustivel gasolina = new Combustivel("gasolina",3.45);

        Tabaco cigarro = new Tabaco("cigarro",7.54);

        System.out.println("\nTAX PRICES RS\n");

        System.out.println(leite.getName()+": " + leite.accept(taxCalcRS));

        System.out.println(gasolina.getName()+": " + gasolina.accept(taxCalcRS));

        System.out.println(cigarro.getName()+": " + cigarro.accept(taxCalcRS) );

        System.out.println("\nTAX PRICES RJ\n");

        System.out.println(leite.getName()+": " +leite.accept(taxCalcRJ));

        System.out.println(gasolina.getName()+": " +gasolina.accept(taxCalcRJ));

        System.out.println(cigarro.getName()+": " +cigarro.accept(taxCalcRJ));

        System.out.println("\nTAX PRICES MA\n");

        System.out.println(leite.getName()+": " +leite.accept(taxCalcAM));

        System.out.println(gasolina.getName()+": " +gasolina.accept(taxCalcAM));

        System.out.println(cigarro.getName()+": " +cigarro.accept(taxCalcAM) );
    }

}
