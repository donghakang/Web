import React, { Component } from "react";

class Counter extends Component {
    // state = {
    //     value: this.props.counter.value,

    //     address: {
    //         street: "",
    //     },
    //     imageURL: "https://picsum.photos/200",
    //     tags: ["tag1", "tag2", "tag3"],
    // };

    styles = {
        fontSize: "16px",
        fontWeight: "bold",
    };

    handleIncrement = (product) => {

    };

    render() {
        // console.log('props', this.props);

        return (
            <div>
                {/* <span>{this.state.count}</span>
                <span>{2 + 2}</span>
                <span>{this.formatCount()}</span> */}
                {/* { this.state.tags.length === 0 && 'Please create a new tag!'}
                { this.renderTags()} */}
                <h4>{this.props.id}</h4>
                {/* <img src={this.state.imageURL} alt="no image" /> */}

                <span className={this.getBadgeClasses()}>
                    {this.formatCount()}
                </span>
                <button
                    onClick={() => this.props.onIncrement(this.props.counter)}
                    className="btn btn-secondary btn-sm"
                >
                    Increment
                </button>
                <button
                    onClick={()=> this.props.onDelete(this.props.counter.id)}
                    className="btn btn-danger btn-sm m-2"
                >
                    Delete
                </button>
            </div>
        );
    }

    getBadgeClasses() {
        // Refactor, ^ shift R to refactor as mehtod.
        let classes = "badge m-2 badge-";
        classes += this.props.counter.value === 0 ? "warning" : "primary";
        return classes;
    }

    formatCount() {
        const { value: count } = this.props.counter;
        const x = "zero";
        return count === 0 ? x : count;
    }
}

export default Counter;
