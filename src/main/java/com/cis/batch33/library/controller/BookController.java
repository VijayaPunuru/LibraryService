package com.cis.batch33.library.controller;
import com.cis.batch33.library.entity.LibraryBook;
import com.cis.batch33.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/{bookid}")
    public LibraryBook getBook(@PathVariable Integer bookid){
        return bookService.getBook(bookid);
    }

    @PostMapping
    public LibraryBook createBook(@RequestBody LibraryBook book){
        return bookService.createBook(book);
    }

    @PutMapping("/{bookid}")
    public LibraryBook updateBook(@RequestBody LibraryBook book,@PathVariable Integer bookid){
        return bookService.updateBook(book,bookid);
    }
    @DeleteMapping("/{bookid}")
    public void deleteBook(@PathVariable Long id) {
    }
}
