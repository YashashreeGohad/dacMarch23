//convert state of Byte instance into byte,short,int,long,float & double
class Program8
{
    public static void main (String [] args)
    {
        byte b=5;
        Byte by = new Byte (b); // Instance of Byte
        
        byte a = by.byteValue(); // byteValue convert it into byte 
        System.out.println("byte :"+a);

        short s=by.shortValue(); // shortValue convert it into short
        System.out.println("Short :"+s);

        int i=by.intValue();
        System.out.println("int :"+i);

        long l=by.longValue();
        System.out.println("long :"+l);

        float f=by.floatValue();
        System.out.println("float :"+f);

        double d=by.doubleValue();
        System.out.println("double :"+d);
        
    }
}