FROM piotrtrzpil/test-repo:master

COPY staging.conf /etc/cs.conf
COPY logger.xml /etc/logger.xml

CMD ["-J-Xmx2g", "-J-Xms1g", "-Dconfig.file=/etc/cs.conf", "-Dlogger.file=/etc/logger.xml"]
