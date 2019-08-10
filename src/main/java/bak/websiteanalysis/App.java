
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
 * A common problem in web development is the minimization of data transfer,
 * historically images. In recent years, the focus has shifted to audio and
 * video content–e.g., the H264 and H265 (HEVC) video codecs.
 * <p>
 * Our interest lies in static content, specifically:
 * <ul>
 * <li>Images (e.g., JPEG, PNG, GIF, and SVG)</li>
 * <li>Javascript</li>
 * <li>Cascading Style Sheets (CSS)</li>
 * <li>Hyperlinks</li>
 * <li>Data Files</li>
 * 		<ul>
 * 		<li>Archives (e.g., .zip, .tar.gz, .tar, .7z)</li>
 *      <li>Video (e.g., .mkv, .mp4)</li>
 *      	<ul>
 *          <li>These are based on containers not codecs (e.g., H264 or H265)</li>
 *          </ul>
 *      <li>Audio (e.g., .m4a, .mka, or .ogg)</li>
 *          <ul>
 *          <li>These are based on containers not codecs (e.g., mp3 or vorbis)</li>
 *          </ul>
 *		<li>Other</li>
 *          <ul>
 *          <li>This is anything that does not fall under another category
 *          (e.g., .deb, .exe, or .cpp)</li>
 *          </ul>
 *      </ul>
 * </ul>
 * <p>
 * This document describes a project, WebsiteAnalysis, to an analyze the
 * static content on each page within a local copy of a website. This includes
 * an analysis of each page and the site as a whole.
 * <p>
 * The system will be operated from a command-line interface.
 * The only parameters required at the interface will be the path to local
 * copy of the site and one or more URLs that must–as part of the analysis–be
 * translated–when encountered–to the local directory structure. The system
 * should present appropriate explanatory error messages when presented a path
 * to a non-existent or unreadable directory, or when a URL is malformed.
 * If no command line arguments are provided, an appropriate usage message
 * should be displayed.
 * 
 * @author Brian Klarman	b.klarman@gmail.com
 * 
 * @param	args			String array containing path to website and URLs
 * 							that need to be resolved.
 * 			args[0]			The local path to the website
 * 			args[1..n]		Optional URLs that need to be resolved
 * 
 * @throws	IOException		If the user does not supply any paths or URLs
 */
public class App {
    
	/**
	 * Outputs a usage message to the user if they run the program without
	 * first supplying command line arguments.
	 */
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
