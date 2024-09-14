# Usar uma imagem base do OpenJDK
FROM openjdk:17-jdk-slim

# Definir o diretório de trabalho
WORKDIR /app

# Copiar o JAR construído para a imagem
COPY target/bank-account-management-system-0.0.1-SNAPSHOT.jar /app/bank-account-management-system.jar

# Expor a porta que a aplicação irá rodar
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "/app/bank-account-management-system.jar"]
