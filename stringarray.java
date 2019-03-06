public class stringarray {
    public static void main(String arg[])
    {

        String [] outlet={"abc","bbc","ccn","cbs","nbc","npr","FOX","sky","alazeera"};
        double lucky=Math.random();
        lucky*=10;

        int luckyIndex= (int)lucky;

        System.out.println(outlet[luckyIndex]);
    }
}
