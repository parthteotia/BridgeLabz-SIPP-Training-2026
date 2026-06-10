public class arrayFrequency {
    public static void main(String[] args){
        int[] arr = {0, 1, 3, 1 ,2, 3, 0, 1, 3, 2, 1, 0};
        int[] frequency = new int[10];
        for(int i=0;i<arr.length;i++){
                frequency[arr[i]]++;
        }
        for(int i=0;i<frequency.length;i++){
            System.out.println(frequency[i]);
        }
    }
}
