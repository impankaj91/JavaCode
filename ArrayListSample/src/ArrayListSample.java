import java.util.ArrayList;

public class ArrayListSample {
    public static void main(String[] args)
    {
        ArrayList<String> hero=new ArrayList<String>();
        hero.ensureCapacity(4);
        hero.add(0,"Hulk");
        hero.add(1,"IronMan");
        hero.add(2,"Capt.America");
        hero.add(3,"WonderWomen");
        hero.add(4,"blackwidow");
        hero.add(5,"Doct.Strange");

        System.out.println( hero.isEmpty());

        for(int i=0;i<hero.size();i++)
        {
            System.out.println(hero.get(i));
        }
        System.out.println(hero.size());
        System.out.println(hero.indexOf("Hulk"));
        System.out.println(hero.remove(0));
        System.out.println(hero.subList(0,3));

    }
}
