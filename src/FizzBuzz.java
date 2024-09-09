/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {


        int j = 1;
        while (j < 100) {

            j = getJ(j);

        }
    }

    public static int getJ(int j) {
        if (j % 3 == 0 && j % 5 == 0) {

            System.out.println("Fizz Buzz");

        }
        else if (j % 3 == 0) {

            System.out.println("Fizz");

        }
        else if (j % 5 == 0) {

            System.out.println("Buzz");

        }
        else {

            System.out.println(j);

        }

        j++;
        return j;
    }
}
