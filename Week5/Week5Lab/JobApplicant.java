public class JobApplicant 
{
    private final int NUM_TRUE;
    private String name;
    private String phoneNumber;
    private int wordProcessing;
    private int spreadsheets;
    private int databases;
    private int graphics;
    
    public JobApplicant(String name, String phone, int int1, int int2, int int3, int int4)
    {
        this.name = name;
        phoneNumber = phone;
        int totalNot0 = 0;

        if(int1 != 0)
        {
            totalNot0 = totalNot0 + 1; 
        }
        if(int2 != 0)
        {
            totalNot0 = totalNot0 +1;
        }
        if(int3 != 0)
        {
            totalNot0 = totalNot0 + 1; 
        }
        if(int4 != 0)
        {
            totalNot0 = totalNot0 +1;
        }

        NUM_TRUE = totalNot0;

        wordProcessing = int1;
        spreadsheets = int2;
        databases = int3;
        graphics = int4;
    }

    public void display() 
    {
        if(NUM_TRUE >= 3)
        {
            System.out.println(name + " qualifies for the interivew, with " + NUM_TRUE + " out of 4 qualifications. Their phone number is " + phoneNumber + " and they have qualifications in the following areas:" );
            if (wordProcessing != 0) {
                System.out.println("- Word Processing");
            }
            if (spreadsheets != 0) {
                System.out.println("- Spreadsheets");
            }
            if (databases != 0) {
                System.out.println("- Databases");
            }
            if (graphics != 0) {
                System.out.println("- Graphics");
            }
        }
        else 
        {
            System.out.println(name + " does not qualify for the interview, with " + NUM_TRUE + " out of 4 qualifications.");
        }
    }
}