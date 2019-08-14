package bak.websiteanalysis;

/**
 * HtmlParser will utilize the JSOUP library to parse all identified Page
 * objects for static content.
 * 
 * @author bklar
 *
 */
public class HtmlParser {
	
	//************** Data members **************
	
	//************** Nested Classes **************
	
	/**
	 * Scans the provided document for all references to linked javascript
	 * files. Inline javascript will not be included.
	 * <p>
	 * Scan for text/javascript element attribute and all links looking for a
	 * Javascript filetype extension.
	 */
	private void parseJavascript() {
		
	}
	
	/**
	 * Scans the provided document for all references to linked CSS style sheet
	 * files. Inline CSS will not be included.
	 * <p>
	 * Scan for text/css element attribute and all links looking for a CSS
	 * filetype extension.
	 */
	private void parseStyleSheets() {
		
	}
	
	/**
	 * Scans the document for all references to linked video files. It should
	 * not be assumed that linked video files will be supplied with the 
	 * 'type' link modifier.
	 * <p>
	 * Scan for the HTML5 video elements and all links looking for known
	 * video filetype extensions.
	 */
	private void parseVideos() {
		
	}
	
	/**
	 * Scans the document for all references to linked audio files. It should
	 * not be assumed that linked video files will be supplied with the 
	 * 'type' link modifier.
	 * <p>
	 * Scan for the HTML5 audio elements and all links looking for known
	 * audio filetype extensions.
	 */
	private void parseAudio() {
		
	}
	
	/**
	 * Scans the document for all references to linked image files. It should
	 * not be assumed that linked video files will be supplied with the 
	 * 'type' link modifier.
	 * 
	 * Scan for the <img src=> tag and links containing known image file
	 * extensions.
	 */
	private void parseImages() {
		
	}
	
	/**
	 * Scans the document for all references to the src element attribute.
	 * Once discovered, a link has been identified. This link will then need
	 * to be categorized as internal or external. The link will undergo
	 * further analysis to determine if it links to static content
	 */
	private void parseLinks() {
		
	}
	
	/**
	 * Determines if the link to a piece of static content is internal
	 * or external. All links must be examined to determine if a URL exists
	 * or not. If no URL exists, then the link points to a relative or
	 * absolute path on the user's file system. If a URL exists, it must be
	 * checked whether or not the URL belongs to the user's website or to
	 * an external website.
	 */
	private void determineLinkLocation() {
		
	}
		
	//************** Constructors **************
	
}
