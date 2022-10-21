public class Main {

    private Service service;

    public Main() {
        service = new Service();
    }

    public static void main(String[] args) {

        Main main = new Main();
        if (args.length == 0) {
            main.service.printHelp();
            System.exit(0);
        }

        switch (args[0]) {
            case "-l": {
                main.service.printTask();
                break;
            }
            case "-a": {
                try {
                    main.service.addTask(args[1]);
                    break;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Unable to add: no task provided");
                }
            }
            case "-r": {
                try {
                    main.service.removeTask(args[1]);
                    break;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Unable to remove: no index provided");
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Unable to remove: index is out of bound");
                } catch (NumberFormatException e) {
                    System.out.println("Unable to remove: index is not a number");
                }
            }
            default:
                System.out.println("\n" + "Unsupported argument" + "\n");
                main.service.printHelp();
        }
    }
}
