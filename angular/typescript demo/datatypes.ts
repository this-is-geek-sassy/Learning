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


// boolean
let isValid: boolean = false;
console.log(isValid);

// array
let emplist: string[] = ["Santosh", "saswata", "Swapna"];

let deptname: Array<string> = [];  //genrerics

let numbersList: Array<number>;

numbersList = [1,2,3,4,5];

let result4 = numbersList.filter((num) => num>2 );
let result5 = numbersList.find ((num) => num === 2);

let sum = numbersList.reduce((acc, num) => acc + num);

console.log(result4);
console.log(result5);

// lname = 76;