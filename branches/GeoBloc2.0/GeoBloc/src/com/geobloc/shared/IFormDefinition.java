package com.geobloc.shared;

/**
 * Class to represent the basic info of a form to be used by different classes.

 * 
 * @author Jorge Carballo
 * @author Dinesh Harjani
 *
 */

public interface IFormDefinition {

	public String getForm_name();	
	public void setForm_name(String formName);
	
	public String getForm_id();	
	public void setForm_id(String formId);
	
	public int getForm_version();	
	public void setForm_version(int formVersion);
	
	public String getForm_description();	
	public void setForm_description(String formDescription);
	
	public String getForm_date();	
	public void setForm_date(String formDate);
	
	public long getForm_local_id();	
	public void setForm_local_id(long formLocalId);
	
}
