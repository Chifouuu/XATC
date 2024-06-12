import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class WindowManager {

    public String title;
    public Color bgcolor;
    public int width;
    public int height;
    public boolean isvisible;
    public JFrame frame;
    public JPanel panel;
    public HashMap<Integer, Traffic> trafficsRegistrations = new HashMap<>();
    public int totalTrafficNumber;

    public WindowManager(String title, Color bgcolor, int width, int height, boolean isVisible) {
        this.title = title;
        this.bgcolor = bgcolor;
        this.width = width;
        this.height = height;
        this.isvisible = isVisible;

        frame = new JFrame(title);
        panel = (JPanel) frame.getContentPane();

        panel.setLayout(null);

        panel.setBackground(bgcolor);

        frame.setSize(width,height);
        frame.setVisible(isvisible);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Color getBgcolor() {
        return bgcolor;
    }

    public void setBgcolor(Color bgcolor) {
        this.bgcolor = bgcolor;
        panel.setBackground(bgcolor);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isIsvisible() {
        return isvisible;
    }

    public void setIsvisible(boolean isvisible) {
        this.isvisible = isvisible;
    }

    public void addTraffic(Traffic traffic) {
        panel.add(traffic.getTrafficPoint());
        panel.add(traffic.getTrafficLabel());
        panel.add(traffic.getTrafficAltLabel());
        panel.add(traffic.getTrafficSpeedlabel());
        totalTrafficNumber++;
        trafficsRegistrations.put(totalTrafficNumber, traffic);

    }

    public void removeTraffic(Traffic traffic) {

        panel.removeAll();
    }

}
