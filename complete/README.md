# how to build

URL:  
dxrd.n-dev-test.net


## buildpacks

```
./mvnw spring-boot:build-image -DskipTests=true
docker image ls


docker tag 46dc51534ad8 742014795691.dkr.ecr.ap-northeast-1.amazonaws.com/ecskensho-dev-ecr-01:v1-buildpacks

sudo su -
aws ecr get-login-password --region ap-northeast-1 | docker login --username AWS --password-stdin 734822300661.dkr.ecr.ap-northeast-1.amazonaws.com
docker push 742014795691.dkr.ecr.ap-northeast-1.amazonaws.com/ecskensho-dev-ecr-01:v1-buildpacks



```
## Using DockerHub
```
#docker hub
#akiraabe

docker image ls

docker tag 57376285411f akiraabe/spring-boot-docker:v226-1
docker push akiraabe/spring-boot-docker:v226-1
```

## Test result.
| tag     | condition                            | result | description          | references                                                                                         |
|---------|--------------------------------------|--------|----------------------|----------------------------------------------------------------------------------------------------|
| v225-1  | HTTP8080, using rediret to HTTPS     | NG     | Cause Redirect loop. | https://docs.spring.io/spring-security/reference/servlet/exploits/http.html#servlet-http-redirect  |
| v226-1  | HTTP8080, Add 'x-forwarded-proto'    | OK     | Looks good!          | https://docs.spring.io/spring-boot/docs/current/reference/html/howto.html#howto.security.enable-https  |
| v226-2  | HTTP8080, only 'x-forwarded-proto'   | OK     | Looks good!          | same as above. |
| v226-3  | HTTP8080, Add  'x-forwarded-for'     | OK     | Looks good!          | same as above. |