package image;

public class ProxyImage implements Image {
 private Real_Image realImage;
 private String filename;

 public ProxyImage(String filename) {
     this.filename = filename;
 }

 @Override
 public void display() {
     if (realImage == null) {
         realImage = new Real_Image(filename); 
     }
     realImage.display(); 
 }
}
