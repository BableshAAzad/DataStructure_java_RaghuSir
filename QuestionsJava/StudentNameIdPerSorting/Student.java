package QuestionsJava.StudentNameIdPerSorting;

public class Student {
    private int id;
    private String name;
    private double per;

    public Student(int id, String name, double per) {
        this.id = id;
        this.name = name;
        this.per = per;
    }

    @Override
    public String toString() {
        return "Student id= " + id + ", Name= " + name + ", Percentage= " + per;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPer() {
        return per;
    }

    public void setPer(double per) {
        this.per = per;
    }

    public int getId() {
        return id;
    }
}
