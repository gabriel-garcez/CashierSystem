package manager;


import java.io.InputStream;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import Products.Products;
import Rules.Rules;


public class YamlManager {

	public Products getProductsYaml()  {
		Yaml yaml = new Yaml(new Constructor(Products.class));
		InputStream inputStream = this.getClass()
		  .getClassLoader()
		  .getResourceAsStream("priv/assets/products.yaml");
		Products products = yaml.load(inputStream);
		return products;
	}
	
	public Rules getRulesYaml()  {
		Yaml yaml2 = new Yaml(new Constructor(Rules.class));
		InputStream inputStream2 = this.getClass()
		  .getClassLoader()
		  .getResourceAsStream("priv/assets/rules.yaml");
		Rules rules = yaml2.load(inputStream2);
		return rules;
	}
		
}

