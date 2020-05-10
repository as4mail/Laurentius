<?xml version="1.0" encoding="utf-8"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0"   
                xmlns:sodDoc="http://www.sodisce.si/2010/mail/Document" 
                xmlns:xds="http://www.w3.org/2000/09/xmldsig#" 
>
 
    <xsl:output method="text" indent="yes"/>
    <xsl:template match="/">
        <xsl:apply-templates select='sodDoc:Document/sodDoc:Signatures/xds:Signature[1]/xds:KeyInfo/xds:X509Data' />
    </xsl:template>
	
    <xsl:template match="sodDoc:Document/sodDoc:Signatures/xds:Signature[1]/xds:KeyInfo/xds:X509Data">
        <xsl:value-of select="xds:X509Certificate"/>
    </xsl:template>


    
</xsl:stylesheet>
