package cards;

import java.security.SecureRandom;
import java.util.*;

public class Deck {

    // members
    protected String colour;
    protected String suite;
    protected String position;
    protected int number;

    public Deck() {
    
    
    }

    public void draw() {
             // random colour
        Random whatColour = new SecureRandom();
        int colourNum = whatColour.nextInt(2);
        String[] colourName = new String[2];
        colourName[0] = "black";
        colourName[1] = "red";
        this.colour = colourName[colourNum];


        // random suite
        Random whatSuite = new SecureRandom();
        int suiteNum = whatSuite.nextInt(4);
        String[] chosenNum = new String[4];
        chosenNum[0] = "heart";
        chosenNum[1] = "diamond";
        chosenNum[2] = "club";
        chosenNum[3] = "spade";
        this.suite = chosenNum[suiteNum];

        // random position
        Random whatPos = new SecureRandom();
        int posNum = whatPos.nextInt(3);
        String[] posName = new String[3];
        posName[0] = "jack";
        posName[1] = "queen";
        posName[2] = "king";
        this.position = posName[posNum];

        // random number
        Random whatNum = new SecureRandom();
        int numNum = whatNum.nextInt(10)+1;
        this.number = numNum;
        
        System.out.printf("Your card is: %s, %s, %s, %d\n", this.colour, this.suite, this.position, this.number);

        }



    }
    // method
    //public void draw() {

       // System.out.printf("Your card is: %s, %s, %s, %d\n", this.colour, this.suite, this.position, this.number);
    

