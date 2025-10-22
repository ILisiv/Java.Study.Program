
public void main()
{
    // Create Random object
    Random rand = new Random();

    // Generate a random number between 1 and 100 (inclusive)
    int randomNumber = rand.nextInt(100) + 1;
    System.out.println("Random number between 1 and 100: " + randomNumber);

    // Check if the number is odd or even using modulo
    if (randomNumber % 2 == 0) {
        System.out.println(randomNumber + " is even.");
    } else {
        System.out.println(randomNumber + " is odd.");
    }
}
