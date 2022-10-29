package saturday._22102022.inputOutput;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) {

        //абсолютный и относительный путь
        String s = "This is one of many comments floating around the " +
                "DeadBedrooms subreddit on the social-media platform Reddit – " +
                "a self-described “discussion group for Redditors " +
                "who are coping with a relationship that is seriously lacking in sexual intimacy”. " +
                "Frustrated anecdotes like these abound from people who are in " +
                "low- or zero-sex relationships. “Why does he prefer his own hand over having sex with me?” " +
                "one poster asks. The subreddit’s outlook is relatively bleak: " +
                "“Advice is always appreciated,” reads its description, " +
                "“just don't be surprised if we've heard it all.";

        String s1 = "!!!";

        try (FileWriter writer = new FileWriter("E:\\SaturdayConsultation\\article.txt")) {
            //writer = new FileWriter("address", true)
            for (int i = 0; i < s.length(); i++) {
                writer.write(s.charAt(i));
//                writer.write(s1); перепишет
            }

            System.out.println("DONE!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}