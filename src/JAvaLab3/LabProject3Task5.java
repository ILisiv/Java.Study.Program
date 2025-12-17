
public void main()
{

    int[] number = new int[10];
    System.out.println("The random numbers generated are: ");
    for (int count = 0; count < number.length; count++)
    {
        number[count] = (int) (Math.random() * 100 + 1);
        System.out.println(number[count]);
    }
    int min = 101;
    int max = 0;

    for (int i = 0; i < number.length; i++)
    {
        if (number[i] < min)
        {
            min = number[i];
        }
        if (number[i] > max)
        {
            max = number[i];
        }
    }
    System.out.println("Max:" + max);
    System.out.println("Min:" + min);

}




