public class Main {
    public static void main(String[] args) {
        Teacher turing = new Teacher("Alan", "Turing", "23/06/1912");
        Student einstein = new Student("Albert", "Einstein", "14/03/1879");
        einstein.setGroup("1A");

        System.out.println(turing);
        System.out.println(einstein);
    }
}
