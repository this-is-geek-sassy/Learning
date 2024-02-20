// window is the top level object
console.log(this); 
console.log(window);

// alert(1);

// Single element selectors
const form = document.getElementById('my-form');
console.log(form);
// querySelector() -> read a little bit about this function
console.log(document.querySelector('.container'));
console.log(document.querySelector('h1'));



// Multiple element selectors
console.log(document.querySelectorAll('.item'));
console.log(document.getElementsByClassName('item'));
console.log(document.getElementsByTagName('li'));