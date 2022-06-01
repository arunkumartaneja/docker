# Docker Commands

## Docker Image
### Pull an image
- #### command

    ```
    docker pull <image-name:tag>
    ```

- #### example

    ```
    docker pull nginx:latest
    ```

### List all available images
- #### command
    ```
    docker images
    ```
### Build Docker image
- #### command

    ```
    docker build -t <image-name:tag> <docker-file-path>
    ```

- #### example
    here docker file in root folder
    ```
    docker build nginx-image:latest .
    ```

### Remove image
- #### command
    ```
    docker image rm <image-name>
    ```

## Docker Container
### Run a image in a new container
- #### command

    ```
     docker run [OPTIONS] <IMAGE>
    ```

- #### options
     -d => Run container in background
     
     --name => assign name to container

- #### example

    ```
    docker run -d -p 8080:80 --name nginx-container nginx:latest
    ```
 ### Remove container
- #### command
    ```
    docker rm <conainer-name/id>
    ```
 ### Container logs
- #### command
    ```
    docker logs <conainer-name/id>
    ```
 ### Start/stop Container
- #### command
    ```
    docker stop <conainer-name/id>
    ```
    ```
    docker start <conainer-name/id>
    ```