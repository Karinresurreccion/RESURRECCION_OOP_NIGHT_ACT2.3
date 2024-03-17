
package main1;

public class AdvancedTextEditor extends TextEditor {
    private final String previousText;

    public AdvancedTextEditor(String initialText) {
        super(initialText);
        previousText = initialText;
    }
}
