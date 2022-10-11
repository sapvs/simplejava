FROM s3vt/java:17

WORKDIR /app
COPY ./target/simplejava-0.0.1.jar /app/simple.jar

ENTRYPOINT [ "java", "-jar","simple.jar" ]