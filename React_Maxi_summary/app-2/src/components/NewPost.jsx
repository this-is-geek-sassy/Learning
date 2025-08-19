import classes from './NewPost.module.css';
import { useState } from 'react';



function NewPost({onCancel, onAddPost}) {

    // const [enteredBody, setEnteredBody] = useState('');
    const [enteredBody, setEnteredBody] = useState('');
    const [enteredAuthor, setEnteredAuthor] = useState('');

    function bodyChangeHandler(event) {
        setEnteredBody(event.target.value);
    }
    function authorChangeHandler(event) {
        setEnteredAuthor(event.target.value);
    }

    function submitHandler(event) {
        event.preventDefault();
        const postData = {
            body: enteredBody,
            author: enteredAuthor
        };
        // console.log(postData);
        onAddPost(postData);
        onCancel();
    }
    
    return (
        <form className={classes.form} onSubmit={submitHandler}>
            <p>
                <label htmlFor="body">Text</label>
                <textarea id="body" required rows={3} onChange={bodyChangeHandler}
                />
            </p>
            {/* <p>
                {enteredBody}
            </p> */}
            <p>
                <label htmlFor="name">Your name</label>
                <input type="text" id="name" required onChange={authorChangeHandler} />
            </p>
            <p className={classes.actions}>
                <button type='button' onClick={onCancel}>Cancel</button>
                {/* the above line will not submit the form, else the default of action of any... */}
                {/* button in html is to submit the form */}
                <button>Submit</button>
            </p>
        </form>
    );
}

export default NewPost;