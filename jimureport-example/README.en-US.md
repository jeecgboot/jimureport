# jimureport-example

JimuReport integration example code.

```
Using MySQL 5.7 database
```



Requirements
-----------------------------------

- Requires JDK 17+ (This project uses Spring Boot 4.1 architecture)
- Requires MySQL 5.7+ - Manually execute db/jimureport.mysql5.7.create.sql, which will automatically create the jimureport database
- Project configuration: src/main/resources/application-dev.yml
- Redis (optional)

Redis Integration (Optional)
-----------------------------------
If you want to use Redis for permission integration, please uncomment the following dependencies in pom.xml:
```
<!-- Sa-Token integration with Redis (using jackson serialization) -->
<dependency>
   <groupId>cn.dev33</groupId>
   <artifactId>sa-token-redis-jackson</artifactId>
   <version>1.44.0</version>
</dependency>
<!-- Provide Redis connection pool -->
<dependency>
   <groupId>org.apache.commons</groupId>
   <artifactId>commons-pool2</artifactId>
</dependency>
```


Usage Steps
-----------------------------------

-  Step 1: Execute initialization script (automatically creates jimureport database)

           db/jimureport.mysql5.7.create.sql
           
-  Step 2: Start the project (right-click to run)

           com.jeecg.JimuReportApplication
           
-  Step 3: Access the project (Default username: admin, Password: 123456)

      Report Dashboard: http://localhost:8085/jmreport/list
      
      Visual Dashboard: http://localhost:8085/drag/list







Docker Image Build
-----------------------------------

-  Step 1: Download the project

         git clone https://gitee.com/jeecg/JimuReport.git

-  Step 2: Navigate to the jimureport-example root directory

         cd JimuReport/jimureport-example
	
-  Step 3: Execute Maven package command

         mvn clean package
		 
-  Step 4: Execute command to build the image

         docker-compose up -d
		 
-  Step 5: Access the reports (Default username: admin, Password: 123456)

      Report Dashboard: http://localhost:8085/jmreport/list
      
      Visual Dashboard: http://localhost:8085/drag/list



> If you are using Mac M-series chips:

**1. Change the `jimureport-mysql` base image to ARM platform:**

Modify the first line of `JimuReport/db/Dockerfile` to: `FROM arm64v8/mysql:8`

**2. Change the `jimureport` base image to ARM platform**
* Build a Docker image with JDK 8 based on ARM architecture.
* Modify the first line of `JimuReport/Dockerfile` to: `FROM <your-built-image-name>`

