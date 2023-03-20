# Kick start Apache  Camel

Suppose you need to read files from one directory (data/inbox), process them in some way, and write the result to another directory (data/outbox).
 
 Using pure java, as shown in Filecopy:
 It results in 34 lines of code. You have to use low-level file APIs and ensure that resources get
closed properly, a task that can easily go wrong. Also, if you wanted to poll the data/
inbox directory for new files, you’d need to set up a timer and also keep track of
which files you’ve already copied. This simple example is getting more complex. 




Routing files from one folder to another using Apache Camel.

FileCopyCamel make use of camel to integrate and thus the complexity is reduced.
