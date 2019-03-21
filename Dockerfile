FROM openjdk:8

COPY /build/distributions/uberJar/app.jar /opt/leto/app.jar

CMD java -Dapp.home=/opt/leto-home -jar /opt/leto/app.jar