let arr = [1,2,9,7,4,6,8];
// 1 2 4 6 7 8 9
for(let i=0;i<arr.length;i++){
    if(arr[i]>arr[i+1]){
        arr[i] = arr[i+1];
    }
};
console.log(arr)