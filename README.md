# GEDOPLAN Ein eigener Maven Archtype

* Maven
* Archtype
* Quarkus

Blog: https://gedoplan.de/javablog/

## Setup:

Archetype kompilieren:
> mvn install

(in beliebigem Ordner) Projekt generieren
> mvn archetype:generate \  
-DarchetypeGroupId=de.gedoplan \  
-DarchetypeArtifactId=ArchetypeDemo \  
-DjdbcUser=su \  
-Dmessages="Hallo,Hier ist die Archetype-Demo,Viel Spass"

Im Projekt-Ordner
> mvn quarkus:dev

Aufrufen:
http://localhost:8080/hello



(by) GEDOPLAN, Dominik Mathmann
