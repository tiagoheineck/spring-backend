ARG VARIANT="bookworm"
FROM mcr.microsoft.com/vscode/devcontainers/java:1-21-${VARIANT}
ARG GRADLE_VERSION=""
RUN apt-get update && apt-get install gnupg2 -y

COPY ./publickeys.asc /tmp/

# only imports usable & necessary signatures into keybox
RUN gpg --import-filter drop-sig='expired == 0' --import-options import-clean --import /tmp/publickeys.asc \
    && rm /tmp/publickeys.asc
    

RUN su vscode -c "umask 0002 && . /usr/local/sdkman/bin/sdkman-init.sh && sdk install gradle \"${GRADLE_VERSION}\""