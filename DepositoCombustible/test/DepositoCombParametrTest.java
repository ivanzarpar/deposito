import static org.junit.Assert.*;
import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DepositoCombParametrTest {
private double depNivel;
private double amount;
private double res;

public DepositoCombParametrTest(double dn, double am, double r) { 
	depNivel=dn;
	amount=am;
	res=r;
}

@Parameters
public static Collection<Object[]> numeros(){
	
	return Arrays.asList(new Object[][] {
		{30.0,20.0,50.0},{30.0,5.0,35.0},{30.0,30.30,60.0}
	});
}

@Test
public void testFill() {
	DepositoCombustible dc=new DepositoCombustible(depNivel, amount);
	 dc.fill(20.0);
	
}
	
@Parameters
public static Collection<Object[]> menos(){
	
	return Arrays.asList(new Object[][] {
		{30.0,10.0,20.0},{30.0,5.0,25.0},{30.0,30.30,0.0}
	});
}

@Test
public void testConsumir() {
	DepositoCombustible dc=new DepositoCombustible(depNivel, amount);
	 dc.consumir(10.0);
	
}	

}
