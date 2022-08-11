package com.example.demo.Controller;

import com.example.demo.dto.BookDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookController {
    @GetMapping()
    public ResponseEntity<List<BookDTO>> getBooks(){
        BookDTO book = BookDTO.builder().title("Hiii").build();
        BookDTO book2 = BookDTO.builder().title("HiiiAll").build();
        List<BookDTO> books = new ArrayList<>();
        books.add(book);
        books.add(book2);
        return  ResponseEntity.ok(books);
    }

}
