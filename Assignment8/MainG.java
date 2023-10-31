interface MeanInterface 
{
    double mean(double[] numbers);
}

interface DeviationInterface extends MeanInterface 
{
    double calculateDeviation(double[] numbers, double mean);
}

class MeanAndDeviationCalculator implements DeviationInterface 
{
    @Override
    public double mean(double[] numbers) 
    {
        if (numbers.length == 0) 
        {
            throw new IllegalArgumentException("Array is empty");
        }

        double sum = 0;
        for (double num : numbers) 
        {
            sum += num;
        }
        return sum / numbers.length;
    }

    @Override
    public double calculateDeviation(double[] numbers, double mean) 
    {
        double sumOfSquaredDifferences = 0;
        for (double num : numbers) 
        {
            double difference = num - mean;
            sumOfSquaredDifferences += difference * difference;
        }
        return Math.sqrt(sumOfSquaredDifferences / numbers.length);
    }
}

public class MainG 
{
    public static void main(String[] args) 
    {
        double[] data = { 1.0, 2.0, 3.0, 4.0, 5.0 };
        MeanAndDeviationCalculator calculator = new MeanAndDeviationCalculator();

        double meanValue = calculator.mean(data);
        System.out.println("Mean: " + meanValue);

        double deviation = calculator.calculateDeviation(data, meanValue);
        System.out.println("Deviation: " + deviation);
    }
}
