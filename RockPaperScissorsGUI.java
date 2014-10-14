import javax.swing.*;

import java.util.*;


public class RockPaperScissorsGUI {


    public static void main(String[] args) {


        String input;                      //stores user input from JOP

        int uchoice;                        //parse of input; users choice

        int compchoice;                  //random choice by computer

 

        //prompts for user input and then parses it to uchoice

        input = JOptionPane.showInputDialog("What'll it be? Rock, paper, or scissors?\n" +

                "1 for rock, 2 for paper, and 3 for scissors: ");

        uchoice = Integer.parseInt(input);

         

        //generates random number and sets a limit

        Random randomnum = new Random ();

         

        compchoice = randomnum.nextInt(3);

         

        //determines whether the user or computer wins

        if (uchoice == 1 && compchoice == 0)

                JOptionPane.showMessageDialog(null, "Tie!");

         

        else if (uchoice == 1 && compchoice == 1)

                JOptionPane.showMessageDialog(null, "Paper beats rock. You lose!");

         

        else if (uchoice == 1 && compchoice == 2)

                JOptionPane.showMessageDialog(null, "Rock beats scissors. You win!");


                JOptionPane.showMessageDialog(null, "Paper beats rock. You win!");


              if (uchoice == 2 && compchoice == 1)

                JOptionPane.showMessageDialog(null, "Tie!");

         

        else if (uchoice == 2 && compchoice == 2)

                JOptionPane.showMessageDialog(null, "Scissors beats paper. You lose!");

         

        else if (uchoice == 3 && compchoice == 0)

                JOptionPane.showMessageDialog(null, "Rock beats Scissors. You lose!");

         
        else if (uchoice == 3 && compchoice == 1)

                JOptionPane.showMessageDialog(null, "Scissors beats paper. You win!");

         

        else if (uchoice == 3 && compchoice == 2)

                JOptionPane.showMessageDialog(null, "Tie!");

    }

}
