
public void main()
{
// Declare all float variables on top
    float weightEarthVolkov = 75.0F;    // in kilograms
    float gravityEarth = 9.81F;   // m/s²
    float gravityMars = 3.721F;   // m/s²
    double weightMarsVolkov;            // declare variable for result

// Main logic
    weightMarsVolkov = (weightEarthVolkov / gravityEarth) * gravityMars;

    IO.println("Your weight on Mars is: " + weightMarsVolkov + " kg");
}
