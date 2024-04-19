import java.util.Scanner;
public class Suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MainSuma sumadin = new MainSuma();
        
        System.out.println("Ingresa el primer numero:");
        sumadin.a = sc.nextInt();
        System.out.println("Ingresa el primer numero:");
        sumadin.b = sc.nextInt();
        sumadin.sum();
        sc.close();
    }
}