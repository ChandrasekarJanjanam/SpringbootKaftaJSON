# SpringbootKaftaJSON
This project demonstartes how configure, produce and consume JSON payload using Apache Kafka and Springboot.

Prerequisite: 
please follow below instructions before executing this project

Kafka Installation
------------------
1. Download from http://kafka.apache.org/downloads and the 
2. Change congif file from downloaded path. For me its C:\chandra\Bigdata\kafka_2.12-1.0.0\config\
3. Find zookeeper.properties file & edit dataDir=/tmp/zookeeper to dataDir=C:\chandra\softwares\zookeeper-3.4.11\data
4. Find server.properties file & edit zookeeper.connect to zookeeper.connect=0.0.0.0:2181. Here Zookeeper acts as Kafka cluster
5. Start Zookeeper using below command
    C:\chandra\softwares\kafka_2.12-1.0.0\bin\windows\zookeeper-server-start.bat ../../config/zookeeper.properties
6. Start Kafka server using below command
    C:\chandra\softwares\kafka_2.12-1.0.0\bin\windows\kafka-server-start.bat ../../config/server.properties
7. Now time to run springboot program
   mvn spring-boot:run
   
Console Output
--------------
.....
.....
sending data={ 'name': sekar, 'age': 23}
###### kafkaTopic send ########jsa-kafka-topic
......
......
###### kafkaTopic receive ########jsa-kafka-topic
######### received content = { 'name': sekar, 'age': 23}
