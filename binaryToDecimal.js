function DecToBin(n){
    let flag = 0;
    let ans = 0;
    while(n>0){
        ans = ans + n%2 * 10 ** flag++;
        n = parseInt(n/2);
    }
    return ans;
}
console.log(DecToBin(8));