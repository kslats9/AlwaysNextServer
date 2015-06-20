# AlwaysNextServer
App Engine Code for AlwaysNext.com

Uses Google Cloud Endpoints
Requires Java 7 and Maven

Build the project by invoking
  mvn clean install
  
start the API in the development server as follows:
  mvn appengine:devserver
  
Visit the APIs Explorer at this URL:
http://localhost:8080/_ah/api/explorer

To deploy to App Engine
  mvn appengine:update
