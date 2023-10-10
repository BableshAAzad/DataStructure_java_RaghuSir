package LambdaExpression.AnonimousLambdaNormal;

public class OlaCabImp implements Cab {
    @Override
    public void booking(String src, String dst){
        System.out.println("Booking Old Cab for "+src+" to "+dst);
    }
}
