public class Main
{
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int part(int[] arr, int l, int r){
        int pivot  = arr[r];
        int i = l - 1;
        for(int j=l;j<=r-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,r);
        return (i+1);
    }
    public static void sort(int[] arr, int l, int r){
        if(l<r){
            int p = part(arr,l,r);
            sort(arr, l, p-1);
            sort(arr, p+1, r);
        }
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
	public static void main(String[] args) {
	    int[] arr = new int[]{5,2,7,1,8,3,9,4};
	    print(arr);
	    sort(arr,0,arr.length-1);
	    print(arr);
	}
}
