
package Logica;

import Datos.vcarro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class fcarro {
    private conexion mysql = new conexion();
    private Connection cn=mysql.conectar();
    private String sSQL="";
    public Integer totalregistros;
    
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        
        String [] titulos = {"ID","Placa","Marca","Modelo","Motor","Cilindro","Color","Año","Puertas","Tipo","Estado","Precio","Descripcion"};
        
        String [] registro = new String[13];
        
        totalregistros = 0;
        modelo = new DefaultTableModel(null,titulos);
        sSQL="select * from carro where placa like '%"+buscar+"%' order by idcarro";
        try {
            Statement st= cn.createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            
            while(rs.next()){
                registro [0]=rs.getString("idcarro");
                registro [1]=rs.getString("placa");
                registro [2]=rs.getString("marca");
                registro [3]=rs.getString("modelo");
                registro [4]=rs.getString("motor");
                registro [5]=rs.getString("cilindraje");
                registro [6]=rs.getString("color");
                registro [7]=rs.getString("año");
                registro [8]=rs.getString("puertas");
                registro [9]=rs.getString("tipo");
                registro [10]=rs.getString("estado");
                registro [11]=rs.getString("precio");
                registro [12]=rs.getString("descripcion");
                
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);
            }
            return modelo;
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
        
    }
    
    public boolean insertar(vcarro dts){
        sSQL = "insert into carro (placa,marca,modelo,motor,cilindraje,color,año,puertas,tipo,estado,precio,descripcion)" +
                "values (?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setString(1, dts.getPlaca());
            pst.setString(2, dts.getMarca());
            pst.setString(3, dts.getModelo());
            pst.setDouble(4, dts.getMotor());
            pst.setInt(5, dts.getCilindro());
            pst.setString(6, dts.getColor());
            pst.setInt(7, dts.getAnio());
            pst.setInt(8, dts.getPuertas());
            pst.setString(9, dts.getTipo());
            pst.setString(10, dts.getEstado());
            pst.setDouble(11, dts.getPrecio());
            pst.setString(12, dts.getDescripcion());
            
            int n=pst.executeUpdate();
            
            if(n!=0){
                return true;
            }else{
                return false;
            }          
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    public boolean editar(vcarro dts){
        sSQL = "update carro set placa=?,marca=?,modelo=?,motor=?,cilindraje=?,color=?,año=?,puertas=?,tipo=?,estado=?,precio=?,descripcion=?"+
                "where idcarro=?";
                
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            
            pst.setString(1, dts.getPlaca());
            pst.setString(2, dts.getMarca());
            pst.setString(3, dts.getModelo());
            pst.setDouble(4, dts.getMotor());
            pst.setInt(5, dts.getCilindro());
            pst.setString(6, dts.getColor());
            pst.setInt(7, dts.getAnio());
            pst.setInt(8, dts.getPuertas());
            pst.setString(9, dts.getTipo());
            pst.setString(10, dts.getEstado());
            pst.setDouble(11, dts.getPrecio());
            pst.setString(12, dts.getDescripcion());
            pst.setInt(13, dts.getIdcarro());
            
            int n=pst.executeUpdate();
            if(n!=0){
                return true;
            }else{
                return false;
            }          
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    public boolean eliminar(vcarro dts){
        sSQL = "delete from carro where idcarro=?";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdcarro());
            int n=pst.executeUpdate();
            if(n!=0){
                return true;
            }else{
                return false;
            }          
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
}
