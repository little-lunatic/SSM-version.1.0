package ttt;

import com.kk.pojo.Books;
import com.kk.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.print.Book;

public class MyTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        BookService bookService = context.getBean("bookService",BookService.class);
        Books b = new Books();
        b.setBookName("asdsa");
        b.setCounts(55);
        b.setDetail("卡山谷的比较火爆");
        bookService.addBook(b);
        int i = 1/0;
        for (Books book : bookService.fyAllBook()
             ) {
            System.out.println(book);
        }

    }








}
