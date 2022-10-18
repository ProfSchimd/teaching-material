public class Person {
    public static Person createPersonFromString(String type) {
        if (type.toLowerCase().equals("professor")) {
            return new Professor();
        }
        if (type.toLowerCase().equals("student")) {
            return new Student();
        }
        return new Person();
    }
}
