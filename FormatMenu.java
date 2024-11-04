/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JColorChooser;

/**
 *
 * @author User
 */
public class FormatMenu {
    public static void bold() {
	Font currentFont = Project.textArea.getFont();
	Font boldfont = currentFont.deriveFont(Font.BOLD);
	Project.textArea.setFont(boldfont);
    }
    public static void italic() {
	Font currentFont = Project.textArea.getFont();
	Font italicfont = currentFont.deriveFont(Font.ITALIC);
	Project.textArea.setFont(italicfont);
	}
    public static void fontColor() {
	Color selectedColor = JColorChooser.showDialog(null, "Select Font Color", Color.BLACK);
	if (selectedColor != null) {
	Project.textArea.setForeground(selectedColor);
	}
    }
}
