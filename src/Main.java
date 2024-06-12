import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        WindowManager Window = new WindowManager("XATC - 1.0", Color.BLACK, 1200, 700, true);
        Traffic traffic1 = new Traffic("AFR1943", 200, 200, 500,500);
        Window.addTraffic(traffic1);

        int a = 0;
        while(true) {
            try {
                a++;
                System.out.println(a);
                Window.removeTraffic(traffic1);
                traffic1.setX(traffic1.getX() + 50);
                Window.addTraffic(traffic1);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }



    }




}
