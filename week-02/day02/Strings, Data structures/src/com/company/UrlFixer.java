package com.company;

public class UrlFixer {
    public static void main(String[] args) {

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crucial component, find out what it is and insert it too!
        // Try to solve it in more than one way using different String functions!

        String url = "https//www.reddit.com/r/nevertellmethebots";
        String replaceString = url.replace("bots", "odds");
        String replaceString2 = replaceString.replace("https", "https:");
        System.out.println(replaceString2);
    }
}
