package CuringaDelimitados_Entities;

// IMPLEMENTAÇÃO DA CLASSE Circle, QUE REPRESENTA UM CÍRCULO E IMPLEMENTA A INTERFACE Shape.
public class Circle implements Shape {

    private double radius;

    // CONSTRUTOR QUE INICIALIZA O RAIO DO CÍRCULO.
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    // MÉTODO GETTER PARA O RAIO.
    public double getRadius() {
        return radius;
    }

    // MÉTODO SETTER PARA O RAIO.
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // IMPLEMENTAÇÃO DO MÉTODO area DA INTERFACE Shape.
    // RETORNA A ÁREA DO CÍRCULO BASEADA NA FÓRMULA PI * RAIO².
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
