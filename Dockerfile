FROM tomcat:9.0.64-jdk17

ADD build/libs/blog.war /usr/local/tomcat/webapps/blog.war

EXPOSE 8080

CMD ["catalina.sh","run"]

