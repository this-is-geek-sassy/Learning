import { useState, Fragment } from 'react';   // built-in react-hook
import componentImg from './assets/components.png';
import { CORE_CONCEPTS } from './data';
import Header from './components/Header/Header';
import CoreConcepts from './components/CoreConcepts';
import TabButton from './components/TabButton';
import { EXAMPLES } from './data';

function App() {

  const [ selectedTopic, setSelectedTopic ] = useState();    // must be called inside of component functions (on top level)

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
    <Fragment>
      <Header/>
      {/* <Header></Header> */}
      <main>
        <section id="core-concepts">
          <h2>Core concepts</h2>
          {/* {[<p>hello</p>, <p>world</p>]} */}
          <ul>
            {CORE_CONCEPTS.map((conceptItem) => <CoreConcepts key={conceptItem.title} {...conceptItem} />)}

            {/* <CoreConcepts
              title={CORE_CONCEPTS[0].title}
              description={CORE_CONCEPTS[0].description}
              image={CORE_CONCEPTS[0].image}
            />
            <CoreConcepts {...CORE_CONCEPTS[1]} />
            <CoreConcepts {...CORE_CONCEPTS[1]} />
            <CoreConcepts {...CORE_CONCEPTS[2]} /> */}
          </ul>
        </section>
        <section id="examples">
          <h2>Examples</h2>
          <menu>
            <TabButton 
              isSelected={selectedTopic === 'components'} 
              onSelect={() => handleSelect('components')}
            >
              Components
            </TabButton>
            <TabButton 
              isSelected={selectedTopic === 'jsx'} 
              onSelect={() => handleSelect('jsx')}
            >
              JSX
            </TabButton>
            <TabButton 
              isSelected={selectedTopic === 'props'} 
              onSelect={() => handleSelect('props')}
            >
              Props
            </TabButton>
            <TabButton 
              isSelected={selectedTopic === 'state'} 
              onSelect={() => handleSelect('state')}
            >
              State
            </TabButton>
          </menu>
          {/* {selectedTopic} */}
          
          {selectedTopic === undefined ? <p>Please select a topic</p> : (
            <div id="tab-content">
            <h3>{EXAMPLES[selectedTopic].title}</h3>
            <p>{EXAMPLES[selectedTopic].description}</p>
            <pre>
              <code>{EXAMPLES[selectedTopic].code}</code>
            </pre>
          </div>
          ) }
          
        </section>
      </main>
    </Fragment>
  );
}

export default App;
