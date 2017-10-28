import java.util.Scanner; // Needed to import several utilities for use later
import java.lang.*;

/* ***************************************
  AUTHOR:Charlie Kennedy
  A short dungeon game
****************************************/

   class dungeongame
   {
      public static void main (String[] param)
      {
        String Character; //Declaring variables (may change this into a report)

        introduction(); //introduce player to the game
        characterselect(); //get players name and race (dwarf, elf, etc.)
        //getter and setter method for race, name, score are needed
        int score1 = gamestart();//begins the game
        printscore(score1);//displays score
        //endgame(); //finish the game *and display high scores?*
        System.exit(0); //exit program
      } //End main

        public static void introduction ()
        {
          System.out.println("Welcome to Darkest Dungeon\nCreated By Charlie Kennedy");
        } //End introduction

        public static void characterselect ()
   			{
          Scanner scanner = new Scanner(System.in);
          String userchoice;
          String answer1;

          System.out.println("Which race are you (input a number from 1 to 4)?\n1 - Elf\n2 - Dwarf\n3 - Human\n4 - Orc");
          answer1 = scanner.nextLine();
          userchoice = answer1;

            if (userchoice.contains("1"))
       		{
           	System.out.println("So you are an Elf?");
       		}
       		  else if (userchoice.contains("2"))
      		{
           	System.out.println("So you are a Dwarf");
      		}
       		  else if (userchoice.contains("3"))
       		{
           	System.out.println("So you're Human?");
       		}
            else if (userchoice.contains("4"))
         {
            System.out.println("So you are an Orc?\nGross!");
         }
    		    else
          {
            System.out.println("Sorry, That is not an option.");
			    }
        }

        public static int gamestart()
        {
          Scanner scanner = new Scanner(System.in);
          String answer1;
          int score1;

          System.out.println("There is a large wooden door, you push it.\nIt opens and you walk down a long corridor until you reach 4 doors.\nEach door has a letter above it; N,S,E,W\nWhich door do you choose?");
          answer1 = scanner.nextLine();
          System.out.println("You are now in a small room. You find a golden sword.");
          score1 = (int)(Math.random()*6) + 1;
          return score1;
        }

        public static void printscore (int score1)
        {
          System.out.println("You Scored " + score1);
        }
   }
