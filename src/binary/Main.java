package binary;

public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch=new BinarySearch();
        int key = 1;
        int[] list = {1, 2, 3, 4, 5};
        System.out.println(binarySearch.binarySearch(list,key));

        int low=0;
        int high=list.length-1;

        System.out.println(binarySearch.binarySearchRec(list,key,low,high));
    }
}
