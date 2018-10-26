import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component {
  constructor(props:  any){
    super(props);

    this.state = {
      books: [],
        isLoading: false
    }
  }
  componentDidMount(){
    this.setState({isLoading: true});

      fetch('http://localhost:8080/books')
          .then(response => response.json())
          .then(data => this.setState({books: data._embedded.books, isLoading: false}))
  }
  render() {
    const {books, isLoading} = this.state;

    if (isLoading){
      return <p>Loading...</p>
    }
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h2>Welcome to React</h2>
            <h1>Books List</h1>
            {books.map((books: any) =>
            <div key={books.id}>
                {books.name}
            </div>)}
        </header>
      </div>
    );
  }
}

export default App;
