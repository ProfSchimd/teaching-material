import java.time.LocalDate;
import java.time.LocalDateTime;

public class AbstractFactoryMain {
    public static Object[] createButtonAndText() {
        Object[] gui = new Object[2];
        if (LocalDateTime.now().getHour() > 17 || LocalDateTime.now().getHour() < 9) {
            gui[0] = new DarkButton();
            gui[1] = new DarkText();
        } else {
            gui[0] = new LightButton(); 
            gui[1] = new LightText();
        }
        return gui;
    }
    public static void main(String[] args) {
       Object[] gui = createButtonAndText(); // abstract factory method
       Button b = (Button)gui[0]; // DarkButton if night, LightButton otherwise
       Text t = (Text)gui[1]; // DarkText if night, LightText otherwise
    }
}
