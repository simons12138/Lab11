//Yanchi Song
public class Cowsay{//coment
    public static void main (String[] args){
        Cow[] cow = HeiferGenerator.getCows();
        if(args[0].equals("-l")){
            System.out.print("Cows available: ");
            for (int i = 0; i < cow.length; i++){
                System.out.print(cow[i].getName() + " ");
            }
            System.out.println("\n");
        }
        else if(args[0].equals("-n")) {
            if(args[1].equals("heifer")){
                for(int i = 2; i < args.length; i++){
                    System.out.print(args[i] + " ");
                }
                System.out.println("\n" + cow[0].getImage());
            }//for "-n" cow with words
            else if(args[1].equals("kitteh")){
                for(int i = 2; i < args.length; i++){
                    System.out.print(args[i] + " ");
                }//coment 
                System.out.println("\n" + cow[1].getImage());
            }//for "-n" kittel with words
            else if(args[1].equals("dragon")){
                for(int i = 2; i < args.length; i++){
                    System.out.print(args[i] + " ");
                }
                System.out.println("\n" + cow[2].getImage());
                System.out.println("This dragon can breathe fire");
            }
            else if(args[1].equals("ice-dragon")){
                for(int i = 2; i < args.length; i++){
                    System.out.print(args[i] + " ");
                }
                System.out.println("\n" + cow[2].getImage());
                System.out.println("This dragon cannot breathe fire");
            }
            else {
                System.out.println("Could not find " + args[1] + " cow!");
            }
        }
        else{
            for(int i = 0; i < args.length; i++){
                System.out.print(args[i] + " ");
            }// for default cow with words
            System.out.println("\n" + cow[0].getImage());
        }
    }
}
