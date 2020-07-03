package ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.Compte;

/**
 * @author Zakaria POJO PLain Old Java Project
 */

@WebService(serviceName = "BanqueWS")
public class BanqueService {
	@WebMethod(operationName = "ConversionEuroToDH")
	public double conversion(@WebParam(name = "monton")double mt) {
		return mt * 11;
	}
	@WebMethod(operationName = "getCompte")
	public Compte getCompte(@WebParam(name = "code")int code) {
		return new Compte(code, Math.random() * 9000, new Date());
	}
	@WebMethod(operationName = "listComptes")
	public List<Compte> listComptes() {
		List<Compte> comptes = new ArrayList<>();
		comptes.add(new Compte(1, Math.random() * 9000, new Date()));
		comptes.add(new Compte(2, Math.random() * 9000, new Date()));
		comptes.add(new Compte(3, Math.random() * 9000, new Date()));
		return comptes;

	}

}
