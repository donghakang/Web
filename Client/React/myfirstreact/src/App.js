// import logo from './logo.svg';
// import './App.css';

// function App() {
//   return (
//     <div className="App">
//       <header className="App-header">
//         <img src={logo} className="App-logo" alt="logo" />
//         <p>
//           Edit <code>src/App.js</code> and save to reload.
//         </p>
//         <a
//           className="App-link"
//           href="https://reactjs.org"
//           target="_blank"
//           rel="noopener noreferrer"
//         >
//           Learn React
//         </a>
//       </header>
//     </div>
//   );
// }

// export default App;


import React, {useState} from 'react';
import Hello from './sayHello'
import Tweet from './Tweet'


function App() {

  const [isRed, setRed] = useState(false);    // actual name, the key to change the value
  const [count, setCount] = useState(0);
  // const [user, setUser] = useState({
  //   name: 'Ed',
  //   age : 25,
  //   posts : ['my First Post', 'my lovely wife']
  // });

  const sayHello = () => {
    console.log('hello');
  }

  const increment = () => {
    setCount(count+1);
    setRed(!isRed);
  };

  const counter = 0;

  return ( 
    // basically a javascript.. JSX
    // React.createElement(div);
    // <div>                     
    //   <h1>Hello React</h1>
    //   <button onClick={console.log('bye')}>Hello</button>
    //   <button onClick={sayHello}>Hello</button>
    //   <button>{counter}</button>
    //   <Hello />
    // </div>

    // --  Tweet
    // <div className="app">
    //   <Tweet name="Dev ED" message="This is the random tweet"/>
    //   <Tweet name="John Snow" message="I am the true king"/>
    //   <Tweet name="Traveler" message="I started React today"/>
    //   <Tweet name="Mosh" message="What is better, three.js? or babylon.js"/>
    // </div>



    // -- useState
    

    <div className="app">
      <h1 className={isRed ? 'red' : ''}>change my color</h1>
      <button onClick={increment}>Increment</button>
      <h1>{count}</h1>
    </div>
  );
}



export default App;