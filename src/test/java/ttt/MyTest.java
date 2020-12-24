package ttt;

import com.kk.pojo.Books;
import com.kk.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.print.Book;
import java.util.List;

public class MyTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        BookService bookService = context.getBean("bookService",BookService.class);
        List<Books> books = bookService.queryAllBook();
        for (Books book : bookService.fyAllBook()
             ) {
            System.out.println(book);
        }

    }








}
