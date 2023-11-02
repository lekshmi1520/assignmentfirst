function sortarray(arr){
    var len= arr.length;
    for(i=0;i<len-1;i++){
        for(j=0;j<len-1-i;j++)
        {
            if(arr[j]<arr[j+1])
            {
                var temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}
var arr=[5,2,10,8,7,12]
sortarray(arr);
console.log(arr);