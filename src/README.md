# Spring Boot and ReactJS integration

Based on the idea from [this tutorial](https://developer.okta.com/blog/2022/06/17/simple-crud-react-and-spring-boot)

The integration is provided by using [frontend-maven-plugin](https://github.com/eirslett/frontend-maven-plugin) and maven-resources-plugin
which job is managed by relevant profiles. 

### Getting started

After cloning, run this command in the `/frontend` directory: 

```npm i``` 

and after that run this maven command in the project directory to perform clean installation: 

```mvn clean install``` 

### Running in the dev environment

To start the server, run 

```mvn spring-boot:run```

To start the React dev server, run this in the `/frontend` directory: 

```npm start```

The backend runs on `localhost:9999` and the React dev server runs on `localhost:3000`.

### Running in the prod environment

Run `mvn clean install -Pprod` to build the production version. Then:

```
cd /target
java -jar demo-0.0.1-SNAPSHOT.jar
```

Or, alternatively, you can just run 

```mvn clean install -Pprod```

The production version of the app runs on `localhost:9999`.
