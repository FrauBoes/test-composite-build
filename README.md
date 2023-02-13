## How to run the app
```
> gradle --include-build ../greeting-plugin greeting  
[composite-build] Configuring build: /home/user/gradle/sample/compositeBuilds/plugin-dev/greeting-plugin  
:greeting-plugin:compileJava  
:greeting-plugin:pluginDescriptors  
:greeting-plugin:processResources  
:greeting-plugin:classes  
:greeting-plugin:jar  
:my-greeting-app:greeting  
Hi Bob!!!  
```

## Plugin changes can be tested
This sample can be used to demonstrate the development lifecycle of a Gradle plugin. Edit the file `greeting-plugin/src/main/java/org/sample/GreetingTask.java` to change the greeting, and re-execute the consumer build:
```
> gradle --include-build ../greeting-plugin greeting
[composite-build] Configuring build: /home/user/gradle/sample/compositeBuilds/plugin-dev/greeting-plugin
:greeting-plugin:compileJava
:greeting-plugin:pluginDescriptors
:greeting-plugin:processResources
:greeting-plugin:classes
:greeting-plugin:jar
:my-greeting-app:greeting
G'day Bob!!!
```