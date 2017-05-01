# Coherence-sql
Introduces basic support for SQL queries into Oracle Coherence data grid. Offers much more greater features than CoQL 
(Coherence Query Language) and remote Java 8 Stream API combined in once.

# Key features
1. Supports joins betwen key associated caches, e.g. :
```xml
select * from employee left join sallary on sallary.key = employee.key
```
2. Takes adventage of POF annotations resulting in low heap usage processing free of reflection based objects extraction

# Comparision with Presto

# Comparision with competetive data grids

# First steps

## Prerequisites
Given the fact that Oracle Coherence is not available in public maven repositories, 
we need to take care of it on our own. Skip this chapter if the following artifact is available in your local or intranet Nexus:
```xml
<dependency>
  <groupId>com.oracle.coherence</groupId>
  <artifactId>coherence</artifactId>
  <version>12.2.1</version>
</dependency>
```
In order to achive your very best copy of coherence.jar, please follow these steps:
1. Download the latest package from http://download.oracle.com/otn/nt/middleware/12c/12212/fmw_12.2.1.2.0_coherence_Disk1_1of1.zip. You will need an Oracle account to proceed. Unpack the archive afterwards.
2. Run the following command. Admistrative priviledges are required under Windows OS.
```
java -jar LOCATION_OF_THE_INSTALLER/fmw_12.2.1.2.0_coherence.jar
```
3. Proceed with the installation without bothering about the details.
4. Run the following command to install Coherence artifact into your local Maven repostitory:
```
mvn install:install-file -Dfile=LOCATION_OF_ORACLE_HOME\coherence\lib\coherence.jar -DgroupId=com.oracle.coherence -DartifactId=coherence -Dversion=12.2.1 -Dpackaging=jar
```
