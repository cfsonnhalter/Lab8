// imports that are needed are added here 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;


//method called guessing game
public class GuessingGame implements ActionListener
{ 
  //declares the variables that will be needed
  JTextField field;
  JButton guessButton, resetButton;
  JLabel labEnter, labGuess, labLast;
  int num;

  GuessingGame()
  {
    // generates a random number between 1 and 100
    random r = new random();
    num = r.nextInt(100) + 1;
    //creates frame withn label guessing game, also assigns layout and size
    JFrame frame = new JFrame("The Guessing Game");
    frame.setLayout(new FlowLayout());
    frame.setSize(240,120);
    // create new textfield with max characters of 10
    field = new JTextField(10);
    field.setActionCommand("myTF");
    //defines what each button is going to say
    guessButton = new JButton("Guess");
    resetButton = new JButton("Play Again");
    //adds action listenr to buttons
    field.addActionListener(this);
    guessButton.addActionListener(this);
    resetButton.addActionListener(this);
    //declares what each label will say
    labEnter = new JLabel("Enter your guess: ");
    labGuess = new JLabel("");
    labLast = new JLabel("");
    //added all elemeents to the frame in the order I want them
    frame.add(labEnter);
    frame.add(field);
    frame.add(guessButton);
    frame.add(labGuess);
    frame.add(labLast);
    frame.add(resetButton);
    // sets the frame so that it can be seen
    frame.setVisible(true);
  }

    public void actionPerformed(ActionEvent ae)
    { //defines what will happen when guessButton is clicked
    if (ae.getActionCommand().equals("Guess")
      {
        int guess = Integer.parseInt(userGuess.getText());{
          if (guess > num) 
          { //tests to see if guess is higher than random number
          labGuess.setText("Too high");
          }
          else if (guess < num)
          {//tests to see if guess is lower than random number
            labGuess.setText("Too low!");
          }
          else if (guess == num)
          { //tests to see if guess equals number
            labGuess.setText("~~You got it!~~");
          } //sets the text of labLast to tell you what their last guess was
        labLast.setText("Your last guess was: " + guess);
        }
      } // defines what will happen if the play again button is pressed
    else if(ae.ActionCommand().equal("Play Again"))
      { //creates a new random number 
        random r = new random();
        num = r.nextInt(100) + 1;
        //sets labels back to default
        labEnter = new JLabel("Enter your guess: ");
        labGuess = new JLabel("");
        labLast = new JLabel("");
        //sets the guess back to null
        guess.setText("");
      }
    else
      { //this will set the label's text if the enter key is pressed, not the guess button
        labGuess.setText("You pressed ENTER KEY. Please press the Guess button.");
      }
    }






  }




}