import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SoftwareQualityClassTest {

	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

	@Test
	public void testSoftwareQualityClass() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalculaEvidencia() {
		List<Objeto> evidencias = new ArrayList<Objeto>();
		Objeto objAux = new Objeto("gpr1", "Teste de qualidade de software", "3", 3, "");
		evidencias.add(objAux);
		
		Integer somaGpr = 0;
		Integer valor = 0;
		Integer qntdEvidencia = 0;
		Integer mediaGpr = 0;
		
		for(Objeto obj : evidencias)
		{
			String referencia = obj.getReferencia();
			String evidencia = obj.getEvidencia();
			String fatorEvidencia = obj.getFatorEvidencia();
			
			if(evidencia.contains(";"))
			{
				qntdEvidencia = 0;
				String[] gprns = fatorEvidencia.split(";");
				
				for(String stringGprn : gprns)
				{
					valor = Integer.parseInt(stringGprn);
					somaGpr = somaGpr + valor;
					qntdEvidencia++;
				}
				mediaGpr = somaGpr/qntdEvidencia;
				obj.setMediaEvidencia(mediaGpr);
//				System.out.println(referencia + ": " + mediaGpr);
			}
			else
			{
				qntdEvidencia = 0;
				if(!fatorEvidencia.isEmpty())
				{
					valor = Integer.parseInt(fatorEvidencia);
					qntdEvidencia++;
					mediaGpr = valor;
					obj.setMediaEvidencia(mediaGpr);
//					System.out.println(referencia + ": " + mediaGpr);
				}
				else
				{
//					System.out.println(referencia + ": none");
				}
			}
		}
	}

	@Test
	public void testCalculaCapacidadeProcesso() {
		fail("Not yet implemented");
	}

	@Test
	public void testGeraRelatorio() {
		fail("Not yet implemented");
	}

	@Test
	public void testObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	public void testClone() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testWait() {
		fail("Not yet implemented");
	}

	@Test
	public void testFinalize() {
		fail("Not yet implemented");
	}

}
