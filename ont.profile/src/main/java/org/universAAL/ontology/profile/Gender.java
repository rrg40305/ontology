package org.universAAL.ontology.profile;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.ProfileOntology;

public class Gender extends ManagedIndividual {

    public static final String MY_URI = ProfileOntology.NAMESPACE+"Gender";

    public static final int MALE = 0;
    public static final int FEMALE = 1;
    public static final int PARTLY_FEMALE_MALE = 2;
    public static final int DO_NOT_SPECIFY = 3;

    private int order;

    private static final String[] names = { "male", "female",
	    "partly_female_male", "do_not_specify" };

    public static final Gender male = new Gender(MALE);
    public static final Gender female = new Gender(FEMALE);
    public static final Gender partly_female_male = new Gender(
	    PARTLY_FEMALE_MALE);
    public static final Gender do_not_specify = new Gender(DO_NOT_SPECIFY);

    public static ManagedIndividual[] getEnumerationMembers() {
	return new ManagedIndividual[] { male, female, partly_female_male,
		do_not_specify };
    }

    private Gender(int order) {
	super(ProfileOntology.NAMESPACE + names[order]);
	this.order = order;
    }

    public Gender() {

    }

    public int getPropSerializationType(String propURI) {
	return PROP_SERIALIZATION_OPTIONAL;
    }

    public boolean isWellFormed() {
	return true;
    }

    public void setProperty(String propURI, Object o) {
	// do nothing
    }

    public String getClassURI() {
	return MY_URI;
    }

    public static Gender getByOrder(int order) {
	switch (order) {
	case MALE:
	    return male;
	case FEMALE:
	    return female;
	case PARTLY_FEMALE_MALE:
	    return partly_female_male;
	case DO_NOT_SPECIFY:
	    return do_not_specify;
	default:
	    return null;
	}
    }

    public static final Gender valueOf(String name) {
	if (name == null)
	    return null;
	if (name.startsWith(ProfileOntology.NAMESPACE))
	    name = name.substring(ProfileOntology.NAMESPACE.length());
	for (int i = MALE; i <= DO_NOT_SPECIFY; i++)
	    if (names[i].equals(name))
		return getByOrder(i);
	return null;
    }

    public String name() {
	return names[order];
    }

    public int ord() {
	return order;
    }
}