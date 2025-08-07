package com.sw.spring_study.book.service;

import com.sw.spring_study.book.model.Book;
import com.sw.spring_study.book.model.BookDto;
import com.sw.spring_study.book.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public void register(BookDto.Register dto) {
        bookRepository.save(dto.toEntity());
    }

    public List<BookDto.Response> list() {
        List<Book> result = bookRepository.findAll();

        return result.stream().map(BookDto.Response::from).toList();
    }

    public BookDto.Response read(Integer idx) {
        Optional<Book> result = bookRepository.findById(idx);

        if (result.isPresent()) {
            Book entity = result.get();

            return BookDto.Response.from(entity);
        }

        return null;
    }

    public List<BookDto.Response> search(String title) {
        List<Book> result = bookRepository.findByTitleContaining(title);

        return result.stream().map(BookDto.Response::from).toList();
    }
}
