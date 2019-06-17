import java.util.ArrayList;

public class GenaricSample1 {
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList=new ArrayList<>();
          arrayList.add(28);
          arrayList.add(27);
        arrayList.add(26);

        for(Object i:arrayList)
        {
            System.out.println(i);
        }

    }
}
