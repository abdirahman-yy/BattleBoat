import javax.swing.*;
import java.awt.*;

/**
 * In this project, we use Java Framework (JFrame) to create buttons and append them to a stack that then displays this syncronized
 * buttons onto the window view. After that, we assess the frame to match any level of difficulty for the BattleShip game
 *
 * In this class, I set up the board :)
 */
public class Board {
    private JFrame frame;
    private JPanel panel;

    public Board(String difficulty) {
        frame = new JFrame();
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(1000,1000,1000,1000));
        panel.setLayout(new GridLayout(0,1));
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        CreateBoard(difficulty);
    }


    public void CreateBoard(String difficulty) {
        if (difficulty.toLowerCase().equals("beginner")) {
            setFrameBeginner();
        }
        else if (difficulty.toLowerCase().equals("intermediate")) {
            setFrameIntermediate();
        }
        else if (difficulty.toLowerCase().equals("expert")) {
            setFrameExpert();
        }
    }

    public void setFrameBeginner() {
        int height = 3;
        int width = 3;
        GridLayout grid = new GridLayout(height, width);

        frame.setLayout(grid);
        frame = new JFrame("BeginnerShip");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(grid);
        frame.setResizable(false);

        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        JButton button4 = new JButton();
        JButton button5 = new JButton();
        JButton button6 = new JButton();
        JButton button7 = new JButton();
        JButton button8 = new JButton();
        JButton button9 = new JButton();

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
    }

    public void setFrameIntermediate() {
        int height = 5;
        int width = 5;
        GridLayout grid = new GridLayout(height, width);

        frame.setLayout(grid);
        frame = new JFrame("BeginnerShip");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setLayout(grid);
        frame.setResizable(false);

        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        JButton button4 = new JButton();
        JButton button5 = new JButton();
        JButton button6 = new JButton();
        JButton button7 = new JButton();
        JButton button8 = new JButton();
        JButton button9 = new JButton();
        JButton button10 = new JButton();
        JButton button11 = new JButton();
        JButton button12 = new JButton();
        JButton button13 = new JButton();
        JButton button14 = new JButton();
        JButton button15 = new JButton();
        JButton button16 = new JButton();
        JButton button17 = new JButton();
        JButton button18 = new JButton();
        JButton button19 = new JButton();
        JButton button20 = new JButton();
        JButton button21 = new JButton();
        JButton button22 = new JButton();
        JButton button23 = new JButton();
        JButton button24 = new JButton();
        JButton button25 = new JButton();

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(button10);
        frame.add(button11);
        frame.add(button12);
        frame.add(button13);
        frame.add(button14);
        frame.add(button15);
        frame.add(button16);
        frame.add(button17);
        frame.add(button18);
        frame.add(button19);
        frame.add(button20);
        frame.add(button21);
        frame.add(button22);
        frame.add(button23);
        frame.add(button24);
        frame.add(button25);
    }

    public void setFrameExpert() {
        int height = 7;
        int width = 7;
        GridLayout grid = new GridLayout(height, width);

        frame.setLayout(grid);
        frame = new JFrame("BeginnerShip");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setLayout(grid);
        frame.setResizable(false);

        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        JButton button4 = new JButton();
        JButton button5 = new JButton();
        JButton button6 = new JButton();
        JButton button7 = new JButton();
        JButton button8 = new JButton();
        JButton button9 = new JButton();
        JButton button10 = new JButton();
        JButton button11 = new JButton();
        JButton button12 = new JButton();
        JButton button13 = new JButton();
        JButton button14 = new JButton();
        JButton button15 = new JButton();
        JButton button16 = new JButton();
        JButton button17 = new JButton();
        JButton button18 = new JButton();
        JButton button19 = new JButton();
        JButton button20 = new JButton();
        JButton button21 = new JButton();
        JButton button22 = new JButton();
        JButton button23 = new JButton();
        JButton button24 = new JButton();
        JButton button25 = new JButton();
        JButton button26 = new JButton();
        JButton button27 = new JButton();
        JButton button28 = new JButton();
        JButton button29 = new JButton();
        JButton button30 = new JButton();
        JButton button31 = new JButton();
        JButton button32 = new JButton();
        JButton button33 = new JButton();
        JButton button34 = new JButton();
        JButton button35 = new JButton();
        JButton button36 = new JButton();
        JButton button37 = new JButton();
        JButton button38 = new JButton();
        JButton button39 = new JButton();
        JButton button40 = new JButton();
        JButton button41 = new JButton();
        JButton button42 = new JButton();
        JButton button43 = new JButton();
        JButton button44 = new JButton();
        JButton button45 = new JButton();
        JButton button46 = new JButton();
        JButton button47 = new JButton();
        JButton button48 = new JButton();
        JButton button49 = new JButton();

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(button10);
        frame.add(button11);
        frame.add(button12);
        frame.add(button13);
        frame.add(button14);
        frame.add(button15);
        frame.add(button16);
        frame.add(button17);
        frame.add(button18);
        frame.add(button19);
        frame.add(button20);
        frame.add(button21);
        frame.add(button22);
        frame.add(button23);
        frame.add(button24);
        frame.add(button25);
        frame.add(button26);
        frame.add(button27);
        frame.add(button28);
        frame.add(button29);
        frame.add(button30);
        frame.add(button31);
        frame.add(button32);
        frame.add(button33);
        frame.add(button34);
        frame.add(button35);
        frame.add(button36);
        frame.add(button37);
        frame.add(button38);
        frame.add(button39);
        frame.add(button40);
        frame.add(button41);
        frame.add(button42);
        frame.add(button43);
        frame.add(button44);
        frame.add(button45);
        frame.add(button46);
        frame.add(button47);
        frame.add(button48);
        frame.add(button49);
    }

    public static void main(String[] args) {
        Board myBoard = new Board("expert");
    }
}
