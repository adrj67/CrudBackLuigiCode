package com.tutorial.crud.service;

import com.tutorial.crud.entity.Producto;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tutorial.crud.repository.ProductoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
@Transactional
public class ProductoService {
    
    @Autowired
    ProductoRepository productoRepository;
    
    //para la Paginacion
    public Page<Producto> paginas (Pageable pageable){
        return productoRepository.findAll(pageable);
    }
    
    //Listar Todos
    public List<Producto> list(){
        return productoRepository.findAll();
    }
    
    //Buscar uno por ID
    public Optional<Producto> getOne(int id){
        return productoRepository.findById(id);
    }
    
    //Buscar uno por nombre
    public Optional<Producto> getByNombre (String nombre){
        return productoRepository.findByNombre(nombre);
    }
    
    //Guardar
    public void save (Producto producto){
        productoRepository.save(producto);
    }
    
    //Borrar
    public void delete (int id){
        productoRepository.deleteById(id);
    }
    
    //Verifica si existe el ID
    public boolean existsById (int id){
        return productoRepository.existsById(id);
    }
    
     //Verifica si existe el Nombre
    public boolean existsByNombre (String nombre){
        return productoRepository.existsByNombre(nombre);
    }
}
