package ttt;

import com.kk.pojo.Books;
import com.kk.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) context.getBean("bookService");
        for (Books book : bookService.fyAllBook()
             ) {
            System.out.println(book);
        }

    }
}
