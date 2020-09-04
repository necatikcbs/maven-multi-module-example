# Maven Multi-Module Example

It's an example that has Parent, Library and Child(Service)

- usage:
	> cd parent
	
	>Open pom.xml file, comment out \<modules\> tag.

		<!-- \<modules\>

			<module>../library</module>

			<module>../service</module>

		</modules> -->
	>Run **mvn clean install**

	>You can see **Parent-0.0.1-SNAPSHOT.pom** artifact inside local .m2 repository

	>Open pom.xml file again, release \<modules\> tag.

		<modules>

			<module>../library</module>

			<module>../service</module>

		</modules>

	>Run **mvn clean install**.

The result should be like below;

  
```
[INFO] Reactor Summary for Parent Project 0.0.1-SNAPSHOT:

[INFO]

[INFO] Parent Project ..................................... SUCCESS [ 0.156 s]

[INFO] Service Library Project ............................ SUCCESS [ 0.928 s]

[INFO] Service Parent Project ............................. SUCCESS [ 0.006 s]

[INFO] Service War Project ................................ SUCCESS [ 0.594 s]

[INFO] Service Ear Project ................................ SUCCESS [ 0.279 s]

[INFO] ------------------------------------------------------------------------

[INFO] BUILD SUCCESS
```