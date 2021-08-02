import java.util.ArrayList;
import java.util.Arrays;

public class Basic{
    public String one(){
        int[] myArray = new int[256];
        for(int i = 0; i <= 255; i++){
            myArray[i] = i;
        }
            return Arrays.toString(myArray);
    }
    public ArrayList two(){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i = 1; i <=255; i++){
            if( i % 2 != 0)
            myArray.add(i);
        }
        return myArray;
    }
    public int three(){
        int sum = 0;
        for(int i = 0; i <=255; i++){
            sum += i;
        }
    return sum;
    }
    
    public void four(){
        int[] myArray = {1,3,5,7,9,13};
        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }

    public int five( int [] array ){
        int max = 0;
        for(int i = 0; i <array.length; i++){
            if(array[i]>max){
                max = array[i];
            }
        }return max;
    }

    public ArrayList six(){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i = 0; i <= 255; i++){
            if( i % 2 != 0){
                myArray.add(i);
            }
        }return myArray;
    }

    public int seven( int [] array ){
        int avg =0;
        int total = 0;
        for(int i = 0; i < array.length;i++){
            total += array[i];
        }
        avg = (total / (array.length));
        return avg;
    }

    public int eight( int [] array, int number ){
        int count = 0;
        for(int i = 0; i < array.length;i++){
            if(array[i] > number){
                count++;
            }
        }
        return count;
    }

    public ArrayList nine( int [] array ){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i = 0; i < array.length;i++){
            myArray.add(array[i]*array[i]);
        }
        return myArray;
    }

    public ArrayList ten( int [] array ){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i = 0; i < array.length;i++){
            if(array[i] > 0){
            myArray.add(array[i]);
            }
            else if(array[i] < 0){
                array[i] = 0;
                myArray.add(array[i]);
            }
        }
        return myArray;
    }

    public ArrayList eleven( int [] array ){
        int max = 0;
        int min = 0;
        int avg = 0;
        int total = 0;
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i = 0; i <array.length; i++){
            total += array[i];
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        myArray.add(max);
        myArray.add(min);
        myArray.add(total/array.length);
        return myArray;
    }

    
}