#!/bin/bash

bash -version
cd /c/simdevworkspace/dynamo_parser/src/
ls 

java -cp ../lib/antlr-3.5.2-complete.jar org.antlr.Tool -o ../generated/examples ./examples/DynWalk.g
javac -cp ../lib/antlr-3.5.2-complete.jar ../generated/examples/*.java

