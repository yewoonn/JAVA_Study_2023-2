public class Word {
    private String sKor;
    private String sEng;

    Word(String sEng, String sKor){
        this.sEng = sEng;
        this.sKor = sKor;
    }

    public String getEng(){
        return this.sEng;
    }

    public String getKor(){
        return this.sKor;
    }
}
