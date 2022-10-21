package PostIt;

public class Main {

    public static void main(String[] args) {
	    PostIt example1 = new PostIt("orange", "Idea1", "Blue");
        PostIt example2 = new PostIt("pink", "Awesome", "Black");
        PostIt example3 = new PostIt("yellow", "Superb!", "Green");
        System.out.println(example1.backgroundColor + " " + example1.text + " " + example1.textColor);
        System.out.println(example1.text);
        System.out.println(example1.textColor);

    }
}
