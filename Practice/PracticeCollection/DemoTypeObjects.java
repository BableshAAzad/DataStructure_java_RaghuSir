package Practice.PracticeCollection;

import java.util.ArrayList;
import java.util.List;

class Pen {
//     static String write() {
//         return "write";
//     }

//     @Override
//     public String toString() {
//         return write();
//     }
}

class Car {
    static void start() {
        System.out.println("start");
    }

    // @Override
    // public String toString() {
    //     return start();
    // }
}

class Tree {
    // static String grow() {
    //     return "grow";
    // }

    // @Override
    // public String toString() {
    //     return grow();
    // }
}

class OtherC {

}

public class DemoTypeObjects {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        Pen p2 = new Pen();

        Car c1 = new Car();
        Car c2 = new Car();

        Tree t1 = new Tree();
        Tree t2 = new Tree();

        OtherC o1 = new OtherC();
        OtherC o2 = new OtherC();

        Object[] o = { p1, p2, c1, c2, t1, t2, o1, o2 };

        List<Object> al = new ArrayList<Object>();
        for (Object object : o) {
            if (object instanceof Pen) {
                Pen p = (Pen) object;
                al.add(p);
            } else if (object instanceof Car) {
                Car c = (Car) object;
                al.add(c);
                c.start();
            } else if (object instanceof Tree) {
                Tree t = (Tree) object;
                al.add(t);
            }
        }
        for (Object object : al) {
            System.out.println(object);
        }
    }
}
