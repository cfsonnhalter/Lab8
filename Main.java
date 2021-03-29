
/* Lab8 written by Christopher Sonnhalter 3/29/21*/


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class Main {
 public static void main(String args[]) {
   SwingUtilities.invokeLater(new Runnable() {
     public void run() {
        new GuessingGame();
     }
   });
 }
} 




