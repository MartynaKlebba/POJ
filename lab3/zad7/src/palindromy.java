public class palindromy {
    private String palindrom;

    public palindromy(String palindrom){
        this.palindrom=palindrom;
    }

    public String getPalindrom(){
        return palindrom;
    }
    public String check(){
        String pal = palindrom;
        int h = pal.length();

        int kk = 0;
        int k = (h-1);
        for (int i=0; i < h; i++)
        {
            if (pal.charAt(i) != pal.charAt(k)){
                kk = 1;
                break;
            }
            k--;
        }
        if (kk == 1)
            return "nie jest palindromem";
        else
            return "jest palindromem";
    }
}
