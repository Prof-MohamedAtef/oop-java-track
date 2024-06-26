package junetwentyfour.arrs.single;

public class DeleteSingleDimenArr {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,66,77};

         // Delete element at index 2
         int index = 2;
         int [] newArr = new int[arr.length -1];

         for(int i = 0, j = 0; i < arr.length; i++){
            if (i == index) {
                continue;
            }
            newArr[j++] = arr[i];
         }

         System.out.println("Array Elements before removal");
         for(int num: arr){
            System.out.println(num + ", ");
         }
         System.out.println("Array Elements After removal");
         for(int num: newArr){
            System.out.println(num + ", ");
         }
    }
}
