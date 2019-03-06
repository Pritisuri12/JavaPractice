public class arrayloop {
public  static double calculateAverage(double[] temprature)
        {
            int size=temprature.length;
            double totle=0;
            for (int i=0;i<size;i++)
            {
                totle+= temprature[i];

            }
            double average=totle/size;
            return average;
        }




    public static void main(string arg[])
    {
       // double pop= arrayloop.calculateAverage(10.5,10,13.5);

    }

}
