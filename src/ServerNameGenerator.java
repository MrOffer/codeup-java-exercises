public class ServerNameGenerator {


     public static String[] adjectives = {"big", "small", "average", "short", "tall", "jumbo", "puny", "wide", "narrow", "substantial"};
     public static String[] nouns = {"boy", "girl", "cat", "dog", "elephant", "deer", "you", "man", "woman", "monkey"};


        public static String randomAdjective(){
            int randomAdj = (int)Math.floor(Math.random() * adjectives.length);
            return adjectives[randomAdj];
        }
        public static String randomNoun(){
            int randomNou = (int)Math.floor(Math.random() * nouns.length);
            return nouns[randomNou];
        }

        public static void main(String[] args) {
            System.out.println( randomAdjective()+ " - " +randomNoun());
        }

        }



