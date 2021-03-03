import java.util.Scanner;

public class Geometry {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a");
        int a = scanner.nextInt();
        if (0 >= a) {
            System.out.println("Неправильное значение");
            System.exit(0);
        }
        System.out.println("Введите b");
        int b = scanner.nextInt();
        if (0 >= b){
            System.out.println("Неправильное значение");
            System.exit(0);
        }
        int c;
        c = (a * a) + (b * b);
        int hupotenyse = c ;
        System.out.println("Гипотенуза"+ hupotenyse );
    }
}