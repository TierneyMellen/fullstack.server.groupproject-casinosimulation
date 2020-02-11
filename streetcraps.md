# Street Craps Dice Game

> This is just Psedoccode planner



## Player class

__class Player implements GamblingPlayer {__
```
private Interger player_id;
private String player_name;
private Interger pocket;

public Player() { }

public Player(String name) {
	this.player_name = name;
}

public int getMoney() {
	return this.pocket;
}

public void setMoney(int money) {
	this.pocket = money;
}

```
__}__



## PlayerController class

__class PlayerController extends Player implement GamblingPlayer implements GamlingGame{__
```

```
__}__



## GamblingPlayer interface
__interface GamblingPlayer {__
```
int getMoney();
void setMoney();
```
__}__



## GamblingGame interface
__interface GamblingGame {__
```
void addMoney(int money);
int loseBet(int Money);
```
__}__



## Dice class

__class Dice {__
```
private int total_side;
private int faceValue; 

public Dice(int total_side){
	this.total_side = total_side;
}


public int roll(){
	faceValue = (int)(Math.random() * MAX) + 1;
	return faceValue;
}

public void setFaceValue (int value) {
	faceValue = value;
}

public int getFaceValue() {
	return faceValue;
}

public String toString() { 
	String result = Integer.toString(faceValue); 
	return result; 
} 
```
__}__



## Street Craps Game class

__class StreetCraps {__
```

private String str = "";
Scanner sc = new Scanner(System.in);

public void main (String[] arg) {

	alert("Welcome to 'Street Craps Dice Game'...");

	Player user = new 

	alert("Let's start");
	play();

}


public void play() {

	int sumDices = sum2Dices();

	boolean notPointBet(sumDices);
		
}


public int sum2Dices() {

	Dice dice1 = new Dice();
	Dice dice2 = new Dice();

	int value1 = dice1.roll();
	int value2 = dice2.roll();

	str = "Dice 1: " + value1 + "\nDice 2: " + value2;
	alert(str);

	int sum = value1 + value2;
	str = "Sum 2 dices: " + sum;
	alert(str);

	return sum;
}


public boolean notPointBet(int x) {

    if (x == 7 || x == 11)
    	return true;

    else if (x == 2 || x == 3 || x == 12)
    	return false;

    else {
    	alert("You are now in Point play");
        return pointBet(x);
    }

}


public void ptsPlay(int x) {

	prompt("Would you like to try your luck with Point again?");

}


public boolean pointBet(int x) {

	int newRoll = sum2Dices();

	if (x == newRoll)
		return true;
	else if (x == 7 || x == 11)
		return false;
	else 
		return pointBet(x);
	
}


public void replay() {

	prompt("Do you want to replay the game?");

}



public void alert(String str) {
	sout(str);
}



public String prompt(String str) {
	sout(str);
	user = nextLine();
}

```
__}__