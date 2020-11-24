import React, { Component } from "react";
import Counter from "./counter";

class Counters extends Component {
    render() { 

        const { onReset, counters, onDelete }  = this.props;     // to replace this.props. 

        return (
            <div>
                <button
                    onClick={onReset}
                    className="btn btn-primary btn-sm m-2"
                >
                    Reset
                </button>
                {counters.map((counter) => (
                    <Counter
                        key={counter.id}
                        onDelete={onDelete}
                        onIncrement={this.props.onIncrement}
                        counter={counter} // able to pass counter data.
                        value={counter.value}
                        id={counter.id}
                    />
                ))}
            </div>
        );
    }
}

export default Counters;
