package com.cdainfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdainfo.dominio.Impuesto;
import com.cdainfo.dominio.ImpuestoPorContribuyente;
import com.cdainfo.repository.ContribuyenteRepository;
import com.cdainfo.repository.ImpuestoPorContribuyenteRepository;
import com.cdainfo.repository.ImpuestoRepository;

@RestController
public class AfipController {
	@Autowired
	ImpuestoRepository impuestoRepository;
	
	@Autowired
	ContribuyenteRepository contribuyenteRepository;
	
	@Autowired
	ImpuestoPorContribuyenteRepository impuestoPorContribuyenteRepository;

    @GetMapping("/afip/impuestos")
    public List<Impuesto> getAllImpuestos() {
        return impuestoRepository.findAll();
    }
    
    @GetMapping("/afip/impuesto/{tipo_impuesto}")
    public Impuesto getSpecificImpuesto(@PathVariable String tipo_impuesto) {
    	return impuestoRepository.findByTipoImpuestoLike(tipo_impuesto);
    }
    
    @GetMapping("/afip/impuestos/{clave_fiscal}")
    public List<ImpuestoPorContribuyente> getSImpuestosFromClaveFiscal(@PathVariable Long clave_fiscal) {
    	return impuestoPorContribuyenteRepository.findByNumeroFiscalLike(clave_fiscal);
    }
    
    @GetMapping("/afip/impuestos/{fecha_desde}/{fecha_hasta}")
    public List<Impuesto> getAllImpuestosByFecha(@PathVariable String fecha_desde, @PathVariable String fecha_hasta){
    	return impuestoRepository.findByFechaLiquidacionBetween(fecha_desde, fecha_hasta);
    }
    
    @PutMapping("/afip/impuesto/{tipo_impuesto}/{fecha}")
    public Impuesto updateFechasImpuestos(@PathVariable String tipo_impuesto,
    		@PathVariable String fecha){
    	Impuesto i = this.getSpecificImpuesto(tipo_impuesto);
    	i.setFechaLiquidacion(fecha);
    	return impuestoRepository.save(i);
    }
    
    @PostMapping("/afip/altaImpuesto")
    public ImpuestoPorContribuyente createContribuyente(@RequestBody ImpuestoPorContribuyente body) {
        return impuestoPorContribuyenteRepository.save(body);
    }
}
