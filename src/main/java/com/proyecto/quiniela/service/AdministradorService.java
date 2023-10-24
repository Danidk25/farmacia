package com.proyecto.quiniela.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.proyecto.quiniela.entity.UsuarioL;


import com.proyecto.quiniela.repository.UsuarioLRepository;

@RestController
@RequestMapping("/proyecto")
@CrossOrigin
public class AdministradorService {
	@Autowired
	UsuarioLRepository usuarioLRepository;


//USUARIOS PARA EL LOGIN PROYECTO BD 1
	@PostMapping(path ="/loginul")//ABC -> A -> AgregarAdm LoginBueno para UsuarioL
	public UsuarioL loginul(@RequestBody UsuarioL usuarioL ) {
		List<UsuarioL> usuarioLs = usuarioLRepository.findByNombreusuarioAndPassword(usuarioL.getNombreusuario(), usuarioL.getPassword());
		
		if(usuarioLs!= null && !usuarioLs.isEmpty()) {
			return usuarioLs.get(0);
		}
		return null;
		}
		
		// consultas para usuarios login
		@GetMapping(path = "/busuario")//ABC -> C -> consultar usuarios login
	public List<UsuarioL> busuario(){
		return usuarioLRepository.findAll();
	}

	@PostMapping(path ="/ausuario")//ABC -> A -> Agregar Usuario login
	public UsuarioL ausurio(@RequestBody UsuarioL usuarioL ) {
		return usuarioLRepository.save(usuarioL);	
	}

	@DeleteMapping(path = "/eliminarul/{idusuario}") //ABC -> B ->Borrar Usuario login
	public void eliminarul(@PathVariable ("idusuario") int idusuario) {
		Optional<UsuarioL> usuarioL= usuarioLRepository.findById(idusuario);
		if(usuarioL.isPresent()) {
			usuarioLRepository.delete(usuarioL.get());
		}
	}















/* 
	//GET POST ANUNCIO-----------------
	@GetMapping(path = "/buscara")//ABC -> C -> ConsultarAn
	public List<Anuncio> buscara(){
		return anuncioRepository.findAll();
	}
	@PostMapping(path ="/guardara")//ABC -> A -> AgregarAn
	public Anuncio guardara(@RequestBody Anuncio anuncio ) {
		return anuncioRepository.save(anuncio);	
	}
	@GetMapping(path = "/buscar/desc")//ABC -> C -> ConsultarAnuncioDescendentemente
	public List<Anuncio>anunciosDesc(){
		return anuncioRepository.findAllByOrderByIdanuncioDesc();
	}
	@DeleteMapping(path = "/eliminara/{idanuncio}") //ABC -> B -> BorrarAnuncio
	public void eliminara(@PathVariable ("idanuncio") int idanuncio) {
		Optional<Anuncio> anuncio = anuncioRepository.findById(idanuncio);
		if(anuncio.isPresent()) {
			anuncioRepository.delete(anuncio.get());
		
		}
	}
	
	//GET POST DSL ADMINISTRADOR-------------
	@GetMapping(path = "/buscarad")//ABC -> C -> ConsultarAd
	public List<Administrador> buscarad(){
		return administradorRepository.findAll();
	}
	
	@PostMapping(path ="/guardarad")//ABC -> A -> AgregarAd
	public Administrador guardarad(@RequestBody Administrador administrador ) {
		return administradorRepository.save(administrador);	
	}
	
	@PostMapping(path ="/loginad")//ABC -> A -> AgregarAdm LoginBueno
	public Administrador loginad(@RequestBody Administrador administrador ) {
		List<Administrador> administradores = administradorRepository.findByEmailAndPassword(administrador.getEmail(), administrador.getPassword() );
		
		if(administradores!= null && !administradores.isEmpty()) {
			return administradores.get(0);
		}
		return null;
		}	
	//GET POST PAIS-------------------
	@GetMapping(path = "/buscarpa")//ABC -> C -> ConsultarPa
	public List<Pais> buscarpa(){
		return paisRepository.findAll();
	}
	
	@PostMapping(path ="/guardarpa")//ABC -> A -> AgregarPa
	public Pais guardarpa(@RequestBody Pais pais ) {
		return paisRepository.save(pais);	
	}
	@DeleteMapping(path = "/eliminarpa/{idpais}") //ABC -> B ->BorrarPais
	public void eliminarpa(@PathVariable ("idpais") int idpais) {
		Optional<Pais> pais= paisRepository.findById(idpais);
		if(pais.isPresent()) {
			paisRepository.delete(pais.get());
		}
	}
	//GET POST PARTIDO-----------------
	@GetMapping(path = "/buscarpar")//ABC -> C -> ConsultarPar
	public List<Partido> buscarpar(){
		return partidoRepository.findAll();
		}
		
	@PostMapping(path ="/guardarpar")//ABC -> A -> AgregarPar
	public Partido guardarpar(@RequestBody Partido partido ) {
		return partidoRepository.save(partido);	
		}
	@DeleteMapping(path = "/eliminarpar/{idpartido}") //ABC -> B -> BorrarPartido
	public void eliminarpar(@PathVariable ("idpartido") int idpartido) {
		Optional<Partido> partido = partidoRepository.findById(idpartido);
		if(partido.isPresent()) {
			partidoRepository.delete(partido.get());
		
		}
	}
	//GET POST QUINIELA-----------------
	@GetMapping(path = "/buscarq")//ABC -> C -> ConsultarQui
	public List<Quiniela> buscarq(){
		return quinielaRepository.findAll();
		}		
	@PostMapping(path ="/guardarq")//ABC -> A -> AgregarQui
	public Quiniela guardarq(@RequestBody Quiniela quiniela ) {
		return quinielaRepository.save(quiniela);	
		}
	@GetMapping(path = "/buscar/id/{usuarioIdusuario}")
	public List<Quiniela> quinielabuscar(@PathVariable("usuarioIdusuario") Integer usuarioIdusuario){
	return quinielaRepository.findByUsuarioIdusuario(usuarioIdusuario);
	}
	@DeleteMapping(path = "/eliminarq/{idquiniela}") //ABC -> B -> BorrarPais
	public void eliminarq(@PathVariable ("idquiniela") int idquiniela) {
		Optional<Quiniela> quiniela = quinielaRepository.findById(idquiniela);
		if(quiniela.isPresent()) {
			quinielaRepository.delete(quiniela.get());
		
		}
	}
	//GET POST USUARIO-----------------
	@GetMapping(path = "/buscaru")//ABC -> C -> ConsultarU
	public List<Usuario> buscaru(){
		return usuarioRepository.findAll();
		}
		
	@PostMapping(path ="/guardaru")//ABC -> A -> AgregarU
	public Usuario guardaru(@RequestBody Usuario usuario ) {
		return usuarioRepository.save(usuario);	
		}
	@DeleteMapping(path = "/eliminaru/{idusuario}") //ABC -> B -> BorrarPais
	public void eliminaru(@PathVariable ("idusuario") int idusuario) {
		Optional<Usuario> usuario = usuarioRepository.findById(idusuario);
		if(usuario.isPresent()) {
			usuarioRepository.delete(usuario.get());
		
		}
	}
	@PostMapping(path ="/loginu")//L ->  LoginBueno
	public Usuario loginu(@RequestBody Usuario usuario ) {
		List<Usuario> usuarios = usuarioRepository.findByCorreoAndPassword(usuario.getCorreo(), usuario.getPassword() );
			
		if(usuarios!= null && !usuarios.isEmpty()) {
			return usuarios.get(0);
		}
		return null;
		}
	//LLAMAR DSL USUARIO
	/*@GetMapping(path="/login/admin/{correo}/{password}")//ABC -> C consultar
	public List <Usuario> logincorreopassword(@PathVariable("correo") String correo, @PathVariable("password") String password){
		return usuarioRepository.findByCorreoAndPassword(correo,password);//Es select * from usuario
	}
	
	@GetMapping(path="/buscar/nombre/idusuario/{nombre}/{idusuario}")//ABC->C->Consultar de forma ordenada
	public List<Usuario>bucarnombreidusuario(@PathVariable("nombre") String nombre, @PathVariable("idusuario") Integer idusuario){
		return usuarioRepository.findByNombreAndIdusuario(nombre,idusuario);//=select*from orderby usuario desc
	}
	
	@GetMapping(path="/buscar/OrderBy")//ABC->C->Consultar de forma ordenada
	public List<Usuario>buscarOrderBy(){
		return usuarioRepository.findAllByOrderByNombreDesc();//=select*from orderby usuario desc
	}
	@GetMapping(path="/buscar/usuario/desc")//ABC->C->Consultar de forma ordenada
	public List<Usuario>buscarOrderByPunt(){
		return usuarioRepository.findFirst5ByOrderByPuntajeDesc();//=select*from orderby usuario desc
	}
 */
	

}
