// Object literals:
const person = {
    firstName : 'John',
    lastName : 'Doe',
    age : 34,
    hobbies : ['Music', 'Movies', 'Sports'],
    address : {
        // embedded object
        street : '50A Green Avenue',
        city : 'Boston',
        state : 'MA'
    }
}

console.log(person, person.firstName, person.lastName);
console.log(`Second hobby : ${person.hobbies[1]}`);
console.log(person.address.city);
// alert(JSON.stringify(person));
console.log(JSON.stringify(person).split(','))
// console.log(JSON.stringify(person).split(/[{},]+/));


// Destructuring:
const {firstName, lastName, address : {city}} = person;
console.log(firstName, lastName, city);

// add properties later:
person.email = 'john@homail.com';
console.log(person);