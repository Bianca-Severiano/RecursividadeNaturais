package view;

import controller.controlleNaturais;

public class principalNatural {

	public static void main(String[] args) {
		int valor = -3;
		controlleNaturais nc = new controlleNaturais();
		int res = nc.SomaNaturais(valor);
		System.out.println(res);

	}

}

/*
f(3) = f(3) + f(2) 
f(2) = f(2) + f(1)
f(1) = f(1) + f(0)
f(0) = 0  <- PARADA 
*/