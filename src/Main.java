import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int nr;
        int nr2;
        int nr3;
        int nr4;
        int nr5;
        int upperBound = 1000;
        Random number = new Random();
        nr = number.nextInt(upperBound);
        nr2 = number.nextInt(upperBound);
        nr3 = number.nextInt(upperBound);
        nr4 = number.nextInt(upperBound);
        nr5 = number.nextInt(upperBound);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(nr);
        numbers.add(nr2);
        numbers.add(nr3);
        numbers.add(nr4);
        numbers.add(nr5);
        System.out.println("the first number is " + nr);
        System.out.println("the second number is " + nr2);
        System.out.println("the third number is " + nr3);
        System.out.println("the fourth number is " + nr4);
        System.out.println("the fifth number is " + nr5);
         digitPrime(numbers);

    }

    public static void digitPrime(ArrayList<Integer> myNumbers) {
        int amountOfNumbersInList = myNumbers.size();
        int number;
        int digitNumber;
        int primeCounter = 0;
        boolean prime = true;
        for (int i = 0; i < amountOfNumbersInList; i++) {
            prime=true;
            number = myNumbers.get(i);
            digitNumber = number % 100;
            for (int j = 2; j <= digitNumber / 2; j++) {
                if (digitNumber % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                primeCounter++;
            }
        }
        System.out.println("the amount of prime numbers is "+primeCounter);

    }
   /* public static void digitPrime(int nr1,int nr2,int nr3,int nr4,int nr5){
        int digit1;
        int digit2;
        int primeCounter=0;
        int twoDigitPrimeNumber;
        int primeChecker=0;


            digit1=nr1%10;
            nr1/=10;
            digit2=nr1%10;
        twoDigitPrimeNumber=digit1*10+digit2;
        for(int i=2;i<=twoDigitPrimeNumber/2;i++){

            if(twoDigitPrimeNumber%i==0){
                primeChecker=1;
                break;
            }

            }
        if(primeChecker==0){
            primeCounter++;
        }


        digit1=nr2%10;
        nr2/=10;
        digit2=nr2%10;
        twoDigitPrimeNumber=digit1*10+digit2;
        for(int i=2;i<=twoDigitPrimeNumber/2;i++){

            if(twoDigitPrimeNumber%i==0){
                primeChecker=1;
                break;
            }

        }
        if(primeChecker==0){
            primeCounter++;
        }



        digit1=nr3%10;
        nr3/=10;
        digit2=nr3%10;
        twoDigitPrimeNumber=digit1*10+digit2;
        for(int i=2;i<=twoDigitPrimeNumber/2;i++){

            if(twoDigitPrimeNumber%i==0){
                primeChecker=1;
                break;
            }

        }
        if(primeChecker==0){
            primeCounter++;
        }


        digit1=nr4%10;
        nr4/=10;
        digit1=nr4%10;
        twoDigitPrimeNumber=digit1*10+digit2;
        for(int i=2;i<=twoDigitPrimeNumber/2;i++){

            if(twoDigitPrimeNumber%i==0){
                primeChecker=1;
                break;
            }

        }
        if(primeChecker==0){
            primeCounter++;
        }

        digit1=nr5%10;
        nr5/=10;
        digit2=nr5%10;
        twoDigitPrimeNumber=digit1*10+digit2;
        for(int i=2;i<=twoDigitPrimeNumber/2;i++){

            if(twoDigitPrimeNumber%i==0){
                primeChecker=1;
                break;
            }

        }
        if(primeChecker==0){
            primeCounter++;
        }

        System.out.println("the number of prime number is"+ primeCounter);


        }*/

}

