// let lname = "john";  //type inference

let lname: string = "santosh";
let newName = lname.toUpperCase();

console.log(newName);

// numbers
let age: number;
age = 23;
// age = "23";  // gives error
age = 23.5;

let result = age.toString();
let result2 = parseFloat("34.6");
console.log(result, result2);
console.log(result2);

let dob = "25";
let result3 = parseInt(dob);
console.log(result3);

// lname = 76;