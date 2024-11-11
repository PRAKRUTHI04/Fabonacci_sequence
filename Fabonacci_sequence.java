import java.util.Scanner;

public class Fabonacci_sequence {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = s.nextInt();
        int n1 = 0, n2 = 1;
        System.out.print("fabonacci sequence: "+ n1 + "," + n2);
        for(int i = 3; i <= n; i++){
            int next = n1 +n2;
            System.out.print("," + next);
            n1 = n2;
            n2 = next;
        }
    }
}
