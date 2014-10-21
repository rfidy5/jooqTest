jooqTest
========

Ce mini-projet permet juste de tester de tester Jooq et ainsi faire la correspondance entre un DSL interne et externe. 
Dans notre cas,  SQL est utilisé comme DSL externe et Java , à travers Jooq comme DSL interne.
Queques exemples de correspondances qu'on peut trouver dans le code:

SQL:

INSERT INTO DEPARTEMENT (DEP_NUM,DEP_NAME) VALUES (35,'Ile-et-Vilaine');

UPDATE PERSON SET PERSO_LASTNAME = 'lastname_35' WHERE PERSO_ID_DEP=1;

SELECT * FROM PERSON WHERE PERSO_ID_DEP=1;




Java/Jooq:

create.insertInto(DEPARTEMENT, DEPARTEMENT.DEP_NUM,DEPARTEMENT.DEP_NAME)
        			.values(35,"Ile-et-Vilaine");
        			
create.select().from(PERSON)
        		.where(PERSON.PERSO_ID_DEP.equal(1))
        		.fetch();
        		
create.update(PERSON)
        	.set(PERSON.PERSO_LASTNAME,"lastname_35")
        	.where(PERSON.PERSO_ID_DEP.equal(1));


