package com.example.JewelleryProductDatabase.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.JewelleryProductDatabase.Entity.Jewelleryproduct;
import com.example.JewelleryProductDatabase.Exception.ResourceNotFoundException;
import com.example.JewelleryProductDatabase.Repository.JewelleryProductRepo;
import com.example.JewelleryProductDatabase.Service.JewelleryProductService;

@Service
public class JewelleryProductServiceimpl implements JewelleryProductService{

	
	@Autowired
	JewelleryProductRepo jewelleryproductrepo;
	@Override
	public Jewelleryproduct addProduct(Jewelleryproduct jewelleryproduct) {
		// TODO Auto-generated method stub
		return jewelleryproductrepo.save(jewelleryproduct);
	}
	
	@Override
	public Jewelleryproduct update(String productname, Jewelleryproduct jewelleryproduct) {
		// TODO Auto-generated method stub
Jewelleryproduct s1 = jewelleryproductrepo.findByName(productname);
		
		if(s1!=null) {
			   
			s1.setProductdescription(jewelleryproduct.getProductdescription());;// old to new set
			s1.setProducturl(jewelleryproduct.getProducturl());;
		return jewelleryproductrepo.save(s1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		}
	}

	@Override
	public void Delete(String productname) {
		// TODO Auto-generated method stub
Jewelleryproduct s2 = jewelleryproductrepo.findByName(productname);
		
		if(s2!=null) {
			jewelleryproductrepo.delete(s2);;
		}
		else {
			throw new ResourceNotFoundException();
		}	
		
		
	}

	
}
