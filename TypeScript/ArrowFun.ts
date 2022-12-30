let display=(a,b)=>
console.log(a+b);
console.log("\nThis is a Simple Parameterless Arrow Function");
display(10,20);

let resty=(name:string,...Numb:any):void=>
console.log(`\nname: ${name}\nNumbers: ${Numb.join()}`);
resty('Ciril',1,2,3,4,4,5,5,6,7,8,8,9)

 function dis(x,y):void
 { 
    console.log(`Sum is x+y`);
 } 