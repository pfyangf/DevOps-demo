FROM java

MAINTAINER isoftstone.com

ADD /target/DevOps-demo.jar /opt/

EXPOSE 9090

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-Xms128m", "-Xmx256m", "-jar", "/opt/DevOps-demo.jar", "--spring.profiles.active=test"]

CMD ["java", "-version"]