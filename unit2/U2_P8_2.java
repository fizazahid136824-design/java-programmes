// write a java program to use final variable.
class FizaPolicy
{
    final void verifyIdentify()
    {
        System.out.println("Student Fiza Identity Verified via Biometrics.");
    }
}

class AdvancedStudent extends FizaPolicy
{
     
    // void verifyIdentify(){}
  
}

public class U2_P8_2
{
    public static void main(String[] args)
     {
        AdvancedStudent a = new AdvancedStudent();

        a.verifyIdentify();
     }
}
