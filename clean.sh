rm -rf server/CN2B2T-1.0-SNAPSHOT.jar
mvn clean package
mv target/CN2B2T-1.0-SNAPSHOT.jar server/plugins
cd server/
java -jar paper-1.12.2-1620.jar
