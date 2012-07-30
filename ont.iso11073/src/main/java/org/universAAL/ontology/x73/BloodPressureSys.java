package org.universAAL.ontology.x73;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.ontology.X73Ontology;


public class BloodPressureSys extends MDSAttribute {
  public static final String MY_URI = X73Ontology.NAMESPACE
    + "BloodPressureSys";


  public BloodPressureSys () {
    super();
  }
  
  public BloodPressureSys (String uri) {
    super(uri);
  }

  public String getClassURI() {
    return MY_URI;
  }

  public int getPropSerializationType(String propURI) {
	return super.getPropSerializationType(propURI);
  }

  public boolean isWellFormed() {
	return true ;
  }
}
