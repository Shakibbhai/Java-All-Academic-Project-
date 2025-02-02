public class student {
    private String name;
    private int roll;
    private int id;

    public student(String name,int rollno,int idno){
        this.name=name;
        this.id=idno;
        this.roll=rollno;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }


    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "student--" +
                "name='" + name +"  " +
                ", roll=" + roll +
                ", id=" + id;
    }
}
