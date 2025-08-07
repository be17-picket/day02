package com.sw.spring_study.book.controller;

import com.sw.spring_study.book.model.BookDto;
import com.sw.spring_study.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody BookDto.Register dto) {
        bookService.register(dto);

        return ResponseEntity.status(200).body("등록 성공");
    }

    @GetMapping("/list")
    public ResponseEntity<List<BookDto.Response>> list() {
        List<BookDto.Response> response = bookService.list();

        return ResponseEntity.status(200).body(response);
    }

    @GetMapping("/read")
    public ResponseEntity<BookDto.Response> read(Integer idx) {
        BookDto.Response response = bookService.read(idx);

        return ResponseEntity.status(200).body(response);
    }


    @GetMapping("/search")
    public ResponseEntity<List<BookDto.Response>> search(String title) {
        List<BookDto.Response> response = bookService.search(title);

        return ResponseEntity.status(200).body(response);
    }


}
