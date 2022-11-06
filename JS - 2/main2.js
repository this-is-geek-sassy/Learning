const items = this.document.querySelectorAll('.item');

items.forEach((item) => console.log(item));

// DOM manipulation

const ul = document.querySelector('.items');
// ul.remove();
// ul.lastElementChild.remove();
// ul.firstElementChild.textContent = "Hello";
ul.children[0].textContent = "Hello";
console.log(ul.childNodes);
console.log(ul.children[1]);
ul.children[1].innerText = 'Brad';
ul.lastElementChild.innerHTML = '<h2>Hello</h2>' + '<p>Lorem, ipsum.</p>';


const btn = document.querySelector('.btn');
btn.style.background = 'red';