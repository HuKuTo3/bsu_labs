package Lab_1;

import static Lab_1.TriangleTypes.RECTANGULAR;

public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(new Point(1, 1), new Point(0, 0), new Point(1, 0));
        //System.out.println(triangle);
        SortTriangleByTypes sortTriangleByTypes = new SortTriangleByTypes(triangle);
        //System.out.println(sortTriangleByTypes.getTriangleTypesTable());
        sortTriangleByTypes.findMaxPerimeter(sortTriangleByTypes.getTriangleTypesTable(), RECTANGULAR);
    }
}
