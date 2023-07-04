package com.horyzont.bussapp.controller;

import com.horyzont.bussapp.dto.BorrowBookDto;
import com.horyzont.bussapp.entities.AuthorEntity;
import com.horyzont.bussapp.entities.BookEntity;
import com.horyzont.bussapp.entities.BorrowEntity;
import com.horyzont.bussapp.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library")
class LibraryController {
    @Autowired
    LibraryService libraryService;

    @GetMapping("/getAllAuthors")
    public List<AuthorEntity> getAllAuthors() {
        return libraryService.getAllAuthors();
    }

    @GetMapping("/getAllBooks")
    public List<BookEntity> getAllBooks() {
        return libraryService.getAllBooks();
    }

    @GetMapping("/getAllBorrows")
    public List<BorrowEntity> getAllBorrows() {
        return libraryService.getAllBorrows();
    }

    @PostMapping("/borrowBook")
    public void borrowBook(@RequestBody BorrowBookDto borrowBookDto) {
        libraryService.borrowBook(borrowBookDto.getStudentId(), borrowBookDto.getBookId());
    }
}