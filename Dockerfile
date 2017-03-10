FROM tray/java:8-jre

ENV VERSION 1.0-SNAPSHOT

ADD test-repo-1.0-SNAPSHOT.tgz /test-repo
COPY VERSION /VERSION
COPY entrypoint.sh /entrypoint.sh

ENTRYPOINT ["test-repo-1.0-SNAPSHOT/bin/test-repo"]
