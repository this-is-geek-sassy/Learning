// OOP
// 1. constructor function w/ prototypes
// 2. ES6 class keyword

// constructor function
function Person(firstName='', lastName='', dob='') {
    this.firstName = firstName; this.lastName = lastName;
    this.dob = new Date(dob);
    // this.getBirthYear = () => this.dob.getFullYear();
    // this.getFullName = () => `${this.firstName} ${this.lastName}`;
}

// prototype level method
Person.prototype.getBirthYear = function(){return this.dob.getFullYear()};
Person.prototype.getFullName = function(){ return `${this.firstName} ${this.lastName}` };

// instatiate object
const person1 = new Person('Saswata', 'Mishra', '07-03-1999');  // date in js is in MM-DD-YYYY format
const person2 = new Person('Mery', 'Smith', '07-03-1998');
console.log(person1, person2);
console.log(person2.dob.getDate());
console.log(person2.getBirthYear());
console.log(person2.getFullName());

person2.nickName = "MJ";
console.log(person2);