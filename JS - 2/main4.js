const myForm = document.querySelector('#my-form');
const nameInput = document.querySelector('#name');
const emailInput = document.querySelector('#email');
const msg = document.querySelector('.msg');
const userList = document.querySelector('#users');

console.log(userList);   console.log(typeof userList);

myForm.addEventListener('submit', onSubmit);

function onSubmit(event) {
    console.log(event);
    event.preventDefault();
    // console.log(nameInput.value);

    // form validation
    if (nameInput.value === '' || emailInput.value === '') {
        // alert('Please enter both fields');
        msg.classList.add('error');
        // nameInput.value = '';
        msg.innerHTML = "<p>Please enter all fields!</p>";
        // msg.style.color = 'red';
        // msg.style.backgroundColor = '#000';

        setTimeout(() => {
            msg.remove();
        }, 3000);

    } else {
        console.log("form submit success!");
        // alert("form submit success!");
        msg.classList.add('success');
        msg.innerHTML = "<p>Form submit is successful!</p>";

        setTimeout(() => {
            msg.remove();
        }, 3000);

        const li = document.createElement('li');
        li.append(document.createTextNode(`${nameInput.value} : ${emailInput.value}`));

        userList.appendChild(li);
        nameInput.value = '';
        emailInput.value = '';
    }

}