package cpnv.jav1.lima;

import java.util.Date;

import android.util.Log;


/* +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ */
/* Constructor */
public class ItemsCurrentYear
{

    protected Integer _id;	
    protected Integer _startYear;
    public static final String sqlTable = "scolaryear";
	
	/**
	 * Class constructor
	 */
	public ItemsCurrentYear()
	{
    	String query = "SELECT * FROM " + sqlTable + " WHERE  editable='1'";
    	Log.i("LIMA", "New query : " + query);
    	LimaDb dao = new LimaDb("http://192.168.0.4");
    	dao.executeQuery(query);
    	
    	while(dao.moveNext()) {
        	Log.i("LIMA", dao.getField("startyear"));    		
    	}
	}
	

	

    
	
	/* +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ */
	  /* Getters & Setters */

	    /**
	     * Sets the SQL ID of the current year
	     *
	     * @param id The SQL ID of the current year
	     */
	    public void setID(Integer id) { _id = id; }

	    /**
	     * Gets the SQL ID of the current year
	     *
	     * @return The SQL ID of the current year
	     */
	    public Integer getID() { return _id; }	
	    
	    
	    /**
	     * Sets the start of the current year
	     *
	     * @param publicationYear Publication year of the book
	     */
	    public void setStartYear(Integer publicationYear) { _startYear = publicationYear; }

	    /**
	     * Gets the start of the currentyear
	     *
	     * @return The start of the current year
	     */
	    public Integer getStartYear() { return _startYear; }	
}
