
package main1;


public class TextEditor {
    private String text;

    public TextEditor(String initialText) {
        this.text = initialText;
    }

    public String getText() {
        return text;
    }

    public void setText(String newText) {
        this.text = newText;
    }
}
