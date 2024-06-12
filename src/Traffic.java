import javax.swing.*;
import java.awt.*;

public class Traffic {

    private String callsign;
    private int startx;
    private int starty;
    private int fl;
    private int spd;
    private Font font = new Font(Font.SERIF, Font.BOLD, 20);
    private Font font1 = new Font(Font.DIALOG, Font.BOLD, 17);

    public Traffic(String callsign, int fl, int spd, int startx, int starty) {
        this.callsign = callsign;
        this.startx = startx;
        this.starty = starty;
        this.fl = fl;
        this.spd = spd;
    }

    public JLabel getTrafficPoint() {
        JLabel point = new JLabel("△");
        point.setFont(font);
        point.setForeground(Color.green);
        point.setSize(20,20);
        point.setLocation(startx, starty);
        return point;
    }

    public JLabel getTrafficLabel() {
        JLabel label = new JLabel(callsign);
        label.setFont(font1);
        label.setForeground(Color.green);
        label.setSize(150,20);
        label.setLocation(startx + 20, starty);
        return label;
    }

    public JLabel getTrafficAltLabel() {
        JLabel label = new JLabel("FL" + fl);
        label.setFont(font1);
        label.setForeground(Color.green);
        label.setSize(150,20);
        label.setLocation(startx + 20, starty + 20 );
        return label;
    }

    public JLabel getTrafficSpeedlabel() {
        JLabel speedLabel = new JLabel(spd + "kt");
        speedLabel.setFont(font1);
        speedLabel.setForeground(Color.green);
        speedLabel.setSize(150,20);
        speedLabel.setLocation(startx + 20, starty + 40 );
        return speedLabel;
    }

    public int getX() {
        return startx;
    }

    public void setX(int startx) {
        this.startx = startx;
    }

    public int getY() {
        return starty;
    }

    public void setY(int starty) {
        this.starty = starty;
    }
}
