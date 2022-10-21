package com.company;

public class TodoPrint {
    public static void main(String[] args) {

        // Add "My todo:" to the beginning of the `todoText`
        // Add " - Download games" to the end of the `todoText`
        // Add " - Diablo" to the end of the `todoText` applying indention
        // Expected output:
        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        String todoText = " - Buy milk\n";
        StringBuilder myTodo = new StringBuilder(todoText);
        myTodo.insert(0, "My todo:\n");
        myTodo.append(" - Download games\n");
        myTodo.append("\t - Diablo");
        System.out.println(myTodo);
    }
}
