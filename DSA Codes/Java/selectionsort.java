public class selectionsort {
    public static void selectionsort(int arr[])

    {
        for (int i = 0; i < arr.length-1; i++) {
            int minval=arr[i];
            int minindex=i;

            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < minval)
                {
                    minval=arr[j];
                    minindex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }

        for (int i = 0; i < arr.length; i++) {
             int val= arr[i];
             System.out.println(val);
        }
    }

    public static void main(String[] args) {
        int arr[]={3,5,4,6,9,8,2};
        selectionsort(arr);
    }
}
