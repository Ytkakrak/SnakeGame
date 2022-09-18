import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow(){
        this.setTitle("Snake");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(370,390);
        this.setLocation(400,400);
        this.add(new GameField());
        this.setVisible(true);
    }

    public static void main(String[] args) {  new MainWindow(); }
}
