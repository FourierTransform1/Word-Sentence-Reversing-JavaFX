package Solution;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Stack;

public class Reverse {

    private Stack<Character> stack = new Stack<Character>();
    private ArrayList<Character> characters = new ArrayList<Character>();


    @FXML
    TextField text;

    @FXML
    TextField texxtfield;


    public void reverse(ActionEvent event) {
        String input = text.getText();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }


        StringBuilder sb = new StringBuilder(characters.size());
        String reversedWord = "";
        while (!stack.isEmpty()) {
            reversedWord += (stack.pop().toString());
        }

        System.out.println(stack);
        texxtfield.setText(reversedWord);
    }
}
