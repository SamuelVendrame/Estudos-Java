package ex7;

public class Produto {
    private int id;
    private String nome;
    private double preco;

    public Produto(int id, String nome, double preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public Double getPreco() { return preco;}
    public int getId() { return id; }

    public void setId(int id) {
        if(id < 0){
            System.out.println("Id nao pode ser menor que 0");
            return;
        }
        this.id = id;
    }

    public void setNome(String nome) {
        if(nome == null || nome.isBlank()){
            System.out.println("Nome nao pode ser vazio");
            return;
        }
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if(preco < 0){
            System.out.println("Preco nao pode ser menor que 0");
            return;
        }
        this.preco = preco;
    }

}
