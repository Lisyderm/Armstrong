public class ArmstrongSearch {

    public static boolean isArmstrongNumber (long number) {
        long sum = 0;
        String numberString = Long.toString(number);
        int numberOfDigits = numberString.length();

        for (int i = 0; i < numberOfDigits; i++) {
            int digit = Character.getNumericValue(numberString.charAt(i));
            sum += (long) Math.pow(digit, numberOfDigits);
        }

        return sum == number;
    }

    public static void main (String[] args) {
        //long max = Long.MAX_VALUE; // 9,223,372,036,854,775,807
        long max = 1000000000; //select max instead
        int total = 0;
        ArmstrongSearch search = new ArmstrongSearch();
        for (long test = 0; test < max; ++test) {
            if (search.isArmstrongNumber(test))
                System.out.println(test + " is an armstrong number");
                ++total;
        }

        System.out.println("There are " + total + " armstrong numbers less than " + max);


    }
}