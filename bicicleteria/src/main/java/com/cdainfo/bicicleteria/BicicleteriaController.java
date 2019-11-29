package com.cdainfo.bicicleteria;

import java.util.List;

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
			return new ResponseEntity<>("ERROR",HttpStatus.BAD_REQUEST);
		}
		else return new ResponseEntity<>(b,HttpStatus.OK);
	}
}
