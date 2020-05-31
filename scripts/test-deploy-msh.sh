#/!bin/sh



WILDFLY_HOME="wildfly-19.1.0.Final"
BOUNDLE_TEST="Laurentius-test"
FOLDER_DEPLOY="test-deploy"

cp ../Laurentius-msh/Laurentius-msh-ear/target/Laurentius-msh.ear $FOLDER_DEPLOY/$WILDFLY_HOME/standalone/deployments/


cd "$FOLDER_DEPLOY/$WILDFLY_HOME/bin"

./laurentius-init.sh --init -d mb-laurentius.si
