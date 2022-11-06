const btn = document.querySelector('.btn');
// console.log(btn);

btn.addEventListener('click', (event)=>{
    console.clear();
    event.preventDefault();
    // console.log(event);
    // console.log(event.target);
    // console.log(event.target.className);
    // console.log(event.target.id);

    document.querySelector('#my-form').style.background = '#ccc';

    document.querySelector('body').classList.add('bg-dark');

    document.querySelector('.items').lastElementChild.innerHTML = '<h2>Hello</h2>';
});

// different events: click, mouseover, mouseout, input