package com.horyzont.bussapp.service;

import com.horyzont.bussapp.dao.AuthorDao;
import com.horyzont.bussapp.dao.BookDao;
import com.horyzont.bussapp.dao.BorrowDao;
import com.horyzont.bussapp.entities.AuthorEntity;
import com.horyzont.bussapp.entities.BookEntity;
import com.horyzont.bussapp.entities.BorrowEntity;
import com.horyzont.bussapp.entities.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class LibraryService {
    @Autowired
    AuthorDao authorDao;

    @Autowired
    BookDao bookDao;

    @Autowired
    BorrowDao borrowDao;

    public List<BookEntity> getAllBooks() {
        return bookDao.findAll();
    }

    public List<AuthorEntity> getAllAuthors() {
        return authorDao.findAll();
    }

    public List<BorrowEntity> getAllBorrows() {
        return borrowDao.findAll();
    }

    public void borrowBook(Integer studentId, Integer bookId) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId(studentId);

        BookEntity bookEntity = new BookEntity();
        bookEntity.setId(bookId);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date borrowDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(borrowDate);
        c.add(Calendar.DATE, 1);
        Date returnDate = c.getTime();


        BorrowEntity borrowEntity = new BorrowEntity();
        borrowEntity.setBook_id(bookEntity);
        borrowEntity.setStudent_id(studentEntity);
        borrowEntity.setStatus(false);
        borrowEntity.setReturn_date(sdf.format(returnDate));
        borrowEntity.setBorrow_date(sdf.format(borrowDate));
        borrowDao.save(borrowEntity);
    }
}
