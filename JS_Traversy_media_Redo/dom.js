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