package main;

import estore.services.interfaces.src.service.Bank;
import estore.services.interfaces.src.service.Client;
import core.Provider;
import estore.services.interfaces.src.service.Store;

public class Main {

	public static void main(String[] args) {
		Provider prov = new Provider();
		Bank bank = new Bank();
		Store store = new Store(prov,bank);
		Client cl = new Client(store);
		
		cl.run();

	}

}
