# WebsiteAnalysis

## General Information
This software system, WebsiteAnalysis , will be a Java program operated from a command line
interface (CLI) which will analyze static content of hypertext markup language (HTML) pages.

The static content that this software system will concern itself with is: images, javascript, cascading
style sheets (CSS), hyperlinks, and data files.

The data files category will contain archives to include zip, tar, and 7z files; video containers to
include mkv and mp4; audio containers to include m4a, mka, and ogg; and finally other data files including
deb, exe, and cpp files.

The WebsiteAnalysis system will analyze this static content by extracting the information contained
in the following HTML content: anchor tags, image tags, link tags, and script tags.
This software system does not concern itself with audio nor video codecs such as mp3, vorbis,
H264, or H265, respectively. This software system is also constrained to locally saved offline
websites.

No online website analysis will be conducted. Finally, WebsiteAnalysis will only analyze
between 1 and 1000 pages of HTML.

## Perspective
The WebsiteAnalysis system is an independent program that analyzes and extracts static data from 1
or more HTML pages and outputs the collected data into 3 document types for the user. As the
program collects data from the given webpages, the program will categorize that data collected by
type of data and html page in which the data was found.

## User Classes
This program is designed for any users that need a software program to provide a website analysis
tool to gather static data content on a local copy of a website.
#### Users
* Webpage Developers
* Data Scientist
#### Experience Level
* Basic command-line interface knowledge (all users)
* Basic knowledge of installing/running a program on their client machine (all users)

## Dependencies
The WebsiteAnalysis system is a Java 8 based system and will run on Windows, Linux, and OS/X
systems. The above systems will need a Java JRE installed to execute the program.

## Design Constraints
This program is limited to offline use only and will not access any online or live webpages.

The user input is limited to only a command-line interface with the only input be the path to local web
pages and any URLs that are needed for the analysis.

The program output is limited to console or terminal window messages, JSON file, text file, and Excel file
outputs.

The WebsiteAnalysis system will be dependent on that the user will have a working Windows,
Linux, or OS/X operating system installed on their client machine, along with an installed Java JRE.
It will also be assumed that the user will have programs installed on their host machine to read and
utilize the output file format of JSON, Text, and Excel files.
