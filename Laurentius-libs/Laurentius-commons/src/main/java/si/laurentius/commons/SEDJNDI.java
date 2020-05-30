/*
 * Copyright 2015, Supreme Court Republic of Slovenia
 * 
 * Licensed under the EUPL, Version 1.1 or – as soon they will be approved by the European
 * Commission - subsequent versions of the EUPL (the "Licence"); You may not use this work except in
 * compliance with the Licence. You may obtain a copy of the Licence at:
 * 
 * https://joinup.ec.europa.eu/software/page/eupl
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence
 * is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the Licence for the specific language governing permissions and limitations under
 * the Licence.
 */
package si.laurentius.commons;

/**
 * Class contains EJB JNDI addresses
 *
 * @author Joze Rihtarsic <joze.rihtarsic@sodisce.si>
 */
public class SEDJNDI {
    
     

  /**
   *
   */
  public static final String JNDI_DBCERTSTORE =
      "java:app/Laurentius-dao/SEDCertStoreBean!si.laurentius.commons.interfaces.SEDCertStoreInterface";
  
  public static final String JNDI_DBCERTUTILS =
      "java:app/Laurentius-dao/SEDCertUtilsBean!si.laurentius.commons.interfaces.SEDCertUtilsInterface";

  /**
   *
   */
  public static final String JNDI_DBSETTINGS =
      "java:app/Laurentius-dao/DBSettings!si.laurentius.commons.interfaces.DBSettingsInterface";
  
  public static final String JNDI_NETWORK =
      "java:app/Laurentius-dao/SEDNetworkUtilsBean!si.laurentius.commons.interfaces.SEDNetworkUtilsInterface";

  /**
   *
   */
  public static final String JNDI_JMSMANAGER =
      "java:app/Laurentius-dao/JMSManager!si.laurentius.commons.interfaces.JMSManagerInterface";

  /**
   *
   */
  public static final String JNDI_SEDDAO =
      "java:app/Laurentius-dao/SEDDaoBean!si.laurentius.commons.interfaces.SEDDaoInterface";

  /**
   *
   */
  public static final String JNDI_SEDLOOKUPS =
      "java:app/Laurentius-dao/SEDLookups!si.laurentius.commons.interfaces.SEDLookupsInterface";

  public static final String JNDI_PLUGIN =
      "java:app/Laurentius-dao/SEDPluginManager!si.laurentius.commons.interfaces.SEDPluginManagerInterface";
  
  
  public static final String JNDI_DATA_INIT =
      "java:app/Laurentius-dao/SEDInitData!si.laurentius.commons.interfaces.SEDInitDataInterface";

  /**
   *
   */
  public static final String JNDI_SEDREPORTS =
      "java:app/Laurentius-dao/SEDReportBean!si.laurentius.commons.interfaces.SEDReportInterface";

  /**
   *
   */
  public static final String JNDI_SEDSCHEDLER =
      "java:app/Laurentius-dao/MSHScheduler!si.laurentius.commons.interfaces.SEDSchedulerInterface";

  /**
   *
   */
  public static final String JNDI_PMODE =
      "java:app/Laurentius-dao/PModeManagerBean!si.laurentius.commons.interfaces.PModeInterface";

}
