package Lab_1;

import java.util.ArrayList;

import static Lab_1.TriangleTypes.RECTANGULAR;

public class Test {
    public static void main(String[] args) {
        ArrayList<Triangle> triangles = new ArrayList<Triangle>();
        Triangle triangle0 = new Triangle(new Point(1, 1), new Point(0, 0), new Point(1, 0));
        triangles.add(triangle0);
        Triangle triangle1 = new Triangle(new Point(0, 3), new Point(4, 0), new Point(0, 0));
        triangles.add(triangle1);
        Triangle triangle2 = new Triangle(new Point(0, 2), new Point(2, 0), new Point(0, 0));
        triangles.add(triangle2);
        Triangle triangle3 = new Triangle(new Point(-3, 1), new Point(3, 5), new Point(0, -4));
        triangles.add(triangle3);

        SortTriangleByTypes.addTriangleToList(triangles);
        System.out.println(SortTriangleByTypes.getTriangleTypesTable());
        SortTriangleByTypes.findMaxPerimeter(RECTANGULAR);
    }
}
