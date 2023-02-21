let arr = [3,99,45,5,-3,4];
let maxNum = 0;
for(let i of arr){
    if(maxNum<i){
        maxNum = i;
    };
};
console.log(maxNum);
