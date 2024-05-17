// source: https://www.youtube.com/watch?v=m55PTVUrlnA

function doSometing() {
    
}

// export const doSomething = () => {

// }

const MyComponent = () => {
    return "<div> </div>";
}

{/* <button onClick={() => {
    console.log("hello hey there!!!");
}}>

</button> */}

// ternary operators
let age = 10;
let name = (age >= 10) ? "Pedro" : "Jack";
console.log(name);

const Component = () => {
    return age > 10 ? '<div> "Pedro" </div>' : '<div> "Jack" </div>';
}

// Objects
const person = {
    // name: name,
    name,   // shorthand
    age: 20,
    isMarried: false
};

const person1 = {
    name: "saswata",
    // name,   // shorthand
    age: 24,
    isMarried: false
};

const person2 = {...person1, name: "Jack"};

// const Name = person.name;
// const Age = person.age;
// const isMarried = person.isMarried;

const {Name, Age, isMarried} = person;
console.log(Name, Age, isMarried);

let names = ['Pedro', 'Jack', 'Jessica'];
const names2 = [...names, 'Joel'];
console.log(names, names2);

// Higher order array methods:
// .map()
// .filter()
// .reduce()


// ['Pedro1', 'Jack1', 'Jessica1']
let newNames = [];
names.map((name) => {newNames.push(name.concat("1"))});
names = names.map((name) => name.concat("1"));
console.log(names);
console.log(newNames);

// Async + Await + Fetch
