<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" >
  <xsl:output method="xml" indent="yes"/>

<xsl:variable name="maxlen_value" select="//sim_specs/stop"/>

<xsl:template match="node()|@*">
    <xsl:copy>
      <xsl:apply-templates select="node()|@*"/>
     </xsl:copy>
  </xsl:template>
<xsl:template match="variables">
    <xsl:copy>
    <aux name="MAXLEN">
       <eqn><xsl:value-of select="$maxlen_value"/></eqn>
    </aux>
      <xsl:apply-templates select="node()|@*"/>
     </xsl:copy>
</xsl:template>
	
<xsl:template match="connector[(from = 'CLIP')]"/>
  
</xsl:stylesheet>
