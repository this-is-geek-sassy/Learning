
// class (ES6)
class Person {
    constructor(firstName='', lastName='', dob='') {
        this.firstName = firstName; this.lastName = lastName;
        this.dob = new Date(dob);
    }

    // this 'getBirthYear' method will be at prototype level.
    getBirthYear() { this.dob.getFullYear(); }

    // 'getFullName' will not be at prototype level since it is an arrow function 
    getFullName = () => `${this.firstName} ${this.lastName}`;
}

const person1 = new Person('Saswata', 'Mishra', '07-03-1999');
const person2 = new Person('Merry', 'Jane Watson', '07-03-1997');

console.log(person1, person2);