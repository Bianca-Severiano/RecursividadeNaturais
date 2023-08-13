package controller;

public class controlleNaturais {

	public controlleNaturais() {
		super();
	}

	public int SomaNaturais(int valor) {
		if (valor <= 0) {
			return 0;
		} else {
			return valor + SomaNaturais(valor - 1);
		}
	}

}

/*
f(3) = f(3) + f(2) 
f(2) = f(2) + f(1)
f(1) = f(1) + f(0)
f(0) = 0  <- PARADA 
*/