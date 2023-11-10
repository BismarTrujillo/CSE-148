package HW07;

public class CalculateAvg implements MyProcessor{

    @Override
    public double process(double... data) {
        double sum = 0.0;
        for(double a: data){
            sum += a;
        }
        return sum / data.length;
    }
}
