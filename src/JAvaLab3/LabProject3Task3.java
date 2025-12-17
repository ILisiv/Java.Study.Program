
public void main()
{
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter  a: ");
    double a = scanner.nextDouble();

    System.out.print("Enter b: ");
    double b = scanner.nextDouble();

    System.out.print("Enter  c: ");
    double c = scanner.nextDouble();

    double result = Math.pow(b, 2) - 4 * a * c;

    System.out.println("The result is" + result);

    if (result > 0)
    {
        double root1 = (-b + Math.sqrt(result)) / (2 * a);
        double root2 = (-b - Math.sqrt(result)) / (2 * a);
        System.out.println("Two roots are:");
        System.out.println("X1 = " + root1);
        System.out.println("X2 = " + root2);
    }
    else if (result == 0)
    {
        double root = -b / (2 * a);
        System.out.println("Two roots are:");
        System.out.println("X1 = X2 = " + root);
    }
    else
    {
        double realPart = -b / (2 * a);
        double imaginaryPart = Math.sqrt(-result) / (2 * a);
        System.out.println("Roots are:");
        System.out.println("X1 = " + realPart + " - " + imaginaryPart + "i");
        System.out.println("X2 = " + realPart + " + " + imaginaryPart + "i");
    }

}




