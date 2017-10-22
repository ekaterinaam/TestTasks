import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String reverse;
        reverse = new StringBuffer(input).reverse().toString();// строка обратна введенной
        System.out.println(reverse);
        String sep [] = input.split(" "); // создать массив из первоначальной строки разбив по пробелу
        for (int i = 0; i < sep.length;) {
            System.out.println(sep[i]); // вывод массива слов с новой строки
        };
        String subtask3 = input.replace(" ", "*"); // замена символа в изначальной строке
        System.out.println(subtask3);
        String subtask4 = input.toUpperCase();
        System.out.println(subtask4);
        String subtask5 = input.substring(5,10);
        System.out.println(subtask5);
    }
}
