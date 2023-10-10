package LambdaExpression.AnonimousLambdaNormal;

public class MainCab {
    public static void main(String[] args) {
        Cab cb1 = new OlaCabImp();
        cb1.booking("Raipur", "Bilaspur");
        // ------------------------------------------
        Cab cb2 = new Cab() {
            @Override
            public void booking(String src, String dst) {
                System.out.println("Bo0king Ola Cab for " + src + " to " + dst);
            }
        };
        cb2.booking("Tundri", "Raipur");
        // ------------------------------------------
        Cab cb3 = (src, dst)-> System.out.println("Booking Ola Cab for "+src+" to "+dst);
        cb3.booking("Bangluru", "Raipur");
    }
}
