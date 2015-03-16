package control;

import com.fuzzylite.Engine;
import com.fuzzylite.FuzzyLite;
import com.fuzzylite.Op;
import com.fuzzylite.rule.Rule;
import com.fuzzylite.rule.RuleBlock;
import com.fuzzylite.term.Triangle;
import com.fuzzylite.variable.InputVariable;
import com.fuzzylite.variable.OutputVariable;

public class Analyzer_TestData {

	//contains players values
	double[] values;
	
	public Analyzer_TestData(double[] values) {
		this.values = values;
	}
	
	public String run() {
		
		Engine engine = new Engine("simple-dimmer");
		 
		 InputVariable ambient = new InputVariable();
		 ambient.setName("Ambient");
		 ambient.setRange(0.000, 1.000);
		 ambient.addTerm(new Triangle("DARK", 0.000, 0.500));
		 ambient.addTerm(new Triangle("MEDIUM", 0.250, 0.750));
		 ambient.addTerm(new Triangle("BRIGHT", 0.500, 1.000));
		 engine.addInputVariable(ambient);
		 
		 OutputVariable power = new OutputVariable();
		 power.setName("Power");
		 power.setRange(0.000, 1.000);
		 power.setDefaultValue(Double.NaN);
		 power.addTerm(new Triangle("LOW", 0.000, 0.500));
		 power.addTerm(new Triangle("MEDIUM", 0.250, 0.750));
		 power.addTerm(new Triangle("HIGH", 0.500, 1.000));
		 engine.addOutputVariable(power);
		 
		 RuleBlock ruleBlock = new RuleBlock();
		 ruleBlock.addRule(Rule.parse("if Ambient is DARK then Power is HIGH", engine));
		 ruleBlock.addRule(Rule.parse("if Ambient is MEDIUM then Power is MEDIUM", engine));
		 ruleBlock.addRule(Rule.parse("if Ambient is BRIGHT then Power is LOW", engine));
		 engine.addRuleBlock(ruleBlock);
		 
		 //No Conjunction or Disjunction is needed
		 engine.configure("", "", "AlgebraicProduct", "AlgebraicSum", "Centroid");
		  
		 StringBuilder status = new StringBuilder();
		 if (!engine.isReady(status))
		      throw new RuntimeException("Engine not ready. " +
		            "The following errors were encountered:\n" + status.toString());

		 for (int i = 0; i < 50; ++i){
		     double light = ambient.getMinimum() + i * (ambient.range() / 50);
		     ambient.setInputValue(light);
		     engine.process();
		     FuzzyLite.logger().info(String.format(
		            "Ambient.input = %s -> Power.output = %s", 
		            Op.str(light), Op.str(power.defuzzify())));
		 }
		
		String string ="";
		
		//DO CALCULATIONS AND APPEND POSSIBLE POSITIONS to string SUCH AS: MF, ZM, ST
		string = "MF";
		
		
		return string;
	}
}
