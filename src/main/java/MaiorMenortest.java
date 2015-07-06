import org.junit.Assert;
import org.junit.Test;



public class MaiorMenortest {
@Test
	public void numerosEmQualquerOrdem() {
		MaiorMenor alg = new MaiorMenor();
		alg.encontra(new int[] { 4, 15, 7, 8 });
		Assert.assertEquals (4,alg.getMenor());
		Assert.assertEquals(15,alg.getMaior());
	}
@Test
public void numerosEmOrdemCrescente() {
	MaiorMenor alg = new MaiorMenor();
	alg.encontra(new int[] { 4, 7, 8, 15});
	Assert.assertEquals (4,alg.getMenor());
	Assert.assertEquals(15,alg.getMaior());
}
@Test
public void numerosEmOrdemDecrescente() {
	MaiorMenor alg = new MaiorMenor();
	alg.encontra(new int[] { 15, 8, 7, 4});
	Assert.assertEquals (4,alg.getMenor());
	Assert.assertEquals(15,alg.getMaior());
}
@Test
public void UmNumeros() {
	MaiorMenor alg = new MaiorMenor();
	alg.encontra(new int[] { 4,15});
	Assert.assertEquals (4,alg.getMenor());
	Assert.assertEquals(15,alg.getMaior());
}
}
