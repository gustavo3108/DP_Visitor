import java.text.DecimalFormat;

// Concrete Visitor Class
class TaxVisitorRS implements Visitor {
    // This formats the item prices to 2 decimal places
    DecimalFormat df = new DecimalFormat("#.##");
    // This is created so that each item is sent to the
    // right version of visit() which is required by the
    // Visitor interface and defined below
    public TaxVisitorRS() {

    }
    // Calculates total price based on this being taxed
    // as a Combustivel item
    public double visit(Combustivel combustivelItem) {
        System.out.println("Gasolina Item: Price with Tax");
        return Double.parseDouble(df.format((combustivelItem.getPrice() * .17) + combustivelItem.getPrice()));
    }
    // Calculates total price based on this being taxed
    // as a Tabaco item
    public double visit(Tabaco tabacoItem) {
        System.out.println("Tabaco Item: Price with Tax");
        return Double.parseDouble(df.format((tabacoItem.getPrice() * .27) + tabacoItem.getPrice()));
    }
    // Calculates total price based on this being taxed
    // as a Alimento item

    public double visit(Alimento alimentoItem) {
        System.out.println("Alimento Item: Price with Tax");
        return Double.parseDouble(df.format((alimentoItem.getPrice() * .12) + alimentoItem.getPrice()));
    }

}

