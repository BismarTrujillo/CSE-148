package HW07;

import java.util.Random;

public class Test2 implements  {
    public static void main(String[] args) {

        Random rd = new Random();


        double a = randomDouble();
        double b = randomDouble();
        double c = randomDouble();
        double d = randomDouble();
        double e = randomDouble();
analyzeData(new CalculateAvg(), a,b,c,d,e);

    }

    public static double analyzeData(MyProcessor proc, double... data){
        CalculateAvg avg = new CalculateAvg();
        avg.average(data);
    }
    private static double randomDouble(){
        Random rd = new Random();
        return rd.nextDouble() * 200.0 - 100.0;
    }
}
