// CLASSE QUE REPRESENTA UM PRODUTO COM NOME E PREÇO
package LambdaConsumer_Entities;

public class Product {

    // ATRIBUTOS DA CLASSE: NOME E PREÇO DO PRODUTO
    private String name;
    private Double price;

    // CONSTRUTOR PARA INICIALIZAR O PRODUTO COM NOME E PREÇO
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    // MÉTODOS GETTER E SETTER PARA O NOME DO PRODUTO
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // MÉTODOS GETTER E SETTER PARA O PREÇO DO PRODUTO
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // MÉTODO ESTÁTICO PARA ATUALIZAR O PREÇO, MULTIPLICANDO POR 1.1
    public static void staticPriceUpdate(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }

    // MÉTODO NÃO-ESTÁTICO PARA ATUALIZAR O PREÇO, MULTIPLICANDO POR 1.1
    public void nonStaticPriceUpdate() {
        price = price * 1.1;
    }

    // MÉTODO toString PARA REPRESENTAR O PRODUTO COMO UMA STRING
    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }
}
