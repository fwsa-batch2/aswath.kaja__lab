import javax.security.auth.SubjectDomainCombiner;

class Summa
{   
    Summa()
    {
        System.out.println("default");
    }
    Summa(int asw)
    {
        this();
        System.out.println(asw);
    }
    Summa(int asw, int mus)
    {
        this(5);
        System.out.println(asw * mus);
    }
    public static void main(String args[])
    {
        new Summa(8, 10);
    }
}
