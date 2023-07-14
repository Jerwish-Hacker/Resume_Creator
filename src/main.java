import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;

import Resume_DataSource.GetData;

import com.itextpdf.text.Font;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Image;
import Styles.style;
 

public class main {
	

	   public static void main(String[] args){
        // Create PDF document instance
		   HashMap<String, String> dataSource = new HashMap<>();
        Document doc = new Document();
        style css =new style();
        
        GetData gd=new GetData();
        
        try {
			PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("Resume.pdf"));
			
			Font h1 =css.getH1();
			Font h3 =css.getH3();
			Font h5 =css.getH5();
			Font a =css.getA();
			a.setColor(BaseColor.BLUE);
            
			gd.userData();
			dataSource=gd.getData();
						
			
			doc.open();
            doc.add(new Paragraph(dataSource.get("Name"),h1));
             
            
            
            
            
            doc.close();
			writer.close();
			
			System.out.println("Created..!");
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

      
       
    }
}
