### Spring Boot Demo with Neo4j

Version - 1 - Primer - Saving Data and Establishing Relationship.
Version - 2 - Beginner - CRUD.
Version - 3 - Advanced Complex Relations and directed graphs impl.

#### Neo4J Introduction
https://neo4j.com/

Neo4j stores and manages data in its more natural, connected state, maintaining data relationships that deliver lightning-fast queries, deeper context for analytics, and a pain-free modifiable data model.
Neo4j provides its own implementation of graph theory concepts. Let’s take an in-depth look at the Labeled Property Graph Model in the Neo4j database. It has the following components:

Nodes (equivalent to vertices in graph theory). These are the main data elements that are interconnected through relationships. A node can have one or more labels (that describe its role) and properties (i.e. attributes).
Relationships (equivalent to edges in graph theory). A relationship connects two nodes that, in turn, can have multiple relationships. Relationships can have one or more properties.
Labels. These are used to group nodes, and each node can be assigned multiple labels. Labels are indexed to speed up finding nodes in a graph.
Properties. These are attributes of both nodes and relationships. Neo4j allows for storing data as key-value pairs, which means properties can have any value (string, number, or boolean).

#### Neo4J Download/Installation
Depending on your OS. Choose specific Neo4j Desktop.
This actually contains all the stuff you need.
`https://neo4j.com/download/?ref=get-started-dropdown-cta`
Once installed and neo4j is started.
You can access it on `http://localhost:7474/browser/`

#### Use Cases
Master Data Management.
Identity and Access Management.
Knowledge Graphs.
Social Networks.
Network and Database Infra Monitoring.

#### Design
Create Person and corresponding relations.


#### Conclusion
Access http://localhost:7474/browser/

#### Useful Links
https://spring.io/guides/gs/accessing-data-neo4j/
https://www.baeldung.com/spring-data-neo4j-intro
https://medium.com/@nethmihettiarachchi484/using-neo4j-graph-database-in-spring-boot-application-436b05a96364
https://github.com/dr5hn/countries-states-cities-database/blob/master/csv/countries.csv
https://github.com/dr5hn/countries-states-cities-database/tree/master/csv
https://gist.githubusercontent.com/jimmycrequer/7aa867900d0cf0b9588d4354f09cb286/raw/countries.json


    Other Use case : 
          1. Employees Staying in City. City Belongs to State. State in Country.
             Establish the Country, State, City, Employee/Person nodes and 
             corresponding relationship.
          2. Person nodes. Establish relationships like Married to, Daughter of, Son of etc. 
