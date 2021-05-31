package co.edu.ufps.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import co.edu.ufps.entity.Book;

public interface BookDao extends CrudRepository<Book, Integer> {

}
