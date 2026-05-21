// Simple Text Editor Logic Using OOP Concepts in Java

class Document {

    // Private StringBuffer for encapsulation
    private StringBuffer textBuffer;

    // Constructor
    public Document() {
        textBuffer = new StringBuffer();
    }

    // Method to add text
    public void addText(String text) {
        textBuffer.append(text);
    }

    // Method to clear text
    public void clearText() {
        textBuffer.setLength(0);
    }

    // Method to reverse text
    public void reverseText() {
        textBuffer.reverse();
    }

    // Method to delete text from start index to end index
    public void deleteText(int start, int end) {
        if (start >= 0 && end <= textBuffer.length() && start < end) {
            textBuffer.delete(start, end);
        } else {
            System.out.println("Invalid indices!");
        }
    }

    // Method to display text
    public void displayText() {
        System.out.println("Current Text: " + textBuffer);
    }
}

// Main Class
public class SimpleTextEditor {

    public static void main(String[] args) {

        // Creating Document object
        Document doc = new Document();

        // Adding text
        doc.addText("Hello World");
        System.out.println("Text after adding:");
        doc.displayText();

        // Reversing text
        doc.reverseText();
        System.out.println("Text after reverse:");
        doc.displayText();

        // Deleting text
        doc.deleteText(0, 5);
        System.out.println("Text after delete (0-5):");
        doc.displayText();

        // Clearing text
        doc.clearText();
        System.out.println("Text after clear:");
        doc.displayText();
    }
}