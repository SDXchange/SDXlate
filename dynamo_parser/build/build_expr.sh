#!/bin/bash

bash -version
pwd
cd ./edu/iastate/xmile/examples/
ls ./../../../../../lib

java -cp ./../../../../../lib/antlr-3.5.2-complete.jar org.antlr.Tool -o ./../../../../../generated/examples ./Expr.g
javac -cp ./../../../../../lib/antlr-3.5.2-complete.jar ./../../../../../generated/examples/*.java

