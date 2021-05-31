package co.edu.ufps.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ufps.Dao.BookDao;
import co.edu.ufps.dto.BookDto;
import co.edu.ufps.entity.Book;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookDao bookDao;
	
	@GetMapping("/saludar")
 public String saludar(HttpServletRequest request) {
	 return "hi";
 }
	
	
	@GetMapping("/listar")
 public List<Book> listar(HttpServletRequest request) {
	 return (List<Book>) bookDao.findAll();
 }
	@PostMapping()
 public List<Book> insertar() {
	 return (List<Book>) bookDao.findAll();
 }
	@PutMapping()
 public List<Book> update() {
	 return (List<Book>) bookDao.findAll();
 }
	@DeleteMapping()
	 public List<Book> delete() {
		 return (List<Book>) bookDao.findAll();
	 }
	
	@GetMapping("/listardto")
 public List<BookDto> listardto(HttpServletRequest request) {
		
		List<Book> books= (List<Book>) bookDao.findAll();
		List<BookDto> booksdto= new ArrayList<>();
		for(Book b: books) {
			BookDto bdto= new BookDto();
			bdto.setId(b.getId());
			bdto.setTitle(b.getTitle());
			bdto.setIsbn(b.getIsbn());
			bdto.setSignature(b.getSignature().getDescription());
			booksdto.add(bdto);
		}
				
				
	 return booksdto;
 }
}
