package com.example.JewelleryProductDatabase.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.JewelleryProductDatabase.Entity.Jewelleryproduct;
import com.example.JewelleryProductDatabase.Service.JewelleryProductService;

@RestController
public class JewelleryProductController {
@Autowired
JewelleryProductService jewelleryproductservice;
	@PostMapping("/post")
	public Jewelleryproduct addProducts(@RequestBody Jewelleryproduct jewelleryproduct) {
		
		return jewelleryproductservice.addProduct(jewelleryproduct);
	}
	
	@PutMapping("/update")
public Jewelleryproduct update(@RequestHeader String productname,@RequestBody Jewelleryproduct jewelleryproduct) {
		
		return jewelleryproductservice.update(productname, jewelleryproduct);
	}
	
	@DeleteMapping("delete")
	public String delete(@RequestHeader String productname) {
		jewelleryproductservice.Delete(productname);
		return "data deleted";
	}
	
}
