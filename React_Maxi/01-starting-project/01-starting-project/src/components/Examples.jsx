import { useState } from "react";     // react hook   ---- also possible to designb custom react hooks
import { EXAMPLES } from '../data';
import TabButton from './TabButton';
import Section from './Section.jsx';

export default function Examples() {

    const [ selectedTopic, setSelectedTopic ] = useState();    // must be called inside of component functions (on top level)

    let tabContent = 'Please click a button';

    function handleSelect(selectedButton) {
        // selectedButton => 'components', 'jsx', 'props', 'state'
        // tabContent = selectedButton;
        setSelectedTopic(selectedButton);     // scheules update, kind of like a non-blocking system call
        console.log(selectedButton);
        console.log(selectedTopic);
        // App();
    }
    return(
        <Section id="examples" title="Examples">
            {/* <h2>Examples</h2> */}
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
            
        </Section>
    );
}