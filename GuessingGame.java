

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GuessingGame implements ActionListener
{
  JTextField field;
  JButton guessButton, resetButton;
  JLabel labEnter, labGuess, labLast;
  int num;

  GuessingGame()
  {
    random r = new random();
    num = r.nextInt(100) + 1;

    JFrame frame = new JFrame("The Guessing Game");
    frame.setLayout(new FlowLayout());
    frame.setSize(240,120);

    field = new JTextField(10);
    field.setActionCommand("myTF");

    guessButton = new JButton("Guess");
    resetButton = new JButton("Play Again");

    field.addActionListener(this);
    guessButton.addActionListener(this);
    resetButton.addActionListener(this);

    labEnter = new JLabel("Enter your guess: ");
    labGuess = new JLabel("");
    labLast = new JLabel("");

    frame.add(labEnter);
    frame.add(field);
    frame.add(guessButton);
    frame.add(labGuess);
    frame.add(labLast);
    frame.add(resetButton);

    frame.setVisible(true);

    public void actionPerformed(ActionEvent ae)
    {
    if (ae.getActionCommand().equals("Guess")
      {
        int guess = Integer.parseInt(userGuess.getText());{
          if (guess > num) {
          labGuess.setText("Too high");
          }
          else if (guess < num){
            labGuess.setText("Too low!");
          }
          else if (guess == num){
            labGuess.setText("~~You got it!~~");
          }
        labLast.setText("Your last guess was: " + guess);
        }
      }
    else if(ae.ActionCommand().equal("Play Again"))
      {
        random r = new random();
        num = r.nextInt(100) + 1;

        labEnter = new JLabel("Enter your guess: ");
        labGuess = new JLabel("");
        labLast = new JLabel("");

        guess.setText("");
      }
    else
      {
        labGuess.setText("You pressed ENTER KEY. Please press the Guess button.");
      }
    }






  }




}