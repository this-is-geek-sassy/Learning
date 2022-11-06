
//alert('hello world');

// console:
//window.console.log('hello world');
console.log('hello world, but other one');

console.error('this is an error');
console.warn('this is a warning');

// variabes:
// var (globally scoped), let (ES2015), const (ES2015)
// let & const have a block level scope
const age = 30;
console.log(age);
//age = 31;
console.log(age);

let score;
console.log(score);
score = 10;
console.log(score);

/**
 * datatypes:
 * 1. String
 * 2. Boolean
 * 3. null
 * 4. undefined
 * 5. Number
 * 6. String
 * 7. Symbol
 */
const name = 'John';
const _age = 21;
const rating = 4.5;
const isCool = true;
const x = null;
const y = undefined;
let z;
console.log(typeof(this.name));
console.log(typeof(this));
console.log(this);
console.log(typeof _age);
console.log(typeof rating);
console.log(typeof isCool);
console.log(typeof x);
console.log(typeof y);
console.log(typeof z);


/**string concatination */
console.log('My name is ' + this.name + ' & age is ' + age);
// template string (ES6)
const hello = `My name is ${this.name} & I am ${age} years old`;
console.log(hello);
