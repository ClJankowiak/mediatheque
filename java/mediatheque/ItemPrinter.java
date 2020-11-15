package mediatheque;

public class ItemPrinter implements ItemVisitor{
	
    @Override
    public void visit(Book book) {
        System.out.println("Book : " + book);
    }

    @Override
    public void visit(CD cd) {
        System.out.println("CD : " + cd);
    }
}
