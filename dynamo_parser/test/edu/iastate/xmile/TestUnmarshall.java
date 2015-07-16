package edu.iastate.xmile;

import static org.junit.Assert.*;

import java.util.List;

import javax.xml.bind.JAXBElement;

import org.junit.Test;
import org.oasis.xmile.v1_0.Auxvar;
import org.oasis.xmile.v1_0.Behavior;
import org.oasis.xmile.v1_0.Model;
import org.oasis.xmile.v1_0.ObjectFactory;
import org.oasis.xmile.v1_0.Variables;
import org.oasis.xmile.v1_0.Xmile;
import org.sdxchange.xmile.devkit.util.XmlHelper;

public class TestUnmarshall {

	@Test
	public void test() {
		XmlHelper<Xmile> helper = new XmlHelper<Xmile>();
		Xmile model = helper.unmarshall("/xmile.xml", "org.oasis.xmile.v1_0");
		assertNotNull(model);
		System.out.println(model);
		
		String xml = helper.marshal(model);
		System.out.println(xml);
	}
	
	@Test
	public void testMinimalDocument(){
		ObjectFactory factory = new ObjectFactory();
		Xmile model = factory.createXmile();
		List<Object> specs = model.getSimSpecsOrModelUnitsOrBehavior();
		Auxvar aux = factory.createAuxvar();
		aux.setName("MyFirstAuxiliary");
		List<Object> eqns = aux.getEqnOrMathmlOrUnits();
		JAXBElement<String> auxEqn = factory.createAuxvarElementEqn("Var3 + Var4");
		eqns.add(auxEqn);
		Model mod1 = factory.createModel();
		mod1.setName("Model1");
		Variables vars = factory.createVariables();				
		vars.getStockOrFlowOrAuxvar().add(aux);
		mod1.setVariables(vars);
		specs.add(mod1);		
		XmlHelper<Xmile> helper = new XmlHelper<Xmile>();
		String xml = helper.marshal(model);

	}
	

}
