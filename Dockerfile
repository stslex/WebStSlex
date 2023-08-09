FROM gradle:7-jdk11
LABEL authors="stslex"
COPY --chown=gradle:gradle . /home/gradle