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

    public static double findMaxPerimeter(Map<TriangleTypes, ArrayList<Object>> triangleTypesMap, TriangleTypes triangleType) {
        ArrayList<Object> trianglesProvidedType = triangleTypesMap.get(triangleType);
        ArrayList<Double> trianglePerimeters = new ArrayList<>();
        for (Object obj : trianglesProvidedType) {
            Triangle triangle = (Triangle) obj;
            trianglePerimeters.add(triangle.getPerimeter());
        }
        double maxPerimeter = Collections.max(trianglePerimeters);
        System.out.println("Max perimeter of " + triangleType.name() + " type -> " + maxPerimeter);

        return maxPerimeter;
    }
}
