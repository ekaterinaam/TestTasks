
public class Application {

    public static void main(String[] args) {
        int results [] = new int [5];
        Students [] students = new Students[5];
        students[0] = new Students("Vasia", "Pupkin");
        students[1] = new Students("Ivan", "Ivanov");
        students[2] = new Students("Petr", "Petrov");
        students[3] = new Students( "Lev", "Lvov");
        students[4] = new Students("Tit", "Kuzmich");

        for (int i = 0; i < 5; i ++){
            results [i] = students [i].getResult();
        }

        double sum = 0;
        for (int i = 0; i < results.length; i++) {
            sum += results[i];
        }

        double average = sum / results.length;

        System.out.print(average);
    }
}
