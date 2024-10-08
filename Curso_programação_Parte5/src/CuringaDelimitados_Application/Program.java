package CuringaDelimitados_Application;

// O CURINGA DELIMITADO <? extends Shape> PERMITE QUE UMA LISTA DE QUALQUER TIPO QUE SEJA SUBCLASSE
// OU IMPLEMENTAÇÃO DE Shape SEJA PASSADA COMO PARÂMETRO PARA O MÉTODO totalArea.
// ISSO OFERECE FLEXIBILIDADE AO PROGRAMA, PERMITINDO QUE O MÉTODO ACEITE LISTAS DE CÍRCULOS, RETÂNGULOS
// OU QUALQUER OUTRA CLASSE QUE IMPLEMENTE A INTERFACE Shape.

import java.util.ArrayList;
import java.util.List;

import CuringaDelimitados_Entities.Circle;
import CuringaDelimitados_Entities.Rectangle;
import CuringaDelimitados_Entities.Shape;

public class Program {

    public static void main(String[] args) {

        // CRIA UMA LISTA DE Shape, QUE PODE CONTER QUALQUER OBJETO QUE IMPLEMENTE Shape.
        List<Shape> myShapes = new ArrayList<>();
        // ADICIONA UM RETÂNGULO E UM CÍRCULO À LISTA myShapes.
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0)); 

        // CRIA UMA LISTA ESPECÍFICA DE CÍRCULOS.
        List<Circle> myCircles = new ArrayList<>();
        // ADICIONA DOIS CÍRCULOS À LISTA myCircles.
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        // IMPRIME A ÁREA TOTAL DOS CÍRCULOS USANDO O MÉTODO totalArea.
        System.out.println("Total area: " + totalArea(myCircles));
    }

    // MÉTODO PARA CALCULAR A ÁREA TOTAL DE UMA LISTA DE OBJETOS QUE IMPLEMENTEM Shape.
    // O CURINGA DELIMITADO <? extends Shape> PERMITE PASSAR LISTAS DE QUALQUER TIPO
    // QUE ESTENDA Shape, COMO Circle OU Rectangle.
    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        // LOOP PARA SOMAR A ÁREA DE CADA OBJETO NA LISTA.
        for (Shape s : list) {
            sum += s.area();
        }
        // RETORNA A SOMA DAS ÁREAS.
        return sum;
    }
}
