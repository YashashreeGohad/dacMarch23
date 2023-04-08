//program to convert

class Program7
{
    //byte value into String
    public static void main(String [] args)
    {
        boolean b=true;
        String str = Boolean.toString(b);
        System.out.println("String :"+str);

    //byte value into Byte instance

        byte b1=2;
        Byte by = new Byte (b1);
        System.out.println("Byte instance : "+by);

    //String instance into Byte instance

        String str1 = new String ("123");
        Byte bt = new Byte(str1);
        System.out.println("Byte instance : "+bt);

    }
}
