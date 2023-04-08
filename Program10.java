/* Character from CommandLine : Check whether entered character is letter or digit */
class Program10{

  public static void main(String[] args)
 {
    char ch = args[0].charAt(0);
    if(Character.isLetter(ch))
    {
        System.out.println(ch+" is a character");

        if(Character.isLowerCase(ch))
        {
            char s = Character.toUpperCase(ch);
            int codepoint= ch;
            System.out.println("To Upper case : "+s);
            System.out.println("codepoint : "+codepoint);

        }
        else {
            char s = Character.toLowerCase(ch);
            int codepoint= ch;
            System.out.println("To Lowerer case : "+s);
            System.out.println("codepoint : "+codepoint);
        }
    }
    else if(Character.isDigit(ch))
    {
        System.out.println(ch+" is Integer");
        int codepoint= ch;
        System.out.println("codepoint : "+codepoint);
    }
   }
 }