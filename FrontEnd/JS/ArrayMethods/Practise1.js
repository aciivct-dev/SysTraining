// let num=[1,2,3,4,5,6,7,8,9,10];
let add=(...num)=>
{
    let  res=0;
    for(let i=0;i<num.length;i++)
    { 
        res+=num[i];
    }
    console.log(res);
}
add(10,40,50);  