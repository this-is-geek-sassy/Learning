// Functions:-

function addNums(num1=0, num2=0){
    console.log(num1 + num2);
    return num1+num2;
}

addNums(5,2);
console.log(addNums());

// arrow function
const subNums = (num1=0, num2=0) => (num1-num2);

console.log(subNums(3,2));

// 'this' keyword
// lexical 'this'