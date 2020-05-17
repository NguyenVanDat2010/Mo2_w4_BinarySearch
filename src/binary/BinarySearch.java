package binary;

public class BinarySearch {
    //Tim kiem nhi phan Sử dụng hàm bình thường trả về vị trí index
    public int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else low = mid + 1;
        }
        return -1;
    }

    //Tìm kiếm nhị phân sdung đệ qu
    public int binarySearchRec(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (list[mid] == key) {
                return mid;
            }
            if (list[mid] > key) {
                high = mid - 1;
                return binarySearchRec(list, key);
            } else {
                low = mid + 1;
                return binarySearchRec(list, key);
            }
        }
        return -1;
    }
}
