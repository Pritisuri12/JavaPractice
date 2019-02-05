public class museumticket {
    public static void main(String arg[])
    {
        int ticketPrice=10;

        int age=30 ;
        boolean isStudent=false;
        if (age<=15)
        {
            ticketPrice=5;

        }else if(age>60)
        {
            ticketPrice= 5;
        }else if(isStudent)
        {
            ticketPrice= 5;
        }
        System.out.println(ticketPrice);
        }
}
