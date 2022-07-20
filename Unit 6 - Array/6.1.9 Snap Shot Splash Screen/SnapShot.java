public class SnapShot
{
    public static void main(String[] args)
    {
        String[] arr = new String[] {"Welcome", "to", "the snap shot", "app!"};
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        System.out.println();
        arr[0] = "Upgrade";
        arr[3] = "premium app!";
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}