public interface Visitor {
    // Created to automatically use the right
        // code based on the Object sent
        // Method Overloading
    public double visit(Combustivel combustivelItem);
    public double visit(Tabaco tabacoItem);
    public double visit(Alimento alimentoItem);
}
