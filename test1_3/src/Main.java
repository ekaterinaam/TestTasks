import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.print("Number of stars for one side:");
        Scanner in = new Scanner(System.in);
        int dimondsSide = in.nextInt(); //длина стороны ромба

        String[] semidimond = getSemidimondLines(dimondsSide); // массив со строками для построения половины ромба

        // верхняя   часть ромба
        for(int i = (semidimond.length - 1); i > 0; i--){
            System.out.println(semidimond[i]);
        }

        //нижняя часть ромба
        for(String line : semidimond){
            System.out.println(line);
        }
    }

    protected static String[] getSemidimondLines(int dimondsSide){
        int dimondWight = (dimondsSide * 2) - 1;
        String[] semidimondLines = new String[dimondsSide];
        //строка-шаблон заданной длины, состоящий только из пробелов
        char[] lineTemplate = new char[dimondWight];
        for(int i = 0; i < dimondWight; i++){
            lineTemplate[i] = ' ';
        }
        // заполненный массив строк для формирования половины ромба
        int firstStarIndex = 0;//индекс первой звезды в строке
        int secondStarIndex = dimondWight - 1;//индекс второй звезды в строке
        for (int i = 0; i < dimondsSide; i++){
            char[] line = lineTemplate.clone();
            if(firstStarIndex == secondStarIndex){
                line[firstStarIndex] = '*';
            } else {
                line[firstStarIndex++] = '*';
                line[secondStarIndex--] = '*';
            }
            semidimondLines[i] = new String(line);
        }
        return semidimondLines;
    }
}