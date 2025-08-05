public class Produto {
    private String nome;
    private double preco;
    private int quant;

    public Produto(String nome, double preco, int quant) {
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }

    public double precoTotal() {return this.preco * this.quant;}

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuant() {
        return quant;
    }

    public void addQuant(int quant) {
        this.quant += quant;
    }

    public void subQuant(int quant){
        this.quant -= quant;
    }

    public String toString() {
        return "Nome: " + getNome()
                + " Preco: $ " + getPreco()
                + " Quantidade: " + getQuant() + " unidades"
                + " Total: $ " + precoTotal();
    }
}