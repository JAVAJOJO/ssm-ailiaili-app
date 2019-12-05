package com.how2java.mapper;
 
import java.util.List;

import com.how2java.pojo.Category;
import com.how2java.util.Page;
import org.springframework.stereotype.Repository;

import javax.servlet.annotation.WebServlet;
@Repository

public interface CategoryMapper {

    public void add(Category category);

    public void delete(int id);  
       
      
    public Category get(int id);  
     
      
    public int update(Category category);   
       
      
    public List<Category> list();

    public List<Category> list(Page page);


    public int total();
}