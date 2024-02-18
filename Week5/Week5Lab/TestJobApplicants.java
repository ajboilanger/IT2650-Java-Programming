package Week5.Week5Lab;

public class TestJobApplicants 
{
    public static void main(String[] args)
    {
        JobApplicant applicant1 = new JobApplicant("Arthur", "216-867-5309", true, true, true, false);
        applicant1.display();
        JobApplicant applicant2 = new JobApplicant("Danielle", "216-555-1234", true, false, false, true);
        applicant2.display();
        JobApplicant applicant3 = new JobApplicant("Connor", "216-444-2345", false, false, true, true);
        applicant3.display();
        JobApplicant applicant4 = new JobApplicant("Jared", "216-333-3456", true, true, true, true);
        applicant4.display();
        JobApplicant applicant5 = new JobApplicant("Oliver", "216-444-4567", false, false, false, false);
        applicant5.display();
    }

       
}
