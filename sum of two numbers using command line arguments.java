import java.util.Scanner;

class twonumbers{

    public static void main(String[] args) {
        int x,y,sum;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number :");

        x = sc.nextInt();

        System.out.println("enter second number :");

        y = sc.nextInt();

        sum = x+y;

        System.out.println("the sum of two input number : " + sum);
        sc.close();

        
    }


    }     