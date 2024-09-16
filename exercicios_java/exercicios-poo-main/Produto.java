package ExerciciosPOO;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void realizarCompra(int quantidadeComprada){
        if (quantidadeComprada>0){
            quantidadeEmEstoque+= quantidadeComprada;
            System.out.println(quantidadeComprada+" unidades de "+nome+" forem compradas.");
        }else {
            System.out.println("Quantidade inválida para compra.");
        }
    }

    public void exibirInformacoes(){
        System.out.println("Informações do Produto:");
        System.out.println("Nome: "+nome);
        System.out.println("Preço: R$"+preco);
        System.out.println("Quantidade em Estoque: "+quantidadeEmEstoque);
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Papel",3.00,5);

        produto.exibirInformacoes();
        produto.realizarCompra(20);
        produto.exibirInformacoes();
    }
}
