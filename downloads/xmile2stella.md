---
layout: download
---
# XMILE to Stella Translator

While ISEE has been a significant suporter of XMILE as the standard  works its way through the OASIS process, the current ISEE products support an earlier draft standard of XMILE. The (nearly) final OASIS standard has a different top-level structure. Our XMILE to Stella translator is a thin Java wrapper around an XSLT script that deals with these top-level differences. 

While this approach should be enough to successfully translate many xmile files to runnable stmx files, we have only tested with the output of our Dynamo translator, thus there are probably xmile structures and idioms that this transform won't handle. 

Please let us know if you encounter a specific translation problem -- the reliance on XSLT makes it relatively easy to make changes to this tool. 

Do keep in mind, however, that we may defer major changes, since we expect ISEE to support the final standard in near term production releases of Stella and iThink. 

### Installation

You must have Java 7 or better installed to run this translator. You can determine what version of Java is installed on your machine by running <code>java -version</code> at the command line. You are looking for a version string greater than <code>1.7.xxxx</code>. 

Once you have an appropriate version of Java available, use this [link](xmile2stella.jar) to download the jar file. Save the file to the directory where you plan to perform your translations. (This isn't strictly required, but it simplifies file references.) 

Put your Xmile model in a text file with file extension <code>.xmile</code> and copy it to the same directory as the translator. Then cd into that directory and issue the command:

<code>java -jar xmile2stella.jar &lt;myModel&gt;.xmile</code>

The angle brackets are _not_ part of the command -- they just indicate the portion that will be unique to your translation. For example, to translate an xmile model saved in the file <code>teacup.xmile</code>, you would issue the command 

<code>java -jar xmile2stella.jar teacup.xmile</code>

The translator will generate a Stella version named <code>myModel.stmx</code>.  
