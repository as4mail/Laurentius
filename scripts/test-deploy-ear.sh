#/!bin/sh



WILDFLY_HOME="wildfly-19.1.0.Final"
BOUNDLE_TEST="Laurentius-test"
FOLDER_DEPLOY="test-deploy"
rm -rf $FOLDER_DEPLOY/$WILDFLY_HOME/standalone/deployments/*.*
cp ../as4mail-ear/target/as4mail.ear $FOLDER_DEPLOY/$WILDFLY_HOME/standalone/deployments/


cd "$FOLDER_DEPLOY/$WILDFLY_HOME/bin"

./laurentius-demo.sh 
