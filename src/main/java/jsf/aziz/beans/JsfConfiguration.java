package jsf.aziz.beans;

import javax.faces.annotation.FacesConfig;
import javax.faces.annotation.FacesConfig.Version;
import javax.inject.Named;

/**
 * Configures the container to work in JSF 2.3 mode.
 */
@FacesConfig(version = Version.JSF_2_3)
@Named
public class JsfConfiguration {
  // nothing, used only to set the JSF compliancy.
}
