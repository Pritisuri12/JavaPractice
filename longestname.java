public class longestname {
    public static void main(String names[])
    {
        int size= names.length;
        String longestName= names[0];
        for (int i=1;i<size;i++)
        {
            if(names[i].length()>longestName.length())
            {
                longestName=names[i];
            }

        }
    }
}
