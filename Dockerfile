FROM tray/java:8-jre-new

ADD test-repo.tgz /

ENTRYPOINT ["/test-repo/bin/test-repo"]
