class Add{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.print(add(arr));
    }
    //add function
    static int add(int[] arr){
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
    }
    return sum;
}
}
