@java -server -Xms4G -Xmx8G -XX:SurvivorRatio=32 -XX:+UseG1GC -cp codeserver.jar; code.Main
@pause