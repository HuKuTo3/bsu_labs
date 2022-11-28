package Lab_1_Triangle;

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

    public static Triangle findMaxPerimeter(TriangleTypes triangleType){
        Triangle triangleWithMaxPerimeter = null;
        double maxPerimeter = 0;

        if (triangleTypesMap.get(triangleType) != null) {
            for (Object obj : triangleTypesMap.get(triangleType)) {
                Triangle triangle = (Triangle) obj;
                if (triangle.getPerimeter() > maxPerimeter) {
                    maxPerimeter = triangle.getPerimeter();
                    triangleWithMaxPerimeter = triangle;
                }
            }

            System.out.println("Max perimeter of " + triangleType.name() + " type -> " + maxPerimeter
                    + "\n" + triangleWithMaxPerimeter.toString());
        } else {
            System.out.println("No triangles of this type -> " + triangleType.name());
        }

        return triangleWithMaxPerimeter;
    }

    public static Triangle findMaxSquare(TriangleTypes triangleType){
        Triangle triangleWithMaxSquare = null;
        double maxSquare = 0;

        if (triangleTypesMap.get(triangleType) != null) {
            for (Object obj : triangleTypesMap.get(triangleType)) {
                Triangle triangle = (Triangle) obj;
                if (triangle.getSquare() > maxSquare) {
                    maxSquare = triangle.getSquare();
                    triangleWithMaxSquare = triangle;
                }
            }

            if (triangleWithMaxSquare != null) {
                System.out.println("Max square of " + triangleType.name() + " type -> " + maxSquare
                        + "\n" + triangleWithMaxSquare.toString());
            }
        } else {
            System.out.println("No triangles of this type -> " + triangleType.name());
        }

        return triangleWithMaxSquare;
    }

    public static Triangle findMinPerimeter(TriangleTypes triangleType){
        Triangle triangleWithMinPerimeter = null;
        double minPerimeter = Double.MAX_VALUE;

        if (triangleTypesMap.get(triangleType) != null) {
            for (Object obj : triangleTypesMap.get(triangleType)) {
                Triangle triangle = (Triangle) obj;
                if (triangle.getPerimeter() < minPerimeter) {
                    minPerimeter = triangle.getPerimeter();
                    triangleWithMinPerimeter = triangle;
                }
            }

            if (triangleWithMinPerimeter != null) {
                System.out.println("Min perimeter of " + triangleType.name() + " type -> " + minPerimeter
                        + "\n" + triangleWithMinPerimeter.toString());
            }
        } else {
            System.out.println("No triangles of this type -> " + triangleType.name());
        }

        return triangleWithMinPerimeter;
    }

    public static Triangle findMinSquare(TriangleTypes triangleType){
        Triangle triangleWithMinSquare = null;
        double minSquare = Double.MAX_VALUE;

        if (triangleTypesMap.get(triangleType) != null) {
            for (Object obj : triangleTypesMap.get(triangleType)) {
                Triangle triangle = (Triangle) obj;
                if (triangle.getSquare() < minSquare) {
                    minSquare = triangle.getSquare();
                    triangleWithMinSquare = triangle;
                }
            }

            if (triangleWithMinSquare != null) {
                System.out.println("Min square of " + triangleType.name() + " type -> " + minSquare
                        + "\n" + triangleWithMinSquare.toString());
            }
        } else {
            System.out.println("No triangles of this type -> " + triangleType.name());
        }

        return triangleWithMinSquare;
    }

    public static void findAll() {
        System.out.println("EQUILATERAL");
        findMaxPerimeter(TriangleTypes.EQUILATERAL);
        findMaxSquare(TriangleTypes.EQUILATERAL);
        findMinPerimeter(TriangleTypes.EQUILATERAL);
        findMinSquare(TriangleTypes.EQUILATERAL);

        System.out.println("ARBITRARY");
        findMaxPerimeter(TriangleTypes.ARBITRARY);
        findMaxSquare(TriangleTypes.ARBITRARY);
        findMinPerimeter(TriangleTypes.ARBITRARY);
        findMinSquare(TriangleTypes.ARBITRARY);

        System.out.println("RECTANGULAR");
        findMaxPerimeter(TriangleTypes.RECTANGULAR);
        findMaxSquare(TriangleTypes.RECTANGULAR);
        findMinPerimeter(TriangleTypes.RECTANGULAR);
        findMinSquare(TriangleTypes.RECTANGULAR);

        System.out.println("ISOSCELES");
        findMaxPerimeter(TriangleTypes.ISOSCELES);
        findMaxSquare(TriangleTypes.ISOSCELES);
        findMinPerimeter(TriangleTypes.ISOSCELES);
        findMinSquare(TriangleTypes.ISOSCELES);
    }
}
