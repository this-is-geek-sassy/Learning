import NewPost from './NewPost';
import Post from './Post'
import classes from './Postslist.module.css';
import { useState } from 'react';
import Modal from './Modal';

function Postslist({ isPosting, onStopPosting }) {

    const [posts, setPosts] = useState([]);

    function addPostHandler(postData) {
        // setPosts([postData, ...posts]);   // ... is spread operator
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

            {posts.length > 0 && (
            <ul className={classes.posts}>
                {/* <Post author={enteredAuthor} body={enteredBody} /> */}
                {/* <Post author="Dark-knight" body="I'm Bruce Wayne!" /> */}
                {posts.map((post, index) => (
                    <Post key={index} author={post.author} body={post.body} />
                ))}
            </ul>)
            }
            {posts.length === 0 && (
                <div>
                    <h2>There are no posts yet!</h2>
                    <p>Start adding some!</p>
                </div>
            )}
        </>
    )
}

export default Postslist;