package AggregationAndComposition.Demo;

public class Employee {
    int eid;
    String ename;
    Aadhaar adh;
    Address add;
    public Employee(int eid, String ename, int adhId, Address add) {
        this.eid = eid;
        this.ename = ename;
        this.adh = new Aadhaar(adhId, ename);
        this.add = add;
    }
    @Override
    public String toString() {
        return "Employee [eid=" + eid + ", ename=" + ename + ", adh=" + adh + ", add=" + add + "]";
    }
    
}
