import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Emter a: ");
        int a = sc.nextInt();
        System.out.print("Emter b: ");
        int b = sc.nextInt();
        System.out.print("Emter b: ");
        int c = sc.nextInt();
        Triangle tri = new Triangle(a,b,c);

            try {
                System.out.println("Parameter : " + tri.getParameter());
            }catch (IllegalTriangleException e){
                System.out.println(e.getErrorMes());
            }


    }
}
