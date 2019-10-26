package bak.websiteanalysis;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * A website will consist of n pages containing HTML content.
 * When a file containing HTML content is identified, a page will be created.
 * All pages will then be subsequently scanned for static content.
 * <p>
 * 
 * @author Brian Klarman	b.klarman@gmail.com
 *
 */
public class Page {

	//************** Data members **************
	private String websitePath;
	private String relativePath;
	private int nbrLocalImages;
	private int nbrExternalImages;
	private int nbrLocalScripts;
	private int nbrExternalScripts;
	private int nbrLocalCss;
	private int nbrExternalCss;
	private int nbrIntraLinks;
	private int nbrInterLinks;
	private int nbrExternalLinks;
	private double sizeOfImages;
	private ArrayList<String> imagePaths = new ArrayList<String>();
	private ArrayList<String> scriptPaths = new ArrayList<String>();
	private ArrayList<String> cssPaths = new ArrayList<String>();
	// Not going to implement a getter for page path.
//	public static final Comparator<Page> compareByPath = (Page lhs, Page rhs) -> lhs.getPagePath()
//			.compareTo(rhs.getPagePath());
	
	//************** Nested Classes **************
	
	
	//************** Constructors **************
	/**
	 * Default constructor for Page. Page should always be created by taking in
	 * one argument, the absolute path to the website.
	 *<p>
	 * When invoking the default constructor, the program will throw an
	 * IllegalArgumentException because a page must have the absolute path to
	 * where it is stored on the user's file system.
	 */
	public Page() {
		throw new IllegalArgumentException(Website.defaultConstructorException
				+ this.getClass().getSimpleName());
	}

}
