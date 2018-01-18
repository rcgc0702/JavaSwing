import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Panel1 extends JPanel {

    List<JButton> a = new ArrayList<>();
    List<String> theLinkings = new ArrayList<>();
    CardLayout b_layout;
    Container c = new Container();

    public Panel1() {

        b_layout = new CardLayout(10,10);
        c.setSize(100,100);
        c.setLayout(b_layout);
        add(c);

        theLinkings.add("Name");
        theLinkings.add("Address");
        theLinkings.add("Age");
        theLinkings.add("Eye color");

        String tempValue = "";

        for (int i = 0; i <= theLinkings.size()-1; i++) {
            tempValue = Integer.toString(i) + " - " + theLinkings.get(i);
            a.add(new JButton(tempValue));
        }

        ActionListener appy = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b_layout.next(c);
            }
        };

        for (JButton jb: a) {
            jb.addActionListener(appy);
            c.add(jb);
        }

        setBackground(Color.WHITE);
        setLayout(new GridLayout());

    }
}
