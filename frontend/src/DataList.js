import { Component } from "react";

class DataList extends Component {
  state = {
    records: [],
  };

  componentDidMount() {
    const requestOptions = {
      headers: {
        Accept: "application/json",
      },
    };
    fetch("/api/data", requestOptions)
      .then((response) => response.json())
      .then((records) => {
        this.setState({
          records: records,
        });
      })
      .catch((error) => console.log(error));
  }

  render() {
    return (
      <div>
        <div>
          <h1>Data</h1>
        </div>
        <div>
          <ul>
            {this.state.records.map((record) => {
              return <li key={record.id}>{record.description}</li>;
            })}
          </ul>
        </div>
      </div>
    );
  }
}

export default DataList;
