import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            if (in.hasNextLine()) {
                String input = in.next();
                if (input.equalsIgnoreCase("quit")){
                    break;
                } else if (input.contains("-")){
                    String numbers [] = input.split("-");
                    int value1 = Integer.parseInt(numbers [0]);
                    int value2 = Integer.parseInt(numbers[1]);
                    System.out.print(value1-value2);
                } else if (input.contains("+")){
                    String numbers [] = input.split("\\+");
                    int value1 = Integer.parseInt(numbers [0]);
                    int value2 = Integer.parseInt(numbers[1]);
                    System.out.print(value1+value2);
                }else {
                    System.out.print("wrong input");
                }}
        }

    }
}