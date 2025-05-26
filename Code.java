class Code {
    public static void main(String[] args) {
        int[] numbers = {10, 21, 4, 45, 66, 93, 1};

        System.out.println("Even Numbers:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }

        System.out.println("\nOdd Numbers:");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }

        System.out.println("\nPrime Numbers:");
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;  
        }
        for (int i = 2; i <= Math.sqrt(number); i++) { 
            if (number % i == 0) {
                return false;  
            }
        }
        return true;  
    }
}
