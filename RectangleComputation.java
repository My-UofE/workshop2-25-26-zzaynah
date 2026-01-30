public class RectangleComputation {
    public static void main(String[] args) {

        double height = Double.parseDouble(args[0]);
        double width = Double.parseDouble(args[1]);

        double area = height * width;
        double perimeter = 2 * (height + width);

        double ratio = height / width;
        boolean isSquare = Math.abs(ratio - 1.0) <= 0.001;

        if (isSquare) {
            System.out.println("Shape: square");
        } else {
            System.out.println("Shape: rectangle");
        }

        System.out.println("area: " + area);
        System.out.println("perimeter: " + perimeter);
        }
    }