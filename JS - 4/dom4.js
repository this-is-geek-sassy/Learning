const intemInput = document.querySelector("input[type='text']");

const form = document.querySelector('form');
const output = document.getElementById('output');

// intemInput.value = "sample value";

// output.innerText = intemInput.value;

intemInput.addEventListener('keydown', (e) => {
    console.log(e);
    // console.log(e.target);
    // console.log(intemInput.value);
    // console.log(e.target.value);

    output.innerText =(e.key != 'Backspace')? (intemInput.value + e.key) : (intemInput.value.substring(0, intemInput.value.length-1));
});

intemInput.addEventListener('keyup', (e) => {
    console.log(e);
});

intemInput.addEventListener('keypress', (e) => {
    console.log(e);
})