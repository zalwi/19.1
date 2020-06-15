import java.util.stream.IntStream;

public class EulerOne {

    private EulerOne(){}

    final static private int MIN_RANGE = 1;

    public static int sumOfmultiplesOfNumberThreeAndFive(int maxRange){
        return IntStream.range(MIN_RANGE,maxRange)
            .filter(number -> number % 3 == 0 || number % 5 == 0)
            .sum();
    }
}
