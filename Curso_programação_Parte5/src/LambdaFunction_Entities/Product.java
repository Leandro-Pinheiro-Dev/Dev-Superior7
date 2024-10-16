// CLASSE QUE REPRESENTA UM PRODUTO COM NOME E PREÇO
package LambdaFunction_Entities;

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

    // MÉTODO NÃO ESTÁTICO PARA CONVERTER O NOME PARA MAIÚSCULAS
    public String nonStaticUpperCaseName() {
        return name.toUpperCase();
    }

    // MÉTODO ESTÁTICO PARA CONVERTER O NOME DO PRODUTO EM MAIÚSCULAS
    public static String staticUpperCaseName(Product p) {
        return p.getName().toUpperCase();
    }

    // MÉTODO toString PARA REPRESENTAR O PRODUTO COMO UMA STRING
    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }
}
