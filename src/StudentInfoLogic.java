
import java.util.Scanner;
public class StudentInfoLogic
{
    private String name;
    private double gpa;
    private int sat;

    public StudentInfoLogic(){}

    Scanner scan = new Scanner (System.in);
    StudentInfo info = new StudentInfo(gpa,name,sat);

    private void select()
    {
        int college = (int) (Math.random() * 6);
        if (college == 0)
        {
            info.Columbia();
        }
        if (college == 1)
        {
            info.Fordham();
        }
        if (college ==2)
        {
            info.SUNYBuffaloState();
        }
        if (college == 3)
        {
            info.CUNYCityCollege();
        }
        if (college ==4)
        {
            info.Cornell();
        }
        if (college == 5)
        {
            info.UConn();
        }
    }

    public void askForInfo()
    {
        System.out.println("What is your name?");
        name=scan.nextLine();
        System.out.println("What is your number average? (Ex: 98, 92.36)");
        gpa=scan.nextInt();
        int loopIndicator = 0;
        while(loopIndicator<400) {
            System.out.println("What is your SAT score?");
            sat = scan.nextInt();
            loopIndicator=sat;
            if(sat<400)
            {
                System.out.println("Invalid sat score");
            }
        }
    }

    public void askForInfo(double gpa) {
        this.gpa = gpa;
        System.out.println("What is your name?");
        name = scan.nextLine();
        int loopIndicator = 0;
        while(loopIndicator<400) {
            System.out.println("What is your SAT score?");
            sat = scan.nextInt();
            loopIndicator=sat;
            if(sat<400)
            {
                System.out.println("Invalid sat score");
            }
        }
    }

    public double avgCalc()
    {
        int sum = 0;
        int grade = 0;
        System.out.println("How many classes do you take?");
        int classAmt  = scan.nextInt();
        for (int i = 1; i<=classAmt; i++)
        {
            System.out.println("Enter a grade: ");
            grade = scan.nextInt();
            sum+=grade;
        }
        scan.nextLine();
        return (double) (sum)/classAmt;
    }

    public void begin()
    {
        double tempGpa;
        String answer="";
        System.out.print("Welcome to the college probability calculator! \nDo you know your average? (y/n): ");
        answer=scan.nextLine();
        if (answer.equals("y") || (answer.equals("Y")))
        {
            askForInfo();
        }
        else {
            tempGpa=avgCalc();
            askForInfo(tempGpa);
        }
        System.out.print("Your grade converted in the 4.0 scale is a ");
        double gpa4 = info.gpaConvert();
        System.out.println(info.gpaConvert());
        boolean passing = info.passing();
        if (passing) {
            if (gpa4 >= 3.8) {
                System.out.println("You have a higher chance to be admitted to more prestigious colleges based on your gpa.");
            } else if (gpa4 >= 3.3) {
                System.out.println("While your gpa is still good, you do not have as much of a chance to be admitted to top colleges.");
            } else if (gpa >= 2.7) {
                System.out.println("Most top colleges would not accept this gpa.");
            } else {
                System.out.println("Unfortunately, your score does not meet the threshold for most private institutions.");
            }
        }
        else {
            System.out.println("You are not passing");
        }
        boolean sat = info.satThreshold();
        if (sat)
        {
            System.out.println("Your SAT score is good enough for many top colleges");
        }
        else {
            System.out.println("Your SAT score is too low for most top colleges. ");
        }
        System.out.println("Here are your SAT and GPA relative to the scores in our randomly selected colleges.");
        System.out.println("Would you like to see more? (y/n");
        String ans = scan.nextLine();
        int loopIndicator = 0;
        while (loopIndicator!=1) {
            if (ans.equals("y")) {
                select();
            } else {
                System.out.println("Thank you for using the Student Tracker!");
                loopIndicator=1;
            }
        }
    }
}

