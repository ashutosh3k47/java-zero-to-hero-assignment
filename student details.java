import java.util.Scanner;

class student{
    String name;
    int roll ;
    float marks;
}
 class assignment {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		System.out.println("Input name of students:");
        System.out.println("Input roll of students:");
        System.out.println("Input marks of students:");

    String name = in.nextLine();
    int roll = in.nextInt();
    float marks= in.nextFloat();
        System.out.println(" name of students: " + name);
        System.out.println(" roll of students: " + roll);
        System.out.println(" marks of students:" + marks);



     in.close();
}
    }
