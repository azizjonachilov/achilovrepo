package jsf.aziz.beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author Azizjon Achilov
 * Created: 24.09.2019
 */
@Named
@ViewScoped
public class SelectboxBean implements Serializable {

  @Inject
  private FacesContext facesContext;

  private boolean checked1;

  private Boolean checked2;


  public boolean isChecked1() {
    return checked1;
  }


  public void setChecked1(boolean checked1) {
    this.checked1 = checked1;
  }


  public Boolean getChecked2() {
    return checked2;
  }


  public void setChecked2(Boolean checked2) {
    this.checked2 = checked2;
  }

  public void onClickChecked1() {
    this.facesContext.addMessage(null, new FacesMessage("checkbox 1 clicked", "checked 1"));
  }

  public void onClickChecked2() {
    this.facesContext.addMessage(null, new FacesMessage("checkbox 2 clicked", "checked 2"));
  }
}
