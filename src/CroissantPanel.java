import javax.swing.*;
import java.awt.*;

public class CroissantPanel extends JPanel{

    public final double PLAIN_CROIS = 8.00;
    public final double WHEAT_CROIS = 10.00;

    private JRadioButton plainCrois;
    private JRadioButton wheatCrois;
    private ButtonGroup bg;

    public  CroissantPanel(){
        plainCrois = new JRadioButton("Plain Croissant");
        wheatCrois = new JRadioButton("Whole Wheat Croissant");

        bg = new ButtonGroup();
        bg.add(plainCrois);
        bg.add(wheatCrois);
        setBorder(BorderFactory.createTitledBorder("Croissant"));
        setLayout(new GridLayout(2,1));
        add(plainCrois);
        add(wheatCrois);

    }
    public double getCroissant() {

        double croisPrice = 0.0;
        if (plainCrois.isSelected()) {
            croisPrice = PLAIN_CROIS;
        } else if (wheatCrois.isSelected()) {
            croisPrice = WHEAT_CROIS;
        }
        return croisPrice;
    }

}
