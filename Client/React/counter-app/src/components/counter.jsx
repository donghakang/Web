import React, { Component } from "react";

class Counter extends Component {
    state = {
        count: 0,


        address: {
            street: "",
        },
        imageURL: "https://picsum.photos/200",
        tags: ["tag1", "tag2", "tag3"],
    };

    styles = {
        fontSize: "16px",
        fontWeight: "bold",
    };


    // constructor() {
    //     super();
    //     // console.log("Constructor", this);
    //     this.handleIncrement = this.handleIncrement.bind(this);            // return new instance of handleIncrement fn
    // }

    // handleIncrement() {
    //     // to enable "this" we have to make a constructor
    //     console.log('clicked', this);
    // }

    handleIncrement = (product) => {
        // console.log('clicked', this);
        console.log(product);
        this.setState({count: this.state.count + 1});       // increment everytime it is pressed 
    }

    render() {
        return (
            <div>
                {/* <span>{this.state.count}</span>
                <span>{2 + 2}</span>
                <span>{this.formatCount()}</span> */}
                {/* { this.state.tags.length === 0 && 'Please create a new tag!'}
                { this.renderTags()} */}
                <img src={this.state.imageURL} alt="no image" />
                <span className={this.getBadgeClasses()}>{this.formatCount()}</span>
                <button onClick={ () => this.handleIncrement(1)} className="btn btn-secondary btn-sm">Increment</button>
            </div>
        );
    }

    getBadgeClasses() {
        // Refactor, ^ shift R to refactor as mehtod.
        let classes = "badge m-2 badge-";
        classes += this.state.count === 0 ? "warning" : "primary";
        return classes;
    }

    formatCount() {
        const { count } = this.state;
        const x = "zero";
        return count === 0 ? x : count;
    }
}

export default Counter;
