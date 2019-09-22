import javax.swing.*;
import java.awt.*;

public class GUI3_extendsJFrame extends JFrame {
    private GUI3_extendsJFrame(String title) throws HeadlessException {
        super(title);
        JPanel panel = new JPanel();

        setContentPane(panel);

        pack();
        setPreferredSize(new Dimension(600, 400));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GUI3_extendsJFrame("창이름");
    }
}
