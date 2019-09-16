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

```
Starting lippia-mixed-web-mobile-sample-project_selenium_hub_1 ... done
Starting lippia-mixed-web-mobile-sample-project_chrome_1         ... done
Starting lippia-mixed-web-mobile-sample-project_samsung_s7_9.0_1 ... done
Attaching to lippia-mixed-web-mobile-sample-project_selenium_hub_1, lippia-mixed-web-mobile-sample-project_samsung_s7_9.0_1, lippia-mixed-web-mobile-sample-project_chrome_1
selenium_hub_1    | starting selenium hub with configuration:
selenium_hub_1    | {
selenium_hub_1    |   "host": "0.0.0.0",
selenium_hub_1    |   "port": 4444,
selenium_hub_1    |   "role": "hub",
selenium_hub_1    |   "maxSession": 5,
selenium_hub_1    |   "newSessionWaitTimeout": -1,
selenium_hub_1    |   "capabilityMatcher": "org.openqa.grid.internal.utils.DefaultCapabilityMatcher",
selenium_hub_1    |   "throwOnCapabilityNotPresent": true,
selenium_hub_1    |   "jettyMaxThreads": -1,
selenium_hub_1    |   "cleanUpCycle": 5000,
selenium_hub_1    |   "browserTimeout": 0,
selenium_hub_1    |   "timeout": 30,
selenium_hub_1    |   "debug": false
selenium_hub_1    | }
samsung_s7_9.0_1  | 2019-09-11 11:29:42,852 CRIT Supervisor running as root (no user in config file)
samsung_s7_9.0_1  | 2019-09-11 11:29:42,877 INFO supervisord started with pid 6
selenium_hub_1    | 18:29:42.888 INFO [GridLauncherV3.launch] - Selenium build info: version: '3.14.0', revision: 'aacccce0'
selenium_hub_1    | 18:29:42.921 INFO [GridLauncherV3$2.launch] - Launching Selenium Grid hub on port 4444
chrome_1          | --LOG 20:29:43:273177304 Stopping supervisord to support docker restart...
samsung_s7_9.0_1  | 2019-09-11 11:29:43,879 INFO spawned: 'xvfb' with pid 22
samsung_s7_9.0_1  | 2019-09-11 11:29:43,917 INFO spawned: 'port-forward' with pid 24
samsung_s7_9.0_1  | 2019-09-11 11:29:44,030 INFO spawned: 'novnc' with pid 25
samsung_s7_9.0_1  | 2019-09-11 11:29:44,035 INFO spawned: 'openbox' with pid 26
samsung_s7_9.0_1  | 2019-09-11 11:29:44,041 INFO spawned: 'x11vnc' with pid 27
samsung_s7_9.0_1  | 2019-09-11 11:29:44,050 INFO spawned: 'android-screen-mirror' with pid 28
samsung_s7_9.0_1  | 2019-09-11 11:29:44,057 INFO spawned: 'docker-appium' with pid 29
samsung_s7_9.0_1  | 2019-09-11 11:29:44,072 INFO spawned: 'auto-recording' with pid 31
samsung_s7_9.0_1  | 2019-09-11 11:29:44,077 INFO spawned: 'adb-utils' with pid 32
selenium_hub_1    | 2019-09-11 18:29:44.106:INFO::main: Logging initialized @6862ms to org.seleniumhq.jetty9.util.log.StdErrLog
samsung_s7_9.0_1  | 2019-09-11 11:29:44,664 INFO success: android-screen-mirror entered RUNNING state, process has stayed up for > than 0 seconds (startsecs)
samsung_s7_9.0_1  | 2019-09-11 11:29:44,665 INFO exited: android-screen-mirror (exit status 0; expected)
samsung_s7_9.0_1  | 2019-09-11 11:29:45,401 INFO success: xvfb entered RUNNING state, process has stayed up for > than 1 seconds (startsecs)
samsung_s7_9.0_1  | 2019-09-11 11:29:45,402 INFO success: port-forward entered RUNNING state, process has stayed up for > than 1 seconds (startsecs)
samsung_s7_9.0_1  | 2019-09-11 11:29:45,402 INFO success: novnc entered RUNNING state, process has stayed up for > than 1 seconds (startsecs)
samsung_s7_9.0_1  | 2019-09-11 11:29:45,402 INFO success: openbox entered RUNNING state, process has stayed up for > than 1 seconds (startsecs)
samsung_s7_9.0_1  | 2019-09-11 11:29:45,402 INFO success: x11vnc entered RUNNING state, process has stayed up for > than 1 seconds (startsecs)
samsung_s7_9.0_1  | 2019-09-11 11:29:45,402 INFO success: docker-appium entered RUNNING state, process has stayed up for > than 1 seconds (startsecs)
samsung_s7_9.0_1  | 2019-09-11 11:29:45,402 INFO success: auto-recording entered RUNNING state, process has stayed up for > than 1 seconds (startsecs)
samsung_s7_9.0_1  | 2019-09-11 11:29:45,402 INFO success: adb-utils entered RUNNING state, process has stayed up for > than 1 seconds (startsecs)
samsung_s7_9.0_1  | 2019-09-11 11:29:45,403 INFO exited: xvfb (exit status 1; not expected)
samsung_s7_9.0_1  | 2019-09-11 11:29:45,407 INFO spawned: 'xvfb' with pid 67
samsung_s7_9.0_1  | 2019-09-11 11:29:46,834 INFO success: xvfb entered RUNNING state, process has stayed up for > than 1 seconds (startsecs)
selenium_hub_1    | 18:29:47.235 INFO [Hub.start] - Selenium Grid hub is up and running
selenium_hub_1    | 18:29:47.238 INFO [Hub.start] - Nodes should register to http://172.26.0.2:4444/grid/register/
selenium_hub_1    | 18:29:47.239 INFO [Hub.start] - Clients should connect to http://172.26.0.2:4444/wd/hub
chrome_1          | -- INFO: Docker Img. Version: 3.141.59-317
chrome_1          | -- INFO: Chrome..... Version: 76.0.3809.132
chrome_1          | -- INFO: Firefox.... Version: 69.0
chrome_1          | -- INFO: Using Selenium.....: 3.141.59
chrome_1          | -- WARN: wait-xvfb.sh failed! for DISPLAY=:78
chrome_1          | -- WARN: DISPLAY=:78 is taken, searching for another...
chrome_1          | -- INFO: Possible free DISPLAY=:58
```

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

![dockerAndroidNovnc](/docs/img/dockeAndroidNovnc.png)

***

### Run from command line
Now you be able to consume the solution and start running tests.

To run tests over "WEB" context you need to execute the following command
```
 mvn clean test -PGridSecuencialWeb
```
> You can verify the behavior by accessing http://localhost:6081

To run tests over "MOBILE" context you must be execute
```
mvn clean test -PGridSecuencialMobile
```
> You can verify the behavior by accessing http://localhost:6080

***

### Reports
you can view this report by accesing to:

you can view reports listing by accesing to:

- `http://localhost:8081`

![Lippia Extent Report](/docs/img/reporteExtent.png)
