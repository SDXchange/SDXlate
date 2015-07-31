---
layout: download
---
# XMILE to InsightMaker Translator

While InsightMaker offers an "Xmile" import, it expects an older format, with a much different top-level structure, than the (nearly) final OASIS v1.0 standard. Moreover, as far as we've been able to determine, InsightMaker's Xmile import doesn't recognize lookup tables (graphical functions). 

### Known Limitations

This release has been tested only with Xmile generated from Dynamo. Since Dynamo does not support dimensions, the translator makes no attempt to set dimensions in the generated InsightMaker file. In particular, the translations will map TIME to the macro SDX_TIME, which should force TIME to be dimensionless. You can change this behavior by editing the SDX_TIME() macro. 

The initial release has explicit support for only a few Xmile built-ins. Most importantly, the InsightMaker translator does handle <code>if ... then ... else</code> conversions for you. References to other Xmile built-ins passed through to the InsightMaker model and will look like a function call or macro reference. In most cases, it should be relatively easy to define a macro to satisfy such references. 

Arrays and subscripts are not supported. 


### Installation

You must have Java 7 or better installed to run this translator. You can determine what version of Java is installed on your machine by running <code>java -version</code> at the command line. You are looking for a version string greater than <code>1.7.xxxx</code>. 

Once you have an appropriate version of Java available, use this [link](xmile2insight.jar) to download the jar file. Save the file to the directory where you plan to perform your translations. (This isn't strictly required, but it simplifies file references.) 

Put your Xmile model in a text file with file extension <code>.xmile</code> and copy it to the same directory as the translator. Then <code>cd</code> into that directory and issue the command:

<code>java -jar xmile2insight.jar &lt;myModel&gt;.xmile</code>

The angle brackets are _not_ part of the command -- they just indicate the portion that will be unique to your translation. For example, to translate an xmile model saved in the file <code>teacup.xmile</code>, you would issue the command 

<code>java -jar xmile2insight.jar teacup.xmile</code>

The translator will generate an InsightMaker version named <code>myModel.InsightMaker</code>.  
