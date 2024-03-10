






public class ArrayObj {
    public static void main(String[] args)
    {
        Ani a = new Ani();
        a.a=10;
        a.b="Aniket";

        Ani a2 = new Ani();
        a2.a=10;
        a2.b="OM";


        Ani ani[] = new Ani[2];
        ani[0] = a;
        ani[1] = a2;

        for(int i=0; i<ani.length;i++)
        {
                System.out.println(ani[i].a + ani[i].b);
        }
    }
        
}

class Ani
{
    int a;
    String b;
}