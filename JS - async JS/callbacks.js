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

function createPost(post, callback) {
    setTimeout(() => {
        posts.push(post);
        callback();
    }, 2000);
}

getPosts();

createPost({
    title: "Post three",
    body: 'This is post three'
}, getPosts);

// getPosts();