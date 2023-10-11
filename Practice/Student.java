package Practice;

public class Student {
    int id;
    String name;
    static int  n =100;

    Student(int id,String name) {
        this.name = name;
        this.id=id;
    }

    Student(int id){
        this.id = id;
    }

    Student() {
        this(n);
        n=n+100;
    }

    @Override
    public String toString() {
        return "Name : " + name;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public static void main(String[] args) {
        Student s1 = new Student(101,"Bablesh");
        Student s2 = new Student(201,"Aazad");
        System.out.println(s1);
        System.out.println(s2);
        // ------------------------------------
        Student s11 = new Student();
        Student s12 = new Student();
        System.out.println(s11.hashCode());
        System.out.println(s12.hashCode());
    }
}
