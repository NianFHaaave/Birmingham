import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SalespersonSort {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Salesperson[] salesperson = new Salesperson[7];
        Arrays.stream(salesperson).forEach(i->new Salesperson(input.nextInt(),input.nextDouble()));
        Arrays.stream(salesperson).sorted(Comparator.comparing(j->j.getIDNumber())).forEach(k->System.out.println(k));
    }
}
