# Running the Project

 ### 1. Install a JDK (Version 8 or 11)
You will need to make sure that the Java virtual machine is downloaded on your machine as Scala comes pre-packaged with it. If it isn't already installed you can download a JDK that is right for your machine [here](https://www.oracle.com/java/technologies/downloads/). You can verify that this is installed by running `java -version` and you should get an output giving you your version of Java. 

*Important:* Your version of Java should be `1.8.X` or `11.X` or greater as anything prior to these version doesn't come with Scala

### 2. Install sbt
The Scala Build Tool is the command line tool used for managing projects as well as compiling and running them for you. This can be downloaded [here](https://www.scala-sbt.org/download.html). 

After install you can verify that it was properly installed by running `sbt` in a terminal/command prompt.

### 3. Compiling the project
If this is the first time pulling the code then you'll want to compile the project. You can do this by navigating to CS372_ScalaCode and running `sbt compile`. Once the project has been compiled you don't need to re-compile it unless you make any changes to the files

### 4. Running the project
Once the project has been compiled you can then run it with the command `sbt run`. This will take a few moments as sbt gets the project running. Once it finished though you should get a list of options similar to below:
```
Multiple main classes detected. Select one to run:
 [1] matching.ClassMatching
 [2] sorting.Sorting
 
Enter number: 
```
There are two main programs in this code. 
1. The first one is an example of Pattern-Matching for classes. This one will output the same thing every time, so to make changes you will want to change the instance type of the 'animal' variable declared in main in order to see the different effects it has
2. The other one is a class made for sorting a list of floats using MergeSort. When it runs it will generate an array of 5 random floats, then sort them in ascending order using MergeSort.

Just type which program you want to run and sbt will execute it for you
