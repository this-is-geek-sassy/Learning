
import Header from './components/Header/Header';
import CoreConcepts from './components/CoreConcepts';
import Examples from './components/Examples';

function App() {

  

  console.log('app component rendering');

  return (
    <>
      <Header/>
      {/* <Header></Header> */}
      <main>
        <CoreConcepts/>
        <Examples/>
      </main>
    </>
  );
}

export default App;
