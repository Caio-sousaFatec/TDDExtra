
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("insira o primeiro lado do triangulo");
        int scan1= sc.nextInt();
        System.out.println("insira o segundo lado do triangulo");
        int scan2= sc.nextInt();
        System.out.println("insira o terceiro lado do triangulo");
        int scan3= sc.nextInt();
        String classificacao = Triangulo.classificarTriangulo(scan1,scan2,scan3);

        sc.close();
        System.out.println(classificacao);


    }
}