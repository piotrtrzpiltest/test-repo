FROM tray/java:8-jre-new

ARG GIT_COMMIT
ENV APP_VERSION ${GIT_COMMIT}

ADD test-repo.tgz /

ENTRYPOINT ["/test-repo/bin/test-repo"]
