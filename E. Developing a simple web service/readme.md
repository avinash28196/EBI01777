# E. Developing a simple web service

## Question 1. Develop a REST-like web service

Develop a REST-like web service providing a single endpoint called date . The endpoint should
respond with the current date and time (similar to the Unix date command). The response should be
in JSON format.

An example request and response are shown below:
$ curl http://my-example-service.com/date
{ "date": "Wed Sep 20 15:32:35 BST 2017" }
You should use the programming language and framework that you feel most comfortable with.
You should manage your source code with git and upload it to a personal account on GitHub
( https://github.com ).


Solution:

## Instructions to run the project 
1. I have uploaded the source code to this folder. Download the file and import the project as MAVEN.
2. Navigate inside demo file where mvnw file is located. 
3. Enter the below command in the terminal. (latest MAVEN should be installed)
 ```
mvn clean install 
```
4. You will now see the target folder that is generated.
5. To run the application in port 8080. Enter the following command.
```
mvn spring-boot:run
```
6. Go to terminal or browser and hit the below endpoint.

```sh
curl http://localhost:8080/date
```
```
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100    37  100    37    0     0    215      0 --:--:-- --:--:-- --:--:--   235
{date: Sun Mar 28 10:43:56 GMT 2021}
```


## Question 2. Creating a Docker image

Create a Docker image for the web service you have just developed and upload it to a personal
Docker Hub account ( https://hub.docker.com ). You should configure your GitHub repository and
Docker Hub account so that a new commit to your repository will automatically trigger a new build
of your docker image.

Solution:

I have created the DockerFile in the demo application. Please follow the below instruction to docker build and run the application.

1. Open terminal and Navigate inside the folder and find the docker file.
2. Enter the following command to build docker image.
```
docker build -t springio/ebi-webapp .
```
3. Run the docker image
```
docker run -p 8080:8080 springio/ebi-webapp
```

## Question 3. Scaling up
Congratulations, your date web service has become very popular! The increase in traffic means that
you will need to deploy five instances of your service in order to meet demand. Explain how you
would do this.

I would use AWS fargate, Codebuild, ECS service to deploy the application and auto-scale up and down as and when required.

1. Create GitHub and code build integration.
2. Create ECS for registering a container 
3. Configure AWS Fargate, such as defining resources, etc

