
const names=["Kumar","Aureen","Joes","Zara","Stanley"];
names.sort();
console.log(names);
const num=[10,100,45,20,29,300,12,2];
num.sort();
console.log(num);
//sort consider as String so sort wrt first letter only;
// so we go with  arrow method 
console.log("------------------------");

num.sort((a,b)=>{
    return a-b;
});
console.log("Ascending Order: "+num);
console.log("------------------------");

num.sort((a,b)=>{
    return b-a;
});
console.log("Descending Order: "+num);
console.log("------------------------");
const users = [
    { name: "Sam", age: 15, city: "Chennai" },
    { name: "Ravi", age: 22, city: "Namakkat" },
    { name: "Joes", age: 18, city: "Hosur" },
    { name: " Aureen ", age: 47, city: " Dharmapuri" },
    { name: "Stanley", age: 10, city: " Salem" },
    { name: "Ram", age: 12, city: "Salem" },
  ];
  users.sort((a,b)=>{
    return a.age-b.age;
  })
  console.log("Sorted wrt Age ");
  console.table(users);

  users.sort((a,b)=>{
    if(a.name>b.name) return 1;
    if(a.name<b.name) return -1;
    return 0;
  })
  console.log("Sorted wrt Name");
  console.table(users);