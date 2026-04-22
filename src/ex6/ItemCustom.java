package ex6;

public class ItemCustom {
    private String name;
    private double durabilidade;
    private String raridade;

    public ItemCustom() {}

    public ItemCustom(String name, double durabilidade, String raridade) {
        this.name = name;
        this.durabilidade = durabilidade;
        this.raridade = raridade;
    }

    public String getName() { return this.name; }
    public double getDurabilidade() { return this.durabilidade; }
    public String getRaridade() { return this.raridade; }


}
