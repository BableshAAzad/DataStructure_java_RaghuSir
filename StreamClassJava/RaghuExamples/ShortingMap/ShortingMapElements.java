package StreamClassJava.RaghuExamples.ShortingMap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class ShortingMapElements {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(124, "Bablus", 76.89, "CS"));
        students.add(new Student(123, "Rakesh", 86.92, "ECE"));
        students.add(new Student(125, "KumarR", 66.39, "CS"));
        students.add(new Student(128, "AAzadX", 56.32, "CIVIL"));
        students.add(new Student(127, "ManjeM", 78.54, "EEE"));
        students.add(new Student(121, "ParamN", 84.95, "MECH"));
        students.add(new Student(126, "Suresh", 67.54, "ECE"));
        students.add(new Student(122, "Roopes", 85.77, "MECH"));
        // ---------------------------------------------------------------------
        System.out.println("Sorting by Percentage in Descending order : ");
        students.stream().sorted((s1, s2) -> -s1.getSper().compareTo(s2.getSper()))
                .forEach(System.out::println);
        /**
         * Ountput :
         * Sorting by Percentage in Descending order :
         * Student [sid=123, sname=Rakesh, sper=86.92, sbranch=ECE]
         * Student [sid=122, sname=Roopes, sper=85.77, sbranch=MECH]
         * Student [sid=121, sname=ParamN, sper=84.95, sbranch=MECH]
         * Student [sid=127, sname=ManjeM, sper=78.54, sbranch=EEE]
         * Student [sid=124, sname=Bablus, sper=76.89, sbranch=CS]
         * Student [sid=126, sname=Suresh, sper=67.54, sbranch=ECE]
         * Student [sid=125, sname=KumarR, sper=66.39, sbranch=CS]
         * Student [sid=128, sname=AAzadX, sper=56.32, sbranch=CIVIL]
         */
        // ---------------------------------------------------------------------
        System.out.println("Sorting by Branch wise : ");
        Map<String, List<Student>> ms = students.stream()
                .collect(Collectors.groupingBy(Student::getSbranch, Collectors.toList()));
        ms.entrySet().forEach(System.out::println);
        /**
         * Ountput :
         * Sorting by Branch wise :
         * 
         * CS=[Student [sid=124, sname=Bablus, sper=76.89, sbranch=CS],
         * Student[sid=125, sname=KumarR, sper=66.39, sbranch=CS]]
         * 
         * CIVIL=[Student [sid=128, sname=AAzadX, sper=56.32, sbranch=CIVIL]]
         * 
         * EEE=[Student [sid=127, sname=ManjeM, sper=78.54, sbranch=EEE]]
         * 
         * ECE=[Student [sid=123, sname=Rakesh, sper=86.92, sbranch=ECE],
         * Student[sid=126, sname=Suresh, sper=67.54, sbranch=ECE]]
         * 
         * MECH=[Student [sid=121, sname=ParamN, sper=84.95, sbranch=MECH],
         * Student[sid=122, sname=Roopes, sper=85.77, sbranch=MECH]]
         */
        // ---------------------------------------------------------------------
        Map<String, Long> bc = students.stream()
                .collect(Collectors.groupingBy(Student::getSbranch, Collectors.counting()));
        bc.entrySet().forEach((k) -> System.out.println(k.getKey() + " -> " +
                k.getValue()));
        bc.entrySet().forEach(System.out::println);
        /**
         * Ountput :
         * CIVIL -> 1
         * EEE -> 1
         * ECE -> 2
         * MECH -> 2
         * CS=2
         * CIVIL=1
         * EEE=1
         * ECE=2
         * MECH=2
         */
        // ---------------------------------------------------------------------
        System.out.println("Top 3 High percentage : ");
        students.stream().sorted((s1, s2) -> -s1.getSper().compareTo(s2.getSper()))
                .limit(3).forEach(System.out::println);
        /**
         * Output :
         * Top 3 High percentage :
         * Student [sid=123, sname=Rakesh, sper=86.92, sbranch=ECE]
         * Student [sid=122, sname=Roopes, sper=85.77, sbranch=MECH]
         * Student [sid=121, sname=ParamN, sper=84.95, sbranch=MECH]
         */
        // ---------------------------------------------------------------------
        System.out.println("Skip Top 3 High percentage persons : ");
        students.stream().sorted((s1, s2) -> -s2.getSper().compareTo(s2.getSper()))
                .skip(3).forEach(System.out::println);
        /**
         * Output :
         * Skip Top 3 High percentage persons :
         * Student [sid=128, sname=AAzadX, sper=56.32, sbranch=CIVIL]
         * Student [sid=127, sname=ManjeM, sper=78.54, sbranch=EEE]
         * Student [sid=121, sname=ParamN, sper=84.95, sbranch=MECH]
         * Student [sid=126, sname=Suresh, sper=67.54, sbranch=ECE]
         * Student [sid=122, sname=Roopes, sper=85.77, sbranch=MECH]
         */
        // ---------------------------------------------------------------------
        Comparator<Student> Cper = (s1, s2) -> s1.getSper().compareTo(s2.getSper());
        Map<String, Optional<Student>> bh = students.stream()
                .collect(Collectors.groupingBy(Student::getSbranch,
                        Collectors.reducing(BinaryOperator.maxBy(Cper))));
        bh.entrySet().forEach(x -> System.out.println(x.getKey() + " -> " +
                x.getValue().get()));
        /**
         * Output :
         * CS -> Student [sid=124, sname=Bablus, sper=76.89, sbranch=CS]
         * CIVIL -> Student [sid=128, sname=AAzadX, sper=56.32, sbranch=CIVIL]
         * EEE -> Student [sid=127, sname=ManjeM, sper=78.54, sbranch=EEE]
         * ECE -> Student [sid=123, sname=Rakesh, sper=86.92, sbranch=ECE]
         * MECH -> Student [sid=122, sname=Roopes, sper=85.77, sbranch=MECH]
         */
        // ---------------------------------------------------------------------
        Student std = students.stream()
                .max(Comparator.comparingDouble(Student::getSper))
                .get();
        System.out.println(std);
        /**
         * Output :
         * Student [sid=123, sname=Rakesh, sper=86.92, sbranch=ECE]
         */
        // ---------------------------------------------------------------------
        students.stream().sorted((s1, s2) -> -s1.getSper().compareTo(s2.getSper()))
                .skip(3)
                .limit(1)
                .forEach(System.out::println);
        /**
         * Output :
         * Student [sid=127, sname=ManjeM, sper=78.54, sbranch=EEE]
         */
    }
}
