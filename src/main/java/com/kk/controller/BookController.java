package com.kk.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kk.pojo.Books;
import com.kk.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.print.Book;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("bookService")
    private BookService bookService;

//    跳转到新增书籍页面
    @RequestMapping("toAddPage")
    public String toAddPage(){
        return "addBook";
    }

    @RequestMapping("toUpdatePage")
    public String toUpdatePage(int id,Model model){
        Books book = bookService.queryById(id);
        model.addAttribute("book",book);
        return "updateBook";
    }

//   查找所有书籍
    @RequestMapping("/findAll")
    public String ListBooks(Model model){
        List<Books> booksList = bookService.queryAllBook();
        model.addAttribute("books", booksList);
        return "playAll";
    }

//    分页查找
@RequestMapping("/fyFindAll")
public String fyBook(@RequestParam(defaultValue = "1", required = true, value = "pageNum") Integer pageNum, ModelMap modelMap){
        int pageSize = 3;
        PageHelper.startPage(pageNum,pageSize);
        List<Books> booksList = bookService.fyAllBook();
        PageInfo<Books> pages = new PageInfo<>(booksList);
        modelMap.addAttribute("pageInfo",pages);
        return "fyPlayAll";
}

//    通过id查找一本书籍
    @RequestMapping("/findById")
    public String findById(int id, Model model){
        Books book = bookService.queryById(id);
        model.addAttribute("book", book);
        return "playOne";
    }

//    添加一本书籍
    @RequestMapping("/addBook")
    public String addBook(Books books, Model model){
        bookService.addBook(books);
        model.addAttribute("book", books);
        return "redirect:/book/findAll";
    }

//    删除一本书籍
    @RequestMapping("/deleteBook")
    public String deleteBook(int id, Model model){
        System.out.println("books.id=>"+id);
        bookService.deleteBook(id);
        return "redirect:/book/findAll";
    }

//    修改书本信息
    @RequestMapping("/updateBook")
    public String updateBook(Books books, Model model){
        bookService.updateBook(books);
        System.out.println("books=>"+books);
        return "redirect:/book/findAll";
    }
}