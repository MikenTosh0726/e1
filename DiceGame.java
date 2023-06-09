import java.util.Random;

class DiceGame{
    public static void main(String[] args){
	System.out.println("What is your name?");

	Scanner input = new Scanner(System.in);
	String name = input.nextLine();

	System.out.println("Hello, " + name + "!");

	System.out.println("Rolling dice...");

	Random ranNum = new Random();
	int total = 0;
	int randomNumber = 0;

	for(int i=1; i<3; i++){
	    randomNumber = ranNum.nextInt(6)+1;
	    total = total + randomNumber;
	    System.out.println("Die " + i + ":" + randomNumber);
	}
	System.out.println("Total Value : " + total);

	if(total>7) System.out.println("You won");
	else System.out.println("You lost");
    }
}
