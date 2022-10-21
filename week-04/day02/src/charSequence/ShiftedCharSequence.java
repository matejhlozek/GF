package charSequence;

public class ShiftedCharSequence implements CharSequence {

    public String shifted;
    public int num;

    public ShiftedCharSequence(String shifted, int num){
        this.shifted = shifted;
        this.num = num;
    }

    @Override
    public int length() {
        return toString().length();
    }

    @Override
    public char charAt(int index) {
        return toString().charAt(index + this.num);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return toString().subSequence(0, shifted.length());
    }
    @Override
    public String toString()
    {
        return shifted;
    }
}
