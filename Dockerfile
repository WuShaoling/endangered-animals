FROM tomcat:8-jre8

RUN rm -rf /usr/local/tomcat/webapps/ROOT/*
COPY ./target/Encounter/ /usr/local/tomcat/webapps/ROOT/

EXPOSE 8080
CMD ["catalina.sh", "run"]