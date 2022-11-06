// Arrays: variable that holds multiple values
// created using contructors
const numbers = new Array(1,2,3,4,5);
console.log(numbers);

const num2 = new Array(4);
num2[2] = 34;
console.log(num2);

const fruits = ['apples', 'oranges', 'pineapple'];
console.log(`Fruits: ${fruits}`);
console.log(`frist fruit is ${fruits[0]}`);
fruits[3] = 'grapes'; // we can add elemnts even it is decalred as const
console.log(fruits);

fruits.push('mangoes'); fruits.unshift('strawberries');  //.unshift method adds elements at the bginning
console.log(fruits);
console.log("fruits.pop(): " + fruits.pop());
console.log(fruits);

// how to find index of some element in an array?
console.log(fruits.indexOf('apples'));
console.log("As of now the \'mangoes\' element is not part of the array, so lt's see what does it return: " + fruits.indexOf('mangoes'));

console.log("The 'guava' element was never part of the array, so let's see what index does it give: " + fruits.indexOf('guava'));



// how to check something is an array?
console.log(`Is fruits an array? : ${Array.isArray(fruits)}`);

// But what does typeof returs?
console.log(`But what does typeof returs? : ${typeof fruits}`);


// .indexof() method, to find index of something
console.log(`Index of orrange in fruits: ${fruits.indexOf('oranges')}`);
