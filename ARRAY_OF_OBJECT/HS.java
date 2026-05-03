package ARRAY_OF_OBJECT;

public class HS {
    private int id;
    private String name;
    private double score;

    public HS(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public void display() {
        System.out.println(id + " - " + name + " - " + score);
    }

    public double getScore() {
        return score;
    }
    
}
