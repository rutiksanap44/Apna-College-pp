let arr = [1,2,3,4]; 

let arr1 = [];
for(let i=0;i<arr.length;i++){ // 0 to 3
    for(let j=i;j<arr.length;j++){ // 1 to 3
        for(let k=i;k<=j;k++){ // 0 to 3
            arr1.push(arr[k]);
        };
    };
};
console.log(arr1);

// O(n^3);