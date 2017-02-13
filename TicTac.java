import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;
import javax.swing.*;
/**
 * Created by Carter on 2/10/17.
 */
public class TicTac {
    JFrame f;
    int count = 0;
    boolean won = false;

        // constructor for displaying the GUI
        TicTac() {

            f = new JFrame("Tic Tac Toe!");
            JButton b1 = new JButton();
            JButton b2 = new JButton();
            JButton b3 = new JButton();
            JButton b4 = new JButton();
            JButton b5 = new JButton();
            JButton b6 = new JButton();
            JButton b7 = new JButton();
            JButton b8 = new JButton();
            JButton b9 = new JButton();
            JButton reset = new JButton("Reset board");
            JButton[] buttons = {b1, b2, b3, b4, b5, b6, b7, b8, b9, reset};

            // set the action listener for each button
            // gotta love lambdas amirite?
            b1.addActionListener(e -> {
                b1.setFont(new Font("Arial", Font.BOLD, 40));
                count++;
                if(count % 2 != 0) {
                    b1.setText("X");
                } else {
                    b1.setText("O");
                }
                b1.setEnabled(false);
                checkWin(buttons);
            });

            b2.addActionListener(e -> {
                b2.setFont(new Font("Arial", Font.BOLD, 40));
                count++;
                if(count % 2 != 0) {
                    b2.setText("X");
                } else {
                    b2.setText("O");
                }
                b2.setEnabled(false);
                checkWin(buttons);
            });

            b3.addActionListener(e -> {
                b3.setFont(new Font("Arial", Font.BOLD, 40));
                count++;
                if(count % 2 != 0) {
                    b3.setText("X");
                } else {
                    b3.setText("O");
                }
                b3.setEnabled(false);
                checkWin(buttons);
            });

            b4.addActionListener(e -> {

                b4.setFont(new Font("Arial", Font.BOLD, 40));
                count++;
                if(count % 2 != 0) {
                    b4.setText("X");
                } else {
                    b4.setText("O");
                }
                b4.setEnabled(false);
                checkWin(buttons);
            });

            b5.addActionListener(e -> {
                b5.setFont(new Font("Arial", Font.BOLD, 40));
                count++;
                if(count % 2 != 0) {
                    b5.setText("X");
                } else {
                    b5.setText("O");
                }
                b5.setEnabled(false);
                checkWin(buttons);
            });

            b6.addActionListener(e -> {
                b6.setFont(new Font("Arial", Font.BOLD, 40));
                count++;
                if(count % 2 != 0) {
                    b6.setText("X");
                } else {
                    b6.setText("O");
                }
                b6.setEnabled(false);
                checkWin(buttons);
            });

            b7.addActionListener(e -> {
                b7.setFont(new Font("Arial", Font.BOLD, 40));
                count++;
                if(count % 2 != 0) {
                    b7.setText("X");
                } else {
                    b7.setText("O");
                }
                b7.setEnabled(false);
                checkWin(buttons);
            });

            b8.addActionListener(e -> {
                b8.setFont(new Font("Arial", Font.BOLD, 40));
                count++;
                if(count % 2 != 0) {
                    b8.setText("X");
                } else {
                    b8.setText("O");
                }
                b8.setEnabled(false);
                checkWin(buttons);
            });

            b9.addActionListener(e -> {
                b9.setFont(new Font("Arial", Font.BOLD, 40));
                count++;
                if(count % 2 != 0) {
                    b9.setText("X");
                } else {
                    b9.setText("O");
                }
                b9.setEnabled(false);
                checkWin(buttons);
            });

            reset.addActionListener(new ActionListener() {
               @Override
                public void actionPerformed(ActionEvent e) {
                   resetButton(b1);
                   resetButton(b2);
                   resetButton(b3);
                   resetButton(b4);
                   resetButton(b5);
                   resetButton(b6);
                   resetButton(b7);
                   resetButton(b8);
                   resetButton(b9);
                   count = 0; // we do this to be sure that X's always start after reset
                }
            });
            f.add(b1);
            f.add(b2);
            f.add(b3);
            f.add(b4);
            f.add(b5);
            f.add(b6);
            f.add(b7);
            f.add(b8);
            f.add(b9);
            f.add(reset);



            f.setLayout(new GridLayout(4, 3));
            //setting grid layout of 4 rows and 3 columns

            f.setSize(500, 500);
            f.setVisible(true);
            f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }

        public void resetButton(JButton button){
            button.setText("");
            button.setEnabled(true);
        }

        public boolean checkWin(JButton[] buttons){

            for(int i = 0; i < buttons.length; i++){

                //check the Xs
                if(buttons[i].getText().equals("X")
                        && buttons[i + 1].getText().equals("X")
                        && buttons[i + 2].getText().equals("X")){
                    displayXWin();
                    resetBoard(buttons);
                } else if(buttons[3].getText().equals("X")
                        && buttons[4].getText().equals("X")
                        && buttons[5].getText().equals("X")){
                    displayXWin();
                    resetBoard(buttons);
                } else if(buttons[6].getText().equals("X")
                        && buttons[7].getText().equals("X")
                        && buttons[8].getText().equals("X")){
                    displayXWin();
                    resetBoard(buttons);
                } else if(buttons[1].getText().equals("X")
                        && buttons[4].getText().equals("X")
                        && buttons[7].getText().equals("X")){
                    displayXWin();
                    resetBoard(buttons);
                } else if(buttons[2].getText().equals("X")
                        && buttons[5].getText().equals("X")
                        && buttons[8].getText().equals("X")){
                    displayXWin();
                    resetBoard(buttons);
                } else if(buttons[0].getText().equals("X")
                        && buttons[4].getText().equals("X")
                        && buttons[8].getText().equals("X")){
                    displayXWin();
                    resetBoard(buttons);
                } else if(buttons[2].getText().equals("X")
                        && buttons[4].getText().equals("X")
                        && buttons[6].getText().equals("X")){
                    displayXWin();
                    resetBoard(buttons);
                } else if(buttons[0].getText().equals("X")
                        && buttons[3].getText().equals("X")
                        && buttons[6].getText().equals("X")) {
                    displayXWin();
                    resetBoard(buttons);
                } else;

                // Now check the Os
                if(buttons[i].getText().equals("O")
                        && buttons[i + 1].getText().equals("O")
                        && buttons[i + 2].getText().equals("O")){
                    displayZeroWin();
                    resetBoard(buttons);
                    return true;
                } else if(buttons[3].getText().equals("O")
                        && buttons[4].getText().equals("O")
                        && buttons[5].getText().equals("O")){
                    displayZeroWin();
                    resetBoard(buttons);
                } else if(buttons[6].getText().equals("O")
                        && buttons[7].getText().equals("O")
                        && buttons[8].getText().equals("O")){
                    displayZeroWin();
                    resetBoard(buttons);
                } else if(buttons[1].getText().equals("O")
                        && buttons[4].getText().equals("O")
                        && buttons[7].getText().equals("O")){
                    displayZeroWin();
                    resetBoard(buttons);
                } else if(buttons[2].getText().equals("O")
                        && buttons[5].getText().equals("O")
                        && buttons[8].getText().equals("O")){
                    displayZeroWin();
                    resetBoard(buttons);
                } else if(buttons[0].getText().equals("O")
                        && buttons[4].getText().equals("O")
                        && buttons[8].getText().equals("O")){
                    displayZeroWin();
                    resetBoard(buttons);
                } else if(buttons[2].getText().equals("O")
                        && buttons[4].getText().equals("O")
                        && buttons[6].getText().equals("O")){
                    displayZeroWin();
                    resetBoard(buttons);
                } else;
            }
            //fail condition if none of those are true
            return false;
        }

    public void resetBoard(JButton[] buttons){
        for(int i = 0; i < buttons.length; i++){
            if(buttons[i].getText().equals("Reset board")){
                count = 0;
                break;
            } else {
                buttons[i].setText("");
                buttons[i].setEnabled(true);
                count = 0;
            }
        }
    }

    public void displayZeroWin(){
        JOptionPane.showMessageDialog(f, "O's win!", "Winner!", JOptionPane.PLAIN_MESSAGE);

    }

    public void displayXWin(){
        JOptionPane.showMessageDialog(f, "X's win!", "Winner!", JOptionPane.PLAIN_MESSAGE);
    }

    public void displayDraw(){
        JOptionPane.showMessageDialog(f, "Draw", "Nobody wins :(", JOptionPane.PLAIN_MESSAGE);
    }


        public static void main(String[] args) {
            new TicTac();
        }
    }

