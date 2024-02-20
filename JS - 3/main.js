console.dir(document);
console.log(document.domain);  console.log(location.hostname);   // alternate to document.hostname
console.log(document.URL);
console.log(document.baseURI);
console.log(document.title);
console.log(document.doctype);
console.log(document.head, document.body);

console.log(document.all);   console.log(document.querySelectorAll('*'));
document.all[14].textContent = "";
console.log(document.all[14]);

console.log(document.forms);
console.log(document.links);
console.log(document.images);

// // console.log(document.querySelectorAll('h1'));

let heading1 = document.querySelector('h1');
let header = document.querySelector('header');
console.log(heading1);
console.log(heading1.innerText);
console.log(heading1.innerHTML);
console.log(heading1.textContent);

/* difference b/w innertext & textcontent */    // see the video for this

heading1.innerHTML = '<h3>Hello</h3>';
console.log(header);

header.style.borderBottom = 'solid 0.5px #636575';