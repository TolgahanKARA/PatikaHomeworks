import java.util.Scanner;

public class calculateCircle {

    public static void main(String[] args) {

        int circleSegment;
        double radius,pi=3.14;

        Scanner scn = new Scanner(System.in);

        circleSegment= scn.nextInt();
        radius= scn.nextDouble();

        System.out.println("Circle Area : " + radius*radius*pi);
        System.out.println("Circle Circumference : " + 2*pi*radius);
        if(circleSegment<=0){

            System.out.println("Circle segment angle cannot be less than zero");

        }else
            System.out.println("Circle Slice : " + (pi*(radius*radius)*circleSegment)/360);

    }

}
