package com.example.JewelleryProductDatabase.Service;

import com.example.JewelleryProductDatabase.Entity.Jewelleryproduct;

public interface JewelleryProductService {
             
	Jewelleryproduct addProduct(Jewelleryproduct jewelleryproduct);
	Jewelleryproduct update(String productname, Jewelleryproduct jewelleryproduct);
	void Delete(String productname);
	
}
