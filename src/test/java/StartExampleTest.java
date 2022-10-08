import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StartExampleTest {

    StartExample example = new StartExample();
    @Test
    public void testResult () {
        boolean [] arr1 = {true,true,true};
        boolean [] arr2 = {false,false,true};
        int result=example.getHammingDistance(arr1,arr2);
        Assertions.assertEquals(2,result);

    }
    @Test
    public void testArraysWithSameValues(){
        boolean [] arr1 = {true,true,true};
        boolean [] arr2 = {true,true,true};
        int result=example.getHammingDistance(arr1,arr2);
        Assertions.assertEquals(0,result);

    }


}
