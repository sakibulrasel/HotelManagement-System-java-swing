/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finance;


import dbconnect.DatabaseHelper;
import java.util.Map;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import javax.swing.JOptionPane;
/**
 *
 * @author Sameera
 */
public class Report_Generation {
    public void view(Map para, String Path){
        try {
            DatabaseHelper dbconnect = new DatabaseHelper();
            JasperReport jar = JasperCompileManager.compileReport(Path);
            JasperPrint jprint = JasperFillManager.fillReport(jar, para, dbconnect.getDBConnection());
            
            JasperViewer.viewReport(jprint, false);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
