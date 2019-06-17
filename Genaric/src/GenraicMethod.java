public class GenraicMethod {

    public static<T extends Comparable<T>> T maxy(T x,T y,T z)
    {
        T maxy=x;
        if(y.compareTo(maxy)>0)
    {
        maxy=y;
    }
        if(z.compareTo(maxy)>0)
        {
            maxy=z;
        }

        return maxy;
    }

    public static void main(String args[])
    {
        System.out.println("Max no :"+maxy(3.9,4.7,5.9));

        Holder<String> stringex=new Holder<>();

        stringex.setvar("\n kar har medan fateh");
        System.out.println(stringex.getmyvar());

        Holder<Integer> intex=new Holder<>();
        intex.setvar(5);
        System.out.println( intex.getmyvar());
    }
}
