## Lippia Web sample project - Linux users

## System Requirements :
+ JDK 8: https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html   
	  https://openjdk.java.net/install/   
+ Maven 3.X: https://maven.apache.org/download.cgi   
+ Docker 18.09: https://docs.docker.com/install/linux/docker-ce/ubuntu/
+ Docker compose 1.24: https://docs.docker.com/compose/install/

# Getting started
 [Download]: <https://bitbucket.org/crowdarautomation/lippia-mixed-web-mobile-sample-project/get/fdc35889edbf.zip>
- [Download] and unzip the source repository for this guide, or clone it using Git:
    ``` $ git clone https://bitbucket.org/crowdarautomation/lippia-mixed-web-mobile-sample-project.git ```
- Go to root directory  
    ``` $ cd lippia-mixed-web-mobile-sample-project.git ```

#### Stack
This solution use docker containers to generate a context to execute the tests. 
Through docker compose we configure the following  
  
-	Selenium hub  
-  	Chrome desktop browser node
-   Emulated Android device with chrome browser

##### Starting stack
To start the containers, simply run the following command from terminal:

```
$ sudo docker-compose up
```


 > This command, will start download the images needed to build all the containers and start them. It takes a while to download the images depending on your internet connection.

![docker-compose](/docs/img/docker-compose-up.png)


After that you you can check the containers are up and running executing the following command
`$ sudo docker ps `.
    You have to see 2 Chrome Browsers, 1 Selenium Grid and 1 Jenkins.

```
CONTAINER ID        IMAGE                           COMMAND                  CREATED             STATUS                    PORTS                                              NAMES
d80fe46dfeb4        budtmo/docker-android-x86-9.0   "/bin/sh -c '/usr/bi…"   26 hours ago        Up 10 minutes (healthy)   4723/tcp, 5554-5555/tcp, 0.0.0.0:6080->6080/tcp    lippia-mixed-web-mobile-sample-project_samsung_s7_9.0_1
39ccaa317fe7        elgalu/selenium:3.141.59-p21    "entry.sh"               26 hours ago        Up 10 minutes             0.0.0.0:5900->25900/tcp, 0.0.0.0:6081->26080/tcp   lippia-mixed-web-mobile-sample-project_chrome_1
92dab3fcc505        selenium/hub:3.14.0-curium      "/opt/bin/entry_poin…"   26 hours ago        Up 10 minutes             0.0.0.0:4444->4444/tcp                             lippia-mixed-web-mobile-sample-project_selenium_hub_1
```

## Check Docker stack is up and running
After starting the stack you can see  and selenium grid following url:

Selenium Grid: http://localhost:4444/grid/console

![grid_console](/docs/img/Grid_Console.png)

Chrome desktop node novnc: http://localhost:6081

![chromeDesktopNovnc](/docs/img/chromeDesktopNovnc.png)

Emulated Android device novnc: http://localhost:6080

![dockerAndroidNovnc](/docs/img/dockerAndroidNovnc.png)

***

### Run from command line
Now you be able to consume the solution and start running tests.

To run tests over "WEB" context you need to execute the following command
```
 mvn clean tests -PGridSecuencialWeb
```
> You can verify the behavior by accessing http://localhost:6081

To run tests over "MOBILE" context you must be execute
```
mvn clean tests -PGridSecuencialMobile
```
> You can verify the behavior by accessing http://localhost:6080

***

### Reports
you can view this report by accesing to:

- `[WORKSPACE_LOCATION]//lippia-mixed-web-mobile-sample-project/target/cucumber-report/example.html`
> "With each job build the report file will be replaced"

![Lippia Extent Report](/docs/img/reporteExtent.png)
