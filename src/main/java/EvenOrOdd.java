public class EvenOrOdd {
    public static boolean CheckEven(int x)
    {
        if(x>=0) {
            if (x % 2 == 0)
               return true;
            else
                return false;
        }
        else
            return false;
    }
    public static boolean CheckOdd(int x)
    {
        if(x>=0) {
            if (x % 2 == 0)
                return false;
            else
                return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        EvenOrOdd n = new EvenOrOdd();
        System.out.print(n.CheckEven(-7));
    }
}
