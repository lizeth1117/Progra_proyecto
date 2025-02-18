
package proyecto_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsuarioContra {

    public String username;
    public String password;
    public String fecha;
    public int puntos;
    public boolean activo;
   
    
    public UsuarioContra(){
    }
    public UsuarioContra(String user, String pass){  // constructor para crear objeto usuario
        username=user;
        password=pass;
        fecha = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        puntos=0;
        activo=true;
    }

    public int getPuntos() {
        return puntos;
    }

    public void sumaPuntos(int puntos) {
        this.puntos +=puntos;
    }
    
    public void setUser(String user){
        username=user;
        
    }
    public String getUser(){
        return username;
    }
    public void setPassword(String pass){
        password=pass;
    }
    public String getPassword(){
        return password;
    }
    
    public String getFecha() {
        return fecha;
    }

    public boolean isActivo() {
        return activo;
    }

   
}
