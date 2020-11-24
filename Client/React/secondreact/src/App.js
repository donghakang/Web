import React, { Component } from "react";
import NavBar from "./components/navbar";
import Counters from "./components/counters";
import "./App.css";

class App extends Component {
    // private
    state = {
        counters: [
            { id: 1, value: 0 },
            { id: 2, value: 0 },
            { id: 3, value: 0 },
            { id: 4, value: 0 },
        ],
    };

    handleIncrement = (counter) => {
        const counters = [...this.state.counters]; // clone
        const index = counters.indexOf(counter);
        counters[index] = { ...counter };
        counters[index].value++;
        console.log(this.state.counters[0]);

        this.setState({ counters: counters });
    };

    handleReset = () => {
        const counters = this.state.counters.map((c) => {
            c.value = 0;
            return c;
        });
        this.setState({ counters: counters });
    };

    handleDelete = (counterId) => {
        console.log("delete", counterId);

        const counters = this.state.counters.filter((c) => c.id !== counterId);
        this.setState({ counters: counters });
    };

    render() {
      return (
        <React.Fragment>
            <NavBar totalCounters={this.state.counters.filter(c => c.value > 0).length} />
            <main className="container">
                <Counters
                    counters={this.state.counters}
                    onReset={this.handleReset}
                    onIncrement={this.handleIncrement}
                    onDelete={this.handleDelete}
                />
            </main>
        </React.Fragment>
    );
    }
    
}

export default App;
