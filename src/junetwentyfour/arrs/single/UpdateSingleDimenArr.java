package junetwentyfour.arrs.single;

public class UpdateSingleDimenArr {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,99};

        for(int num : arr){
            System.out.println(num + ", ");
        }
        // update index 3 to 25

        int value = 25;
        int index = 3;

        arr[index] = value;

        for(int num : arr){
            System.out.println(num + ", ");
        }

    }
}
