FROM tomcat:9.0
MAINTAINER gmendez
COPY /target/WebApplicationMvc.war /usr/local/tomcat/webapps/