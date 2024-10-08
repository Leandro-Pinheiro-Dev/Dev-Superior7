/*
 * A CLASSE Product REPRESENTA UM PRODUTO COM NOME E PREÇO.
 * IMPLEMENTA A INTERFACE Comparable PARA QUE OS OBJETOS DESSA CLASSE POSSAM SER
 * COMPARADOS BASEADOS NO PREÇO.
 */
package GenericsDelimitados_Entities;

public class Product implements Comparable<Product> {

    // ATRIBUTOS PRIVADOS: NOME E PREÇO DO PRODUTO
    private String name;
    private Double price;
    
    // CONSTRUTOR QUE INICIALIZA O PRODUTO COM NOME E PREÇO
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    // MÉTODOS GETTERS E SETTERS PARA ACESSAR E MODIFICAR O NOME DO PRODUTO
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // MÉTODOS GETTERS E SETTERS PARA ACESSAR E MODIFICAR O PREÇO DO PRODUTO
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // MÉTODO toString PARA EXIBIR AS INFORMAÇÕES DO PRODUTO EM FORMATO DE STRING
    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);  // RETORNA O NOME E O PREÇO FORMATADO COM DUAS CASAS DECIMAIS
    }

    // IMPLEMENTAÇÃO DO MÉTODO compareTo DA INTERFACE Comparable
    // ESSE MÉTODO COMPARA O PREÇO DO PRODUTO ATUAL COM O PREÇO DE OUTRO PRODUTO
    @Override
    public int compareTo(Product other) {
        return price.compareTo(other.getPrice());  // COMPARA OS PREÇOS E RETORNA UM VALOR INTEIRO
    }
}
