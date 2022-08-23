FROM openjdk:11.0.16-jre-slim
WORKDIR /apps
ADD target/sb01_helloworld-1.0.jar sb01_helloworld-1.0.jar
ENTRYPOINT java -jar sb01_helloworld-1.0.jar