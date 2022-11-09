package Lab_1;

public class Triangle {
    private Point firstPoint;
    private Point secondPoint;
    private Point thirdPoint;

    private double firstSideLength;
    private double secondSideLength;
    private double thirdSideLength;

    private double square;
    private double perimeter;

    private boolean ifExist;

    public Point getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public Point getsecondPoint() {
        return secondPoint;
    }

    public void setsecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }

    public Point getThirdPoint() {
        return thirdPoint;
    }

    public void setThirdPoint(Point thirdPoint) {
        this.thirdPoint = thirdPoint;
    }

    public double getFirstSideLength() {
        return firstSideLength;
    }

    public void setFirstSideLength(double firstSideLength) {
        this.firstSideLength = firstSideLength;
    }

    public double getSecondSideLength() {
        return secondSideLength;
    }

    public void setSecondSideLength(double secondSideLength) {
        this.secondSideLength = secondSideLength;
    }

    public double getThirdSideLength() {
        return thirdSideLength;
    }

    public void setThirdSideLength(double thirdSideLength) {
        this.thirdSideLength = thirdSideLength;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public boolean getIfExist() {
        return ifExist;
    }

    public void setIfExist(boolean ifExist) {
        this.ifExist = ifExist;
    }

    public Triangle() {
        this.ifExist = false;
    }

    public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
        this.firstSideLength = calculateSideLength(firstPoint, secondPoint);
        this.secondSideLength = calculateSideLength(secondPoint, thirdPoint);
        this.thirdSideLength = calculateSideLength(thirdPoint, firstPoint);
        this.square = calculateSquare(firstSideLength, secondSideLength, thirdSideLength);
        this.perimeter = calculatePerimeter(firstSideLength, secondSideLength, thirdSideLength);
        this.ifExist = ifExistByPoints(firstPoint, secondPoint, thirdPoint);
    }

    public Triangle(double firstSideLength, double secondSideLength, double thirdSideLength) {
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
        this.thirdSideLength = thirdSideLength;
        this.square = calculateSquare(firstSideLength, secondSideLength, thirdSideLength);
        this.perimeter = calculatePerimeter(firstSideLength, secondSideLength, thirdSideLength);
        this.ifExist = ifExistBySides(firstSideLength, secondSideLength, thirdSideLength);
    }
    
    public boolean ifExistByPoints(Point firstPoint, Point secondPoint, Point thirdPoint) {        
        return (((firstPoint.getX() != secondPoint.getX()) || (secondPoint.getX() != thirdPoint.getX()))
                && ((firstPoint.getY() != secondPoint.getY()) || (secondPoint.getY() != thirdPoint.getY())));
    }

    public boolean ifExistBySides(double firstSideLength, double secondSideLength, double thirdSideLength) {
        return ((firstSideLength + secondSideLength > thirdSideLength) && (secondSideLength + thirdSideLength > firstSideLength)
                 && (thirdSideLength + firstSideLength > secondSideLength));
    }

    public double calculateSideLength(Point firstPoint, Point secondPoint) {
        return Math.sqrt(Math.pow(firstPoint.getX() - secondPoint.getX(), 2)
                + Math.pow(firstPoint.getY() - secondPoint.getY(), 2));
    }

    public double calculateSquare(double firstSideLength, double secondSideLength, double thirdSideLength) {
        double semiPerimeter = (firstSideLength + secondSideLength + thirdSideLength) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - firstSideLength)
                * (semiPerimeter - secondSideLength) * (semiPerimeter - thirdSideLength));
    }

    public double calculatePerimeter(double firstSideLength, double secondSideLength, double thirdSideLength) {
        return firstSideLength + secondSideLength + thirdSideLength;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstPoint=" + firstPoint +
                ", secondPoint=" + secondPoint +
                ", thirdPoint=" + thirdPoint +
                ", firstSideLength=" + firstSideLength +
                ", secondSideLength=" + secondSideLength +
                ", thirdSideLength=" + thirdSideLength +
                ", square=" + square +
                ", perimeter=" + perimeter +
                ", ifExist=" + ifExist +
                '}';
    }
}
