package test;

import static org.junit.Assert.*; // utiliser les methodes sans Classe.methode


import java.util.ArrayList;
import static java.util.Arrays.*;

import org.junit.Test;

import code.DifferentSizeException;
import code.VectorHelper;

public class VectorHelperTest {
	

	@Test (expected =  DifferentSizeException.class)
	public final void testSommeTailleDiff() {
		
	VectorHelper v =  new VectorHelper();
	
	int []tab = new int[100], res =  new int[0];
	int [] tab1=  {1,6,-4,2,-5,8} , tab2  = {1,6}  ;
	
   if (v.somme(tab1, tab2)!= res) 
  fail("Somme de tableaux de taille diff .");
	}
//
	@Test
	public void testTri() {
		VectorHelper v =  new VectorHelper();
		//cas vide  
		int [] tab1 = new int [0] ,tab2 = new int[0];
		sort(tab1);
		v.Tri(tab2);
		assertArrayEquals("tab vid ",tab1, tab2); 
		//cas non vide
		int [] tab3=  {1,6,-4,2,-5,8} , tab4  = {1,6,-4,2,-5,8} ;
		sort(tab3);
		v.Tri(tab4);
		assertArrayEquals("tab alea",tab3, tab4);   //assertequals(theorique , pratique )
	}

	@Test
	public void testMinEtMax() {
		fail("Not yet implemented");
	}

}
