const posts = [
    {
        title: "Post One",
        body: 'This is Post one'
    },
    {
        title: "Post Two",
        body: 'This is Post two'
    }
]

function getPosts() {
    setTimeout(() => {
        let output = '';
        posts.forEach((post, index) => {
            output += `<li>${post.title}</li>`;
        });
        document.body.innerHTML = output;
    }, 1000);
}

function createPost(post) {

    return new Promise((resolve, reject) => {
        setTimeout(() => {
            posts.push(post);

            const error = false;

            if(!error) {
                resolve();
            } else {
                reject('Something erroneous happend!');
            }
            //callback();
        }, 2000);
    });
}

// getPosts();

// createPost({
//     title: "Post Three",
//     body: 'This is post three'
// })
//     .then(getPosts)
//     .catch(err => console.error(err));

// createPost({
//     title: "Post Four",
//     body: 'This is post four'
// });

// Async / Await
// async function init() {
//     await createPost({
//             title: "Post Three",
//             body: 'This is post three'
//         });
    
//     getPosts();
// }

// init();

// Async / Await with Fetch
async function fetchUsers() {
    const res = await fetch('https://jsonplaceholder.typicode.com/users').then(response => response.json());

    console.log(res);
}

fetchUsers();

// Promise.all
// const promise1 = Promise.resolve('Hello world!');
// const promise2 = 10;
// const promise3 = new Promise((resolve, reject) => setTimeout(resolve, 2000, 'GoodBye!'));
// const promise4 = fetch('https://jsonplaceholder.typicode.com/users').then(response => response.json());

// Promise.all([promise1, promise2, promise3, promise4])
//             .then(value => console.log(value));

