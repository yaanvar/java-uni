package ru.mirea.lab15;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.AbstractAction;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class MenuBar extends JFrame {
    private static final long serialVersionUID = 1L;
    public MenuBar() {
        super("Menu Bar");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createFileMenu());
        menuBar.add(createViewMenu());
        setJMenuBar(menuBar);
        setSize(300, 200);
        setVisible(true);
    }
    private JMenu createFileMenu() {
        JMenu file = new JMenu("File");
        JMenuItem open = new JMenuItem("Open",
                new ImageIcon("images/open.png"));
        JMenuItem exit = new JMenuItem(new ExitAction());
        exit.setIcon(new ImageIcon("images/exit.png"));
        file.add(open);
        file.addSeparator();
        file.add(exit);

        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println ("ActionListener.actionPerformed : open");
            }
        });
        return file;
    }
    private JMenu createViewMenu() {
        JMenu viewMenu = new JMenu("View");
        JCheckBoxMenuItem line  = new JCheckBoxMenuItem("Russia");
        JCheckBoxMenuItem grid  = new JCheckBoxMenuItem("USA");
        JCheckBoxMenuItem navig = new JCheckBoxMenuItem("Germany");
        JRadioButtonMenuItem one = new JRadioButtonMenuItem("Page 1");
        JRadioButtonMenuItem two = new JRadioButtonMenuItem("Page 2");
        ButtonGroup bg = new ButtonGroup();
        bg.add(one);
        bg.add(two);
        viewMenu.add(line);
        viewMenu.add(grid);
        viewMenu.add(navig);
        viewMenu.add( new JSeparator());
        viewMenu.add(one);
        viewMenu.add(two);
        return viewMenu;
    }
    class ExitAction extends AbstractAction {
        private static final long serialVersionUID = 1L;
        ExitAction() {
            putValue(NAME, "Выход");
        }
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new MenuBar();
    }
}