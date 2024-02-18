public class TestJobApplicants 
{
    public static void main(String[] args)
    {
        JobApplicant applicant1 = new JobApplicant("Arthur", "216-867-5309", 1, 1, 1, 0);
        applicant1.display();
        JobApplicant applicant2 = new JobApplicant("Danielle", "216-555-1234", 1, 0, 0, 1);
        applicant2.display();
        JobApplicant applicant3 = new JobApplicant("Connor", "216-444-2345", 0, 0, 0, 1);
        applicant3.display();
        JobApplicant applicant4 = new JobApplicant("Jared", "216-333-3456", 1, 1, 1, 1);
        applicant4.display();
        JobApplicant applicant5 = new JobApplicant("Oliver", "216-444-4567", 0, 0, 0, 0);
        applicant5.display();
    }

       
}
