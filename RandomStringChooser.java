import java.util.ArrayList;

public class RandomStringChooser {
    private String[] words;
    private ArrayList<String> wordss = new ArrayList<String>();
    
    RandomStringChooser(String[] wordparam){
        words = wordparam;
        // Used to initialise class (A special method)
        for (String s:words){
            wordss.add(s);
        }
    }
    public String getNext(){
        //IN the question no parameters given so no parameters here
        int length = wordss.size();    
        if (length>0){
        // String[] temp = new String[];
        int i = (int) (Math.random()* length);
        return wordss.remove(i);
        } else {
            return "NONE";
        }

    }
    public static void main(String[] args){
        String[] wordArray = {"wheels", "on", "the", "bus"};
        RandomStringChooser sChooser = new RandomStringChooser(wordArray);
        for (int k = 0; k<6; k++){
            System.out.print(sChooser.getNext() + " ");
        }
        
    }
}

