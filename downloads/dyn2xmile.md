---
layout: download
---
### UNDER CONSTRUCTION

# Dynamo to Xmile Translator

DYNAMO was the original System Dynamics modeling language. The models in Industrial Dynamics (1961) were all created in DYNAMO. While we are not aware of any modern implementation of Dynamo, this translator can give you a runnable Xmile model for most DYNAMO structures. It  supports all core features of DYNAMO (as documented by Richardson and Pugh's 1981 book _Introduction to System Dynamics Modeling with DYNAMO_.)

Since DYNAMO preceded affordable interactive graphics, the translator "synthesizes" the view portion of the model. Presently we use a trivial mechanism for assigning elements positions within this view, resulting in a working, but ugly, graph. 

The translator does not, yet, handle arrays or macros. Additionally, some idioms peculiar to DYNAMO will be ignored. (In particular, stock equations that do more than just aggregate flows may require manual rewrite.) 


### Installation

You must have Java 7 or better installed to run this translator. You can determine what version of Java is installed on your machine by running <code>java -version</code> at the command line. You are looking for a version string greater than <code>1.7.xxxx</code>. 

Once you have an appropriate version of Java available, use this [link](dyn2xmile.jar) to download the jar file. Save the file to the directory where you plan to perform your translations. (This isn't strictly required, but it simplifies file references.) 

Put your DYNAMO model in a text file with file extension <code>.dyn</code> and copy it to the same directory as the translator. Then cd into that directory and issue the command:

<code>java -jar dyn2xmile.jar &lt;myModel&gt;.dyn</code>

The angle brackets are _not_ part of the command -- they just indicate the portion that will be unique to your translation. For example, to translate a dynamo model saved in the file teacup.dyn, you would issue the command 

<code>java -jar dyn2xmile.jar teacup.dyn</code>

The translator will generate an XMILE verion named <code>myModel.xmile</code> and (for diagnostic purposes) will dump its internal symbol table to the file <code>myModel.sym</code>. 

#### Recent Revisions
* 2015-08-06 Fix corrupted build. Replace dyn2xmile.md with new build: ver 1.01.
