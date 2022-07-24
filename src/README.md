### Getting started

After cloning, run `npm i` in the `/frontend` directory and 
run `mvn clean install` in the project directory.

### Running in the dev environment

Run `mvn spring-boot:run` to start the server and
run `npm start` in the `/frontend` directory to start the React dev server.

The backend runs on `localhost:8080` and the React dev server runs on `localhost:3000`.

### Running in the prod environment

Run `mvn clean install -Pprod` to build the production version. Then:
```
cd /target
java -jar demo-0.0.1-SNAPSHOT.jar
```

Or, alternatively, you can just run `mvn clean install -Pprod`

The production version of the app runs on `localhost:8080`.
