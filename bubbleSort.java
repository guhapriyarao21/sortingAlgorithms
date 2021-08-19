public class Main
{
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        boolean isSwap = false;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                    isSwap = true;
                }
            }
            if(isSwap == false){
                break;
            }
        }
    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
	public static void main(String[] args) {
		int arr[] = new int[]{2,6,1,5,4,8,3,9};
		printArray(arr);
		bubbleSort(arr);
		printArray(arr);
	}
}
