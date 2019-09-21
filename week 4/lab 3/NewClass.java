/*
 - Programmer Name: Valentinno Cruz
 - Assignment Start: 10/01/19 14:19
 - Assignment Completion:10/02/19 14:50
 - Total Hours for Assignment:   2.5
 - Comments: This was a bit troublesome for me, I wanted to 
             figure out a way to ask the user if they wanted to continue
             bidding so the program wouldnt continue automatically untill broke.
 */
package crapsapp.CrapsApp;
import java.util.Random;                  //Generate Pseudo numbers
import java.io.BufferedReader;           //Read text from char input stream
import java.io.InputStreamReader;       //Bridge byte to char
import java.util.Date;                 //Date util.
import java.text.DateFormat;          //Format to text
import java.text.SimpleDateFormat;   //Simpler date format

/**
 *
 * @author valen
 */
public class NewClass {
    
    private static final Random randomNumbers = new Random(); //generate ran #'s
    private enum Status {CONTINUE, WON, LOST};  //group of con. based on outcome
    private static final int Snakee_Eyes = 2; 
    private static final int TRES = 3;
    private static final int SE7EN = 7;
    private static final int ELEVEN = 11;
    private static final int HOT_ONE2 = 12;
    public static void main(String []args) throws Exception
{
// Points 
int myPoint = 0;

//apply new int variable for bankbalance & wager
int bankBalance = 1000;
int wager;

//read the character-input
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //loop to continously ask user for wager untill a correct amt is entered
    while(true) {
        System.out.println("Whats your bid?");
            wager = Integer.parseInt(br.readLine());

    if(wager<=bankBalance)
        break;
    
    else
        System.out.println("You are too broke, bid less.");
}

Status gameStatus;
int sumOfDice = rollDice();
    switch(sumOfDice){
        case SE7EN:
        case ELEVEN:
    gameStatus = Status.WON;
    chtter(gameStatus);
        break;
        case Snakee_Eyes:
        case TRES:
        case HOT_ONE2:
    gameStatus = Status.LOST;
    chtter(gameStatus);
        break;
            
    default:
    gameStatus = Status.CONTINUE;
    chtter(gameStatus);
    myPoint = sumOfDice;
        System.out.println("Point is "+myPoint);
            break;
}
    while (gameStatus == Status.CONTINUE){
        sumOfDice = rollDice();
    if(sumOfDice == myPoint)
        gameStatus = Status.WON;
    else if(sumOfDice == SE7EN)
        gameStatus = Status.LOST;
        chtter(gameStatus);
}
    if(gameStatus == Status.WON){
        System.out.println("Player wins");
        bankBalance = bankBalance + wager;
        System.out.println("Your new bank balance is "+bankBalance);
}
    else{
        System.out.println("Player loses");
        bankBalance = bankBalance - wager;
        System.out.println("Your new bank balance is "+bankBalance);
    if(bankBalance == 0)
        System.out.println("Sorry. You busted!"
                + "\n Thank you for using the Calculating Sales app"
                + "\n Time of calculation is: ");
            DateFormat df = new SimpleDateFormat("MM/dd/yy hh:mm:ss");
             Date dateobj = new Date();
                System.out.println(df.format(dateobj));
                        
    }
}

public static int rollDice(){

    int die1 = randomNumbers.nextInt(6);
    int die2 = randomNumbers.nextInt(6);
    int sum = die1 + die2;
        System.out.println("Player rolled "+die1+"+"+die2+"="+sum);
    return sum;
}

//depending on situation, different messages for chatter 
public static void chtter(Status gameStatus){
    int random = randomNumbers.nextInt(4);
        if(gameStatus == Status.WON){
        switch(random){
            case 1:
            System.out.println("Hey! Congrats man");
                break;
            case 2:
            System.out.println("You nailed it.wohoooo!");
                break;
            case 3:
            System.out.println("Wah! what a win.Congrts");
                break;
            case 4:
            System.out.println("Bro,you deserve it.Let's enjoy");
                break;
        }
}
    else if(gameStatus == Status.LOST){
        switch(random){
            case 1:
            System.out.println("Sorry man, better luck next time");
                break;
            case 2:
            System.out.println("Bad luck! Better luck next time");
                break;
            case 3:
            System.out.println("Seems fortune is not with you today");
                break;
            case 4:
            System.out.println("Never mind.Someday you will win.");
                break;
        }
}
    else{
        switch(random){
            case 1:
            System.out.println("oh! you are going to broke, huh?");
                break;
            case 2:
            System.out.println("Aw c'mon, take a chance!");
                break;
            case 3:
            System.out.println("c'mon.keep trying");
                break;
            case 4:
            System.out.println("Keep it up.You can do it");
                break;
        }
    }
  }
}
