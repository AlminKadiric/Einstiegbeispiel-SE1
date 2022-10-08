public class StartExample {

    public int getHammingDistance (boolean [] array1, boolean [] array2){
        if(array1.length!= array2.length) {
            return 0;
        }
        int sum=0;
        for(int i=0; i<array1.length; i++){
            if(array1[i]!=array2[i]){
                sum=sum+1;
            }
        }
        return sum;


    }

}
