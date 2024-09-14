# Etapa 1: Construir o JAR usando Gradle
FROM gradle:8.0.0-jdk17 AS build

# Definir o diretório de trabalho
WORKDIR /app

# Copiar arquivos de configuração do Gradle e scripts
COPY gradle /app/gradle
COPY gradle-wrapper.jar /app/gradle/wrapper/
COPY gradle-wrapper.properties /app/gradle/wrapper/
COPY build.gradle settings.gradle /app/

# Copiar o código-fonte
COPY src /app/src

# Construir o JAR da aplicação
RUN gradle build --no-daemon

# Etapa 2: Criar a imagem final com o JAR construído
FROM openjdk:17-jdk-slim

# Definir o diretório de trabalho
WORKDIR /app

# Copiar o JAR construído da imagem de build
COPY --from=build /app/build/libs/bank-account-management-system-0.0.1-SNAPSHOT.jar /app/bank-account-management-system.jar

# Expor a porta que a aplicação irá rodar
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "/app/bank-account-management-system.jar"]
