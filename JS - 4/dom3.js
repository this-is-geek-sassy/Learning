// const button = document.querySelector('#button').addEventListener('click', buttonClick);

console.log(button);  // Strange??

function buttonClick(e) {
    // console.log("Buttonclicked!!");
    document.getElementById('header-title').textContent = 'Changed!';

    document.querySelector('#main').style.backgroundColor = '#f4f4f4';

    // console.log(e);

    console.log(e.target);
    console.log(e.target.id);
    console.log(e.target.classList);

    const output = document.getElementById('output');
    output.innerHTML = '<h3>' + e.target.id + '</h3>';

    console.log(e.type);

    console.log(e.clientX, e.clientY);

    console.log(e.offsetX, e.offsetY);
    console.log(e.altKey, e.ctrlKey, e.shiftKey);
}


const submitButton = document.querySelector('#button');
console.log("submitButton : " + submitButton);

// submitButton.addEventListener('dblclick', (e) => {
//     console.log(e.type);
// });

// submitButton.addEventListener('mousedown', (e) => {
//     console.log(e.type);
// });

// submitButton.addEventListener('mouseup', (e) => {
//     console.log(e.type);
// });

const box = document.getElementById('box');
const output = document.getElementById('output');

box.addEventListener('mouseenter', (e) => {
    console.log("Event type : " + e.type);
});

box.addEventListener('mouseleave', (e) => {
    console.log("Event type : " + e.type);
});

box.addEventListener('mouseover', (e) => {
    console.log("Event type : " + e.type);
});

box.addEventListener('mouseout', (e) => {
    console.log("Event type : " + e.type);
});

box.addEventListener('mousemove', (e) => {
    console.log("Event type : " + e.type);
    // console.log(e);
    output.innerHTML = '<h4> MouseX : ' + e.offsetX + '</h4>'
                        + '<h4> MouseY : ' + e.offsetY + '</h4>';

    box.style.backgroundColor = 'rgb(' + e.offsetX + ',' + e.offsetY + ',' + (e.offsetX + e.offsetY) +')';
});