public class Winners {

    int time;
    String name;
    // Constructor
    public Winners (int time, String name) {
        this.time = time;
        this.name = name;
    }

    public String toString()
    {
        return this.time + " " + this.name ;
    }
}