package com.juanma.ejemplo2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.juanma.ejemplo2.model.Curso;

@Service
public interface CursosService {
 
        List<Curso> cursos = new ArrayList<>();
        public void altaCurso(@RequestBody Curso curso);
        public List<Curso> eliminarCurso(@PathVariable String codigo);
        public Curso buscarCurso(@PathVariable String codigo);
        public void actualizarDuracion(@PathVariable String codigo, @PathVariable String duracion);
        public List<Curso> listarCursos();
}
