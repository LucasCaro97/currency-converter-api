FROM openjdk:19
ADD target/CurrencyConverter-0.0.1-SNAPSHOT CurrencyConverter-0.0.1-SNAPSHOT
ENTRYPOINT ["java", "-jar", "/CurrencyConverter-0.0.1-SNAPSHOT"]