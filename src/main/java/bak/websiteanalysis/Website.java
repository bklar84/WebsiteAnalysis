package bak.websiteanalysis;

/**
 * Website will serve as the overarching class for the user's website. Through
 * this class, we will generate a list of pages that belong to the website as
 * well as maintain statistics applicable to the entire website.
 * <p>
 * A website consists of n files that contain html tags with optional static
 * content such as images, videos, audio, CSS, and JavaScript.
 * <p>
 * The WebsiteAnalysis system must be cable of classifying the links contained
 * in a local copy of a website. WebsiteAnalysis must be capable of processing
 * sites containing between 1 and 1000 pages. After identifying a set of HTML
 * files, an error message must be output if fewer than 1 page or more than
 * 1000 pages are present.
 * <p>
 * The system must stop at site boundaries. For example, if the site were run
 * on a directory, '/home/user/this/is/my/website
 * then it should not cross in to 'home/user/this/is/my/otherWebsite.
 * The latter path should be considered external–i.e., part of another site.
 * Relative links should be checked against site boundaries–i.e., this site
 * boundary check should occur after a path, is expanded.
 * The system must traverse all static content within the supplied directory.
 * <p>
 * The system must handle any file that contains HTML content–html and htm.
 * As the system must work with a local copy of a site, you will need to handle
 * other extensions–e.g., php and cgi. The system should not assume that a
 * document does–or does not–contain HTML content based on file extensions.
 * <p>
 * This analysis should only be performed for local links–i.e., links that
 * reference other parts of the same site.
 * <p>
 * The system must be able to extract the links (anchor tags) from a page.
 * Links should be classified as:
 * <ul>
 * <li>Intra-page</li>
 * <li>Inter-site</li>
 * <li>External</li>
 * </ul>
 * An intra-page link is any link that references a part of the current
 * document.
 * <p>
 * An inter-site link is any link that references another part of the same
 * site.
 * <p>
 * An external link is any link that references another site.
 * <p>
 * The system must be able to extract the images (<img ...> tags) from a page.
 * Images should be classified as internal or external.
 * For each internal image, the file size shall be recorded. For each page,
 * the URI of each image should be recorded. For each image, the local pages
 * on which it is referenced shall be recorded.
 * <p>
 * The system must be able to examine CSS files and JavaScript files used in
 * each internal page. Both should be classified as internal or external.
 * For each page, the URI of each script and stylesheet should be recorded.
 * For each item, the local pages on which it is utilized shall be recorded.
 * <b>Only CSS and JavaScript content stored in separate files shall be
 * analyzed. Inline CSS and JavaScript should be ignored.</b>
 * <p>
 * After performing an analysis of every page in the local website the
 * WebAnalysis system should generate trhee files: a json file (json), a text
 * file (txt), and an Excel file (xlsx). Each file will be named using the
 * data and time the processing started. File names will take the form
 * YYYYMMDD-hhmmss-summary.{json,txt,xlsx} where:
 * <ul>
 * <li>YYYY: 4-digit year</li>
 * <li>MM: 2-digit month (zero padded) - 01 to 12</li>
 * <li>DD: 2-digit day (zero padded) - 01 to 31</li>
 * <li>hh: 2-digit hour (zero padded) - 00 to 23</li>
 * <li>mm: 2-digit minute (zero padded) - 00 to 59</li>
 * <li>ss: 2-digit second (zero padded) - oo to 59</li>
 * </ul>
 * The names of all output files must be written (one per line) to standard
 * out (i.e., the terminal). With the exception of error messages (written to
 * standard error) and usage messages, there should be no other output written
 * to the terminal.
 * 
 * @author Brian Klarman	b.klarman@gmail.com
 * @see
 * @see
 * @see
 */

public class Website {

}
