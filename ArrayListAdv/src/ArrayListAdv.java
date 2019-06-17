import java.util.ArrayList;

public class ArrayListAdv {
    public static void main(String args[]){
        ArrayList<Integer> myList=new ArrayList<Integer>();
        //set an item
        for(int i=0;i<2;i++){
            System.out.println(myList.add(Integer.valueOf(i)));
        }
        //get an item
        for(int i=0;i<2;i++){
            System.out.println(" "+myList.get(i).intValue());
        }
    }
}
