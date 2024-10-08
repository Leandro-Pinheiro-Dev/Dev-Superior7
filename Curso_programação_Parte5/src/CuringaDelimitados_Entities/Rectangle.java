package CuringaDelimitados_Entities;

// IMPLEMENTAÇÃO DA CLASSE Rectangle, QUE REPRESENTA UM RETÂNGULO E IMPLEMENTA A INTERFACE Shape.
public class Rectangle implements Shape {

    private double width;
    private double height;

    // CONSTRUTOR QUE INICIALIZA A LARGURA E ALTURA DO RETÂNGULO.
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // MÉTODO GETTER PARA A LARGURA.
    public double getWidth() {
        return width;
    }

    // MÉTODO SETTER PARA A LARGURA.
    public void setWidth(double width) {
        this.width = width;
    }

    // MÉTODO GETTER PARA A ALTURA.
    public double getHeight() {
        return height;
    }

    // MÉTODO SETTER PARA A ALTURA.
    public void setHeight(double height) {
        this.height = height;
    }

    // IMPLEMENTAÇÃO DO MÉTODO area DA INTERFACE Shape.
    // RETORNA A ÁREA DO RETÂNGULO MULTIPLICANDO A LARGURA PELA ALTURA.
    @Override
    public double area() {
        return width * height;
    }
}
