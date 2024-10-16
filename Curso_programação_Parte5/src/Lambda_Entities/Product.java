// CLASSE QUE REPRESENTA UM PRODUTO COM NOME E PREÇO
package Lambda_Entities;

public class Product {

    // ATRIBUTOS DA CLASSE
    private String name;
    private Double price;

    // CONSTRUTOR PADRÃO
    public Product() {
    }

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

    // MÉTODO toString PARA RETORNAR A REPRESENTAÇÃO DO PRODUTO EM STRING
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }
}
