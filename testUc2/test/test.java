package test;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import businessLayer.MutantGenerator;
public class test {

		@Test
		void MutationGenerationTest1() {
		MutantGenerator mutgen = new MutantGenerator();
			ListString getmun = mutgen.mutantList("بنگلح");
			Assertions.assertEquals(getmun, mutgen.mutantList("بنگلح"));
		}
		@Test
		void MutationGenerationTest2() {
			MutantGenerator mutgen = new MutantGenerator();
			String testmutnt = "بنگلح";
			ListString getmun = null;
			Assertions.assertNotEquals(getmun, mutgen.mutantList("بنگلح"));
		
	}

}