public class Teste {
    public static void main(String[] args) {
        Author autor1 = new Author("Machado de Assis", "machadoassis@gmail.com", 'M');
        Author autor2 = new Author("William Shakespeare", "william.shakespeare@yahoo.com", 'M');

        Book   livro1 = new Book("Dom Casmurro", autor1, 14.90, 20);
        Book   livro2 = new Book("Romeu e Julieta", autor2, 26.31, 50);

        System.out.println(livro1.toString() + "\n");
        System.out.println(livro2.toString() + "\n");
    } 
}
