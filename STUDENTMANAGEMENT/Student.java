package STUDENTMANAGEMENT;

public class Student {
    private int id;
    private String name;
    private int age;
    private double theoryScore;
    private double practiceScore;

    //constuctor
    public Student(int id, String name, int age, double theoryScore, double practiceScore ){
        this.id = id;
        this.name = name;
        this.age = age;
        this.theoryScore = theoryScore;
        this.practiceScore = practiceScore;  
    }

    // getter
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getTheory(){
        return theoryScore;
    }
    public double getPractice(){
        return practiceScore;
    }
    // method
    public double getAverage() {
    return (theoryScore + practiceScore) / 2;
}
@Override
    public String toString() {
        return "ID: " + id
                + ", Name: " + name
                + ", Age: " + age
                + ", Theory: " + theoryScore
                + ", Practice: " + practiceScore
                + ", Average: " + getAverage();
    }
}
