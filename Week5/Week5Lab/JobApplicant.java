package Week5.Week5Lab;

public class JobApplicant 
{
    private String name;
    private String phoneNumber;
    private boolean wordProcessing;
    private boolean spreadsheets;
    private boolean databases;
    private boolean graphics;
    
    public JobApplicant(String name, String phone, boolean bool1, boolean bool2, boolean bool3, boolean bool4)
    {
        this.name = name;
        phoneNumber = phone;
        int totalTrue = 0;
        
        if(bool1 != false)
        {
            totalTrue = totalTrue + 1;
        }
        if(bool2 != false)
        {
            totalTrue = totalTrue + 1;
        }
        if(bool3 != false)
        {
            totalTrue = totalTrue + 1;
        }
        if(bool4 != false)
        {
            totalTrue = totalTrue + 1;
        }




        wordProcessing = bool1;
        spreadsheets = bool2;
        databases = bool3;
        graphics = bool4;
    }

    public void display()
    {
        if(totalTrue >= 3)
        {
            System.out.println(name + " has qualifications in " + totalTrue + " of 4 areas, and qualifies for the interview.");
        }
        else
        {
            System.out.println(name + " has qualifications in " + totalTrue + " of 4 areas, and does not qualify for the interview.");
        }
    }
}
