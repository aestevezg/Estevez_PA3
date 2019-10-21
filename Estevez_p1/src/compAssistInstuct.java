import java.util.*;
import java.text.DecimalFormat;
import java.security.SecureRandom;
class compAssistInstruct
{
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    public static void main(String arg[])
    {
        while(true)
        {
            Start();
        }
    }
    static void Start()
    {
        System.out.println("Choose the difficulty level type a number '1-4' for the corresponding level\n");

        System.out.print("For Level 1 Type: '1'\t");
        System.out.println("For Level 3 Type: '3'");
        System.out.print("For Level 2 Type: '2'\t");
        System.out.println("For Level 4 Type: '4'");

        Scanner scnr = new Scanner(System.in);
        int level = scnr.nextInt();

        System.out.println("\nChoose the type of Math Questions you want\n");

        System.out.print("For Addition Type:    '1'\t\t");
        System.out.println("For Multiplication Type: '3'");
        System.out.print("For Subtraction Type: '2'\t\t");
        System.out.println("For Division Type: \t\t '4'");
        System.out.println("\t\t\tFor a mixture of all 4 Type: '5'");
        int matht = scnr.nextInt();

        solve_problem(level, matht);
    }
    static void solve_problem(int level, int matht)
    {
        int counter=0;

        switch (matht) {
            case 1:
                for(int i = 1; i <= 10; i++)
                {
                    counter += add(level);
                }
                break;
            case 2:
                for(int i = 1; i <= 10; i++)
                {
                    counter += mult(level);
                }
                break;
            case 3:
                for(int i = 1; i <= 10; i++)
                {
                    counter += sub(level);
                }
                break;
            case 4:
                for(int i = 1; i <= 10; i++)
                {
                    counter += division(level);
                }
                break;
            case 5:
                for(int i = 1; i <= 10; i++)
                {
                    int rand = ranGen(1,4);
                    if(rand == 1)
                    {
                        counter += add(level);
                    }
                    if(rand == 2)
                    {
                        counter += mult(level);
                    }
                    if(rand == 3)
                    {
                        counter += sub(level);
                    }
                    if(rand == 4)
                    {
                        counter += division(level);
                    }
                }
                break;
            default:
                System.out.println("Invalid Number");
                return;
        }




        if((double)((double)counter/10)*100>=(double)75)
        {
            System.out.println("Congratulations, you are ready to go to the next level!\n");
        }
        else
        {
            System.out.println("Please ask your teacher for extra help\n");
        }
    }
    static int add(int level)
    {
        int a = 0;
        int b = 0;
        if(level == 1)
        {
            a = ranGen(0,9);
            b = ranGen(0,9);
        }
        if(level == 2)
        {
            a = ranGen(10,99);
            b = ranGen(10,99);
        }
        if(level == 3)
        {
            a = ranGen(100,999);
            b = ranGen(100,999);
        }
        if(level == 4)
        {
            a = ranGen(1000,9999);
            b = ranGen(1000,9999);
        }

        Scanner scnr = new Scanner(System.in);

        System.out.println("How much is "+a+" + "+b);

        int answer = scnr.nextInt();

        if(answer == a + b)
        {
            int choose = ranGen(1,4);
            if(choose == 1)
            {
                System.out.println("Very good!\n");
            }
            if(choose == 2)
            {
                System.out.println("Excellent!\n");
            }
            if(choose == 3)
            {
                System.out.println("Nice work!\n");
            }
            if(choose == 4)
            {
                System.out.println("Keep up the good work!\n");
            }
            return 1;
        }
        else
        {
            int ch = ranGen(1,4);
            if(ch == 1)
            {
                System.out.println("No. Please try again.");
            }
            if(ch == 2)
            {
                System.out.println("Wrong. Try once more.");
            }
            if(ch == 3)
            {
                System.out.println("Don't give up!");
            }
            if(ch == 4)
            {
                System.out.println("No. Keep trying");
            }

            while(true)
            {
                int ans = scnr.nextInt();

                if(ans == a + b)
                {
                    int choose = ranGen(1,4);

                    if(choose == 1)
                    {
                        System.out.println("Very good!\n");
                    }
                    if(choose == 2)
                    {
                        System.out.println("Excellent!\n");
                    }
                    if(choose == 3)
                    {
                        System.out.println("Nice work!\n");
                    }
                    if(choose == 4)
                    {
                        System.out.println("Keep up the good work!\n");
                    }

                    return 0;
                }
                else
                {
                    int choose = ranGen(1,4);
                    if(choose == 1)
                    {
                        System.out.println("No. Please try again.");
                    }
                    if(choose == 2)
                    {
                        System.out.println("Wrong. Try once more.");
                    }
                    if(choose==3)
                    {
                        System.out.println("Don't give up!");
                    }
                    if(choose==4)
                    {
                        System.out.println("No. Keep trying");
                    }
                }
            }
        }

    }
    static int sub(int level)
    {
        int a = 0, b = 0;
        if(level == 1)
        {
            a = ranGen(0,9);
            b = ranGen(0,9);
        }
        if(level == 2)
        {
            a = ranGen(10,99);
            b = ranGen(10,99);
        }
        if(level == 3)
        {
            a = ranGen(100,999);
            b = ranGen(100,999);
        }
        if(level == 4)
        {
            a = ranGen(1000,9999);
            b = ranGen(1000,9999);
        }
        Scanner scnr = new Scanner(System.in);

        System.out.println("How much is "+a+" - "+b);

        int answer = scnr.nextInt();

        if(answer == b - a)
        {
            int choose = ranGen(1,4);
            if(choose == 1)
            {
                System.out.println("Very good!\n");
            }
            if(choose == 2)
            {
                System.out.println("Excellent!\n");
            }
            if(choose == 3)
            {
                System.out.println("Nice work!\n");
            }
            if(choose == 4)
            {
                System.out.println("Keep up the good work!\n");
            }
            return 1;
        }
        else
        {
            int ch = ranGen(1,4);
            if(ch == 1)
            {
                System.out.println("No. Please try again.");
            }
            if(ch == 2)
            {
                System.out.println("Wrong. Try once more.");
            }
            if(ch == 3)
            {
                System.out.println("Don't give up!");
            }
            if(ch == 4)
            {
                System.out.println("No. Keep trying");
            }
            while(true)
            {
                int ans = scnr.nextInt();

                if(ans == b - a)
                {
                    int choose = ranGen(1,4);
                    if(choose == 1)
                    {
                        System.out.println("Very good!\n");
                    }
                    if(choose == 2)
                    {
                        System.out.println("Excellent!\n");
                    }
                    if(choose == 3)
                    {
                        System.out.println("Nice work!\n");
                    }
                    if(choose == 4)
                    {
                        System.out.println("Keep up the good work!\n");
                    }

                    return 0;
                }
                else
                {
                    int choose = ranGen(1,4);
                    if(choose == 1)
                    {
                        System.out.println("No. Please try again.");
                    }
                    if(choose == 2)
                    {
                        System.out.println("Wrong. Try once more.");
                    }
                    if(choose == 3)
                    {
                        System.out.println("Don't give up!");
                    }
                    if(choose == 4)
                    {
                        System.out.println("No. Keep trying");
                    }
                }
            }
        }
    }
    static int mult(int level)
    {
        int a = 0, b = 0;
        if(level == 1)
        {
            a = ranGen(0,9);
            b = ranGen(0,9);
        }
        if(level == 2)
        {
            a = ranGen(10,99);
            b = ranGen(10,99);
        }
        if(level == 3)
        {
            a = ranGen(100,999);
            b = ranGen(100,999);
        }
        if(level == 4)
        {
            a = ranGen(1000,9999);
            b = ranGen(1000,9999);
        }
        Scanner scnr = new Scanner(System.in);
        System.out.println("How much is "+a+" * "+b);
        int answer = scnr.nextInt();
        if(answer == b * a)
        {
            int choose = ranGen(1,4);
            if(choose == 1)
            {
                System.out.println("Very good!\n");
            }
            if(choose == 2)
            {
                System.out.println("Excellent!\n");
            }
            if(choose == 3)
            {
                System.out.println("Nice work!\n");
            }
            if(choose == 4)
            {
                System.out.println("Keep up the good work!\n");
            }
            return 1;
        }
        else
        {
            int ch = ranGen(1,4);
            if(ch == 1)
            {
                System.out.println("No. Please try again.");
            }
            if(ch == 2)
            {
                System.out.println("Wrong. Try once more.");
            }
            if(ch == 3)
            {
                System.out.println("Don't give up!");
            }
            if(ch == 4)
            {
                System.out.println("No. Keep trying");
            }

            while(true)
            {
                int ans = scnr.nextInt();

                if(ans == b * a)
                {
                    int choose = ranGen(1,4);
                    if(choose == 1)
                    {
                        System.out.println("Very good!\n");
                    }
                    if(choose == 2)
                    {
                        System.out.println("Excellent!\n");
                    }
                    if(choose == 3)
                    {
                        System.out.println("Nice work!\n");
                    }
                    if(choose == 4)
                    {
                        System.out.println("Keep up the good work!\n");
                    }

                    return 0;
                }
                else
                {
                    int choose = ranGen(1,4);
                    if(choose == 1)
                    {
                        System.out.println("No. Please try again.");
                    }
                    if(choose == 2)
                    {
                        System.out.println("Wrong. Try once more.");
                    }
                    if(choose == 3)
                    {
                        System.out.println("Don't give up!");
                    }
                    if(choose == 4)
                    {
                        System.out.println("No. Keep trying");
                    }
                }
            }
        }
    }
    static int division(int level)
    {
        float a = 0, b = 0;
        if(level == 1)
        {
            a = ranGen(1,9);
            b = ranGen(1,9);
        }
        if(level == 2)
        {
            a = ranGen(10,99);
            b = ranGen(10,99);
        }
        if(level == 3)
        {
            a = ranGen(100,999);
            b = ranGen(100,999);
        }
        if(level == 4)
        {
            a = ranGen(1000,999);
            b = ranGen(1000,999);
        }
        Scanner scnr = new Scanner(System.in);

        System.out.println("How much is "+a+" divided by "+b);

        String answer = scnr.nextLine();

        if(answer.equals(df2.format(b/a)))
        {
            int choose = ranGen(1,4);
            if(choose == 1)
            {
                System.out.println("Very good!\n");
            }
            if(choose == 2)
            {
                System.out.println("Excellent!\n");
            }
            if(choose == 3)
            {
                System.out.println("Nice work!\n");
            }
            if(choose == 4)
            {
                System.out.println("Keep up the good work!\n");
            }
            return 1;
        }
        else
        {
            int ch = ranGen(1,4);
            if(ch == 1)
            {
                System.out.println("No. Please try again.");
            }
            if(ch == 2)
            {
                System.out.println("Wrong. Try once more.");
            }
            if(ch == 3)
            {
                System.out.println("Don't give up!");
            }
            if(ch == 4)
            {
                System.out.println("No. Keep trying");
            }
            while(true)
            {
                String ans = scnr.nextLine();

                if(ans.equals(df2.format(b/a)))
                {
                    int choose = ranGen(1,4);
                    if(choose == 1)
                    {
                        System.out.println("Very good!\n");
                    }
                    if(choose == 2)
                    {
                        System.out.println("Excellent!\n");
                    }
                    if(choose == 3)
                    {
                        System.out.println("Nice work!\n");
                    }
                    if(choose == 4)
                    {
                        System.out.println("Keep up the good work!\n");
                    }

                    return 0;
                }
                else
                {
                    int choose = ranGen(1,4);
                    if(choose == 1)
                    {
                        System.out.println("No. Please try again.");
                    }
                    if(choose == 2)
                    {
                        System.out.println("Wrong. Try once more.");
                    }
                    if(choose == 3)
                    {
                        System.out.println("Don't give up!");
                    }
                    if(choose == 4)
                    {
                        System.out.println("No. Keep trying");
                    }
                }
            }
        }
    }
    public static int ranGen(int min, int max){
        SecureRandom rand = new SecureRandom();
        int x = (int)(rand.nextDouble() * ((max - min) + 1)) + min;
        return x;
    }

}
