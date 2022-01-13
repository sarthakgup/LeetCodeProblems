public class findPalindromesNotLCProblem {
    public static void main(String[] args)
    {
        System.out.println(palindromeSolver2("eye"));
        System.out.println(palindromeSolver2(""));
        System.out.println(palindromeSolver2("hi"));
        System.out.println(palindromeSolver2("i"));
        System.out.println(palindromeSolver2("do geese see god"));
        
        System.out.println("next set:");
        System.out.println(palindromeSolver1("eye"));
        System.out.println(palindromeSolver1(""));
        System.out.println(palindromeSolver1("hi"));
        System.out.println(palindromeSolver1("i"));
        System.out.println(palindromeSolver1("do geese see god"));
    }

    public static boolean palindromeSolver1(String input)
    {
        //solving using efficient pointer-based method
        input = input.replaceAll(" ", "");

        int i = 0;
        int j = input.length() - 1;
        int loopLen = input.length()/2;

        for(i = 0; i < loopLen; i++)
        {
            if(input.charAt(i) != input.charAt(j))
            {
                return false;
            }
        }

        return true;
    }

    public static boolean palindromeSolver2(String input)
    {
        //solving using inefficient new string creation method
        String temp = "";
        input = input.replaceAll(" ", "");

        for(int i = input.length()-1; i >= 0; i--)
        {
            temp += input.charAt(i);
        }

        //System.out.println(temp);
        //System.out.println(input);

        if(input.equals(temp))
        {
            return true;
        }
        else{
            return false;
        }
    } 
}