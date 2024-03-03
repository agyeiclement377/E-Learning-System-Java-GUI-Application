package javasemesterproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

public class AboutDevelopers extends JFrame{
    JTable groupMembers;
    JPanel tablePanel;
    JLabel title;
    public AboutDevelopers() {
        super("About Developer");
        setSize(620,380);
        setLocation(430,280);
        setLayout(new BorderLayout());
        
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("javasemesterproject/icons/systemIcon.png"));
        setIconImage(icon.getImage());
        
        title = new JLabel("Developers", JLabel.CENTER);
        title.setFont(new Font(Font.SERIF, Font.BOLD, 25));
        title.setBackground(Color.BLACK);
        title.setForeground(Color.WHITE);
        title.setOpaque(true);
        add(title, BorderLayout.NORTH);
        
        String[][] rowData = {{"01", "Agyei Clement", "<html>Project Lead and UI Designer<html>"},
        {"02", "Joseph Baffuor", "<html>Frontend Developer<html>"},
        {"03", "Nathaniel Afriyie", "<html>Backend Developer<html>"},
        {"04", "Bright Kekeli Amuzu", "<html>Public Relations & Advocacy Head<html>"},
        String columns[] = {"ID", "Name", "Contributions"};
        
        tablePanel = new JPanel(new BorderLayout());
        add(tablePanel, BorderLayout.CENTER);
        
        JTable table = new JTable(rowData, columns);
        table.setBackground(Color.ORANGE);
        table.setRowHeight(80);
        table.setFont(new Font(Font.MONOSPACED, Font.BOLD, 18));
        TableColumnModel colModel = table.getColumnModel();
        colModel.getColumn(0).setPreferredWidth(10);  
        colModel.getColumn(1).setPreferredWidth(110);    
        colModel.getColumn(2).setPreferredWidth(90);
        tablePanel.add(table.getTableHeader(), BorderLayout.NORTH);
        tablePanel.add(table, BorderLayout.CENTER);
        
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new AboutDevelopers();
    }
}
