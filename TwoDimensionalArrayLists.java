import java.util.ArrayList;

public class TwoDimensionalArrayLists{
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer> > arrLL = new ArrayList<>();
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();

        array.add(25);
        array.add(27);
        array.add(29);
        array2.add(29);
        array2.add(0);
        array2.add(5);
        array2.add(57);






        arrLL.add(array);
        arrLL.add(array2);
        System.out.println(arrLL);

    }
}
