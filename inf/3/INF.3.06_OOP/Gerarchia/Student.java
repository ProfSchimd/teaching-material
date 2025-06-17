public class Student extends Person {

    private String group;

    public Student(String first, String second, String birth) {
        super(first, second, birth);
    } 

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public String toString() {
        String g = (group != null) ? group : "";
        return super.toString() + " - " + g;
    }
}
