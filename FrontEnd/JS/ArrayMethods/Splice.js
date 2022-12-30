/*
Splice is to Remove Elements in array
It wilt change original array
removed _ Element=Splice(Start,Length,new elements)
*/
console.log("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
const n1=[1,2,3,4,5,6,7,8,9,10];
console.log("Before Splice: "+n1);
let remove=n1.splice(5);
console.log("Removed Elements: "+remove);
console.log("After Splice: "+n1);
console.log("--------------------------------------")
//-----------------------------------------
const n2=[1,2,3,4,5,6,7,8,9,10];
console.log("Before Splice: "+n2);
let remn2=n2.splice(4,3);
console.log("Removed Elements: "+remn2);
console.log("After Splice: "+n2);
console.log("--------------------------------------")
//-----------------------------------------
const n3=[1,2,3,4,5,6,7,8,9,10];
console.log("Before Splice: "+n3);
// let remn3=n3.splice(4,3,9,9,9);
let remn3=n3.splice(4,3,[0,0,0,0,0,0,0,0,0,0,0,0]);
console.log("Removed Elements: "+remn3);
console.log("After Splice: "+n3);
console.log("--------------------------------------")
//-----------------------------------------
const n4=[1,2,3,4,5,6,7,8,9,10];
console.log("Before Splice: "+n4);
let remn4=n4.splice(4,0,[0,0,0,0,0,0,0,0,0,0,0,0]);
console.log("Removed Elements: "+remn4);
console.log("After Splice: "+n4);

