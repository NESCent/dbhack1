

package org.cdao.jasper;

import com.hp.hpl.jena.rdf.model.*;

/**
 * Interface for TU ontology class<br>
 * Use the org.cdao.CDAOFactory to create instances of this interface.
 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#TU)</p>
 * <br>
 * <br>
 * Dublin Core Standard Properties <br>
 * 	description : A unit of analysis that may be tied to a node in a tree and to a row in a character matrix.  It subsumes the traditional concepts of 'OTU' and 'HTU'. <br>
 * <br>
 */
public interface TU extends com.ibm.adtech.jastor.Thing {
	
	/**
	 * The rdf:type for this ontology class
     */
	public static final Resource TYPE = ResourceFactory.createResource("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#TU");
	

	/**
	 * The Jena Property for has__External__Reference 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_External_Reference)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__External__ReferenceProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_External_Reference");


	/**
	 * The Jena Property for has__Float__Value 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Float_Value)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__Float__ValueProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Float_Value");


	/**
	 * The Jena Property for part__of 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#part_of)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property part__ofProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#part_of");


	/**
	 * The Jena Property for has__Uncertainty__Factor 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Uncertainty_Factor)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__Uncertainty__FactorProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Uncertainty_Factor");


	/**
	 * The Jena Property for exclude 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#exclude)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property excludeProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#exclude");


	/**
	 * The Jena Property for has__Int__Value 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Int_Value)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__Int__ValueProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Int_Value");


	/**
	 * The Jena Property for has__Precision 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Precision)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__PrecisionProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Precision");


	/**
	 * The Jena Property for connects__to 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#connects_to)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property connects__toProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#connects_to");


	/**
	 * The Jena Property for belongs__to 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#belongs_to)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : Generic property that links a concept to another concept it is a constituent of. The property is a synonym of part_of. <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property belongs__toProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#belongs_to");


	/**
	 * The Jena Property for represented__by__Node 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#represented_by_Node)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : This property relates a TU to a node that represents it in a network.^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property represented__by__NodeProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#represented_by_Node");


	/**
	 * The Jena Property for exclude__Subtree 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#exclude_Subtree)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property exclude__SubtreeProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#exclude_Subtree");


	/**
	 * The Jena Property for has 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : Generic 'has' property. <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property hasProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has");


	/**
	 * The Jena Property for has__Support__Value 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Support_Value)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__Support__ValueProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Support_Value");


	/**
	 * The Jena Property for has__Annotation 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Annotation)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__AnnotationProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Annotation");


	/**
	 * The Jena Property for precedes 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#precedes)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property precedesProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#precedes");


	/**
	 * The Jena Property for has__Type 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Type)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__TypeProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Type");


	/**
	 * The Jena Property for has__Value 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Value)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__ValueProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Value");


	/**
	 * The Jena Property for exclude__Node 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#exclude_Node)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property exclude__NodeProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#exclude_Node");


	/**
	 * The Jena Property for has__Standard__Datum 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Standard_Datum)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__Standard__DatumProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Standard_Datum");


	/**
	 * The Jena Property for has__Amino__Acid__Datum 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Amino_Acid_Datum)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : This property relates an amino acid character (a column in a protein sequence alignment) to a state datum for the character (an individual cell in the alignment column).^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__Amino__Acid__DatumProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Amino_Acid_Datum");


	/**
	 * The Jena Property for belongs__to__Character__State__Data__Matrix 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#belongs_to_Character_State_Data_Matrix)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property belongs__to__Character__State__Data__MatrixProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#belongs_to_Character_State_Data_Matrix");


	/**
	 * The Jena Property for has__Molecular__Datum 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Molecular_Datum)</p>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__Molecular__DatumProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Molecular_Datum");


	/**
	 * The Jena Property for has__Compound__Datum 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Compound_Datum)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : This property relates a compound character (a character with some states that are subdividable) to a state datum for the character.^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__Compound__DatumProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Compound_Datum");


	/**
	 * The Jena Property for has__Datum 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Datum)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : This property relates a character to a state datum for the character.^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__DatumProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Datum");


	/**
	 * The Jena Property for has__Nucleotide__Datum 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Nucleotide_Datum)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : This property relates a nucleotide character (a column in a nucleotide alignment) to a state datum for the character (an individual cell in the alignment column).^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__Nucleotide__DatumProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Nucleotide_Datum");


	/**
	 * The Jena Property for has__Continuous__Datum 
	 * <p>(URI: http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Continuous_Datum)</p>
	 * <br>
	 * Dublin Core Standard Properties <br>
	 * 	description : This property relates a continuous character to a state datum for the character.^^http://www.w3.org/2001/XMLSchema#string <br>
	 * <br>  
	 */
	public static com.hp.hpl.jena.rdf.model.Property has__Continuous__DatumProperty = ResourceFactory.createProperty("http://www.cs.nmsu.edu/~epontell/CURRENT.owl#has_Continuous_Datum");




	/**
	 * Iterates through the 'has__External__Reference' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.hp.hpl.jena.rdf.model.Literal}
	 * @see			#has__External__ReferenceProperty
	 */
	public java.util.Iterator getHas__External__Reference() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'has__External__Reference' property value
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to add
	 * @see			#has__External__ReferenceProperty
	 */
	public void addHas__External__Reference(com.hp.hpl.jena.rdf.model.Literal has__External__Reference) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'has__External__Reference' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link com.hp.hpl.jena.rdf.model.Literal}, the value to remove
	 * @see			#has__External__ReferenceProperty
	 */
	public void removeHas__External__Reference(com.hp.hpl.jena.rdf.model.Literal has__External__Reference) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'has__Float__Value' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Float}
	 * @see			#has__Float__ValueProperty
	 */
	public java.util.Iterator getHas__Float__Value() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'has__Float__Value' property value
	 * @param		{@link java.lang.Float}, the value to add
	 * @see			#has__Float__ValueProperty
	 */
	public void addHas__Float__Value(java.lang.Float has__Float__Value) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'has__Float__Value' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Float}, the value to remove
	 * @see			#has__Float__ValueProperty
	 */
	public void removeHas__Float__Value(java.lang.Float has__Float__Value) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'part__of' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#part__ofProperty
	 */
	public java.util.Iterator getPart__of() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'part__of' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#part__ofProperty
	 */
	public void addPart__of(com.ibm.adtech.jastor.Thing part__of) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'part__of' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#part__ofProperty
	 */
	public com.ibm.adtech.jastor.Thing addPart__of() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#part__ofProperty
	 */
	public com.ibm.adtech.jastor.Thing addPart__of(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'part__of' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#part__ofProperty
	 */
	public void removePart__of(com.ibm.adtech.jastor.Thing part__of) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'has__Uncertainty__Factor' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Float}
	 * @see			#has__Uncertainty__FactorProperty
	 */
	public java.util.Iterator getHas__Uncertainty__Factor() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'has__Uncertainty__Factor' property value
	 * @param		{@link java.lang.Float}, the value to add
	 * @see			#has__Uncertainty__FactorProperty
	 */
	public void addHas__Uncertainty__Factor(java.lang.Float has__Uncertainty__Factor) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'has__Uncertainty__Factor' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Float}, the value to remove
	 * @see			#has__Uncertainty__FactorProperty
	 */
	public void removeHas__Uncertainty__Factor(java.lang.Float has__Uncertainty__Factor) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'exclude' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#excludeProperty
	 */
	public java.util.Iterator getExclude() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'exclude' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#excludeProperty
	 */
	public void addExclude(com.ibm.adtech.jastor.Thing exclude) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'exclude' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#excludeProperty
	 */
	public com.ibm.adtech.jastor.Thing addExclude() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#excludeProperty
	 */
	public com.ibm.adtech.jastor.Thing addExclude(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'exclude' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#excludeProperty
	 */
	public void removeExclude(com.ibm.adtech.jastor.Thing exclude) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'has__Int__Value' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Integer}
	 * @see			#has__Int__ValueProperty
	 */
	public java.util.Iterator getHas__Int__Value() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'has__Int__Value' property value
	 * @param		{@link java.lang.Integer}, the value to add
	 * @see			#has__Int__ValueProperty
	 */
	public void addHas__Int__Value(java.lang.Integer has__Int__Value) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'has__Int__Value' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Integer}, the value to remove
	 * @see			#has__Int__ValueProperty
	 */
	public void removeHas__Int__Value(java.lang.Integer has__Int__Value) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Iterates through the 'has__Precision' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Float}
	 * @see			#has__PrecisionProperty
	 */
	public java.util.Iterator getHas__Precision() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'has__Precision' property value
	 * @param		{@link java.lang.Float}, the value to add
	 * @see			#has__PrecisionProperty
	 */
	public void addHas__Precision(java.lang.Float has__Precision) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'has__Precision' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Float}, the value to remove
	 * @see			#has__PrecisionProperty
	 */
	public void removeHas__Precision(java.lang.Float has__Precision) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'connects__to' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#connects__toProperty
	 */
	public java.util.Iterator getConnects__to() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'connects__to' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#connects__toProperty
	 */
	public void addConnects__to(com.ibm.adtech.jastor.Thing connects__to) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'connects__to' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#connects__toProperty
	 */
	public com.ibm.adtech.jastor.Thing addConnects__to() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#connects__toProperty
	 */
	public com.ibm.adtech.jastor.Thing addConnects__to(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'connects__to' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#connects__toProperty
	 */
	public void removeConnects__to(com.ibm.adtech.jastor.Thing connects__to) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'belongs__to' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#belongs__toProperty
	 */
	public java.util.Iterator getBelongs__to() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'belongs__to' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#belongs__toProperty
	 */
	public void addBelongs__to(com.ibm.adtech.jastor.Thing belongs__to) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'belongs__to' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#belongs__toProperty
	 */
	public com.ibm.adtech.jastor.Thing addBelongs__to() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#belongs__toProperty
	 */
	public com.ibm.adtech.jastor.Thing addBelongs__to(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'belongs__to' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#belongs__toProperty
	 */
	public void removeBelongs__to(com.ibm.adtech.jastor.Thing belongs__to) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'represented__by__Node' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jasper.Node}
	 * @see			#represented__by__NodeProperty
	 */
	public java.util.Iterator getRepresented__by__Node() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'represented__by__Node' property
	 * @param		The {@link org.cdao.jasper.Node} to add
	 * @see			#represented__by__NodeProperty
	 */
	public void addRepresented__by__Node(org.cdao.jasper.Node represented__by__Node) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'represented__by__Node' property
	 * @return		The anoymous {@link org.cdao.jasper.Node} created
	 * @see			#represented__by__NodeProperty
	 */
	public org.cdao.jasper.Node addRepresented__by__Node() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Node.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#represented__by__NodeProperty
	 */
	public org.cdao.jasper.Node addRepresented__by__Node(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'represented__by__Node' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jasper.Node} to remove
	 * @see			#represented__by__NodeProperty
	 */
	public void removeRepresented__by__Node(org.cdao.jasper.Node represented__by__Node) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'exclude__Subtree' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jasper.Subtree}
	 * @see			#exclude__SubtreeProperty
	 */
	public java.util.Iterator getExclude__Subtree() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'exclude__Subtree' property
	 * @param		The {@link org.cdao.jasper.Subtree} to add
	 * @see			#exclude__SubtreeProperty
	 */
	public void addExclude__Subtree(org.cdao.jasper.Subtree exclude__Subtree) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'exclude__Subtree' property
	 * @return		The anoymous {@link org.cdao.jasper.Subtree} created
	 * @see			#exclude__SubtreeProperty
	 */
	public org.cdao.jasper.Subtree addExclude__Subtree() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Subtree.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#exclude__SubtreeProperty
	 */
	public org.cdao.jasper.Subtree addExclude__Subtree(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'exclude__Subtree' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jasper.Subtree} to remove
	 * @see			#exclude__SubtreeProperty
	 */
	public void removeExclude__Subtree(org.cdao.jasper.Subtree exclude__Subtree) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'has' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#hasProperty
	 */
	public java.util.Iterator getHas() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#hasProperty
	 */
	public void addHas(com.ibm.adtech.jastor.Thing has) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#hasProperty
	 */
	public com.ibm.adtech.jastor.Thing addHas() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#hasProperty
	 */
	public com.ibm.adtech.jastor.Thing addHas(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#hasProperty
	 */
	public void removeHas(com.ibm.adtech.jastor.Thing has) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'has__Support__Value' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.Float}
	 * @see			#has__Support__ValueProperty
	 */
	public java.util.Iterator getHas__Support__Value() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'has__Support__Value' property value
	 * @param		{@link java.lang.Float}, the value to add
	 * @see			#has__Support__ValueProperty
	 */
	public void addHas__Support__Value(java.lang.Float has__Support__Value) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'has__Support__Value' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.Float}, the value to remove
	 * @see			#has__Support__ValueProperty
	 */
	public void removeHas__Support__Value(java.lang.Float has__Support__Value) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'has__Annotation' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jasper.CDAOAnnotation}
	 * @see			#has__AnnotationProperty
	 */
	public java.util.Iterator getHas__Annotation() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Annotation' property
	 * @param		The {@link org.cdao.jasper.CDAOAnnotation} to add
	 * @see			#has__AnnotationProperty
	 */
	public void addHas__Annotation(org.cdao.jasper.CDAOAnnotation has__Annotation) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Annotation' property
	 * @return		The anoymous {@link org.cdao.jasper.CDAOAnnotation} created
	 * @see			#has__AnnotationProperty
	 */
	public org.cdao.jasper.CDAOAnnotation addHas__Annotation() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CDAOAnnotation.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__AnnotationProperty
	 */
	public org.cdao.jasper.CDAOAnnotation addHas__Annotation(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Annotation' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jasper.CDAOAnnotation} to remove
	 * @see			#has__AnnotationProperty
	 */
	public void removeHas__Annotation(org.cdao.jasper.CDAOAnnotation has__Annotation) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'precedes' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#precedesProperty
	 */
	public java.util.Iterator getPrecedes() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'precedes' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#precedesProperty
	 */
	public void addPrecedes(com.ibm.adtech.jastor.Thing precedes) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'precedes' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#precedesProperty
	 */
	public com.ibm.adtech.jastor.Thing addPrecedes() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#precedesProperty
	 */
	public com.ibm.adtech.jastor.Thing addPrecedes(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'precedes' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#precedesProperty
	 */
	public void removePrecedes(com.ibm.adtech.jastor.Thing precedes) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'has__Type' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link com.ibm.adtech.jastor.Thing}
	 * @see			#has__TypeProperty
	 */
	public java.util.Iterator getHas__Type() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Type' property
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to add
	 * @see			#has__TypeProperty
	 */
	public void addHas__Type(com.ibm.adtech.jastor.Thing has__Type) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Type' property
	 * @return		The anoymous {@link com.ibm.adtech.jastor.Thing} created
	 * @see			#has__TypeProperty
	 */
	public com.ibm.adtech.jastor.Thing addHas__Type() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.w3.org/2000/01/rdf-schema#Resource.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__TypeProperty
	 */
	public com.ibm.adtech.jastor.Thing addHas__Type(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Type' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link com.ibm.adtech.jastor.Thing} to remove
	 * @see			#has__TypeProperty
	 */
	public void removeHas__Type(com.ibm.adtech.jastor.Thing has__Type) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Iterates through the 'has__Value' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link java.lang.String}
	 * @see			#has__ValueProperty
	 */
	public java.util.Iterator getHas__Value() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Add a 'has__Value' property value
	 * @param		{@link java.lang.String}, the value to add
	 * @see			#has__ValueProperty
	 */
	public void addHas__Value(java.lang.String has__Value) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Remove a 'has__Value' property value. This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		{@link java.lang.String}, the value to remove
	 * @see			#has__ValueProperty
	 */
	public void removeHas__Value(java.lang.String has__Value) throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Get an Iterator the 'exclude__Node' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jasper.Node}
	 * @see			#exclude__NodeProperty
	 */
	public java.util.Iterator getExclude__Node() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'exclude__Node' property
	 * @param		The {@link org.cdao.jasper.Node} to add
	 * @see			#exclude__NodeProperty
	 */
	public void addExclude__Node(org.cdao.jasper.Node exclude__Node) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'exclude__Node' property
	 * @return		The anoymous {@link org.cdao.jasper.Node} created
	 * @see			#exclude__NodeProperty
	 */
	public org.cdao.jasper.Node addExclude__Node() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#Node.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#exclude__NodeProperty
	 */
	public org.cdao.jasper.Node addExclude__Node(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'exclude__Node' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jasper.Node} to remove
	 * @see			#exclude__NodeProperty
	 */
	public void removeExclude__Node(org.cdao.jasper.Node exclude__Node) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'has__Standard__Datum' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jasper.StandardStateDatum}
	 * @see			#has__Standard__DatumProperty
	 */
	public java.util.Iterator getHas__Standard__Datum() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Standard__Datum' property
	 * @param		The {@link org.cdao.jasper.StandardStateDatum} to add
	 * @see			#has__Standard__DatumProperty
	 */
	public void addHas__Standard__Datum(org.cdao.jasper.StandardStateDatum has__Standard__Datum) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Standard__Datum' property
	 * @return		The anoymous {@link org.cdao.jasper.StandardStateDatum} created
	 * @see			#has__Standard__DatumProperty
	 */
	public org.cdao.jasper.StandardStateDatum addHas__Standard__Datum() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#StandardStateDatum.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__Standard__DatumProperty
	 */
	public org.cdao.jasper.StandardStateDatum addHas__Standard__Datum(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Standard__Datum' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jasper.StandardStateDatum} to remove
	 * @see			#has__Standard__DatumProperty
	 */
	public void removeHas__Standard__Datum(org.cdao.jasper.StandardStateDatum has__Standard__Datum) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'has__Amino__Acid__Datum' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jasper.AminoAcidResidueStateDatum}
	 * @see			#has__Amino__Acid__DatumProperty
	 */
	public java.util.Iterator getHas__Amino__Acid__Datum() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Amino__Acid__Datum' property
	 * @param		The {@link org.cdao.jasper.AminoAcidResidueStateDatum} to add
	 * @see			#has__Amino__Acid__DatumProperty
	 */
	public void addHas__Amino__Acid__Datum(org.cdao.jasper.AminoAcidResidueStateDatum has__Amino__Acid__Datum) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Amino__Acid__Datum' property
	 * @return		The anoymous {@link org.cdao.jasper.AminoAcidResidueStateDatum} created
	 * @see			#has__Amino__Acid__DatumProperty
	 */
	public org.cdao.jasper.AminoAcidResidueStateDatum addHas__Amino__Acid__Datum() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#AminoAcidResidueStateDatum.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__Amino__Acid__DatumProperty
	 */
	public org.cdao.jasper.AminoAcidResidueStateDatum addHas__Amino__Acid__Datum(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Amino__Acid__Datum' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jasper.AminoAcidResidueStateDatum} to remove
	 * @see			#has__Amino__Acid__DatumProperty
	 */
	public void removeHas__Amino__Acid__Datum(org.cdao.jasper.AminoAcidResidueStateDatum has__Amino__Acid__Datum) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'belongs__to__Character__State__Data__Matrix' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jasper.CharacterStateDataMatrix}
	 * @see			#belongs__to__Character__State__Data__MatrixProperty
	 */
	public java.util.Iterator getBelongs__to__Character__State__Data__Matrix() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'belongs__to__Character__State__Data__Matrix' property
	 * @param		The {@link org.cdao.jasper.CharacterStateDataMatrix} to add
	 * @see			#belongs__to__Character__State__Data__MatrixProperty
	 */
	public void addBelongs__to__Character__State__Data__Matrix(org.cdao.jasper.CharacterStateDataMatrix belongs__to__Character__State__Data__Matrix) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'belongs__to__Character__State__Data__Matrix' property
	 * @return		The anoymous {@link org.cdao.jasper.CharacterStateDataMatrix} created
	 * @see			#belongs__to__Character__State__Data__MatrixProperty
	 */
	public org.cdao.jasper.CharacterStateDataMatrix addBelongs__to__Character__State__Data__Matrix() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CharacterStateDataMatrix.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#belongs__to__Character__State__Data__MatrixProperty
	 */
	public org.cdao.jasper.CharacterStateDataMatrix addBelongs__to__Character__State__Data__Matrix(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'belongs__to__Character__State__Data__Matrix' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jasper.CharacterStateDataMatrix} to remove
	 * @see			#belongs__to__Character__State__Data__MatrixProperty
	 */
	public void removeBelongs__to__Character__State__Data__Matrix(org.cdao.jasper.CharacterStateDataMatrix belongs__to__Character__State__Data__Matrix) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'has__Molecular__Datum' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jasper.MolecularStateDatum}
	 * @see			#has__Molecular__DatumProperty
	 */
	public java.util.Iterator getHas__Molecular__Datum() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Molecular__Datum' property
	 * @param		The {@link org.cdao.jasper.MolecularStateDatum} to add
	 * @see			#has__Molecular__DatumProperty
	 */
	public void addHas__Molecular__Datum(org.cdao.jasper.MolecularStateDatum has__Molecular__Datum) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Molecular__Datum' property
	 * @return		The anoymous {@link org.cdao.jasper.MolecularStateDatum} created
	 * @see			#has__Molecular__DatumProperty
	 */
	public org.cdao.jasper.MolecularStateDatum addHas__Molecular__Datum() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#MolecularStateDatum.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__Molecular__DatumProperty
	 */
	public org.cdao.jasper.MolecularStateDatum addHas__Molecular__Datum(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Molecular__Datum' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jasper.MolecularStateDatum} to remove
	 * @see			#has__Molecular__DatumProperty
	 */
	public void removeHas__Molecular__Datum(org.cdao.jasper.MolecularStateDatum has__Molecular__Datum) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'has__Compound__Datum' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jasper.CompoundStateDatum}
	 * @see			#has__Compound__DatumProperty
	 */
	public java.util.Iterator getHas__Compound__Datum() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Compound__Datum' property
	 * @param		The {@link org.cdao.jasper.CompoundStateDatum} to add
	 * @see			#has__Compound__DatumProperty
	 */
	public void addHas__Compound__Datum(org.cdao.jasper.CompoundStateDatum has__Compound__Datum) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Compound__Datum' property
	 * @return		The anoymous {@link org.cdao.jasper.CompoundStateDatum} created
	 * @see			#has__Compound__DatumProperty
	 */
	public org.cdao.jasper.CompoundStateDatum addHas__Compound__Datum() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CompoundStateDatum.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__Compound__DatumProperty
	 */
	public org.cdao.jasper.CompoundStateDatum addHas__Compound__Datum(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Compound__Datum' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jasper.CompoundStateDatum} to remove
	 * @see			#has__Compound__DatumProperty
	 */
	public void removeHas__Compound__Datum(org.cdao.jasper.CompoundStateDatum has__Compound__Datum) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'has__Datum' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jasper.CharacterStateDatum}
	 * @see			#has__DatumProperty
	 */
	public java.util.Iterator getHas__Datum() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Datum' property
	 * @param		The {@link org.cdao.jasper.CharacterStateDatum} to add
	 * @see			#has__DatumProperty
	 */
	public void addHas__Datum(org.cdao.jasper.CharacterStateDatum has__Datum) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Datum' property
	 * @return		The anoymous {@link org.cdao.jasper.CharacterStateDatum} created
	 * @see			#has__DatumProperty
	 */
	public org.cdao.jasper.CharacterStateDatum addHas__Datum() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#CharacterStateDatum.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__DatumProperty
	 */
	public org.cdao.jasper.CharacterStateDatum addHas__Datum(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Datum' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jasper.CharacterStateDatum} to remove
	 * @see			#has__DatumProperty
	 */
	public void removeHas__Datum(org.cdao.jasper.CharacterStateDatum has__Datum) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'has__Nucleotide__Datum' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jasper.DesoxiRibonucleotideResidueStateDatum}
	 * @see			#has__Nucleotide__DatumProperty
	 */
	public java.util.Iterator getHas__Nucleotide__Datum() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Nucleotide__Datum' property
	 * @param		The {@link org.cdao.jasper.DesoxiRibonucleotideResidueStateDatum} to add
	 * @see			#has__Nucleotide__DatumProperty
	 */
	public void addHas__Nucleotide__Datum(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatum has__Nucleotide__Datum) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Nucleotide__Datum' property
	 * @return		The anoymous {@link org.cdao.jasper.DesoxiRibonucleotideResidueStateDatum} created
	 * @see			#has__Nucleotide__DatumProperty
	 */
	public org.cdao.jasper.DesoxiRibonucleotideResidueStateDatum addHas__Nucleotide__Datum() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#DesoxiRibonucleotideResidueStateDatum.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__Nucleotide__DatumProperty
	 */
	public org.cdao.jasper.DesoxiRibonucleotideResidueStateDatum addHas__Nucleotide__Datum(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Nucleotide__Datum' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jasper.DesoxiRibonucleotideResidueStateDatum} to remove
	 * @see			#has__Nucleotide__DatumProperty
	 */
	public void removeHas__Nucleotide__Datum(org.cdao.jasper.DesoxiRibonucleotideResidueStateDatum has__Nucleotide__Datum) throws com.ibm.adtech.jastor.JastorException;
		
	/**
	 * Get an Iterator the 'has__Continuous__Datum' property values.  This Iteartor
	 * may be used to remove all such values.
	 * @return		{@link java.util.Iterator} of {@link org.cdao.jasper.ContinuousStateDatum}
	 * @see			#has__Continuous__DatumProperty
	 */
	public java.util.Iterator getHas__Continuous__Datum() throws com.ibm.adtech.jastor.JastorException;

	/**
	 * Adds a value for the 'has__Continuous__Datum' property
	 * @param		The {@link org.cdao.jasper.ContinuousStateDatum} to add
	 * @see			#has__Continuous__DatumProperty
	 */
	public void addHas__Continuous__Datum(org.cdao.jasper.ContinuousStateDatum has__Continuous__Datum) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Adds an anonymous value for the 'has__Continuous__Datum' property
	 * @return		The anoymous {@link org.cdao.jasper.ContinuousStateDatum} created
	 * @see			#has__Continuous__DatumProperty
	 */
	public org.cdao.jasper.ContinuousStateDatum addHas__Continuous__Datum() throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * 
	 * The resource argument have rdf:type http://www.cs.nmsu.edu/~epontell/CURRENT.owl#ContinuousStateDatum.  That is, this method
	 * should not be used as a shortcut for creating new objects in the model.
	 * @param		The {@link om.hp.hpl.jena.rdf.model.Resource} to add
	 * @see			#has__Continuous__DatumProperty
	 */
	public org.cdao.jasper.ContinuousStateDatum addHas__Continuous__Datum(com.hp.hpl.jena.rdf.model.Resource resource) throws com.ibm.adtech.jastor.JastorException;
	
	/**
	 * Removes a value for the 'has__Continuous__Datum' property.  This method should not
	 * be invoked while iterator through values.  In that case, the remove() method of the Iterator
	 * itself should be used.
	 * @param		The {@link org.cdao.jasper.ContinuousStateDatum} to remove
	 * @see			#has__Continuous__DatumProperty
	 */
	public void removeHas__Continuous__Datum(org.cdao.jasper.ContinuousStateDatum has__Continuous__Datum) throws com.ibm.adtech.jastor.JastorException;
		
}