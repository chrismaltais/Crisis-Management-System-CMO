package cmo.webconfig;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

public class WebSiteMeshFilter extends ConfigurableSiteMeshFilter{

	@Override
	protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
		builder.addDecoratorPath("*/pages/911", "/decorators/dashboardtheme")
			   //.addDecoratorPath("/*", "/decorators/nodashboard")
			    // .addExcludedPath("/login")
			   // .addExcludedPath("/pages/911")
		       // .addExcludedPath("/ajax/*")
		       // .addExcludedPath("plugin/*")
		       .create();
	}
}