import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUICalculate extends JFrame{
    private JButton calcBtn;
    private JButton exitBtn;
    private CroissantPanel croPnl;
    private TitlePanel titlePnl;
    private ToppingPanel topPnl;
    private CoffeePanel coffeePnl;

    private JPanel buttonPnl;

    public GUICalculate(){
        setTitle("Order Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,500);
        setVisible(true);
        setLayout(new BorderLayout());

        croPnl = new CroissantPanel();
        titlePnl = new TitlePanel();
        topPnl = new ToppingPanel();
        coffeePnl = new CoffeePanel();

        buildButtonPanel();

        add(titlePnl,BorderLayout.NORTH);
        add(croPnl,BorderLayout.WEST);
        add(topPnl,BorderLayout.CENTER);
        add(coffeePnl,BorderLayout.EAST);
        add(buttonPnl,BorderLayout.SOUTH);

    }
    private void buildButtonPanel(){
        buttonPnl = new JPanel();

        calcBtn = new JButton("Calculate");
        exitBtn = new JButton("Exit");

        calcBtn.addActionListener(new CalButtonListener());
        exitBtn.addActionListener(new ExitButtonListener());
        buttonPnl.add(calcBtn);
        buttonPnl.add(exitBtn);

    }
    private class CalButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            double total;

            total = croPnl.getCroissant() + coffeePnl.getCoffeeCost() + topPnl.getToppingCost();
            JOptionPane.showMessageDialog(null,"Total is RM: " + total);
        }
    }
    private class ExitButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}

