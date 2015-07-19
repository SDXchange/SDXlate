<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" >
  <xsl:output method="xml" indent="yes"/>

<xsl:variable name="auxOffset" >100</xsl:variable>
<xsl:variable name="stockOffset">400</xsl:variable>

 <xsl:template  match="variables">
   <xsl:apply-templates select="./*" />
 </xsl:template>

<xsl:template match="*">
  <xsl:copy>
    <xsl:copy-of select="@*"/>
    <xsl:apply-templates/>
  </xsl:copy>
</xsl:template>

<xsl:template match="plot">
   <xsl:variable name="idxVar" select="@index" />
   <plot index="{$idxVar}" pen_width="1" show_y_axis="true"  >
   <xsl:apply-templates select="./*"/>
   </plot>
</xsl:template>

<xsl:template match="graph">
            <graph type="time_series" title="Untitled" show_grid="true" 
            numbers_on_plots="true" background="#FFFFC9" from="0" to="600">
            <xsl:apply-templates select="./*"/>
            </graph>
</xsl:template>

<xsl:template match="stacked_container">
	<xsl:variable name="uidVar" select="@uid"/>
    <stacked_container x="200" y="400" height="282" width="492" visible_index="0" uid="{$uidVar}">
    	<xsl:apply-templates select="./*"/>
    </stacked_container>   
</xsl:template>


<xsl:template match="aux">
   <xsl:copy>
   	<xsl:copy-of select="@*" />
	<!-- <xsl:apply-templates select="*[not(name()='gf')]"/>
	<xsl:if test="./gf">
		<xsl:variable name="gfName" select="./gf/@name" />
		<xsl:copy-of select="../gf[@name=$gfName]" />
	</xsl:if>
	 -->
	<xsl:copy-of select="*" /> 
   <display color="black" x="{$auxOffset}" y="{(1+count(preceding::aux))*100}" label_side="top"/>
   </xsl:copy>
</xsl:template>

<xsl:template match="stock">
   <xsl:copy>
    <xsl:copy-of select="@*"/>
   <xsl:apply-templates select="./*" />
   <display color="black" x="{$stockOffset}" y="{(1+count(preceding::stock))*100}" label_side="center"/>
   </xsl:copy>
</xsl:template>
 
 <xsl:template match="flow">
   <xsl:copy>
    <xsl:copy-of select="@*"/>
   <xsl:apply-templates select="./*" />
   <display color="black" x="300" y="{(1+count(preceding::flow))*100}" label_side="bottom">
   	  <pts>
   	    <pt x="250" y="{(1+count(preceding::flow))*100}"/>
   	    <pt x="350" y="{(1+count(preceding::flow))*100}"/>
   	  </pts>
   </display>
   </xsl:copy>
</xsl:template>

 <xsl:template match="gf">
 <!--   <xsl:copy>
    <xsl:copy-of select="@*"/>
   <xsl:apply-templates select="./*" />
   <display color="black" x="300" y="{(1+count(preceding::flow))*100}" label_side="bottom"/>
   </xsl:copy> 
    -->
</xsl:template>

<xsl:template match="views">
   <xsl:apply-templates select="./*" />
</xsl:template>

<xsl:template match="view">
   <display orientation="landscape">
   <xsl:apply-templates select="./*[not(name()='stacked_container')]" />
   <xsl:apply-templates select="./stacked_container"/>
   </display>
</xsl:template>
  
</xsl:stylesheet>
