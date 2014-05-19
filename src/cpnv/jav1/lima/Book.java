/**
 * This class represent a book
 *
 * @package cpnv.jav1.lima
 * @author romain.lanz
 * @version 1.0, 12.05.14
 */

package cpnv.jav1.lima;

public class Book extends Article
{

/* +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ */
  /* Attributes */

    /**
     * SQL ID of the book
     */
    protected Integer _id;

    /**
     * ISBN of the book
     */
    protected String _isbn;

    /**
     * Author of the book
     */
    protected String _author;

    /**
     * Editor of the book
     */
    protected String _editor;

    /**
     * Date of the publication of the book
     */
    protected Integer _publicationYear;

/* +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ */
  /* SQL fields */

    /**
     * The name of the SQL table 
     */
    public static final String sqlTable = "bookdetail";
    
    /**
     * The name of the SQL field for the ID
     */
    public static final String sqlID = "idbookdetail";

    /**
     * The name of the SQL field for the ISBN
     */
    public static final String sqlIsbn = "ISBN";

    /**
     * The name of the SQL field for the author
     */
    public static final String sqlAuthor = "author";

    /**
     * The name of the SQL field for the editor
     */
    public static final String sqlEditor = "editor";

    /**
     * The name for the SQL field for the publication year
     */
    public static final String sqlPublicationYear = "publicationyear";

/* +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ */
  /* Constructor */

    /**
     * Class constructor
     */
    public Book() {}
    
    /**
     * Class constructor to instance a book with all attributes
     * 
     * @param id ID of the book
     * @param author Author of the book
     * @param editor Editor of the book
     * @param isbn ISBN of the book
     * @param publicationYear Year of the publication of the book
     */
    public Book(Integer id, String author, String editor, String isbn, Integer publicationYear)
    {
    	setID(id);
    	setAuthor(author);
    	setEditor(editor);
    	setIsbn(isbn);
    	setPublicationYear(publicationYear);
    }

/* +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ */
  /* Methods */

    /**
     * Dump informations of this instance
     *
     * @return A dump of this instance
     */
    public String dump()
    {
        return _isbn;
    }

/* +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ */
  /* Database methods */
    
    /**
     * Gets the database access object
     * 
     * @return The database access object
     */
    private static LimaDb getDao()
    {
    	return new LimaDb("http://192.168.0.4");
    }
    
    /**
     * Save the current object on the database
     */
    public void save()
    {
    	LimaDb dao = Book.getDao();
    	
    	if (null == _id) {
    		
    	} else {
    		
    	}
    }
    
    /**
     * Gets a book with an ID
     * 
     * @param id ID of the book
     * @return A book
     */
    public static Book findOneById(Integer id)
    {
    	String query = "SELECT * FROM " + sqlTable + " WHERE " + sqlID + " = " + id;
    	LimaDb dao = Book.getDao();
    	
    	dao.executeQuery(query);
    	
    	return Book.instanceWithDao(dao);
    }
    
    /**
     * Gets a book with an ISBN
     * 
     * @param isbn ISBN of the book
     * @return A book
     */
    public static Book findOneByIsbn(String isbn)
    {
    	String query = "SELECT * FROM " + sqlTable + " WHERE " + sqlIsbn + " = " + isbn;
    	LimaDb dao = Book.getDao();
    	
    	dao.executeQuery(query);
    	
    	return Book.instanceWithDao(dao);
    }
    
    /**
     * Instance a book with a database access object
     * 
     * @param dao Database access object
     * @return A Book
     */
    private static Book instanceWithDao(LimaDb dao)
    {
    	while(dao.moveNext()) {
    		return new Book(
    				Integer.parseInt(dao.getField(sqlID)),
    				dao.getField(sqlAuthor),
    				dao.getField(sqlEditor),
    				dao.getField(sqlIsbn),
    				Integer.parseInt(dao.getField(sqlPublicationYear))
    		);
    	}
    }
    
/* +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ */
  /* Getters & Setters */

    /**
     * Sets the SQL ID of the book
     *
     * @param id The SQL ID of the book
     */
    public void setID(Integer id) { _id = id; }

    /**
     * Gets the SQL ID of the book
     *
     * @return The SQL ID of the book
     */
    public Integer getID() { return _id; }

    /**
     * Sets the ISBN of the book
     *
     * @param isbn ISBN of the book
     */
    public void setIsbn(String isbn) { _isbn = isbn; }

    /**
     * Gets the ISBN of the book
     *
     * @return The ISBN of the book
     */
    public String getIsbn() { return _isbn; }

    /**
     * Sets the author of the book
     *
     * @param author Author of the book
     */
    public void setAuthor(String author) { _author = author; }

    /**
     * Gets the author of the book
     *
     * @return The author of the book
     */
    public String getAuthor() { return _author; }

    /**
     * Sets the editor of the book
     *
     * @param editor Editor of the book
     */
    public void setEditor(String editor) { _editor = editor; }

    /**
     * Gets the editor of the book
     *
     * @return The editor of the book
     */
    public String getEditor() { return _editor; }

    /**
     * Sets the publication year of the book
     *
     * @param publicationYear Publication year of the book
     */
    public void setPublicationYear(Integer publicationYear) { _publicationYear = publicationYear; }

    /**
     * Gets the publication year of the book
     *
     * @return The publication year of the book
     */
    public Integer getPublicationYear() { return _publicationYear; }

}
