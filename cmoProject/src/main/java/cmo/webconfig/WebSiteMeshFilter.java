package cmo.webconfig;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

public class WebSiteMeshFilter extends ConfigurableSiteMeshFilter{

	@Override
	protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
		builder.addDecoratorPath("/general/*", "/decorators/dashboardGeneral")
			   .addExcludedPath("/login")
		       .addExcludedPath("/ajax/*");
		builder.addDecoratorPath("/pages/*", "/decorators/dashboardtheme")
		       .addExcludedPath("/login")
	           .addExcludedPath("/ajax/*");
	}
}