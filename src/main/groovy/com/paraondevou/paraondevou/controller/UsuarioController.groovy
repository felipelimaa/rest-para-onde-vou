package com.paraondevou.paraondevou.controller

import com.paraondevou.paraondevou.entity.Usuario
import com.paraondevou.paraondevou.repository.UsuarioRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/usuario")
class UsuarioController {
    @Autowired
    UsuarioRepository usuarioRepository

    @GetMapping("/{id}")
    ResponseEntity listar(@PathVariable("id") Long id) {
        Optional<Usuario> usuarioBD = usuarioRepository.findById(id)

        if (usuarioBD) {
            ResponseEntity.ok(usuarioDB.get())
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @GetMapping("/all")
    Usuario listarTudo() {
        List<Usuario> lista = usuarioRepository.findAll()
    }

    @PostMapping("/")
    ResponseEntity<Usuario> inserirNovo(@RequestBody Usuario usuario) {
        def usuarioBD = usuarioRepository.findByEmail(usuario.email)

        if (usuarioBD) {
            ResponseEntity.status(HttpStatus.FORBIDDEN).body(usuario)
        } else {
            usuarioRepository.save(usuario)
            ResponseEntity.ok(usuario)
        }
    }
}
