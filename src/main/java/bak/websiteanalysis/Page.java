package bak.websiteanalysis;

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
	
	// Not going to implement a getter for page path.
//	public static final Comparator<Page> compareByPath = (Page lhs, Page rhs) -> lhs.getPagePath()
//			.compareTo(rhs.getPagePath());
	
	//************** Nested Classes **************
	/**
	 * Takes the command-line arguments supplied by user at runtime and places
	 * them in their own container. These URLs will have to be checked when
	 * determining if static content is internal or external. If the link to a
	 * piece of static content begins with a URL found in the container, it
	 * will be classified as internal. If the link contains a URL not in the
	 * container, it will be classified as external.
	 */
	private void createUrlList(String[] userArgs) {
		
	}
	
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
