public class ExplicitTypeCasting
{
    public static void main(String[] args)
    {
        int a=10;
        byte  b;
        double c=20.6;
        float d;
        short e;
        long f=233453;
        int g;
        //Explicit Type Casting Example
        b=(byte)a;
        d=(float) c;
        e=(short)a;
        g=(int) c;
        System.out.println("Explicit Type Casting Example");
        System.out.println("Value Of A:"+a);
        System.out.println("Value Of B:"+b);
        System.out.println("Value Of C:"+c);
        System.out.println("Value Of D:"+d);
        System.out.println("Value Of E:"+e);
        System.out.println("Value Of F:"+f);
        System.out.println("Value Of G:"+g);
    }
}
