import java.util.Scanner;

public class calculadeGrade {

    public static void main(String[] args) {

        int mat,fzk,kmy,trc,trh,mzk,sum;
        double  result;

        Scanner src = new Scanner(System.in);

        System.out.println("Enter your math grade :");
        mat=src.nextInt();

        System.out.println("Enter your physics grade :");
        fzk=src.nextInt();

        System.out.println("Enter your chemical grade :");
        kmy=src.nextInt();

        System.out.println("Enter your turkish grade :");
        trc=src.nextInt();

        System.out.println("Enter your history grade :");
        trh=src.nextInt();

        System.out.println("Enter your music grade :");
        mzk=src.nextInt();

        sum=mat+fzk+kmy+trc+trh+mzk;
        result = sum/6.0;

        System.out.println("Average of your course grades" + result);

        String pass = result > 60 ? "Passed":"You failed classed";

        System.out.println(pass);

    }

}
