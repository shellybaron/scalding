A simple scalding word count job. includes a pom.xml with all the needed dependencies to work with hadoop locally

*Execution params*:
	
Main class:	
com.twitter.scalding.Tool

VM options:
-Xmx1024m

Program arguments:
WordCountScalding --hdfs --input aliceInWonderland.txt --output output.txt

The pom.xml was taken from the book Programming MapReduce with Scalding (By: Antonios Chalkiopoulos)
http://techbus.safaribooksonline.com/book/networking/9781783287017

