//.................................................................
// console.log("Map Using Array");
// const number = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
// let sqrt=number.map((value, index)=>
// {
//     return Math.sqrt(value).toFixed(2)
// })
// console.table(sqrt);
//.................................................................
const users = [
    { name: "Sam", age: 15, city: "Chennai" },
    { name: "Ravi", age: 22, city: "Namakkat" },
    { name: "Joes", age: 18, city: "Hosur" },
    { name: " Aureen ", age: 47, city: " Dharmapuri" },
    { name: "Stanley", age: 10, city: " Salem" },
    { name: "Ram", age: 12, city: "Salem" },
  ];
//   console.table(users);
//   .............................................................
  let statuss = users.map((users) => ({


 //-------------Another Methed is SPREAD OPERATOR----------------
  //   name: users.name,
  //   city: users.city,
  //   age: users.age,
    ...users,//SPREAD Operator
    status: users.age >= 18 ? "Eligible" : "NotEligible", 
  }));
  console.table(statuss);
  // //.............................................................
 