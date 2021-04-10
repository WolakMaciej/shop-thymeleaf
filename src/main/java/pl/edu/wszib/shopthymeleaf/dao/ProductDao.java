package pl.edu.wszib.shopthymeleaf.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.shopthymeleaf.domain.Product;
@Repository
public interface ProductDao extends JpaRepository<Product,Long> {
}
