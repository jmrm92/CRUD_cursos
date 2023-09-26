package com.juanma.ejemplo2.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.juanma.ejemplo2.model.Curso;
import com.juanma.ejemplo2.service.CursosServiceImpl;

@RestController
public class CursoControlador {

    @Autowired
    CursosServiceImpl service = new CursosServiceImpl();

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> listarCursos() {
        return service.listarCursos();
    }

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void altaCurso(@RequestBody Curso curso) {
        service.altaCurso(curso);
    }

    @DeleteMapping(value = "/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void eliminarCurso(@PathVariable String codigo) {
        service.eliminarCurso(codigo);
    }

    @GetMapping("/{codigo}")
    public Curso buscarCurso(@PathVariable String codigo) {
        return service.buscarCurso(codigo);
    }

    @PutMapping("/{codigo}/{duracion}")
    public void actualizarDuracion(@PathVariable String codigo, @PathVariable String duracion) {
        service.actualizarDuracion(codigo, duracion);
    }
}
