package br.com.bigsupermercados.api.util;

public class Util {

	public static String converteCodigo(String codMercadoria) {
		return String.format("%017d", Long.parseLong(codMercadoria));
	} 
}
