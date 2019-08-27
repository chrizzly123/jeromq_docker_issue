# JeroMQ Docker Issue

Project to reproduce JeroMQ Exception in combination with docker.

## Prerequisites
setup java, maven, docker

## Steps to reproduce:
1. maven package: `mvn clean package`
2. build and run docker container: `docker-compose -f server.yml up -d`
3. run Client main method from IDE or with command line: `mvn exec:java -Dexec.mainClass="dockerissue.Client"`

This should throw an Exception.

## Stacktrace
```` 
java.lang.NullPointerException
	at zmq.pipe.Pipe.isDelimiter(Pipe.java:504)
	at zmq.pipe.Pipe.checkRead(Pipe.java:193)
	at zmq.io.SessionBase.readActivated(SessionBase.java:255)
	at zmq.pipe.Pipe.processActivateRead(Pipe.java:312)
	at zmq.ZObject.processCommand(ZObject.java:51)
	at zmq.Command.process(Command.java:75)
	at zmq.io.IOThread.inEvent(IOThread.java:80)
	at zmq.poll.Poller.run(Poller.java:273)
	at java.base/java.lang.Thread.run(Thread.java:830)
````
