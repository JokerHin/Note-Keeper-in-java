package com.mycompany.project;

import java.awt.FileDialog;

import javax.swing.JFrame;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMenu {
	
	public static JFrame frame;
	public static String fileName;
	public static String filePath;
	public static String directory;
	
	public static void newFile() {
            Project.textArea.setText("");
            Project.frame.setTitle("New");
	}
	public static void openFile() {
            FileDialog filedialog = new FileDialog(frame, "Open File", FileDialog.LOAD);
            filedialog.setVisible(true);
		
            if (filedialog.getFile() != null) {
		directory = filedialog.getDirectory();
		fileName = filedialog.getFile();
		filePath = directory + fileName;
		Project.frame.setTitle(fileName);
			
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
                    String Line;
                    Project.textArea.setText("");
                    while((Line = reader.readLine()) != null) {
                        Project.textArea.append( Line + "\n");
                    }
		}
		catch (IOException e) {
                    System.out.println("File not opened");
		}
            }
	}
	public static void saveAs() {
            FileDialog filedialog = new FileDialog(frame, "Save As...", FileDialog.SAVE);
            filedialog.setVisible(true);
		
            if (filedialog.getFile() != null) {
		directory = filedialog.getDirectory();
		fileName = filedialog.getFile();
		filePath = directory + fileName;
		Project.frame.setTitle(fileName);
			
		try {
                    FileWriter writer = new FileWriter(filePath);
                    writer.write(Project.textArea.getText());
                    writer.close();
				
                }
		catch (IOException e) {
                    System.out.println("File can not be saved");
		}
            }
	}
	public static void save() {
            if (fileName == null) {
		saveAs();
            }
            else {
		try {
                    FileWriter writer = new FileWriter(filePath);
                    writer.write(Project.textArea.getText());
                    writer.close();
				
		}
		catch (IOException e) {
                    System.out.println("File can not be saved");
		}
            }
	}
}
