package mediatheque;

public class CDPrinter implements ItemVisitor {
	
    @Override
    public void visit(Book book) {
    }

    @Override
    public void visit(CD cd) {
        System.out.println("CD : " + cd);
    }
}
