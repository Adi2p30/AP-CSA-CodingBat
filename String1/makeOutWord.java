package String1;
public class String_1_Codingbat {
    //________________________________________________
    //https://codingbat.com/prob/p184030
    public String makeOutWord(String out, String word) {
        return(out.substring(0,2)+word+out.substring(2,4));
    };
    //________________________________________________

    //https://codingbat.com/prob/p108853
    public String extraEnd(String str) {
        return (str.substring(str.length()-2,str.length())
                +str.substring(str.length()-2,str.length())
                +str.substring(str.length()-2,str.length()));
    };
    //________________________________________________
    //https://codingbat.com/prob/p105745

    public String minCat(String a, String b) {
        boolean longer = true;
        int difference = 0;
        if (a.length() >= b.length()){
            difference = a.length()-b.length();
            longer = true;
        }
        else {
            difference = b.length()-a.length();
            longer = false;
        };
        if (longer == true){
            return(a.substring(difference,a.length()) + b);
        }
        else{
            return(a + b.substring(difference,b.length()));
        }
    }

    //________________________________________________
    //https://codingbat.com/prob/p159531
    public boolean cigarParty(int cigars, boolean isWeekend) {
        boolean party = false;
        if (isWeekend == false){
            if (cigars>=40 && cigars<=60){
                party = true;
            }}
        else{
            if (cigars>=40){
                party = true;
            }

        }
        return party;
    }
    //________________________________________________
    //https://codingbat.com/prob/p103360
    public int dateFashion(int you, int date) {
        int result = 1;
        if (you <= 2 || date <= 2){
            result = 0;
        }
        else if (you >= 8 || date >= 8){
            result = 2;
        }
        return result;
    }
    //________________________________________________
    //https://codingbat.com/prob/p141061
    public boolean squirrelPlay(int temp, boolean isSummer) {
        boolean play = false;
        if (isSummer == true){
            if (temp>=60 && temp<=100){
                play = true;
            }
        }
        else{
            if (temp>=60 && temp<=90){
                play = true;
            }
        }
        return play;
    }




}
