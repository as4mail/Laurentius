/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package si.laurentius.msh.ws;

import java.io.File;
import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.Session;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.apache.activemq.ActiveMQConnectionFactory;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

import si.laurentius.commons.SEDValues;

/**
 *
 * @author Jože Rihtaršič
 */
public class TestUtils {

  /**
     *
     */
  protected static final String JNDI_CONNECTION_FACTORY = "ConnectionFactory";

  /**
     *
     */
  protected static final String PERSISTENCE_LAU_UNIT_NAME = "ebMS_MSH_PU";

  /**
     *
     */
  protected static final String PERSISTENCE_UNIT_NAME = "ebMS_PU";

  /**
     *
     */
  protected static final String LAU_HOME = "target/TEST-LAU_HOME";

  /**
   *
   * @return @throws NamingException
   */
  public static Queue setJMSEnvironment() throws NamingException, JMSException {
    System.getProperties().put(Context.INITIAL_CONTEXT_FACTORY,
        "org.apache.activemq.jndi.ActiveMQInitialContextFactory");
    System.getProperties()
        .put("java.naming.provider.url", "vm://localhost?broker.persistent=false");
    InitialContext context = new InitialContext();
    ActiveMQConnectionFactory connectionFactory =
        (ActiveMQConnectionFactory) context.lookup(JNDI_CONNECTION_FACTORY);
    // Create a Connection
    Connection connection = connectionFactory.createConnection();
    connection.start();
    // Create a Session
    Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
    // Create the destination Queue
    Queue mshQue = session.createQueue(SEDValues.JNDI_QUEUE_EBMS);

    return mshQue;
  }

 

}
