
public void main()
{
    float weightEarthVolkov = 75.0F;
    float gravityEarth = 9.81F;
    float gravityMars = 3.721F;
    double weightMarsVolkov;

//  logic
    weightMarsVolkov = (weightEarthVolkov / gravityEarth) * gravityMars;

    IO.println("Weight on Mars is double: " + String.format("%.4f", weightMarsVolkov) + " kg");

    int newWeight = (int) weightMarsVolkov;

    IO.println("Weight on Mars is in int: " + newWeight + " kg");

    String s = String.valueOf(newWeight);
    char newWeightText = (char) s.charAt(0);

    IO.println("Weight on Mars is in char: " + newWeightText + " kg");

    int result = (int) newWeightText * 2;
    IO.println("Result is: " + result + " kg");
}
