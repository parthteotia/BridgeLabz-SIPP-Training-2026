public class arrayFrequency2 {
    public static void main(String[] args){
        int[] arr = {11, 12, 12, 11, 10};
        boolean[] visited = new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            int count = 1;
            if(visited[i]){
                continue;
            }
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(arr[i]+" appears "+count+" times.");
        }
    }
}
