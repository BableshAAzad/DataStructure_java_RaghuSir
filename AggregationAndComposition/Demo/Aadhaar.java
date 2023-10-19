package AggregationAndComposition.Demo;

public class Aadhaar {
    int adhId;
    String name;
    public Aadhaar(int adhId, String name) {
        this.adhId = adhId;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Aadhaar [adhId=" + adhId + ", name=" + name + "]";
    }
}
