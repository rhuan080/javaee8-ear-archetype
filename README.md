# javaee8-ear-archetype
Archetype to create a java EE 8 project as a EAR.

## Install

To install the archetype on your local repository, run the following command:

    mvn install
  
## Creating a Project

To create a project, go to a folder where you will have the project and run the following command:

    mvn archetype:generate -DarchetypeGroupId=net.rhuanrocha -DarchetypeArtifactId=javaee8-ear-archetype -DarchetypeVersion=1.0.0 -DgroupId=<new project Group Id> -DartifactId=<new project artifact Id>

