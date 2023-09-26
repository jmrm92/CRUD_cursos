package com.juanma.ejemplo2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.juanma.ejemplo2.model.Curso;

@Service
public class CursosServiceImpl implements CursosService {
 
        private List<Curso> cursos;

        public CursosServiceImpl (){
            cursos = new ArrayList<>();
            
            cursos.add(new Curso("1234", "Java", 90, 200));
            cursos.add(new Curso("5678", "Python", 60, 150));
            cursos.add(new Curso("9012", "JavaScript", 75, 180));
        }
    
        @Override
        public void altaCurso(@RequestBody Curso curso) {
            cursos.add(curso);
        }

        @Override
        public List<Curso> eliminarCurso(@PathVariable String codigo) {
            cursos.removeIf(curso -> curso.getCodigo().equals(codigo));
                return cursos;
        }

        public Curso buscarCurso(@PathVariable String codigo) {
            return cursos.stream()
                    .filter(curso -> curso.getCodigo().equals(codigo))
                    .findFirst()
                    .orElse(null);
        }

        @Override
        public void actualizarDuracion(@PathVariable String codigo, @PathVariable String duracion) {
            Curso curso = cursos.stream()
                    .filter(c -> c.getCodigo().equals(codigo))
                    .findFirst()
                    .orElse(null);
                    
            if (curso != null) {
                curso.setDuracion(Integer.parseInt(duracion));
            }
        }

        @Override
        public List<Curso> listarCursos() {
            return cursos;
        }
}