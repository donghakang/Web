import React from "react";

function Hello() {
    const sayHello = () => {
        console.log("hello");
    };
    return (
        <div>
            <h1>This is from sayHello</h1>
            <button onClick={sayHello}>Say Hello</button>
        </div>
    );
}

export default Hello;
