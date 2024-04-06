import javax.swing.*;
import java.awt.*;

public class CoffeePanel extends JPanel{
    public final double NONE = 0.0;
    public final double REGULAR = 5.0;
    public final double DECAF = 8.0;
    public final double CAPPU = 11.0;

    private JRadioButton none;
    private JRadioButton reg;
    private JRadioButton decaf;
    private JRadioButton cino;

    public CoffeePanel(){

        none = new JRadioButton("No Coffee");
        reg = new JRadioButton("Regular Coffee");
        decaf = new JRadioButton(" Decaf Coffee");
        cino = new JRadioButton("Cappuccino");

        setBorder(BorderFactory.createTitledBorder("Coffee"));

        setLayout(new GridLayout(4,1));
        add(none);
        add(reg);
        add(decaf);
        add(cino);

    }
    public double getCoffeeCost(){
        double coffeePrice = 0.0;

        if (none.isSelected()){
            coffeePrice = NONE;
        } else if (reg.isSelected()) {
            coffeePrice = REGULAR;
        } else if (decaf.isSelected()) {
            coffeePrice = DECAF;
        } else if (cino.isSelected()) {
            coffeePrice = CAPPU;
        }
        return coffeePrice;
    }
}
