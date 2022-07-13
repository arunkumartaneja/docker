# Spring Boot JPA with Docker  


## Without Docker Compose

### Network
`sudo docker network create my-net`


### Postgres DB
```
sudo docker run -d \
	-e POSTGRES_USER=user -e POSTGRES_PASSWORD=mypass \
	--name pg-db -p 5432:5432 \
	--network=my-net \
	--restart=always postgres:alpine
```

### PGadmin
```
sudo docker run -p 8080:80 \
    -e 'PGADMIN_DEFAULT_EMAIL=user@domain.com' \
    -e 'PGADMIN_DEFAULT_PASSWORD=mypass' \
    --name pg-admin \
    --network=my-net \
    --restart=always \
    -d dpage/pgadmin4
 ```
 
### Java App
- #### Image
	``` sudo docker build -t java-app:latest . ```
- #### Container
	``` sudo docker run -d -p 8081:8082 --name backend --network=my-net -e 'SPRING_PROFILES_ACTIVE=docker' java-app ```

## Using Docker Compose

### Ceck our build-file for syntax-errors
``` sudo docker-compose config ```

### Build images, create the defined containers, and start it in one command
``` sudo docker-compose up --build -d ```

### stop the containers, remove them from Docker and remove the connected networks from it
``` sudo docker-compose down ```

