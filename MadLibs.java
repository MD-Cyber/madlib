public class MadLibs {

    /*
     * This program generates a mad libbed story.
     * Author:
     * Date: 15/11/2022
     */

    public static void main(String[] args) {

        // name of protagnist
        String name1 = "John";

        // all the adjectives
        String adjective1, adjective2, adjective3;
        adjective1 = "tall";
        adjective2 = "green";
        adjective3 = "fast";

        // all the verbs
        String verb1 = "run";

        // all the nouns
        String noun1, noun2, noun3, noun4, noun5, noun6;
        noun1 = "ohio";
        noun2 = "river";
        noun3 = "happy";
        noun4 = "sky";
        noun5 = "birds";
        noun6 = "water";

        // another character name
        String name2 = "oliver";

        // number
        int number = 8;

        // place
        String place1 = "Europe";

        // The template for the story
        String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". 'It is going to be a "
                + adjective2 + " day!' Outside, a bunch of " + noun1 + "s were protesting to keep " + noun2
                + " in stores. They began to " + verb1 + " to the rhythm of the " + noun3 + ", which made all the "
                + noun4 + "s very " + adjective3 + ". Concerned, " + name1 + " texted " + name2 + ", who flew " + name1
                + " to " + place1 + " and dropped " + name1 + " in a puddle of frozen " + noun5 + ". " + name1
                + " woke up in the year " + number + ", in a world where " + noun6 + "s ruled the world.";

        System.out.println(story);
    }
}