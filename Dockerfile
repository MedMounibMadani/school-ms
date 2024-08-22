FROM bellsoft/liberica-runtime-container:jre-17-stream-musl
WORKDIR .
EXPOSE 8040
COPY target/*-SNAPSHOT.jar app.jar
CMD ["sh", "-c", "sleep 120 && java -jar /app.jar"]
