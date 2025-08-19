import NewPost from './NewPost';
import Post from './Post'
import classes from './Postslist.module.css';
import { useState, useEffect } from 'react';
import Modal from './Modal';

function Postslist({ isPosting, onStopPosting }) {

    // fetch('http://localhost:8080/posts').then(response => response.json()).then(data => {
    //     setPosts(data.posts);   // infinite loop
    // });

    const [posts, setPosts] = useState([]);
    const [isFetching, setIsFetching] = useState(false);

    useEffect(() => {
        async function fetchPosts() {
            setIsFetching(true);
            const response = await fetch('http://localhost:8080/posts')
            const resData = await response.json()
            // .then(response => response.json()).then(data => {
            //     setPosts(data.posts);   // infinite loop
            // });
            setPosts(resData.posts);
            setIsFetching(false);
        }
        fetchPosts();
    }, []);

    function addPostHandler(postData) {
        // setPosts([postData, ...posts]);   // ... is spread operator
        fetch('http://localhost:8080/posts', {
            method: 'POST',
            body: JSON.stringify(postData),
            headers: {
                'Content-Type': 'application/json'
            }
        });
        setPosts((existingPosts) => [postData, ...existingPosts]);     // updating state based on previous state
    }

    let modalContent;
    if (isPosting) {
        modalContent = <Modal onClose={onStopPosting}>
            <NewPost
                onCancel={onStopPosting}
                onAddPost={addPostHandler}
            />
        </Modal>;
    }
    return (
        <>
            {modalContent}

            {!isFetching && posts.length > 0 && (
            <ul className={classes.posts}>
                {/* <Post author={enteredAuthor} body={enteredBody} /> */}
                {/* <Post author="Dark-knight" body="I'm Bruce Wayne!" /> */}
                {posts.map((post, index) => (
                    <Post key={index} author={post.author} body={post.body} />
                ))}
            </ul>)
            }
            {!isFetching && posts.length === 0 && (
                <div>
                    <h2>There are no posts yet!</h2>
                    <p>Start adding some!</p>
                </div>
            )}
            {isFetching && (
                <div style={{textAlign: 'center', color: 'white', fontFamily: 'monospace'}}>
                    <p>Loading posts...</p>
                </div>
            )}
        </>
    )
}

export default Postslist;