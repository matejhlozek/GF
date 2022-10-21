package charSequence;

public class Gnirts implements CharSequence {

    public String example;

    public Gnirts(String example){
        this.example = example;
    }
    public static Gnirts reverse(String example){
        return Gnirts.reverse(new StringBuilder(example).reverse().toString());
    }


    @Override
    public int length() {
        return example.length();
    }

    @Override
    public char charAt(int index) {
        return example.charAt(example.length()-index-1);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return toString().subSequence(0, example.length());
    }
    @Override
    public String toString(){
        return example;
    }
}
