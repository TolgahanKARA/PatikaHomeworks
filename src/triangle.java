import java.util.Scanner;

public class triangle {



    public static void main(String[] args) {

        double firsSideOfTriangle,secondSideOfTriangle,thirdSideOfTriangle,areaOfTriangle,perimeterOfTriangle;
        Scanner scn= new Scanner(System.in);

        firsSideOfTriangle= scn.nextDouble();
        secondSideOfTriangle= scn.nextDouble();
        thirdSideOfTriangle=scn.nextDouble();

        perimeterOfTriangle=(firsSideOfTriangle+secondSideOfTriangle+thirdSideOfTriangle)/2;

        System.out.println("Perimeter of Triangle : " + perimeterOfTriangle);

        areaOfTriangle = Math.sqrt(perimeterOfTriangle*(perimeterOfTriangle-firsSideOfTriangle)*(perimeterOfTriangle-secondSideOfTriangle)*(perimeterOfTriangle-thirdSideOfTriangle));

        System.out.println("Area of Triangle : " + areaOfTriangle);

    }


}
