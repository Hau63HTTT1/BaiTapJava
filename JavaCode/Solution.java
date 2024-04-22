import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            int a = Integer.parseInt(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            int d = 21
            String c = scanner.nextLine();
            System.out.println("String: " + c);
            System.out.println("Double: " + b);
            System.out.println("Int: " + a);
        }catch(NumberFormatException e){
            e.printStackTrace();
        }

    }
}
