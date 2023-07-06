// array of objects:
const todos = [
    {
        id : 1,
        text : 'Take out trash',
        isCompleted: true
    }, {
        id : 2,
        text : 'Meeting with boss',
        isCompleted: true
    }, {
        id : 3,
        text : 'Dentist apointment',
        isCompleted: false
    }
];

console.log(todos);
console.log(todos[1].text);

const todoJSON = JSON.stringify(todos);
console.log(todoJSON);

// for loop
console.log('for loop');
for (let i = 0; i < todos.length; i++) {
    const element = todos[i];
    console.log(element);
}

// while loop
console.log('while loop');
let i = 0;
while (i<10) {
    console.log(todos[i]);
    i++;
}

//for of loop
console.log(`For of loop:`);
for (const item of todos) {
    console.log(item.id, item.text);
    // console.log(item.text, item.id);
}

// forEach, Map, filter

console.log(`Array.forEach() metthod`);
todos.forEach((todo_item) => {
    console.log(todo_item.text);
    // return todo_item.text;  <-- this line does nothing
});

console.log(`Array.map() metthod`);
todo_text = todos.map(function(todo_item){
    return todo_item.text;
});
console.log(todo_text);

console.log(`Array.filter method:`);
const todoCompleted = todos.filter(function(todo_item) {
    return todo_item.isCompleted === true;
}).map((todo_item) => {
    return todo_item.text;
});
console.log(todoCompleted);