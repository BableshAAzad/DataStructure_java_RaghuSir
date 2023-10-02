package QuestionsJava.StudentNameIdPerSorting;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class MainStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Student> stds = new HashSet<Student>();
        while (true) {
            System.out.println("Enter Student Id, Name and Percentage : ");
            int id = sc.nextInt();
            String name = sc.next();
            double per = sc.nextDouble();
            Student std = new Student(id, name, per);
            boolean rs = stds.add(std);
            if (rs)
                System.out.println("Successfully added");
            else
                System.out.println("Fails to added");
            System.out.println("Do you hava more Students (Yes or No) : ");
            String res = sc.next();
            if (res.equalsIgnoreCase("no"))
                break;
        }
        System.out.println("Press 1. Sort based on Name \n2. Sort based on Id \n3. Sort based on Percentage");
        int choise = sc.nextInt();
        Comparator<Student> com = null;
        switch (choise) {
            case 1:
                System.out.println("Based On Name Sorted : ");
                com = new NameComparator();
                break;
            case 2:
                class IdComparator implements Comparator<Student> {
                    @Override
                    public int compare(Student s1, Student s2) {
                        return s1.getId() - s2.getId();
                    }
                }
                System.out.println("Based On Id Sorted : ");
                com = new IdComparator();
                break;
            case 3:
                com = new Comparator<Student>() {
                    @Override
                    public int compare(Student s1, Student s2) {
                        if (((Double) s1.getPer()).compareTo(s2.getPer()) > 0)
                            return 1;
                        else
                            return -1;
                    }
                };
                System.out.println("Based On Persentage Sorted : ");
                break;
            default:
                System.out.println("Input is Allowed only 1 to 3");
                break;
        }
        TreeSet<Student> ts = new TreeSet<Student>(com);
        ts.addAll(stds);
        for (Student std : ts) {
            System.out.println(std);
        }
        sc.close();
    }
}
