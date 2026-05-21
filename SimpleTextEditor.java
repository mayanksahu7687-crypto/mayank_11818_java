

class Document {

    private StringBuffer textBuffer;

    public Document() {
        textBuffer = new StringBuffer();
    }
    
    public void addText(String text) {
        textBuffer.append(text);
    }

    public void clearText() {
        textBuffer.setLength(0);
    }

    public void reverseText() {
        textBuffer.reverse();
    }

    public void deleteText(int start, int end) {
        if (start >= 0 && end <= textBuffer.length() && start < end) {
            textBuffer.delete(start, end);
        } else {
            System.out.println("Invalid indices!");
        }
    }

    
    public void displayText() {
        System.out.println("Current Text: " + textBuffer);
    }
}


public class SimpleTextEditor {

    public static void main(String[] args) {

        
        Document doc = new Document();

      
        doc.addText("Hello World");
        System.out.println("Text after adding:");
        doc.displayText();
        
        doc.reverseText();
        System.out.println("Text after reverse:");
        doc.displayText();
        
        doc.deleteText(0, 5);
        System.out.println("Text after delete (0-5):");
        doc.displayText();
        
        doc.clearText();
        System.out.println("Text after clear:");
        doc.displayText();
    }
}
