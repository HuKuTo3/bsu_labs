package Lab_1;

import java.util.*;

public class SortTriangleByTypes {
    private static Map<TriangleTypes, ArrayList<Object>> triangleTypesMap = new HashMap<>();

    public static void addTriangleToList(Triangle triangle) {
        double firstSideLength = triangle.getFirstSideLength();
        double secondSideLength = triangle.getSecondSideLength();
        double thirdSideLength = triangle.getThirdSideLength();
        boolean isRectangular = isRectangular(firstSideLength, secondSideLength, thirdSideLength);

        if (triangle.getIfExist()) {
            if ((firstSideLength == secondSideLength) && (firstSideLength == thirdSideLength)){
                tableOfTriangles(TriangleTypes.EQUILATERAL, triangle);
            } else if ((firstSideLength != secondSideLength) && (firstSideLength != thirdSideLength)
                    && (secondSideLength != thirdSideLength) && !isRectangular)  {
                tableOfTriangles(TriangleTypes.ARBITRARY, triangle);
            } else if (isRectangular) {
                tableOfTriangles(TriangleTypes.RECTANGULAR, triangle);
            }else {
                tableOfTriangles(TriangleTypes.ISOSCELES, triangle);
            }
        }
    }

    public static void addTriangleToList(ArrayList<Triangle> triangles) {
        for (Triangle obj : triangles) {
            addTriangleToList(obj);
        }
    }

    public static boolean isRectangular(double firstSideLength, double secondSideLength, double thirdSideLength) {
        List<Double> lengthOfSides = new ArrayList<>();

        lengthOfSides.add(firstSideLength);
        lengthOfSides.add(secondSideLength);
        lengthOfSides.add(thirdSideLength);

        double maxLength = Collections.max(lengthOfSides);
        lengthOfSides.remove(maxLength);

        return maxLength == Math.sqrt(Math.pow(lengthOfSides.get(0), 2) + Math.pow(lengthOfSides.get(1), 2));
    }

    private static void tableOfTriangles(TriangleTypes triangleType, Triangle triangle){
        triangleTypesMap.computeIfAbsent(triangleType, k -> new ArrayList<>());
        triangleTypesMap.get(triangleType).add(triangle);
    }

    public static Map<TriangleTypes, ArrayList<Object>> getTriangleTypesTable() {
        return triangleTypesMap;
    }

    public static double findMaxPerimeter(TriangleTypes triangleType) {
        ArrayList<Double> trianglePerimeters = new ArrayList<>();
        Triangle triangle = null;
        for (Object obj : triangleTypesMap.get(triangleType)) {
            triangle = (Triangle) obj;
            trianglePerimeters.add(triangle.getPerimeter());
        }
        double maxPerimeter = Collections.max(trianglePerimeters);
        System.out.println("Max perimeter of " + triangleType.name() + " type -> " + maxPerimeter
                + "\n" + triangle.toString());

        return maxPerimeter;
    }

    public static double findMaxSquare(TriangleTypes triangleType){
        ArrayList<Double> triangleSquares = new ArrayList<>();
        Triangle triangle = null;
        for (Object obj : triangleTypesMap.get(triangleType)) {
            triangle = (Triangle) obj;
            triangleSquares.add(triangle.getSquare());
        }
        double maxSquare = Collections.max(triangleSquares);
        System.out.println("Max square of " + triangleType.name() + " type -> " + maxSquare
                + "\n" + triangle.toString());

        return maxSquare;
    }

    public static double findMinPerimeter(TriangleTypes triangleType){
        ArrayList<Double> trianglePerimeters = new ArrayList<>();
        Triangle triangle = null;
        for (Object obj : triangleTypesMap.get(triangleType)) {
            triangle = (Triangle) obj;
            trianglePerimeters.add(triangle.getPerimeter());
        }
        double minPerimeter = Collections.min(trianglePerimeters);
        System.out.println("Min perimeter of " + triangleType.name() + " type -> " + minPerimeter
                + "\n" + triangle.toString());

        return minPerimeter;
    }

    public static double findMinSquare(TriangleTypes triangleType){
        ArrayList<Double> triangleSquares = new ArrayList<>();
        Triangle triangle = null;
        for (Object obj : triangleTypesMap.get(triangleType)) {
            triangle = (Triangle) obj;
            triangleSquares.add(triangle.getSquare());
        }
        double minSquare = Collections.min(triangleSquares);
        System.out.println("Min square of " + triangleType.name() + " type -> " + minSquare
                + "\n" + triangle.toString());

        return minSquare;
    }
}
