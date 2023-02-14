public class checkVal {
    

    public static boolean checkValue(int value) {
        int[] arr = {1,2};
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

}
