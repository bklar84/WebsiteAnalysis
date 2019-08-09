
package bak.websiteanalysis;

import java.io.IOException;

/**
 * WebsiteAnalysis is a basic web scraper. It began as a project for a
 * university class. WebsiteAnalysis Examines a local website and derives
 * statistics based on static HTML elements identified by the requirements.
 * The program will then create three output files:
 * <ul>
 * 		<li>JSON (.json)</li>
 *		<li>Excel (.xlsx)</li>
 *		<li>Text (.txt)</li>
 * </ul>
 * These output files will contain specific statistics as per requirements.
 * 
 * @author Brian Klarman		b.klarman@gmail.com
 * 
 * @param	args		String array containing path to website and URLs
 * 						that need to be resolved.
 * 			args[0]		The local path to the website
 * 			args[1..n]	Optional URLs that need to be resolved
 * 
 * @throws	IOException	if the user does not supply any paths or URLs
 */
public class App {
    
	// Nested Classes
	static String getUsageMessage() {
        return "Usage: WebsiteAnalysis Path URL1 [URL2 URL3...]\n"
				+  "	Path: Path to the local copy of website to be analyzed\n"
				+  "	URL1, 2, 3...: URLs to be translated to local directory structure.";
    }

    public static void main(String[] args) throws IOException {

        if(args.length == 0) {
        	new App();
			throw new IOException(App.getUsageMessage());
        }
    }
}
