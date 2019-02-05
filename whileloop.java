public class whileloop {
    public static void main(String arg[])
    {
        String googol="1";
        int len=googol.length();
        while (len<101)
        {
            googol=googol+ "0";
            len=googol.length();
        }

    }
}
