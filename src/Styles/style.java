package Styles;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Font;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Image;

public class style {
	
  
	Font h1 = new Font(Font.FontFamily.HELVETICA, 30, Font.BOLD);
    Font h3 = new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD);
    Font h5 = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD);
	Font a = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL);
    
    public Font getA() {
		return a;
	}
	public void setA(Font a) {
		this.a = a;
	}
    
    
    public Font getH1() {
  		return h1;
  	}
  	public void setH1(Font h1) {
  		this.h1 = h1;
  	}
  	public Font getH3() {
  		return h3;
  	}
  	public void setH3(Font h3) {
  		this.h3 = h3;
  	}
  	public Font getH5() {
  		return h5;
  	}
  	public void setH5(Font h5) {
  		this.h5 = h5;
  	} 
    
    
}
