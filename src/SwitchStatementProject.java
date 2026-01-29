import java.awt.*;
import java.awt.event.*;


public class SwitchStatementProject extends Frame implements ActionListener {
    Label l;
    Menu file;
    MenuItem n, o, s, c, e, z;
    MenuBar mb;

    SwitchStatementProject() {
        l = new Label("Menu Option");
        l.setAlignment(Label.CENTER);
        file = new Menu("File");
        n = new MenuItem("New");
        o = new MenuItem("Open");
        s = new MenuItem("Save");
        c = new MenuItem("Close");
        e = new MenuItem("Exit");
        z = new MenuItem("Dubey");

        file.add(n);
        file.add(o);
        file.add(s);
        file.add(c);
        file.add(e);
        file.add(z);

        mb = new MenuBar();
        mb.add(file);

        setMenuBar(mb);
        add(l);

        n.addActionListener(this);
        o.addActionListener(this);
        s.addActionListener(this);
        c.addActionListener(this);
        e.addActionListener(this);
        z.addActionListener(this);

        // Close window properly
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        String option = ae.getActionCommand();

        switch (option) {
            case "New":
                l.setText("New File Created");
                break;
            case "Open":
                l.setText("File Open");
                break;
            case "Close":
                l.setText("File Closed");
                break;
            case "Save":
                l.setText("File Save");
                break;
            case "Exit":
                System.exit(0);
                break;
            case "Dubey":
                l.setText("Aashish Dubey MadarChod hai....");
                break;

        }
    }

    public static void main(String[] args) {
        SwitchStatementProject m = new SwitchStatementProject();
        m.setSize(500, 400);
        m.setVisible(true);
    }
}
