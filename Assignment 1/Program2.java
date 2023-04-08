class Program2
{
    public static void main (String []args)
    {
        boolean b=false;
        boolean b1=true;

        String str= String.valueOf(b);
        String str1= String.valueOf(b1);

        System.out.println("String : "+ str);
        System.out.println("String : "+ str1);

    //method 2

        String s=Boolean.toString(b);
        System.out.println("String : "+s);

    }
}