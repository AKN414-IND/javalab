import javax.swing.*;;

public class swing {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b = new JButton("click");
        JLabel l = new JLabel("Hello");
        l.setBounds(130, 50, 100, 40);
        f.add(l);

        b.setBounds(130, 100, 100, 40);

        f.add(b);

        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
}