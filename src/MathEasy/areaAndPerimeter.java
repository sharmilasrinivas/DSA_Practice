package MathEasy;
import java.util.Scanner;
public class areaAndPerimeter {
    public static double squareArea(double side){
        return (side*side);
    }
    public static double rectangleArea(double length, double breadth){
        return length*breadth;
    }
    public static double triangleArea(double height, double base){
        return 0.5*(base * height);
    }
    public static double circleArea(double radius){
        return (22.0 / 7)*(radius*radius);
    }
    public static double squarePerimeter(double side){
        return 4*side;
    }
    public static double rectanglePerimeter(double length, double breadth){
        return 2*(length+breadth);
    }
    public static double trianglePerimeter(double side1, double side2, double side3){
        return side1+side2+side3;
    }
    public static double circlePerimeter(double radius){
        return 2*(22.0 / 7)*radius;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("\n1. Area of Square\n2. Area of Rectangle\n3. Area of Triangle\n4. Area of Circle\n5. Perimeter of Square\n6. Perimeter of Rectangle\n7. Perimeter of Triangle\n8. Circumference of Circle\n9. Exit\nEnter your choice:");
            int choice = sc.nextInt();
            switch(choice){
                case 1: System.out.println("Enter the side of Square: ");
                    double side = sc.nextDouble();
                    System.out.println("The Square with  "+ side+" sides and has an area of "+squareArea(side)+" sq.units.");
                    break;
                case 2: System.out.println("Enter the Length of Rectangle: ");
                    double length = sc.nextDouble();
                    System.out.println("Enter the breadth of Rectangle: ");
                    double breadth = sc.nextDouble();
                    System.out.println("The Rectangle with length  "+length+" and breadth "+breadth+" has an area of "+ rectangleArea(length,breadth) +" sq.units.");
                    break;
                case 3: System.out.println("Enter the base of Triangle: ");
                    double base = sc.nextDouble();
                    System.out.println("Enter the height of Triangle: ");
                    double height = sc.nextDouble();
                    System.out.println("The Triangle with base "+base+" and height "+height+" has an area of "+triangleArea(height,base)+" sq.units.");
                    break;
                case 4: System.out.println("Enter the radius of Circle: ");
                    double radius = sc.nextDouble();
                    System.out.println("The circle with radius "+radius+" has an area of "+circleArea(radius)+" sq.units.");
                    break;
                case 5: System.out.println("Enter the side of Square: ");
                    double a = sc.nextDouble();
                    System.out.println("The Square with  "+ a+" sides and has a perimeter of "+squarePerimeter(a)+" units.");
                    break;
                case 6: System.out.println("Enter the Length of Rectangle: ");
                    double l = sc.nextDouble();
                    System.out.println("Enter the breadth of Rectangle: ");
                    double b = sc.nextDouble();
                    System.out.println("The Rectangle with length  "+l+" and breadth "+b+" has perimeter of "+ rectanglePerimeter(l,b) +" units.");
                    break;
                case 7: System.out.println("Enter the first side of Triangle: ");
                    double s1 = sc.nextDouble();
                    System.out.println("Enter the second side of Triangle: ");
                    double s2 = sc.nextDouble();
                    System.out.println("Enter the third side of Triangle: ");
                    double s3 = sc.nextDouble();
                    System.out.println("The Triangle with three sides "+s1+" "+s2+" "+s3+" "+ "has perimeter of "+trianglePerimeter(s1,s2,s3)+" units.");
                    break;
                case 8: System.out.println("Enter the radius of Circle: ");
                    double r = sc.nextDouble();
                    System.out.println("The circle with radius "+r+" has an area of "+circlePerimeter(r)+" units.");
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}
