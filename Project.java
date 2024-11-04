/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project;

import java.awt.event.KeyEvent;
import javax.swing.*;

public class Project {
    
    public static JFrame frame; 
    public static JTextArea textArea;
    
    public static void main(String[] args) {
        createFrame();
        createTextarea();
        createMenu();
                
        frame.setVisible(true);
    }
    public static void createFrame() {
        frame = new JFrame("Note keeper");
        
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon icon = new ImageIcon("C:/Users/User/Downloads/Note Icon.png");
        frame.setIconImage(icon.getImage());
    }
    public static void createTextarea() {
        textArea = new JTextArea();
        frame.add(textArea);
        
        JScrollPane scrollbar = new JScrollPane(textArea);
        scrollbar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollbar.setBorder(BorderFactory.createEmptyBorder());
        frame.add(scrollbar);
    }
    public static void createMenu() {
        JMenuBar menu = new JMenuBar();
        frame.setJMenuBar(menu);
        
        JMenu filemenu = new JMenu("File");
        menu.add(filemenu);
        JMenu editmenu = new JMenu("Edit");
        menu.add(editmenu);
        JMenu formatmenu = new JMenu("Format");
        menu.add(formatmenu);
        
        JMenuItem New = new JMenuItem("New");
        New.addActionListener(e -> FileMenu.newFile());
        filemenu.add(New);
        New.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
        
        JMenuItem open = new JMenuItem("Open");
        open.addActionListener(e -> FileMenu.openFile());
        filemenu.add(open);
        open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
        
        JMenuItem save = new JMenuItem("Save");
        save.addActionListener(e -> FileMenu.openFile());
        filemenu.add(save);
        save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
        
        JMenuItem saveAs = new JMenuItem("Save As...");
        saveAs.addActionListener(e -> FileMenu.saveAs());
        filemenu.add(saveAs);
        saveAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK | KeyEvent.SHIFT_DOWN_MASK));
        
        //Creating Edit Menu
        JMenuItem cutItem = new JMenuItem("Cut");
        cutItem.addActionListener(e -> Edit.cut());
        editmenu.add(cutItem);
        cutItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK));
        
        JMenuItem copyItem = new JMenuItem("Copy");
        copyItem.addActionListener(e -> Edit.copy());
        editmenu.add(copyItem);
        copyItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));
        
        JMenuItem pasteItem = new JMenuItem("Paste");
        pasteItem.addActionListener(e -> Edit.paste());
        editmenu.add(pasteItem);
        pasteItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK));
        
        JMenuItem selectItem = new JMenuItem("Select All");
	selectItem.addActionListener(e -> Edit.selectAll());
	editmenu.add(selectItem);
        selectItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK));
        
        // Creating format menu items
	JMenuItem boldItem = new JMenuItem("Bold");
	boldItem.addActionListener(e -> FormatMenu.bold());
	formatmenu.add(boldItem);
		
	JMenuItem italicItem = new JMenuItem("Italic");
	italicItem.addActionListener(e -> FormatMenu.italic());
	formatmenu.add(italicItem);
		
	JMenuItem fontColorItem = new JMenuItem("Font Color");
	fontColorItem.addActionListener(e -> FormatMenu.fontColor());
	formatmenu.add(fontColorItem);
    }
}
