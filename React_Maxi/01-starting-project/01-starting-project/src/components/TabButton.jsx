export default function TabButton({children}) {

    // document.querySelector('button').addEventListener('click', () => {

    // });

    function handleClick() {
        console.log("hello world");
    }

    return (
        <li><button onClick={handleClick}>{children}</button></li>
    );
}