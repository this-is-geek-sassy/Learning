// TRAVERSING THE DOM //

const itemList = document.querySelector('#items');
// parentnode
// console.log(itemList.parentNode);

itemList.parentNode.style.backgroundColor = '#f4f4f4';

// console.log(itemList.parentNode.parentNode);

// console.log(itemList.parentNode.parentNode.parentNode);

// parentElement == parentNode

// childnode
// console.log(itemList.childNodes);  // text nodes are just the line breaks
// console.log(itemList.children);
// console.log(itemList.children[1].innerHTML);

itemList.children[1].style.backgroundColor = 'yellow';

// firstChild
// console.log(itemList.firstChild);

// firstelementChild
// console.log(itemList.firstElementChild);

itemList.firstElementChild.innerText = 'Hello 1';

// lastChild & lastelementChild
// ---------------
/* Siblings */

// console.log(itemList.nextSibling);
// console.log(itemList.previousSibling);
// console.log(itemList.nextElementSibling);
// console.log(itemList.previousElementSibling);

itemList.previousElementSibling.style.color = 'green';

// ---------
/** Create Elements */

// createElements
// create a div
const newDiv = document.createElement('div');
newDiv.className = "Hello";  // add class
newDiv.id = 'Hello1'; //add Id

// add attribute
newDiv.setAttribute("title", "Hello title");

// create a text node
newDivText = document.createTextNode("Hello World");
console.log(newDivText);
// newDiv.appendChild(newDivText);
newDiv.append(newDivText);

console.log(newDiv);

// Inserting a Node object
const parent = document.createElement('div');
const child = document.createElement('p');
parent.append(child);
// This appends the child element to the div element
// The div would then look like this <div><p></p></div>
console.log(parent);
// difference between .append() and .appendChild() ---> https://dev.to/ibn_abubakre/append-vs-appendchild-a4m?signin=true

const container = document.querySelector('header .container');
const h1 = document.querySelector('header h1');

container.insertBefore(newDiv, h1);

newDiv.style.fontSize = '30px';