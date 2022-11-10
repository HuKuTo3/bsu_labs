package Lab_1;

import java.util.ArrayList;

import static Lab_1.TriangleTypes.RECTANGULAR;

public class Test {
    public static void main(String[] args) {
        ArrayList<Triangle> triangles = new ArrayList<Triangle>();
//        Triangle triangle0 = new Triangle(new Point(4, 0), new Point(0, 0), new Point(2, 2 * Math.sqrt(3))); //равност.
//        triangles.add(triangle0);
        //с помощью точек сложно построить равносторонний треугольник
        Triangle triangle0 = new Triangle(4, 4, 4); //равност.
        triangles.add(triangle0);
        Triangle triangle1 = new Triangle(new Point(0, 6), new Point(4, 4), new Point(0, 0)); //разност.
        triangles.add(triangle1);
        Triangle triangle2 = new Triangle(new Point(0, 3), new Point(4, 0), new Point(0, 0)); //прямоуг.
        triangles.add(triangle2);
        Triangle triangle3 = new Triangle(new Point(3, 3), new Point(0, 6), new Point(0, 0)); //равноб.
        triangles.add(triangle3);

        SortTriangleByTypes.addTriangleToList(triangles);
        System.out.println(SortTriangleByTypes.getTriangleTypesTable() + "\n\n");
        SortTriangleByTypes.findAll();

    }
}
