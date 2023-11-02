import java.util.Random;
public class ShuffleArray{
    public static void ArrayShuffled(int[] array)
    {
        Random random =new Random();
        for(int i=array.length-1;i>0;i--)
        {
           int randomIndex= random.nextInt(i+1);
           int temp=array[i];
           array[i]=array[randomIndex];
           array[randomIndex]=temp;
        }
    }
    public static void main(String[] args)
    {
        int[] myArray={1,2,3,4,5,6,7};
        System.out.println("Orginal Array");
        for(int value : myArray)
        {
           System.out.println(value+ " ");
        }
         ArrayShuffled(myArray);
        System.out.println(" \nShuffled Array");
        for(int value:myArray)
        {
           System.out.println(value+" ");
        }
    }
}
