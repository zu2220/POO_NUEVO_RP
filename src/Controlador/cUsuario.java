package Controlador;

import Clases.Usuario;
import Modelo.UsuarioDao;
import java.util.List;

public class cUsuario {
   public List<Usuario> getUsuarios() { 
       UsuarioDao obj = new UsuarioDao();
       return obj.getUsuarios();
   }
   
   public Usuario validarCredenciales(String login, String clave) {
       UsuarioDao obj = new UsuarioDao();
       return obj.validarCredenciales(login, clave);
   }
   
   public boolean add(Usuario obj) {
       UsuarioDao objD = new UsuarioDao();
       return objD.add(obj);
   }
}
