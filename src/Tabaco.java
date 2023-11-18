class Tabaco implements Visitable {

    private double price;

    private String name;

    Tabaco(String name, double item) {
        this.name = name;
        price = item;

    }

    public double accept(Visitor visitor) {

        return visitor.visit(this);

    }

    public double getPrice() {

        return price;

    }

    public String getName() {

        return name;

    }
}


