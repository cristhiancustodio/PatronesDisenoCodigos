package com.ejemplo.mvc;  
  
import com.vaadin.Application;  
import com.vaadin.ui.Window;  
  
public class MvcApplication extends Application {  
  private static final long serialVersionUID = 1L;  
  
  @Override  
  public void init() {  
    Window mainWindow = new Window("Mvc Application");  
    BaseVehiculos modelo = new BaseVehiculos();  
    VistaPrincipal mainView = new VistaPrincipal(modelo);  
    mainWindow.addComponent(mainView);  
    setMainWindow(mainWindow);  
  }  
}
