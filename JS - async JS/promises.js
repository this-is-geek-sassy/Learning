const posts = [
    { title: 'Post One', body: 'This is post one' },
    { title: 'Post two', body: 'This is post two' }
];

function getPosts() {
    setTimeout(() => {

        let output = '';
        posts.forEach((post, index) => {
            output += `<li>${post.title} - ${post.body}</li>`;
        });

        document.body.innerHTML = `<ol> ${output} </ol>`;
    }, 1000)
}

function createPost(post) {

    return new Promise((resolve, reject) => {

        setTimeout(() => {
            posts.push(post);
            // callback();

            const error = false;
            if (!error) {
                resolve();
            } else {
                reject('Error: something went wrong');
            }
        }, 2000);
    });
}

// createPost({
//     title: "post three",
//     body: "this is post three"
// })
//     .then(getPosts)
//     .catch(err => console.error(err));



// Async / await
async function init() {
    await createPost({
            title: "post three",
            body: "this is post three"
        });

    getPosts();
}

init();


// Async / await / Fetch
async function fetchUsers() {
    const res = await fetch("https://jsonplaceholder.typicode.com/users");

    const data = await res.json();
    console.log(data);
}

fetchUsers();


// Promise.all
// const promise1 = Promise.resolve('Hello world');
// const promise2 = 10;
// const promise3 = new Promise((resolve, reject) => setTimeout(resolve, 2000, 'goodbye!'));

// const promise4 = fetch("https://jsonplaceholder.typicode.com/users")
//                     .then(response => response.json())
//                     .then(values => {
//                         values.forEach((value) => console.log(value.name));
//                     });

// Promise.all([promise1, promise2, promise3, promise4])
//         .then((values) => console.log(values));

// console.log(promise4);


