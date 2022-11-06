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
for (let i = 0; i < todos.length; i++) {
    const element = todos[i];
    console.log(element);
}

//while loop

//for of loop
console.log(`For of loop:`);
for (const item of todos) {
    console.log(item.id, item.text);
    // console.log(item.text, item.id);
}

// forEach, Map, filter
console.log(`Array.forEach() metthod`);
todos.forEach(function(todo_item){
    console.log(todo_item.text);
});

console.log(`Array.map() metthod`);
todo_text = todos.map(function(todo_item){
    return todo_item.text;
});
console.log(todo_text);

console.log(`Array.filter method:`);
const todoCompleted = todos.filter(function(todo_item) {
    return todo_item.isCompleted === true;
}).map(function(todo_item) {
    return todo_item.text;
});
console.log(todoCompleted);