package Controlador;

import ConexionBD.ConexionBD;
import Modelo.Alumno;

//DAO Data Access Objet
public class AlumnoDAO {
    //Metodos ABCC (CRUD)
    ConexionBD conexion = new ConexionBD();
    //==================================Altas===================================
    public boolean agregarAlumno(Alumno a){
        boolean res= false;
        /*
        *Proceso Altas en MySQL
        *  INSERT INTO alumnos VALUES("01","Goku","-","-",34,10,'ISC');
        *
        */
        String sql="INSERT INTO alumnos VALUES('"+a.getNumControl()+"','"+a.getNombre()+"','"+a.getPrimerAp()+"','"+a.getSegundoAp()+
                "',"+a.getEdad()+","+a.getSemestre()+",'"+a.getCarrera()+"')";

        res = conexion.ejecutarInstruccionDML(sql);

        return res;
    }

    //==================================Bajas===================================
    public boolean eliminarAlumno(String numControl){
    boolean res= false;

        String sql="DELETE FROM alumnos WHERE NumeroControl='"+numControl+"'";
        res = conexion.ejecutarInstruccionDML(sql);
    return res;
    }

    public boolean actualizarAlumno (Alumno a){
        boolean res= false;
        // UPDATE alumnos SET Nombre='x', PrimerAp="x",SegundoAp="x",Edad=0,Semestre=1,Carrera='x' WHERE NumeroControl='02';
        String sql="UPDATE alumnos SET '"+a.getNombre()+"','"+a.getPrimerAp()+"','"+a.getSegundoAp()+
                "',"+a.getEdad()+","+a.getSemestre()+",'"+a.getCarrera()+"' WHERE NumeroControl='"+a.getNumControl()+"'";
        res = conexion.ejecutarInstruccionDML(sql);
        return res;
    }
    //==================================Cambios=================================
    //==================================Consultas===============================


}
