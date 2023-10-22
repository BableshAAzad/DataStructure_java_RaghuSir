package CollectionFrameWork.StringVsStringBuffer;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Bablesh");
        System.out.println(sb.capacity());
        sb.append(" AAzad");
        System.out.println(sb.capacity());
        sb.append(" AB");
        System.out.println(sb.capacity());
        System.out.println(sb);
        sb.append("C");
        System.out.println(sb.capacity());
        System.out.println(sb);
        System.out.println(sb.hashCode());
        System.out.println("---------------------------------");
        StringBuffer sb1 = new StringBuffer("java");
        StringBuffer sb2 = new StringBuffer("java");
        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.capacity());
        System.out.println(sb1.hashCode());
        System.out.println(sb2.hashCode());
    }
}
