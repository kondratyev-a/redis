# Simple REST application with Redis
Trying to use Redis, Spring Data Redis, and Jedis

## Local run
Requirements
- Java 11
- Gradle
- Redis

To run Redis in Docker
```console
docker run -p 6379:6379 -d redis
```

After that
```console
git clone https://github.com/kondratyev-a/redis.git  
cd redis 
.\gradlew bootRun  
```

## Examples of using
Run in a browser http://localhost:8080/rest/user/add/1/Alex to add a user.  
Run http://localhost:8080/rest/user/all to get users list.

