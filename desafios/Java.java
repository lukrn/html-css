import java.util.Scanner;

public class Java{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double n1, n2, n3, n4, n5, n6, media;

        System.out.println("Sistema para calculo de media de 6 provas.");

        System.out.print("Nota 1: ");
        n1 = entrada.nextDouble();

        System.out.print("Nota 2: ");
        n2 = entrada.nextDouble();

        System.out.print("Nota 3: ");
        n3 = entrada.nextDouble();

        System.out.print("Nota 4: ");
        n4 = entrada.nextDouble();

        System.out.print("Nota 5: ");
        n5 = entrada.nextDouble();

        System.out.print("Nota 6: ");
        n6 = entrada.nextDouble();

        media = (n1+ n2+n3+n4+n5+n6)/6;

        System.out.println("A media das notas é: "+ media);
}
}