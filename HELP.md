# Getting Started

### Steps  to  build  the App in play with docker
1. Open the play with Docker   https://labs.play-with-docker.com/ 
2. Click on  ADD NEW INSTANCE
3. Create a  Zip  file  springdocker.zip  containing the  src ,pom.xml and docker file
4. unzip the  using unzip springdocker.zip -d springdocker .
5. cd springdocker
6. Run  this  command  to build  an image docker build -t springdocker .
   _-t flag specifies the tag (name) for the resulting Docker image. Image is created with springdocker as the  tag name
7. Run the  command **_docker run -dp 8080:8080 --name spring-greet spring-docker_**
   * docker run: This Docker command creates a new container from a specified image and starts it. If the image (e.g., springdocker) exists locally, Docker uses it; otherwise, it attempts to pull it from a registry like Docker Hub.
   * -p 8080:8080: The -p flag (short for --publish) maps a port on the host machine to a port inside the container.
8. acees the app actuator  by running the
   http://ip172-18-0-14-d07239qim2rg00c7rjj0-8080.direct.labs.play-with-docker.com:8080/actuator
9. access the greetUser API
   http://ip172-18-0-14-d07239qim2rg00c7rjj0-8080.direct.labs.play-with-docker.com:8080/api/v1/greetUser

### Useful Docker commands
1. List  running containers
   docker ps
2. List all Containers
   docker ps -a
3. inspect container details
   docker inspect spring-greet
4. view container logs
   docker logs spring-greet
5. Follow  logs in real time
   docker logs -f spring-greet
6. docker stop containers
   docker stop greet-app
7. docker stop multiple  containers
   docker stop $(docker ps -q)
8. **Be cautions in running** Stop and remove all conainers
   docker rm -f $(docker ps -a -q)
9. **Be cautions in running**  remove all images
   docker rmi -f $(docker images -q)
10. Single command to remove all containers, images, networks, and unused resources:
    docker system prune -a -f --volumes





    