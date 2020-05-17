package binary;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @DisplayName("Tim thay sử dụng hàm bình thường")
    @Test
    void whenBinarySearch(){
        int key=1;
        int[]list={1,2,3,4,5};
        int expected=0;
        BinarySearch binarySearch=new BinarySearch();
        int result=binarySearch.binarySearch(list,key);
        assertEquals(expected,result);
    }

    @DisplayName("Tim thay su dung ham de quy")
    @Test
    void whenBinarySearchByRec(){
        int key=1;
        int[]list={1,2,3,4,5};
        int expected=0;
        BinarySearch binarySearch=new BinarySearch();
        int result=binarySearch.binarySearchRec(list,key);
        assertEquals(expected,result);
    }
}