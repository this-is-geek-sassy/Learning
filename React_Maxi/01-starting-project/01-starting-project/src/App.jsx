import { useState } from 'react';   // built-in react-hook
import componentImg from './assets/components.png';
import { CORE_CONCEPTS } from './data';
import Header from './components/Header/Header';
import CoreConcepts from './components/CoreConcepts';
import TabButton from './components/TabButton';

function App() {

  const [ selectedTopic, setSelectedTopic ] = useState('Please click a button');    // must be called inside of component functions (on top level)

  let tabContent = 'Please click a button';

  function handleSelect(selectedButton) {
    // selectedButton => 'components', 'jsx', 'props', 'state'
    // tabContent = selectedButton;
    setSelectedTopic(selectedButton);
    console.log(selectedButton);
    console.log(selectedTopic);
    // App();
  }

  console.log('app component rendering');

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
            <TabButton onSelect={() => handleSelect('componets')}>Components</TabButton>
            <TabButton onSelect={() => handleSelect('jsx')}>JSX</TabButton>
            <TabButton onSelect={() => handleSelect('props')}>Props</TabButton>
            <TabButton onSelect={() => handleSelect('state')}>State</TabButton>
          </menu>
          {selectedTopic}
        </section>
      </main>
    </div>
  );
}

export default App;
