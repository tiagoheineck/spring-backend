FROM eclipse-temurin:21.3.0_0-jdk-bookworm as base

WORKDIR /app

COPY . ./app

CMD ["./gradle", "build"]


FROM pre-build as development

CMD ["./gradle", "bootRun"]