// CLASSE QUE REPRESENTA UM PRODUTO COM NOME E PREÇO
package LambdaPredicate_Entities;

public class Product {

    // ATRIBUTOS DA CLASSE
    private String name;
    private Double price;

    // CONSTRUTOR COM ARGUMENTOS PARA INICIALIZAR NOME E PREÇO
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

    // MÉTODO ESTÁTICO PARA FILTRAGEM DE PRODUTOS BASEADO NO PREÇO
    public static boolean staticProductPredicate(Product p) {
        return p.getPrice() >= 100.0;
    }

    // MÉTODO NÃO-ESTÁTICO PARA FILTRAGEM DE PRODUTOS BASEADO NO PREÇO
    public boolean nonStaticProductPredicate() {
        return price >= 100.0;
    }

    // MÉTODO toString PARA RETORNAR A REPRESENTAÇÃO DO PRODUTO EM STRING
    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }
}
