# AS4Mail

##  Purpose 

AS4Mail is multipuropose ebMS 3.0 solution. Code is forked from VsrsCif/Laruentius which is profile conformant Access Point Implementation maintained by the IT of Supreme Court of Republic of Slovenia. 

The purpose of this fork is to develope new features, security upgrades and also to explore new possibilities of using ebMS 3.0 standards for B2B integrations. 

## Why use of ebMS 3.0 standard

Business interactions are dynamic, so should be the B2B software. Eventhough that B2B interactions are various they all share common messaging aspetcs as: security, reliablility, addressing, message description... These B2B aspects does not have business values which are usually process in backend systems. The backend business data is usually in the message payload(s). The ebMS 3.0 standard is payload agnostics and focus on message transfer aspects. In other words it leaves backend system to focus in bussies data, but leaves message transfer aspects as: security reliability, to so called MSH (message service handler) component.   

When having multiple backend system and many clients this approach is cost saving on maintenance tasks for clients endpoints, certificates, and also when applying latest security recommondation into transfer protocols. 

Another strong reason for using the ebMS 3.0 standard is its potential widespread use of the standards. Nowadays many other equally efficient standards and solutions handles message transfer aspects. For a quick and costless start of B2B communication with partners also the partners software must "speak" the same tehnical language. Else we or the partners must implement new standards or by new solutions. The ebMS 3.0 standard was poroposed by European commission and also used by many of it's projects for reaching the goal of common B2B marked. 

At the project eDelivery (https://ec.europa.eu/cefdigital/wiki/display/CEFDIGITAL/eDelivery) develope example of ebMS 3.0 (AS4 eDelivery profile) called Domibus and aslo providing conformaces tests and also a list of softwares complient with that profile for message exchange.  












