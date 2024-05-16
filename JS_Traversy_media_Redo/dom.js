// examine the document object
// console.dir(document);

console.log(document.domain);
console.log(document.URL);
console.log(document.title);

document.title = "JS crash course";

console.log(document.querySelectorAll("*")[10]); 
console.log(document.querySelectorAll("*")[10].innerHTML);

console.log(document.forms, document.forms[0]);
console.log(document.links);

console.log(document.images);

// difference b/w innerText & textContent  (watch the lecture)
let headerTitle = document.getElementById('header-title');
let header = document.getElementById('main-header');
console.log(headerTitle, header);
console.log(headerTitle.innerHTML);
console.log(headerTitle.innerText);
console.log(headerTitle.textContent);

header.style.borderBottom = "solid 3px black";

// 26:05 
// getElementsByClassName  //
let items = document.getElementsByClassName('list-group-item');
console.log(items);
// items[1].textContent = "saswata";
console.log(items[0].innerHTML);

for (let i = 0; i < items.length; i++) {
    const item = items[i];
    item.style.backgroundColor = '#ccc';
}

// querySelector or querySelectorAll

let header2 = document.querySelector('header#main-header');
console.log(header2);
let input = document.querySelector('input');
console.log(input);
input.value = "my custom value";

let submit = document.querySelector('input[type="submit"]');
console.log(submit);
submit.value = "send";


// part 2
var itemList = document.querySelector("#items");
// parent node 
console.log(itemList.parentNode);
itemList.parentElement.style.backgroundColor = "#ffd4ff";  //light pink
// console.log(itemList.parentNode.parentElement.parentNode);

// parentNode & parentElement
// ....

// childNodes
console.log(itemList.childNodes);
console.log(itemList.children);
console.log(itemList.children[1].style.backgroundColor = "purple");


// firstchild
console.log(itemList.firstChild);
// firstElementChild
console.log(itemList.firstElementChild);
// itemList.firstElementChild.textContent = 'hello 1';

// lastchild
console.log(itemList.lastChild);
// lastElementChild
console.log(itemList.lastElementChild);
// itemList.lastElementChild.textContent = 'hello n';

// siblings
console.log(itemList.nextSibling);
console.log(itemList.nextElementSibling);
console.log(itemList.previousSibling);
console.log(itemList.previousElementSibling);
// itemList.previousElementSibling.style.color = "green";

// createElement
// create a div
var newDiv = document.createElement('div');
newDiv.className = 'hello';
newDiv.id = 'hello1';
newDiv.setAttribute('title', 'hello div');

var newDivText = document.createTextNode("hello world");
newDiv.appendChild(newDivText);
console.log(newDiv);

var container = document.querySelector('header .container');
var rowDiv = document.querySelector('header div .row');

// container.insertBefore(newDiv, rowDiv);

// Events:-
// (part 3)

// var button = document.getElementById('button').addEventListener('click', function (params) {
//     console.log("button clicked 2", params);
// });

// var button = document.getElementById('button').addEventListener('click', buttonClick);

function buttonClick(params) {
    console.log("button clicked");
    console.log(params);
    console.log(params.target);
    console.log(params.target.id);
    console.log(params.target.className);
    console.log(params.target.classList);

    document.getElementById('header-title').textContent = 'Changed';
    document.querySelector('#main').style.backgroundColor = '#fff';

    var output = document.getElementById('output');
    output.innerHTML = '<h3>'+ params.target.id + '</h3>';

    console.log(params.type);
    console.log(params.clientX);
    console.log(params.clientY);
    console.log(params.offsetX, params.offsetY);
    console.log(params.altKey);
}

var button = document.getElementById('button');
// button.addEventListener('click', runEvent);
// button.addEventListener('dblclick', runEvent);
// button.addEventListener('mousedown', runEvent);
button.addEventListener('mouseup', runEvent);



var box = document.getElementById('box');
// box.addEventListener('mouseenter', runEvent);
// box.addEventListener('mouseleave', runEvent);
box.addEventListener('mousemove', runEvent);

let item2 = document.querySelector('ul#items').children[1];
console.log(item2.style.backgroundColor);

let itemInput = document.querySelectorAll('input[type="text"]');
let form = document.querySelector('form');
// console.log(itemInput.item(1));
let targetTextBox = itemInput.item(1);
console.log(targetTextBox);
console.log(form);
targetTextBox.addEventListener("keyup", keyboardEvent);
// itemInput.addEventListener("keyup", runEvent);

// new KeyboardEvent("keydown")

function runEvent(e) {
    console.log("Event type: " + e.type);
    console.log(e);

    let item2 = document.querySelector('ul#items').children[1];
    // console.log(item2.style.backgroundColor);
    let red = ((e.screenX + e.screenY) / 2) % 255;
    let green = ((e.screenX**2 + e.screenY**2) / 2) % 255;
    let blue = ((e.screenX**2 - e.screenY**2) / 2) % 255;
    let mean = (red + blue + green) / 3;
    mean = 255 - mean;

    item2.style.backgroundColor = "rgb(" + red + ", " + green + ", " + blue + ")";
    item2.style.color = "rgb(" + mean + ", " + mean + ", " + mean + ")";
}

function keyboardEvent(e) {
    console.log("Event type: " + e.type);
    console.log(e.target);
    console.log(e.target.value);

    document.getElementById('output').innerHTML = "<p>" + e.target.value + "</p>";
}