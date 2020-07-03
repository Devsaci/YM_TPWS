package metier;

import java.util.Date;

public class Compte {
private int code;
private double solde;
private Date dateCreation;
/**
 * @return the code
 */
public int getCode() {
	return code;
}
/**
 * @param code the code to set
 */
public void setCode(int code) {
	this.code = code;
}
/**
 * @return the solde
 */
public double getSolde() {
	return solde;
}
/**
 * @param solde the solde to set
 */
public void setSolde(double solde) {
	this.solde = solde;
}
/**
 * @return the dateCreation
 */
public Date getDateCreation() {
	return dateCreation;
}
/**
 * @param dateCreation the dateCreation to set
 */
public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}
public Compte(int code, double solde, Date dateCreation) {
	super();
	this.code = code;
	this.solde = solde;
	this.dateCreation = dateCreation;
}
public Compte() {
	super();
}





}
