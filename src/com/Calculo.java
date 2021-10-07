package com;

public class Calculo {

	public void calcular(String ent) {
		String result = "";
		String[] entFinal = ent.split(" ");
		String arg1;
		String arg2;
		
		if(entFinal.length > 1) {
			arg1 = entFinal[0];
			arg2 = entFinal[1];
			
			String[] entLeft = arg1.split("->|v|\\^");
			String[] entRight = arg2.split("->|v|\\^");
			String a;
			String b;
			String c;
			
			if(entLeft.length > 1) {
				if(entRight.length > 1) {
					a = entLeft[0];
					b = entLeft[1];
					String bL = entRight[0];
					c = entRight[1];
					
					if(b.contains(b) && bL.contains(b)) {
						result = "Silogismo Hipotético, resultado é: " + a + "->" + c;
					}
					else {
						result = "Entrada inválida.";
					}
					
				}
				else {
					if(arg1.contains("->")) {
						a = entLeft[0];
						b = entLeft[1];
						String bR = entRight[0];
						if(arg2.contains("~")) {
							if(b.contains(b) && bR.contains(b)) {	
								result = "Modus Tollens, resultado é: " + "~" + a;
							}
						}
						else {
							result = "Entrada inválida.";
						}
					}
					else if(arg1.contains("v")) {
						a = entLeft[0];
						b = entLeft[1];
						String aL = entRight[0];
						if(arg2.contains("~")) {
							if(b.contains(b) && aL.contains(b)) {	
								result = "Silogismo Disjuntivo, resultado é: " + a;
							}
							else if(b.contains(b) && aL.contains(a)) {
								result = "Silogismo Disjuntivo, resultado é: " + b;
							}
							else {
								result = "Entrada inválida.";
							}
						}
					}
					else {
						result = "Entrada inválida.";
					}
				}
			}
			else {
				if(entRight.length > 1) {
					a = entLeft[0];
					
					if(arg2.contains("->")) {
						String aL = entRight[0];
						String bL = entRight[1];

						if(a.contains(aL) && aL.contains(aL)) {
							result = "Modus Ponens, resultado é: " +  bL;
						}
						else {
							
							result = "Entrada inválida.";
						}
					}
				}
				else {
					a = entLeft[0];
					b = entRight[0];
					
					result = "Conjunção, resultado é: " + a + "^" + b + "|" + b + "^" + a;
				}
			}
		}
		else {
			arg1 = entFinal[0];
			String[] entLeft = arg1.split("->|v|\\^");
			String a;
			String b;
			if(entLeft.length > 1) {
				a = entLeft[0];
				b = entLeft[1];
				
				if(arg1.contains("^")) {
					result = "Simplificação, resultado é: " + a + "|" + b;
				}
				else {
					result = "Entrada inválida.";
				}
			}
			else {
				a = entLeft[0];
				result = "Adição, resultado é: " + a + "v" + (((char)((int)a.charAt(0) + 1))) + "|"  + (((char)((int)a.charAt(0) + 1))) + "v" + a ;
			}
		}
		
		System.out.println(result);
	}
	
}
