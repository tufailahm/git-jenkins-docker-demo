FROM java:8

ADD target/ChennaiBatch.jar app.jar

ENTRYPOINT [ "java" , "-jar" , "app.jar" ]
