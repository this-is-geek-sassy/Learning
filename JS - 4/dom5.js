// More events:
// // focus & blur
// 27:34        cut
// 28:41        paste
// 28:50        input
// 29:23        change
// 31:50        submit

function runEvent(e) {
    console.log(e.type);
    e.preventDefault();
    return false;
}

const input = document.querySelector('input[type="text"]');

// input.addEventListener('focus', runEvent);
// input.addEventListener('blur', runEvent);

input.addEventListener('cut', runEvent);
input.addEventListener('paste', runEvent);
input.addEventListener('copy', runEvent);


input.addEventListener('copy', (e) => console.log(e));

document.querySelector('body').addEventListener('contextmenu', (e) => e.preventDefault());

const select = document.querySelector('select');

select.addEventListener('change', runEvent);