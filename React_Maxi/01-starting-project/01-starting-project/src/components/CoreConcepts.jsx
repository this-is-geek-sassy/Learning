import CoreConcept from './CoreConcept';
import { CORE_CONCEPTS } from '../data';

export default function CoreConcepts() {
    return(
        <section id="core-concepts">
            <h2>Core concepts</h2>
            {/* {[<p>hello</p>, <p>world</p>]} */}
            <ul>
                {CORE_CONCEPTS.map((conceptItem) => <CoreConcept key={conceptItem.title} {...conceptItem} />)}

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
    );
}