@Echo OFF

setlocal
cd /d %~dp0

java -cp ./*;./plugins/* org.sdxchange.apps.Main %*