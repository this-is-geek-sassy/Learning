const form = document.getElementById('addForm');
const itemList = document.getElementById('items');
const filter = document.getElementById('filter');

// Form submit events:
form.addEventListener('submit', addItem);
itemList.addEventListener('click', deleteItem);
filter.addEventListener('keyup', filterItems);

function addItem(e) {
    e.preventDefault();
    // console.log(e);
    // get input value
    const newItem = document.getElementById('item');
    const li = document.createElement('li');
    li.className = 'list-group-item';
    li.textContent = newItem.value;
    console.log(li);


    const button = document.createElement('button');
    button.textContent = 'X';
    button.className = 'btn btn-danger btn-sm float-right delete';
    console.log(button);
    li.appendChild(button);

    itemList.appendChild(li);
    newItem.value = '';
    // console.clear();
}

// const buttons = document.querySelectorAll('button');
// console.log(buttons);

// buttons.forEach(eachButton => {
//     eachButton.addEventListener('click', removeItem);
// });

// function removeItem(e) {
//     e.preventDefault();

//     console.log(e);
//     console.log(e.target.parentNode);
//     e.path[1].remove();
// }

function deleteItem(e) {
    // console.log(e.target);
    if(e.target.classList.contains('delete')) {
        console.clear();
        console.log(e.target);
        if(confirm('Are you sure?')) {
            e.path[1].remove(); 
        }
    }
}

function filterItems(e) {
    let text = e.target.value.toLowerCase();
    console.log(text);

    const items = itemList.getElementsByTagName('li');
    console.log(items);

    Array.from(items).forEach(function(item){
        const itemName = item.firstChild.textContent;
        // console.log(itemName);
        if(itemName.toLowerCase().indexOf(text) != -1){
            // match case
            item.style.display = 'block';
            item.style.backgroundColor = '#f4f4f4';
        } else {
            item.style.display = 'none';
        }
    });
}