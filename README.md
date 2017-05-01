# coherence-sql
Introduces basic support for SQL queries into Oracle Coherence data grid. Offers much more greater features than CoQL 
(Coherence Query Language) or remote Java 8 Stream API.

## First steps

### Prerequisites
Given the fact that Oracle Coherence is not listed in any of official & available maven repositories, 
we need to take care of it on our own. Skip this chapter if the following artifact is available in your local or intranet Nexus:
```xml
<dependency>
  <groupId>com.oracle.coherence</groupId>
  <artifactId>coherence</artifactId>
  <version>12.2.1.2.0</version>
</dependency>
```
Otherwise:
1. Download the latest package from http://www.oracle.com/technetwork/middleware/coherence/downloads/index.html. 
Choose the "Quick Install" option. You will need an Oracle account to proceed.
