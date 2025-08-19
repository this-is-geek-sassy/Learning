import Postslist from "./components/Postslist";
import './App.css'
import MainHeader from './components/MainHeader';
import { useState } from "react";

function App() {
  const [modalIsVisible, setModalIsVisible] = useState(false);

  function hideModalHandler() {
    setModalIsVisible(false);
  }
  function showModalHandler() {
    setModalIsVisible(true);
  }

  return (
    <>
      {/* <div>
        <Post author="Maximillian" body="React.js is awesome"/>
      </div>
      
      <Post author="Manuel" body="Check out the full course"/>
      <Post /> */}

      <MainHeader onCreatePost={showModalHandler} />
      <main>
        <Postslist isPosting={modalIsVisible} onStopPosting={hideModalHandler} />
      </main>
    </>
  )
}

export default App
