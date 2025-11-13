        public static void main(String[] args)
    {
                int[] array = new int[10];
                Scanner sc = new Scanner(System.in);
                System.out.println("Please enter starting number: ");
                int number = sc.nextInt();

                for(int i = 0; i > number; i++) {
                    if(i % 2 == 0) {
                        array[i] = i;
                    }
                }

                for(int element: array) {
                    System.out.print(element + " ");
                }
            
    }



