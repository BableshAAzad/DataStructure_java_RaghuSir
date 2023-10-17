package StreamClassJava.RaghuExamples.ShortingMap;

public class Student {
    private Integer sid;
    private String sname;
    private Double sper;
    private String sbranch;

    public Student(Integer sid, String sname, Double sper, String sbranch) {
        super();
        this.sid = sid;
        this.sname = sname;
        this.sper = sper;
        this.sbranch = sbranch;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Double getSper() {
        return sper;
    }

    public void setSper(Double sper) {
        this.sper = sper;
    }

    public String getSbranch() {
        return sbranch;
    }

    public void setSbranch(String sbranch) {
        this.sbranch = sbranch;
    }

    public Integer getSid() {
        return sid;
    }

    @Override
    public String toString() {
        return "Student [sid=" + sid + ", sname=" + sname + ", sper=" + sper + ", sbranch=" + sbranch + "]";
    }

}
