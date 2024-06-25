import componentImg from './assets/components.png';
import { CORE_CONCEPTS } from './data';
import Header from './components/Header/Header';
import CoreConcepts from './components/CoreConcepts';
import TabButton from './components/TabButton';

function App() {

  function handleSelect() {
    console.log("hello world - selected!!!");
  }

  return (
    <div>
      <Header/>
      {/* <Header></Header> */}
      <main>
        <section id="core-concepts">
          <h2>Core concepts</h2>
          <ul>
            <CoreConcepts {...CORE_CONCEPTS[0]} />
            <CoreConcepts {...CORE_CONCEPTS[1]} />
            <CoreConcepts {...CORE_CONCEPTS[1]} />
            <CoreConcepts {...CORE_CONCEPTS[2]} />
          </ul>
        </section>
        <section id="examples">
          <h2>Examples</h2>
          <menu>
            <TabButton onSelect={handleSelect}>Component</TabButton>
            <TabButton onSelect={handleSelect}>JSX</TabButton>
            <TabButton onSelect={handleSelect}>Props</TabButton>
            <TabButton onSelect={handleSelect}>State</TabButton>
          </menu>
        </section>
      </main>
    </div>
  );
}

export default App;
