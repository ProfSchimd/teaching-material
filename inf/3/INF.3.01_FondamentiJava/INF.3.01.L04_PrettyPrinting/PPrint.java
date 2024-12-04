public class PPrint {
    private static final String HEAD = "\033[";
    private static final String TRAIL_RESET = "\033[0m";

    public static void println(String str, String fg, String bg) {
        System.out.println(HEAD + fg + ";" + bg + "m" + str + TRAIL_RESET);        
    }

    public static void println(String str, String fg) {
        System.out.println(HEAD + fg + "m" + str + TRAIL_RESET);        
    }

    public static void danger(String str) {
        System.out.println(HEAD + "91" + "m" + str + TRAIL_RESET);        
    }


    public static void main(String[] args) {
        println("Hello World!", "31", "42");
        println("Ciao mondo!", "93");
        danger("NON FARLO!!!");
        // System.out.println("World!");
    }
}
