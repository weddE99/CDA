package com.cdainfo.bicicleteria;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cdainfo.bicicleteria.dominio.Bicicleta;
import com.cdainfo.bicicleteria.repository.BicicleteriaRepository;

@RestController
public class BicicleteriaController {
	@Autowired
	BicicleteriaRepository bicicleteriaRepository;
	
	@RequestMapping(value = "/bicicletas", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> getAllBicicletas(){
		List<Bicicleta> b = bicicleteriaRepository.findAll();
		if(b.isEmpty()) {
			return new ResponseEntity<>("ERROR, no se encontraron bicicletas! ",HttpStatus.BAD_REQUEST);
		}
		else return new ResponseEntity<>(b,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/bicicleta/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> getSpecificBicicletas(@PathVariable Long id){
		Optional<Bicicleta> b = bicicleteriaRepository.findById(id);
		if(b.isPresent()) {
			return new ResponseEntity<>(b,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("ERROR, bicicleta no encontrada! ",
					HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value = "/bicicleta/agregar", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<?> setBicicleta(@RequestBody Bicicleta body){
		try {
			Bicicleta b = bicicleteriaRepository.save(body);
			return new ResponseEntity<>(b,HttpStatus.OK);
		}
		catch(Exception e){
			return new ResponseEntity<>("ERROR, no se setearon datos!\nExcepcion -> "+e,
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
