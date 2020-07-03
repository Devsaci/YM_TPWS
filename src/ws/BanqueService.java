package ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import metier.Compte;




/**
 * @author Zakaria
 * POJO PLain Old Java Project
 */
public class BanqueService {
public double conversion(double mt) {
	return mt*11;
}

public Compte getCompte(int code) {	
	return new Compte(code,Math.random()*9000,new Date());
}
public List<Compte> listComptes() {
	List<Compte> comptes=new ArrayList<>();
	comptes.add(new Compte(1,Math.random()*9000,new Date()));	
	comptes.add(new Compte(2,Math.random()*9000,new Date()));
	comptes.add(new Compte(3,Math.random()*9000,new Date()));
	return comptes;
	
}



}
