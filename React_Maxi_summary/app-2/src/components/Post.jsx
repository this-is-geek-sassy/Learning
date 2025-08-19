import classes from './Post.module.css';
const names = ['Maximilian', 'Manuel'];

function Post(props) {

    const chosenName = Math.random() > 0.5 ? names[0] : names[1];
    return (
        <li className={classes.post}>
            {/* <p>{chosenName}</p> */}
            {/* <p>React.js is awesome</p> */}
            <p>{props.author === ''? chosenName : props.author}</p>
            <p>{props.body === ''? 'React is aweosme' : props.body}</p>
        </li>
    );
}

export default Post;