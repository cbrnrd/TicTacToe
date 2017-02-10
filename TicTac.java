import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 * Created by Carter on 2/10/17.
 */
public class TicTac {
    JFrame f;
    int count = 0;

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
            //JButton[] buttons = {b1, b2, b3, b4, b5, b6, b7, b8, b9, reset};

            reset.setSize(100, 100);

            // set the action listener for each button
            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    b1.setFont(new Font("Arial", Font.BOLD, 40));
                    count++;
                    if(count % 2 != 0) {
                        b1.setText("X");
                    } else {
                        b1.setText("O");
                    }
                    b1.setEnabled(false);
                }
            });

            b2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    b2.setFont(new Font("Arial", Font.BOLD, 40));
                    count++;
                    if(count % 2 != 0) {
                        b2.setText("X");
                    } else {
                        b2.setText("O");
                    }
                    b2.setEnabled(false);
                }
            });

            b3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    b3.setFont(new Font("Arial", Font.BOLD, 40));
                    count++;
                    if(count % 2 != 0) {
                        b3.setText("X");
                    } else {
                        b3.setText("O");
                    }
                    b3.setEnabled(false);
                }
            });

            b4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    b4.setFont(new Font("Arial", Font.BOLD, 40));
                    count++;
                    if(count % 2 != 0) {
                        b4.setText("X");
                    } else {
                        b4.setText("O");
                    }
                    b4.setEnabled(false);
                }
            });

            b5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    b5.setFont(new Font("Arial", Font.BOLD, 40));
                    count++;
                    if(count % 2 != 0) {
                        b5.setText("X");
                    } else {
                        b5.setText("O");
                    }
                    b5.setEnabled(false);
                }
            });

            b6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    b6.setFont(new Font("Arial", Font.BOLD, 40));
                    count++;
                    if(count % 2 != 0) {
                        b6.setText("X");
                    } else {
                        b6.setText("O");
                    }
                    b6.setEnabled(false);
                }
            });

            b7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    b7.setFont(new Font("Arial", Font.BOLD, 40));
                    count++;
                    if(count % 2 != 0) {
                        b7.setText("X");
                    } else {
                        b7.setText("O");
                    }
                    b7.setEnabled(false);
                }
            });

            b8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    b8.setFont(new Font("Arial", Font.BOLD, 40));
                    count++;
                    if(count % 2 != 0) {
                        b8.setText("X");
                    } else {
                        b8.setText("O");
                    }
                    b8.setEnabled(false);
                }
            });

            b9.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    b9.setFont(new Font("Arial", Font.BOLD, 40));
                    count++;
                    if(count % 2 != 0) {
                        b9.setText("X");
                    } else {
                        b9.setText("O");
                    }
                    b9.setEnabled(false);
                }
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


        public static void main(String[] args) {
            new TicTac();
        }
    }

