public class Practice2 {
    int age;
    

    Practice2(int age1) {
        this.age = age1;
        
    }

    // @Override
    // public boolean equals( a)
    //  {
        
    //     return this.age == a.age;
    // }

    public static void main(String[] args) {
        Practice2 p1 = new Practice2(20);
        Practice2 p2 = new Practice2(20);
        System.out.println(p1.equals(p2));
    }
}
