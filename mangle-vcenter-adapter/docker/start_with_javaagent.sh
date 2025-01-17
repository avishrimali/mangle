#!/bin/sh
echo "generating ssl certificate..................."
OPT_DIR=/var/opt
chmod +x $OPT_DIR/vmware/mangle/cert/generateCert.sh
$OPT_DIR/vmware/mangle/cert/generateCert.sh
cp $OPT_DIR/vmware/mangle/cert/server.* $OPT_DIR/mangle-vc-adapter-tomcat/config/

echo "starting tomcat service...................."

java -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/var/opt/mangle-vc-adapter-tomcat/logs -XX:+ExitOnOutOfMemoryError -Xms512m -Xmx4G -javaagent:$OPT_DIR/jacocoagent.jar=port=36320,destfile=jacoco-it.exec,output=tcpserver -jar $OPT_DIR/mangle-vc-adapter-tomcat/app.jar
