import javax.swing.*;
import java.awt.*;

public class ToppingPanel extends JPanel {
    public final double CREAM_CHEESE = 8.00;
    public final double BUTTER = 9.00;
    public final double PEACH_JELLY = 5.00;
    public final double BLUEBERRY_JAM = 7.00;

    private JCheckBox creamCheese;
    private JCheckBox butter;
    private JCheckBox peach;
    private JCheckBox blueberry;

    public ToppingPanel() {
        creamCheese = new JCheckBox("Cream Cheese");
        butter = new JCheckBox("Butter");
        peach = new JCheckBox("Peach");
        blueberry = new JCheckBox("Blueberry");

        setBorder(BorderFactory.createTitledBorder("Topping"));

        setLayout(new GridLayout(4, 1));
        add(creamCheese);
        add(butter);
        add(peach);
        add(blueberry);

    }

    public double getToppingCost() {
        double toppingPrice = 0.0;

        if (creamCheese.isSelected()) {
            toppingPrice += CREAM_CHEESE;
        } else if (butter.isSelected()) {
            toppingPrice += BUTTER;
        } else if (peach.isSelected()) {
            toppingPrice += PEACH_JELLY;
        } else if (blueberry.isSelected()) {
            toppingPrice += BLUEBERRY_JAM;
        }
        return toppingPrice;
    }
}