
public void main()
{
    Random rand = new Random();
    int randomNumber = rand.nextInt(100) + 1;
    System.out.println("Random number between 1 and 100: " + randomNumber);

    if (randomNumber % 2 == 0)
    {
        System.out.println(randomNumber + " is even.");
    }
    else
    {
        System.out.println(randomNumber + " is odd.");
    }
}
