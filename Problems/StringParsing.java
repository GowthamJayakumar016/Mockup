package Problems;
public class StringParsing {
    public static void main(String[] args) {
        System.out.println("Searching in the string");
        String Str ="Hello";
        char n ='p';
        boolean o=Search( Str , n);
        System.out.println(o);
        
    }
    static boolean  Search(String Str ,char l)
    {
        for(int i=0;i<Str.length();i++)
        {
            if(l==Str.charAt(i))
            {
                return true;
            }
        }
        return false;
 
        
    }
}
