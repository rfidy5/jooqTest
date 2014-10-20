package fr.istic.idm.dslJook.main;

import java.sql.Connection;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import static fr.istic.idm.dslJook.test.generated.Tables.*;

/**
 * Classe principale permettant de tester Jooq
 * @author fidy
 *
 */
public class App {
    public static void main( String[] args ){
        
        Connection conn=Connectiondb.getConnection();
        
        DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
        
        //insert departements
        create.insertInto(DEPARTEMENT, DEPARTEMENT.DEP_NUM,DEPARTEMENT.DEP_NAME)
        			.values(35,"Ile-et-Vilaine")
        			.values(56,"Morbihan")
        			.values(29,"Finistere")
        			.values(22,"Côtes-d'Armor")
        			.execute();
        
        //insert persons
        create.insertInto(PERSON, PERSON.PERSO_FIRSTNAME,PERSON.PERSO_LASTNAME,PERSON.PERSO_ID_DEP)
        			.values("firstname1","lastname1",1)
        			.values("firstname2","lastname2",1)
        			.values("firstname3","lastname3",2)
        			.execute();
        
        
        //select all departements
        Result<Record> resultDep = create.select().from(DEPARTEMENT).fetch();
        
        //show departements
        showResultDepartements(resultDep);
        
        //update person
        create.update(PERSON)
        	.set(PERSON.PERSO_LASTNAME,"lastname_35")
        	.where(PERSON.PERSO_ID_DEP.equal(1))
        	.execute();
        

        //select person where departement==1
        Result<Record> resultPers = create.select().from(PERSON)
        		.where(PERSON.PERSO_ID_DEP.equal(1))
        		.fetch();
        
        //showResults person
        showResultPerson(resultPers);
       
       Connectiondb.closeConnection();
    }
    
    /**
     * affiche la liste des departements
     * @param result Result<Record> containing select query Person Results 
     */
    public static void showResultDepartements( Result<Record> result){
    	 for (Record r : result) {
//             Integer id = r.getValue(DEPARTEMENT.DEP_ID);
             Integer depNum = r.getValue(DEPARTEMENT.DEP_NUM);
             String depName = r.getValue(DEPARTEMENT.DEP_NAME);

             System.out.println(depNum + " - " + depName);
         }
    }
    
    /**
     * affiche la liste des persons
     * @param result Result<Record> containing select query Departements Results 
     */
    public static void showResultPerson( Result<Record> result){
   	 for (Record r : result) {
//            Integer id = r.getValue(PERSON.PERSO_ID);
            String firstName = r.getValue(PERSON.PERSO_FIRSTNAME);
            String lastName = r.getValue(PERSON.PERSO_LASTNAME);

            System.out.println("Name : " + firstName + " " + lastName);
        }
   }
}
