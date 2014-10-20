/**
 * This class is generated by jOOQ
 */
package fr.istic.idm.dslJook.test.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Person extends org.jooq.impl.TableImpl<fr.istic.idm.dslJook.test.generated.tables.records.PersonRecord> {

	private static final long serialVersionUID = -1152978983;

	/**
	 * The singleton instance of <code>jookTest_bdd.person</code>
	 */
	public static final fr.istic.idm.dslJook.test.generated.tables.Person PERSON = new fr.istic.idm.dslJook.test.generated.tables.Person();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<fr.istic.idm.dslJook.test.generated.tables.records.PersonRecord> getRecordType() {
		return fr.istic.idm.dslJook.test.generated.tables.records.PersonRecord.class;
	}

	/**
	 * The column <code>jookTest_bdd.person.perso_id</code>.
	 */
	public final org.jooq.TableField<fr.istic.idm.dslJook.test.generated.tables.records.PersonRecord, java.lang.Integer> PERSO_ID = createField("perso_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>jookTest_bdd.person.perso_firstName</code>.
	 */
	public final org.jooq.TableField<fr.istic.idm.dslJook.test.generated.tables.records.PersonRecord, java.lang.String> PERSO_FIRSTNAME = createField("perso_firstName", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>jookTest_bdd.person.perso_lastName</code>.
	 */
	public final org.jooq.TableField<fr.istic.idm.dslJook.test.generated.tables.records.PersonRecord, java.lang.String> PERSO_LASTNAME = createField("perso_lastName", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>jookTest_bdd.person.perso_id_dep</code>.
	 */
	public final org.jooq.TableField<fr.istic.idm.dslJook.test.generated.tables.records.PersonRecord, java.lang.Integer> PERSO_ID_DEP = createField("perso_id_dep", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>jookTest_bdd.person</code> table reference
	 */
	public Person() {
		this("person", null);
	}

	/**
	 * Create an aliased <code>jookTest_bdd.person</code> table reference
	 */
	public Person(java.lang.String alias) {
		this(alias, fr.istic.idm.dslJook.test.generated.tables.Person.PERSON);
	}

	private Person(java.lang.String alias, org.jooq.Table<fr.istic.idm.dslJook.test.generated.tables.records.PersonRecord> aliased) {
		this(alias, aliased, null);
	}

	private Person(java.lang.String alias, org.jooq.Table<fr.istic.idm.dslJook.test.generated.tables.records.PersonRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, fr.istic.idm.dslJook.test.generated.JooktestBdd.JOOKTEST_BDD, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<fr.istic.idm.dslJook.test.generated.tables.records.PersonRecord, java.lang.Integer> getIdentity() {
		return fr.istic.idm.dslJook.test.generated.Keys.IDENTITY_PERSON;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<fr.istic.idm.dslJook.test.generated.tables.records.PersonRecord> getPrimaryKey() {
		return fr.istic.idm.dslJook.test.generated.Keys.KEY_PERSON_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<fr.istic.idm.dslJook.test.generated.tables.records.PersonRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<fr.istic.idm.dslJook.test.generated.tables.records.PersonRecord>>asList(fr.istic.idm.dslJook.test.generated.Keys.KEY_PERSON_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public fr.istic.idm.dslJook.test.generated.tables.Person as(java.lang.String alias) {
		return new fr.istic.idm.dslJook.test.generated.tables.Person(alias, this);
	}

	/**
	 * Rename this table
	 */
	public fr.istic.idm.dslJook.test.generated.tables.Person rename(java.lang.String name) {
		return new fr.istic.idm.dslJook.test.generated.tables.Person(name, null);
	}
}