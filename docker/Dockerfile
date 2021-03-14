FROM openjdk:8-jre
RUN mkdir /app
COPY hello-dubbo-service-consumer-1.0.0-SNAPSHOT.jar /app/
ENV SPRING_PROFILES_ACTIVE dev
CMD java -jar /app/hello-dubbo-service-consumer-1.0.0-SNAPSHOT.jar --spring.profiles.active=${SPRING_PROFILES_ACTIVE}
EXPOSE 8801
