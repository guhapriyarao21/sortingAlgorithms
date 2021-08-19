public class Main
{
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int[] partition(int[] arr, int low, int high){
        if(arr[low]>arr[high]){
            swap(arr, low, high);
        }
        int j = low+1;
        int g = high-1, k= low+1;
        int p = arr[low];
        int q = arr[high];
        while(k<=g){
            if(arr[k]<p){
                swap(arr,k,j);
                j++;
            }
            else if(arr[k]>=q){
                while(arr[g]>q && k<q){
                    g--;
                }
                swap(arr, k, q);
                g--;
                if(arr[k]<p){
                    swap(arr,k,j);
                    j++;
                }
            }
            k++;
        }
        j--;
        g++;
        swap(arr, low, j);
        swap(arr, high, g);
        return new int[]{j,g};
    }
    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int[] piv;
            piv = partition(arr, low, high);
            quickSort(arr, low, piv[0]-1);
            quickSort(arr, piv[0]+1, piv[1]-1);
            quickSort(arr, piv[1]+1, high);
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
		quickSort(arr, 0, arr.length-1);
		printArray(arr);
	}
}
