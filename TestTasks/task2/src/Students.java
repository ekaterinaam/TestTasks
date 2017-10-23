import java.util.Random;

public class Students {
    private String name;
    private String lastName;

    Students(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public int getResult(){
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
