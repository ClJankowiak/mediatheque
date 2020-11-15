package mediatheque;

public class BookPrinter implements ItemVisitor {
	
    @Override
    public void visit(Book book) {
        System.out.println("Book : " + book);
    }

    @Override
    public void visit(CD cd) {
    }
}
